package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Control
  extends StObject
     with Element {
  
  /**
    * The string given as "sStyleClass" will be added to the "class" attribute of this control's root HTML
    * element.This method is intended to be used to mark controls as being of a special type for
    * whichspecial styling can be provided using CSS selectors that reference this style class
    * name.<pre>Example:   myButton.addStyleClass("myRedTextButton"); // add a CSS class to one button
    * instance...and in CSS:   .myRedTextButton {      color: red;   }</pre>This will add the CSS class
    * "myRedTextButton" to the Button HTML and the CSS code above will thenmake the text in this
    * particular button red.Only characters allowed inside HTML attributes are allowed.Quotes are not
    * allowed and this method will ignore any strings containing quotes.Strings containing spaces are
    * interpreted as multiple custom style classes which are split by space and can be removedindividually
    * later by calling removeStyleClass.Multiple calls with the same sStyleClass will have no different
    * effect than calling once.If sStyleClass is null, empty string or it contains quotes, the call is
    * ignored.
    * @param sStyleClass the CSS class name to be added
    * @returns Returns <code>this</code> to allow method chaining
    */
  def addStyleClass(): Control = js.native
  
  /**
    * Defines whether the user can select text inside this control.Defaults to <code>true</code> as long
    * as this method has not been called.<b>Note:</b>This only works in IE and Safari; for Firefox the
    * element's style mustbe set to:<pre>  -moz-user-select: none;</pre>in order to prevent text
    * selection.
    * @param bAllow whether to allow text selection or not
    * @returns Returns <code>this</code> to allow method chaining
    */
  def allowTextSelection(bAllow: Boolean): Control = js.native
  
  /**
    * Allows binding handlers for any native browser event to the root HTML element of this Control. This
    * internally handlesDOM element replacements caused by re-rendering.IMPORTANT:This should be only used
    * as FALLBACK when the Control events do not cover a specific use-case! Always try usingSAPUI5 control
    * events, as e.g. accessibility-related functionality is then provided automatically.E.g. when working
    * with a sap.ui.commons.Button, always use the Button's "press" event, not the native "click" event,
    * because"press" is also guaranteed to be fired when certain keyboard activity is supposed to trigger
    * the Button.In the event handler, "this" refers to the Control - not to the root DOM element like in
    * jQuery. While the DOM element canbe used and modified, the general caveats for working with SAPUI5
    * control DOM elements apply. In particular the DOM elementmay be destroyed and replaced by a new one
    * at any time, so modifications that are required to have permanent effect may notbe done. E.g. use
    * Control.addStyleClass() instead if the modification is of visual nature.Use detachBrowserEvent() to
    * remove the event handler(s) again.
    * @param sEventType A string containing one or more JavaScript event types, such as "click" or "blur".
    * @param fnHandler A function to execute each time the event is triggered.
    * @param oListener The object, that wants to be notified, when the event occurs
    * @returns Returns <code>this</code> to allow method chaining
    */
  def attachBrowserEvent(sEventType: String): Control = js.native
  def attachBrowserEvent(sEventType: String, fnHandler: js.Any): Control = js.native
  def attachBrowserEvent(sEventType: String, fnHandler: js.Any, oListener: js.Any): Control = js.native
  def attachBrowserEvent(sEventType: String, fnHandler: Unit, oListener: js.Any): Control = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>validateFieldGroup</code> event of this
    * <code>sap.ui.core.Control</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.ui.core.Control</code> itself.Event is fired if a logical field group defined by
    * <code>fieldGroupIds</code> of a control was left or the user explicitly pressed a validation key
    * combination.Use this event to validate data of the controls belonging to a field group.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.ui.core.Control</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachValidateFieldGroup(oData: js.Any, fnFunction: js.Any): Control = js.native
  def attachValidateFieldGroup(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Control = js.native
  
  /**
    * Returns whether the control has a given field group.If <code>vFieldGroupIds</code> is not given it
    * checks whether at least one field group ID is given for this control.If <code>vFieldGroupIds</code>
    * is an empty array or empty string, true is returned if there is no field group ID set for this
    * control.If <code>vFieldGroupIds</code> is a string array or a string all expected field group IDs
    * are checked and true is returned if all are contained for given for this control.The comma delimiter
    * can be used to seperate multiple field group IDs in one string.
    * @param vFieldGroupIds ID of the field group or an array of field group IDs to match
    * @returns true if a field group ID matches
    */
  def checkFieldGroupIds(vFieldGroupIds: String): Boolean = js.native
  def checkFieldGroupIds(vFieldGroupIds: js.Array[String]): Boolean = js.native
  
  /**
    * Removes event handlers which have been previously attached using {@link #attachBrowserEvent}.Note:
    * listeners are only removed, if the same combination of event type, callback functionand context
    * object is given as in the call to <code>attachBrowserEvent</code>.
    * @param sEventType A string containing one or more JavaScript event types, such as "click" or "blur".
    * @param fnHandler The function that is to be no longer executed.
    * @param oListener The context object that was given in the call to attachBrowserEvent.
    */
  def detachBrowserEvent(sEventType: String): Unit = js.native
  def detachBrowserEvent(sEventType: String, fnHandler: js.Any): Unit = js.native
  def detachBrowserEvent(sEventType: String, fnHandler: js.Any, oListener: js.Any): Unit = js.native
  def detachBrowserEvent(sEventType: String, fnHandler: Unit, oListener: js.Any): Unit = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>validateFieldGroup</code> event of
    * this <code>sap.ui.core.Control</code>.The passed function and listener object must match the ones
    * used for event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachValidateFieldGroup(fnFunction: js.Any, oListener: js.Any): Control = js.native
  
  /**
    * Fires event <code>validateFieldGroup</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>fieldGroupIds</code> of type <code>string[]</code>field group IDs of the
    * logical field groups to validate</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireValidateFieldGroup(mArguments: js.Any): Control = js.native
  
  /**
    * This function (if available on the concrete control) providesthe current accessibility state of the
    * control.Applications must not call this hook method directly, it is called by the
    * framework.Subclasses of Control should implement this hook to provide any necessary accessibility
    * information:<pre>MyControl.prototype.getAccessibilityInfo = function() {   return {     role:
    * "textbox",      // String which represents the WAI-ARIA role which is implemented by the control.   
    *  type: "date input",   // String which represents the control type (Must be a translated text).
    * Might correlate with                           // the role.     description: "value", // String
    * which describes the most relevant control state (e.g. the inputs value). Must be a                  
    *         // translated text.                           // Note: The type and the enabled/editable
    * state must not be handled here.     focusable: true,      // Boolean which describes whether the
    * control can get the focus.     enabled: true,        // Boolean which describes whether the control
    * is enabled. If not relevant it must not be set or                           // <code>null</code> can
    * be provided.     editable: true,       // Boolean which describes whether the control is editable.
    * If not relevant it must not be set or                           // <code>null</code> can be
    * provided.     children: []          // Array of accessibility info objects of children of the given
    * control (e.g. when the control is a layout).                           // Note: Children should only
    * be provided when it is helpful to understand the accessibility context                           // 
    *      (e.g. a form control must not provide details of its internals (fields, labels, ...) but a     
    *                      //       layout should).   };};</pre>Note: The returned object provides the
    * accessibility state of the control at the point in time when this function is called.
    * @since 1.37.0
    * @returns Current accessibility state of the control.
    */
  def getAccessibilityInfo(): js.Any = js.native
  
  /**
    * Gets current value of property <code>busy</code>.Whether the control is currently in busy
    * state.Default value is <code>false</code>.
    * @returns Value of property <code>busy</code>
    */
  def getBusy(): Boolean = js.native
  
  /**
    * Gets current value of property <code>busyIndicatorDelay</code>.The delay in milliseconds, after
    * which the busy indicator will show up for this control.Default value is <code>1000</code>.
    * @returns Value of property <code>busyIndicatorDelay</code>
    */
  def getBusyIndicatorDelay(): Double = js.native
  
  /**
    * Returns a list of all child controls with a field group ID.See {@link #checkFieldGroupIds
    * checkFieldGroupIds} for a description of the<code>vFieldGroupIds</code> parameter.Associated
    * controls are not taken into account.
    * @param vFieldGroupIds ID of the field group or an array of field group IDs to match
    * @returns The list of controls with a field group ID
    */
  def getControlsByFieldGroupId(vFieldGroupIds: String): js.Array[Control] = js.native
  def getControlsByFieldGroupId(vFieldGroupIds: js.Array[String]): js.Array[Control] = js.native
  
  /**
    * Returns a copy of the field group IDs array. Modification of the field group IDsneed to call {@link
    * #setFieldGroupIds setFieldGroupIds} to apply the changes.
    * @returns copy of the field group IDs
    */
  def getFieldGroupIds(): js.Array[String] = js.native
  
  /**
    * Returns the DOMNode Id to be used for the "labelFor" attribute of the label.By default, this is the
    * Id of the control itself.
    * @returns Id to be used for the <code>labelFor</code>
    */
  def getIdForLabel(): String = js.native
  
  /**
    * Returns a renderer for this control instance.It is retrieved using the RenderManager as done during
    * rendering.
    * @returns a Renderer suitable for this Control instance.
    */
  def getRenderer(): js.Any = js.native
  
  /**
    * Gets current value of property <code>visible</code>.Whether the control should be visible on the
    * screen. If set to false, a placeholder is rendered instead of the real controlDefault value is
    * <code>true</code>.
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Returns true if the given style class or all multiple style classes which are generated by splitting
    * the given string with space are already set on the controlvia previous call(s) to addStyleClass().
    * @param sStyleClass the style to check for
    */
  def hasStyleClass(sStyleClass: String): Boolean = js.native
  
  /**
    * Check if the control is currently in busy state
    */
  def isBusy(): Unit = js.native
  
  /**
    * Function is called when the rendering of the control is completed.Applications must not call this
    * hook method directly, it is called by the framework.Subclasses of Control should override this hook
    * to implement any necessary actions after the rendering.
    */
  def onAfterRendering(): Unit = js.native
  
  /**
    * Function is called before the rendering of the control is started.Applications must not call this
    * hook method directly, it is called by the framework.Subclasses of Control should override this hook
    * to implement any necessary actions before the rendering.
    */
  def onBeforeRendering(): Unit = js.native
  
  /**
    * Puts <code>this</code> control into the specified container (<code>oRef</code>) at the givenposition
    * (<code>oPosition</code>).First it is checked whether <code>oRef</code> is a container element /
    * control (has amultiple aggregation with type <code>sap.ui.core.Control</code> and name 'content') or
    * is an Id Stringof such an container.If this is not the case <code>oRef</code> can either be a Dom
    * Reference or Id String of the UIArea(if it does not yet exist implicitly a new UIArea is
    * created),The <code>oPosition</code> can be one of the following:<ul> <li>"first": The control is
    * added as the first element to the container.</li> <li>"last": The control is added as the last
    * element to the container (default).</li> <li>"only": All existing children of the container are
    * removed (not destroyed!) and the control is added as new child.</li> <li><i>index</i>: The control
    * is added at the specified <i>index</i> to the container.</li></ul>
    * @param oRef container into which the control should be put
    * @param oPosition Describes the position where the control should be put into the container
    * @returns Returns <code>this</code> to allow method chaining
    */
  def placeAt(oPosition: String): Control = js.native
  def placeAt(oPosition: Double): Control = js.native
  /**
    * Puts <code>this</code> control into the specified container (<code>oRef</code>) at the givenposition
    * (<code>oPosition</code>).First it is checked whether <code>oRef</code> is a container element /
    * control (has amultiple aggregation with type <code>sap.ui.core.Control</code> and name 'content') or
    * is an Id Stringof such an container.If this is not the case <code>oRef</code> can either be a Dom
    * Reference or Id String of the UIArea(if it does not yet exist implicitly a new UIArea is
    * created),The <code>oPosition</code> can be one of the following:<ul> <li>"first": The control is
    * added as the first element to the container.</li> <li>"last": The control is added as the last
    * element to the container (default).</li> <li>"only": All existing children of the container are
    * removed (not destroyed!) and the control is added as new child.</li> <li><i>index</i>: The control
    * is added at the specified <i>index</i> to the container.</li></ul>
    * @param oRef container into which the control should be put
    * @param oPosition Describes the position where the control should be put into the container
    * @returns Returns <code>this</code> to allow method chaining
    */
  def placeAt(oRef: String, oPosition: String): Control = js.native
  def placeAt(oRef: String, oPosition: Double): Control = js.native
  def placeAt(oRef: Control, oPosition: String): Control = js.native
  def placeAt(oRef: Control, oPosition: Double): Control = js.native
  def placeAt(oRef: Element, oPosition: String): Control = js.native
  def placeAt(oRef: Element, oPosition: Double): Control = js.native
  
  /**
    * Removes the given string from the list of custom style classes that have been set previously.Regular
    * style classes like "sapUiBtn" cannot be removed.
    * @param sStyleClass the style to be removed
    * @returns Returns <code>this</code> to allow method chaining
    */
  def removeStyleClass(sStyleClass: String): Control = js.native
  
  /**
    * Set the controls busy state.
    * @param bBusy The new busy state to be set
    * @returns <code>this</code> to allow method chaining
    */
  def setBusy(bBusy: Boolean): Control = js.native
  
  /**
    * Define the delay, after which the busy indicator will show up
    * @param iDelay The delay in ms
    * @returns <code>this</code> to allow method chaining
    */
  def setBusyIndicatorDelay(iDelay: Double): Control = js.native
  
  /**
    * Sets a new value for property <code>fieldGroupIds</code>.The IDs of a logical field group that this
    * control belongs to. All fields in a logical field group should share the same
    * <code>fieldGroupId</code>.Once a logical field group is left, the validateFieldGroup event is
    * raised.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>[]</code>.
    * @since 1.31
    * @param sFieldGroupIds New value for property <code>fieldGroupIds</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFieldGroupIds(sFieldGroupIds: js.Array[String]): Control = js.native
  
  /**
    * Sets a new value for property <code>visible</code>.Whether the control should be visible on the
    * screen. If set to false, a placeholder is rendered instead of the real controlWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: Boolean): Control = js.native
  
  /**
    * The string given as "sStyleClass" will be be either added to or removed from the "class" attribute
    * of this control's root HTML element,depending on the value of "bAdd": if bAdd is true, sStyleClass
    * will be added.If bAdd is not given, sStyleClass will be removed if it is currently present and will
    * be added if not present.If sStyleClass is null or empty string, the call is ignored.See
    * addStyleClass and removeStyleClass for further documentation.
    * @param sStyleClass the CSS class name to be added or removed
    * @param bAdd whether sStyleClass should be added (or removed); when this parameter is not given,
    * sStyleClass will be toggled (removed, if present, and added if not present)
    * @returns Returns <code>this</code> to allow method chaining
    */
  def toggleStyleClass(sStyleClass: String, bAdd: Boolean): Control = js.native
  
  /**
    * Triggers the validateFieldGroup event for this control.Called by sap.ui.core.UIArea if a field group
    * should be validated after is loses the focus or a validation key combibation was pressed.The
    * validation key is defined in the UI area <code>UIArea._oFieldGroupValidationKey</code>
    */
  def triggerValidateFieldGroup(): Unit = js.native
}
