package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiTestActionsActionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Check extends StObject {
  
  /**
    * Available since 1.34.0. An array of functions or Actions or a mixture of both. An action has an 'executeOn'
    * function that will receive a single control as a parameter. If there are multiple actions defined all
    * of them will be executed (first in first out) on each control of, similar to the matchers. Here is one
    * of the most common usages: ` function (sButtonId) { // executes a Press on a button with a specific id
    * new Opa5().waitFor({ id: sButtonId, actions: new Press() }); }; ` But actions will only be executed once
    * and only after the check function returned true. Before actions are executed the {@link sap.ui.test.matchers.Interactable}
    * matcher and the internal autoWait logic will check if the Control is currently able to perform actions
    * if it is not, Opa5 will try again after the 'pollingInterval'. That means actions will only be executed
    * if:
    * 	 -  Controls and their parents are visible, not busy and not hidden behind a blocking layer
    * 	 -  The controls are not hidden behind static elements such as dialogs
    * 	 -  There is no pending asynchronous work performed by the application   If there are multiple
    * 			controls in Opa5's result set the action will be executed on all of them. The actions will be invoked
    * 			directly before success is called. In the documentation of the success parameter there is a list of conditions
    * 			that have to be fulfilled. They also apply for the actions. There are some predefined actions in the
    * 			{@link sap.ui.test.actions} namespace. since 1.42 an Action may add other waitFors. The next action or
    * 			the success handler will not be executed until the waitFor of the action has finished. An example:
    * ```javascript
    *
    *     this.waitFor({
    *         id: "myButton",
    *         actions: function (oButton) {
    *            // this action is executed first
    *            this.waitFor({
    *              id: "anotherButton",
    *              actions: function () {
    *                // This is the second function that will be executed
    *                // Opa will also wait until anotherButton is Interactable before executing this function
    *              },
    *              success: function () {
    *                // This is the third function that will be executed
    *              }
    *            })
    *         },
    *         success: function () {
    *             // This is the fourth function that will be executed
    *         }
    *     });
    *     ```
    *  Executing multiple actions will not wait between actions for a control to become "Interactable" again.
    * If you need waiting between actions you need to split the actions into multiple 'waitFor' statements.
    */
  var actions: js.UndefOr[js.Function | (js.Array[js.Function0[Unit] | default]) | default] = js.undefined
  
  /**
    * @since 1.42 Only has an effect if set to true. Since 1.53 it can also be a plain object. When autoWait
    * is true, the waitFor statement will not execute success callbacks as long as there is pending asynchronous
    * work such as for example: open XMLHTTPRequests (requests to a server), scheduled delayed work and promises,
    * unfinished UI navigation. In addition, the control state will be checked with the {@link sap.ui.test.matchers.Interactable}
    * matcher, and the control will have to be enabled. So when autoWait is enabled, success behaves like an
    * action in terms of waiting. It is recommended to set this value to true for all your waitFor statements
    * using:
    * ```javascript
    *
    *     Opa5.extendConfig({
    *         autoWait: true
    *     });
    * ```
    *  Why it is recommended: When writing a huge set of tests and executing them frequently you might face
    * tests that are sometimes successful but sometimes they are not. Setting the autoWait to true should stabilize
    * most of those tests. The default "false" could not be changed since it causes existing tests to fail.
    * There are cases where you do not want to wait for controls to be "Interactable": For example when you
    * are testing the Busy indication of your UI during the sending of a request. But these cases are the exception
    * so it is better to explicitly adding autoWait: false to this waitFor.
    * ```javascript
    *
    *     this.waitFor({
    *         id: "myButton",
    *         autoWait: false,
    *         success: function (oButton) {
    *              Opa5.assert.ok(oButton.getBusy(), "My Button was busy");
    *         }
    *     });
    * ```
    *  This is also the easiest way of migrating existing tests. First extend the config, then see which waitFors
    * will time out and finally disable autoWait in these Tests.
    */
  var autoWait: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will get invoked in every polling interval. If it returns true, the check is successful and the polling
    * will stop. The first parameter passed into the function is the same value that gets passed to the success
    * function. Returning something other than boolean in check will not change the first parameter of success.
    */
  var check: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Selects all control by their type. It is usually combined with a viewName or searchOpenDialogs. If no
    * control is matching the type, an empty array will be returned. Here are some samples:
    * ```javascript
    *
    *         this.waitFor({
    *             controlType: "sap.m.Button",
    *             success: function (aButtons) {
    *                 // aButtons is an array of all visible buttons
    *             }
    *         });
    *
    *         // control type will also return controls that extend the control type
    *         // this will return an array of visible sap.m.List and sap.m.Table since both extend List base
    *         this.waitFor({
    *             controlType: "sap.m.ListBase",
    *             success: function (aLists) {
    *                 // aLists is an array of all visible Tables and Lists
    *             }
    *         });
    *
    *         // control type is often combined with viewName - only controls that are inside of the view
    *         // and have the correct type will be returned
    *         this.waitFor({
    *             viewName: "my.View"
    *             controlType: "sap.m.Input",
    *             success: function (aInputs) {
    *                 // aInputs are all sap.m.Inputs inside of a view called 'my.View'
    *             }
    *         });
    *     ```
    */
  var controlType: js.UndefOr[String] = js.undefined
  
  /**
    * @since 1.47 (seconds) Specifies how long the waitFor function polls before it fails in debug mode.O means
    * it will wait forever.
    */
  var debugTimeout: js.UndefOr[int] = js.undefined
  
  /**
    * @since 1.80 If set to true, Opa5 will match only editable controls. If set to false, Opa5 will match
    * both editable and non-editable controls.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @since 1.66 If set to false, Opa5 will look for both enabled and disabled controls. Note that this option's
    * default value is related to the autoWait mechanism:
    * 	 -  When autoWait is enabled globally or in the current waitFor, the default value for options.enabled
    * 			is true.
    * 	 -  When autoWait is not used, the default value for options.enabled is false.  This means that
    * 			if you use autoWait and you want to find a disabled control, you need to explicitly set options.enabled
    * 			to false.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Invoked when the timeout is reached and the check never returned true.
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Will be displayed as an errorMessage depending on your unit test framework. Currently the only adapter
    * for Opa5 is QUnit. This message is displayed if Opa5 has reached its timeout before QUnit has reached
    * it.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * @since 1.63 The ID of a fragment. If set, controls will match only if their IDs contain the fragment
    * ID prefix.
    */
  var fragmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The global ID of a control, or the ID of a control inside a view.
    *
    * If a regex and a viewName is provided, Opa5 only looks for controls in the view with a matching ID.
    *
    * Example of a waitFor:
    * ```javascript
    *
    *
    *         this.waitFor({
    *             id: /my/,
    *             viewName: "myView"
    *         });
    *
    * ```
    *  The view that is searched in:
    * ```javascript
    *
    *
    *         <mvc:View xmlns:mvc="sap.ui.core.mvc" xmlns="sap.m">
    *             <Button id="myButton">
    *             </Button>
    *             <Button id="bar">
    *             </Button>
    *             <Button id="baz">
    *             </Button>
    *             <Image id="myImage"></Image>
    *         </mvc:View>
    *
    * ```
    *
    *
    * Will result in matching two controls, the image with the effective ID myView--myImage and the button
    * myView--myButton. Although the IDs of the controls myView--bar and myView--baz contain a my, they will
    * not be matched since only the part you really write in your views will be matched.
    */
  var id: js.UndefOr[String | js.RegExp] = js.undefined
  
  /**
    * @since 1.80 If set to true, the {@link sap.ui.test.matchers.Interactable} matcher will be applied. If
    * autoWait is true, this option has no effect and interactable will always be true. If autoWait is false,
    * which is the default state, the value of the interactable property will have an effect. When interactable
    * is true, enabled will also be set to true, unless declared otherwise.
    */
  var interactable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Matchers used to filter controls. Could be a function, a single matcher instance, an array of matcher
    * instances, or, since version 1.72, a plain object to specify matchers declaratively. For a full list
    * of built-in matchers, see {@link sap.ui.test.matchers}.
    *
    * Matchers are applied to each control found by the `waitFor` function. The matchers are a pipeline: the
    * first matcher gets a control as an input parameter, each subsequent matcher gets the same input as the
    * previous one, if the previous output is `true`.
    *
    * If the previous output is a truthy value, the next matcher will receive this value as an input parameter.
    * If there is a matcher that does not match a control (for example, returns a falsy value), then the control
    * is filtered out.
    *
    * Check function is only called if the matchers matched at least one control, for example, it is not called
    * if matchers filter out all controls/values. Check and success are be called with all matching controls
    * as an input parameter. A matcher inline function has one parameter - an array of controls, and returns
    * an array of the filtered controls.
    *
    * A matcher instance could extend `sap.ui.test.matchers.Matcher` and must have a method with name `isMatching`,
    * that accepts an array of controls and returns an array of the filtered controls.
    *
    * A declarative matcher object is a set of key-value pairs created by the object literal notation, such
    * that:
    * 	Every key is a name of an OPA5 built-in matcher, starting with a lower case letter. The following example
    * declares an `sap.ui.test.matchers.Properties` matcher:
    * ```javascript
    *             matchers: {
    *                 properties: {<...>}
    *             }
    * ```
    *   Every value is an object or an array or objects. Each object represents the properties that
    * will be fed to one instance of the declared matcher. The following example declares one `sap.ui.test.matchers.Properties`
    * matcher for property "text" and value "hello":
    * ```javascript
    *             matchers: {
    *                 properties: {text: "hello"}
    *             }
    * ```
    *
    *
    * The following example declares two `sap.ui.test.matchers.Properties` matchers (the `text` property with
    * value `hello` and the `number` property with value `0`):
    * ```javascript
    *             matchers: {
    *                 properties: [
    *                     {text: "hello"},
    *                     {number: 0}
    *             ]}
    * ```
    */
  var matchers: js.UndefOr[
    js.Function | js.Array[Any] | js.Object | typings.openui5.sapUiTestMatchersMatcherMod.default
  ] = js.undefined
  
  /**
    * (milliseconds) Specifies how often the waitFor function polls.
    */
  var pollingInterval: js.UndefOr[int] = js.undefined
  
  /**
    * If set to true, Opa5 will only look in open dialogs. All the other values except control type will be
    * ignored
    */
  var searchOpenDialogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will get invoked after the following conditions are met:
    * 	 -  One or multiple controls were found using controlType, Id, viewName. If visible is true (it is by
    * 			default), the controls also need to be rendered.
    * 	 -  The whole matcher pipeline returned true for at least one control, or there are no matchers
    * 	 -  The check function returned true, or there is no check function   The first parameter passed
    * 			into the function is either a single control (when a single string ID was used), or an array of controls
    * 			(viewName, controlType, multiple ID's, regex ID's) that matched all matchers. Matchers can alter the
    * 			array or single control to something different. Please read the documentation of waitFor's matcher parameter.
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (seconds) Specifies how long the waitFor function polls before it fails.O means it will wait forever.
    */
  var timeout: js.UndefOr[int] = js.undefined
  
  /**
    * @since 1.62 The ID of a view. Can be used alone or in combination with viewName and viewNamespace. *
    * Always set view ID if there are multiple views with the same name.
    */
  var viewId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a view. If viewName is set, controls will be searched only inside this view. If control ID
    * is given, it will be considered to be relative to the view.
    */
  var viewName: js.UndefOr[String] = js.undefined
  
  /**
    * viewName prefix. Recommended to be set in {@link sap.ui.test.Opa5.extendConfig} instead.
    */
  var viewNamespace: js.UndefOr[String] = js.undefined
  
  /**
    * If set to false, Opa5 will also look for unrendered and invisible controls.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Check {
  
  inline def apply(): Check = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Check]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Check] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Function | (js.Array[js.Function0[Unit] | default]) | default): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (js.Function0[Unit] | default)*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAutoWait(value: Boolean): Self = StObject.set(x, "autoWait", value.asInstanceOf[js.Any])
    
    inline def setAutoWaitUndefined: Self = StObject.set(x, "autoWait", js.undefined)
    
    inline def setCheck(value: js.Function): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    inline def setControlType(value: String): Self = StObject.set(x, "controlType", value.asInstanceOf[js.Any])
    
    inline def setControlTypeUndefined: Self = StObject.set(x, "controlType", js.undefined)
    
    inline def setDebugTimeout(value: int): Self = StObject.set(x, "debugTimeout", value.asInstanceOf[js.Any])
    
    inline def setDebugTimeoutUndefined: Self = StObject.set(x, "debugTimeout", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFragmentId(value: String): Self = StObject.set(x, "fragmentId", value.asInstanceOf[js.Any])
    
    inline def setFragmentIdUndefined: Self = StObject.set(x, "fragmentId", js.undefined)
    
    inline def setId(value: String | js.RegExp): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInteractable(value: Boolean): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
    
    inline def setInteractableUndefined: Self = StObject.set(x, "interactable", js.undefined)
    
    inline def setMatchers(
      value: js.Function | js.Array[Any] | js.Object | typings.openui5.sapUiTestMatchersMatcherMod.default
    ): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
    
    inline def setMatchersUndefined: Self = StObject.set(x, "matchers", js.undefined)
    
    inline def setMatchersVarargs(value: Any*): Self = StObject.set(x, "matchers", js.Array(value*))
    
    inline def setPollingInterval(value: int): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
    
    inline def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
    
    inline def setSearchOpenDialogs(value: Boolean): Self = StObject.set(x, "searchOpenDialogs", value.asInstanceOf[js.Any])
    
    inline def setSearchOpenDialogsUndefined: Self = StObject.set(x, "searchOpenDialogs", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeout(value: int): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setViewId(value: String): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
    
    inline def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
    
    inline def setViewNamespace(value: String): Self = StObject.set(x, "viewNamespace", value.asInstanceOf[js.Any])
    
    inline def setViewNamespaceUndefined: Self = StObject.set(x, "viewNamespace", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
