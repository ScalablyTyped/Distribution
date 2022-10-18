package typings.openui5

import typings.openui5.anon.FieldGroupIds
import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.BusyIndicatorSize
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreControlMod {
  
  @JSImport("sap/ui/core/Control", JSImport.Default)
  @js.native
  /**
    * Creates and initializes a new control with the given `sId` and settings.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Control {
    def this(/**
      * Object with initial settings for the new control
      */
    mSettings: ControlSettings) = this()
    def this(/**
      * Optional ID for the new control; generated automatically if no non-empty ID is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new control; generated automatically if no non-empty ID is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String,
      /**
      * Object with initial settings for the new control
      */
    mSettings: ControlSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new control; generated automatically if no non-empty ID is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: Unit,
      /**
      * Object with initial settings for the new control
      */
    mSettings: ControlSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/Control", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Defines a new subclass of Control with the name `sClassName` and enriches it with the information contained
      * in `oClassInfo`.
      *
      * `oClassInfo` can contain the same information that {@link sap.ui.core.Element.extend} already accepts,
      * plus the following `renderer` property:
      *
      * Example:
      * ```javascript
      *
      * Control.extend("sap.mylib.MyControl", {
      *   metadata : {
      *     library : "sap.mylib",
      *     properties : {
      *       text : "string",
      *       width : "sap.ui.core.CSSSize"
      *     }
      *   },
      *   renderer: {
      *     apiVersion: 2,
      *     render: function(oRM, oControl) {
      *       oRM.openStart("div", oControl);
      *       oRM.style("width", oControl.getWidth());
      *       oRM.openEnd();
      *       oRM.text(oControl.getText());
      *       oRM.close("div");
      *     }
      *   }
      * });
      * ```
      *
      *
      * There are multiple ways how a renderer can be specified:
      * 	 - As a **plain object**: The object will be used to create a new renderer by using {@link sap.ui.core.Renderer.extend}
      * 			to extend the renderer of the base class of this control. The new renderer will have the same global
      * 			name as this control class with the additional suffix 'Renderer'.
      *  **Note:** The `Renderer.extend` method expects a plain object (no prototype chain).
      * 	 - As a **function**: The given function will be used as `render` function of a new renderer; the renderer
      * 			will be created in the same way as described for the plain object case.
      * 	 - As a **ready-made renderer**, e.g. imported from the corresponding renderer module. As renderers
      * 			are simple objects (not instances of a specific class), some heuristic is used to distinguish renderers
      * 			from the plain object case above: An object is assumed to be a ready-made renderer when it has
      * 			a `render` function and either is already exposed under the expected global name or has an `extend` method.
      *
      * 	 - As a **fully qualified name**: The name will be looked up as a global property. If not defined, a
      * 			module name will be derived from the global name (dots replaced by slashes), the module will be required
      * 			and provides the renderer, either as AMD export or via the named global property.
      * 	 - **Omitting the `renderer` property** or setting it to `undefined`: The fully qualified name of the
      * 			renderer will be derived from the fully qualified name of the control by adding the suffix "Renderer".
      * 			The renderer then is retrieved in the same way as described for the fully qualified name case.
      *
      * 	 - **`null` or empty string**: The control will have no renderer, a call to `oControl.getMetadata().getRenderer()`
      * 			will return `undefined`.
      *
      * If the resulting renderer is incomplete (has no `render` function) or if it cannot be found at all, rendering
      * of the control will be skipped.
      *
      * **Note:** The `apiVersion: 2` flag is required to enable in-place rendering technology. Before setting
      * this property, please ensure that the constraints documented in section "Contract for Renderer.apiVersion
      * 2" of the {@link sap.ui.core.RenderManager RenderManager} API documentation are fulfilled.
      *
      * @returns Constructor of the newly created class
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class to be created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class to be created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object. If not given, it defaults to `sap.ui.core.ElementMetadata`.
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class to be created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Control]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class to be created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Control],
      /**
      * Constructor function for the metadata object. If not given, it defaults to `sap.ui.core.ElementMetadata`.
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.Control.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Control
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * The string given as "sStyleClass" will be added to the "class" attribute of this control's root HTML
      * element.
      *
      * This method is intended to be used to mark controls as being of a special type for which special styling
      * can be provided using CSS selectors that reference this style class name.
      *
      *
      * ```javascript
      *
      * Example:
      *    myButton.addStyleClass("myRedTextButton"); // add a CSS class to one button instance
      *
      * ...and in CSS:
      *    .myRedTextButton {
      *       color: red;
      *    }
      * ```
      *
      *
      * This will add the CSS class "myRedTextButton" to the Button HTML and the CSS code above will then make
      * the text in this particular button red.
      *
      * Only characters allowed inside HTML attributes are allowed. Quotes are not allowed and this method will
      * ignore any strings containing quotes. Strings containing spaces are interpreted as multiple custom style
      * classes which are split by space and can be removed individually later by calling removeStyleClass. Multiple
      * calls with the same sStyleClass will have no different effect than calling once. If sStyleClass is null,
      * empty string or it contains quotes, the call is ignored.
      *
      * @returns Returns `this` to allow method chaining
      */
    def addStyleClass(/**
      * the CSS class name to be added
      */
    sStyleClass: String): this.type = js.native
    
    /**
      * Defines whether the user can select text inside this control. Defaults to `true` as long as this method
      * has not been called.
      *
      * **Note:**This only works in Safari; for Firefox the element's style must be set to:
      * ```javascript
      *
      *   -moz-user-select: none;
      * ```
      *  in order to prevent text selection.
      *
      * @returns Returns `this` to allow method chaining
      */
    def allowTextSelection(/**
      * whether to allow text selection or not
      */
    bAllow: Boolean): this.type = js.native
    
    /**
      * Allows binding handlers for any native browser event to the root HTML element of this Control. This internally
      * handles DOM element replacements caused by re-rendering.
      *
      * **IMPORTANT:**
      *  This should be only used as FALLBACK when the Control events do not cover a specific use-case! Always
      * try using SAPUI5 control events, as e.g. accessibility-related functionality is then provided automatically.
      * E.g. when working with a `sap.m.Button`, always use the Button's "press" event, not the native "click"
      * event, because "press" is also guaranteed to be fired when certain keyboard activity is supposed to trigger
      * the Button.
      *
      * In the event handler, `this` refers to the Control - not to the root DOM element like in jQuery. While
      * the DOM element can be used and modified, the general caveats for working with SAPUI5 control DOM elements
      * apply. In particular the DOM element may be destroyed and replaced by a new one at any time, so modifications
      * that are required to have permanent effect may not be done. E.g. use {@link #addStyleClass} instead if
      * the modification is of visual nature.
      *
      * Use {@link #detachBrowserEvent} to remove the event handler(s) again.
      *
      * @returns Returns `this` to allow method chaining
      */
    def attachBrowserEvent(): this.type = js.native
    def attachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: String
    ): this.type = js.native
    def attachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: String,
      /**
      * A function to execute each time the event is triggered.
      */
    fnHandler: js.Function
    ): this.type = js.native
    def attachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: String,
      /**
      * A function to execute each time the event is triggered.
      */
    fnHandler: js.Function,
      /**
      * The object, that wants to be notified, when the event occurs
      */
    oListener: js.Object
    ): this.type = js.native
    def attachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: String,
      /**
      * A function to execute each time the event is triggered.
      */
    fnHandler: Unit,
      /**
      * The object, that wants to be notified, when the event occurs
      */
    oListener: js.Object
    ): this.type = js.native
    def attachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: Unit,
      /**
      * A function to execute each time the event is triggered.
      */
    fnHandler: js.Function
    ): this.type = js.native
    def attachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: Unit,
      /**
      * A function to execute each time the event is triggered.
      */
    fnHandler: js.Function,
      /**
      * The object, that wants to be notified, when the event occurs
      */
    oListener: js.Object
    ): this.type = js.native
    def attachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: Unit,
      /**
      * A function to execute each time the event is triggered.
      */
    fnHandler: Unit,
      /**
      * The object, that wants to be notified, when the event occurs
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:validateFieldGroup validateFieldGroup} event
      * of this `sap.ui.core.Control`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.Control` itself.
      *
      * Event is fired if a logical field group defined by `fieldGroupIds` of a control was left or when the
      * user explicitly pressed the key combination that triggers validation.
      *
      * By default, the `RETURN` key without any modifier keys triggers validation, see {@link #triggerValidateFieldGroup}.
      *
      * Listen to this event to validate data of the controls belonging to a field group. See {@link #setFieldGroupIds},
      * or consult the {@link topic:5b0775397e394b1fb973fa207554003e Field Group} documentation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValidateFieldGroup(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachValidateFieldGroup(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.Control` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:validateFieldGroup validateFieldGroup} event
      * of this `sap.ui.core.Control`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.Control` itself.
      *
      * Event is fired if a logical field group defined by `fieldGroupIds` of a control was left or when the
      * user explicitly pressed the key combination that triggers validation.
      *
      * By default, the `RETURN` key without any modifier keys triggers validation, see {@link #triggerValidateFieldGroup}.
      *
      * Listen to this event to validate data of the controls belonging to a field group. See {@link #setFieldGroupIds},
      * or consult the {@link topic:5b0775397e394b1fb973fa207554003e Field Group} documentation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValidateFieldGroup(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachValidateFieldGroup(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.Control` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Returns whether this control belongs to a given combination of field groups.
      *
      * If the `vFieldGroupIds` parameter is not specified, the method checks whether this control belongs to
      * **any** field group, that is, whether any field group ID is defined for it.
      *
      * If a list of field group IDs is specified, either as an array of strings or as a single string (interpreted
      * as a comma separated list of IDs), then the method will check whether this control belongs to **all**
      * given field groups. Accordingly, an empty list of IDs (empty array or empty string) will always return
      * true.
      *
      * Note that a string value for `vFieldGroupIds` (comma separated list) will not be trimmed. All whitespace
      * characters are significant, but in general not recommended in field group IDs.
      * See:
      * 	{@link #setFieldGroupIds}
      *
      * @returns Whether the field group IDs defined for the control match the given ones
      */
    def checkFieldGroupIds(): Boolean = js.native
    def checkFieldGroupIds(
      /**
      * An array of field group IDs or a single string with a comma separated list of IDs to match
      */
    vFieldGroupIds: String
    ): Boolean = js.native
    def checkFieldGroupIds(
      /**
      * An array of field group IDs or a single string with a comma separated list of IDs to match
      */
    vFieldGroupIds: js.Array[String]
    ): Boolean = js.native
    
    /**
      * Removes event handlers which have been previously attached using {@link #attachBrowserEvent}.
      *
      * Note: listeners are only removed, if the same combination of event type, callback function and context
      * object is given as in the call to `attachBrowserEvent`.
      *
      * @returns Returns `this` to allow method chaining
      */
    def detachBrowserEvent(): this.type = js.native
    def detachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: String
    ): this.type = js.native
    def detachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: String,
      /**
      * The function that is to be no longer executed.
      */
    fnHandler: js.Function
    ): this.type = js.native
    def detachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: String,
      /**
      * The function that is to be no longer executed.
      */
    fnHandler: js.Function,
      /**
      * The context object that was given in the call to `attachBrowserEvent`.
      */
    oListener: js.Object
    ): this.type = js.native
    def detachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: String,
      /**
      * The function that is to be no longer executed.
      */
    fnHandler: Unit,
      /**
      * The context object that was given in the call to `attachBrowserEvent`.
      */
    oListener: js.Object
    ): this.type = js.native
    def detachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: Unit,
      /**
      * The function that is to be no longer executed.
      */
    fnHandler: js.Function
    ): this.type = js.native
    def detachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: Unit,
      /**
      * The function that is to be no longer executed.
      */
    fnHandler: js.Function,
      /**
      * The context object that was given in the call to `attachBrowserEvent`.
      */
    oListener: js.Object
    ): this.type = js.native
    def detachBrowserEvent(
      /**
      * A string containing one or more JavaScript event types, such as "click" or "blur".
      */
    sEventType: Unit,
      /**
      * The function that is to be no longer executed.
      */
    fnHandler: Unit,
      /**
      * The context object that was given in the call to `attachBrowserEvent`.
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:validateFieldGroup validateFieldGroup} event
      * of this `sap.ui.core.Control`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachValidateFieldGroup(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachValidateFieldGroup(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:validateFieldGroup validateFieldGroup} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireValidateFieldGroup(): this.type = js.native
    def fireValidateFieldGroup(/**
      * Parameters to pass along with the event
      */
    mParameters: FieldGroupIds): this.type = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * This function (if available on the concrete control) provides the current accessibility state of the
      * control.
      *
      * Applications must not call this hook method directly, it is called by the framework.
      *
      * Subclasses of Control should implement this hook to provide any necessary accessibility information:
      *
      *
      * ```javascript
      *
      * MyControl.prototype.getAccessibilityInfo = function() {
      *    return {
      *      role: "textbox",      // String which represents the WAI-ARIA role which is implemented by the control.
      *      type: "date input",   // String which represents the control type (Must be a translated text). Might correlate with
      *                            // the role.
      *      description: "value", // String which describes the most relevant control state (e.g. the inputs value). Must be a
      *                            // translated text.
      *                            // Note: The type and the enabled/editable state must not be handled here.
      *      focusable: true,      // Boolean which describes whether the control can get the focus.
      *      enabled: true,        // Boolean which describes whether the control is enabled. If not relevant it must not be set or
      *                            // `null` can be provided.
      *      editable: true,       // Boolean which describes whether the control is editable. If not relevant it must not be set or
      *                            // `null` can be provided.
      *      children: []          // Aggregations of the given control (e.g. when the control is a layout). Primitive aggregations will be ignored.
      *                            // Note: Children should only be provided when it is helpful to understand the accessibility context
      *                            //       (e.g. a form control must not provide details of its internals (fields, labels, ...) but a
      *                            //       layout should).
      *    };
      * };
      * ```
      *
      *
      * Note: The returned object provides the accessibility state of the control at the point in time when this
      * function is called.
      *
      * @returns Current accessibility state of the control.
      */
    def getAccessibilityInfo(): js.Object = js.native
    
    /**
      * @deprecated (since 1.69) - The blocked property is deprecated. There is no accessibility support for
      * this property. Blocked controls should not be used inside Controls, which rely on keyboard navigation,
      * e.g. List controls.
      *
      * Gets current value of property {@link #getBlocked blocked}.
      *
      * Whether the control is currently in blocked state.
      *
      * Default value is `false`.
      *
      * @returns Value of property `blocked`
      */
    def getBlocked(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getBusy busy}.
      *
      * Whether the control is currently in busy state.
      *
      * Default value is `false`.
      *
      * @returns Value of property `busy`
      */
    def getBusy(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getBusyIndicatorDelay busyIndicatorDelay}.
      *
      * The delay in milliseconds, after which the busy indicator will show up for this control.
      *
      * Default value is `1000`.
      *
      * @returns Value of property `busyIndicatorDelay`
      */
    def getBusyIndicatorDelay(): int = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getBusyIndicatorSize busyIndicatorSize}.
      *
      * The size of the BusyIndicator. For controls with a width smaller 3rem a `sap.ui.core.BusyIndicatorSize.Small`
      * should be used. If the size could vary in width and the width could get smaller than 3rem, the `sap.ui.core.BusyIndicatorSize.Auto`
      * option could be used. The default is set to `sap.ui.core.BusyIndicatorSize.Medium` For a full screen
      * BusyIndicator use `sap.ui.core.BusyIndicatorSize.Large`.
      *
      * Default value is `'Medium'`.
      *
      * @returns Value of property `busyIndicatorSize`
      */
    def getBusyIndicatorSize(): BusyIndicatorSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BusyIndicatorSize * / any */ String) = js.native
    
    /**
      * Returns a list of all child controls with a field group ID. See {@link #checkFieldGroupIds checkFieldGroupIds}
      * for a description of the `vFieldGroupIds` parameter. Associated controls are not taken into account.
      *
      * @returns The list of controls with a field group ID
      */
    def getControlsByFieldGroupId(): js.Array[Control] = js.native
    def getControlsByFieldGroupId(/**
      * ID of the field group or an array of field group IDs to match
      */
    vFieldGroupIds: String): js.Array[Control] = js.native
    def getControlsByFieldGroupId(
      /**
      * ID of the field group or an array of field group IDs to match
      */
    vFieldGroupIds: js.Array[String]
    ): js.Array[Control] = js.native
    
    /**
      * Returns a copy of the field group IDs array. Modification of the field group IDs need to call {@link
      * #setFieldGroupIds setFieldGroupIds} to apply the changes.
      *
      * @returns copy of the field group IDs
      */
    def getFieldGroupIds(): js.Array[String] = js.native
    
    /**
      * Returns the DOMNode Id to be used for the "labelFor" attribute of the label.
      *
      * By default, this is the Id of the control itself.
      *
      * @returns Id to be used for the `labelFor`
      */
    def getIdForLabel(): String = js.native
    
    /**
      * Returns a renderer for this control instance.
      *
      * It is retrieved using the RenderManager as done during rendering.
      *
      * @returns a Renderer suitable for this Control instance.
      */
    def getRenderer(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Whether the control should be visible on the screen.
      *
      * If set to false, a placeholder will be rendered to mark the location of the invisible control in the
      * DOM of the current page. The placeholder will be hidden and have zero dimensions (`display: none`).
      *
      * Also see {@link module:sap/ui/core/InvisibleRenderer InvisibleRenderer}.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Returns true if the given style class or all multiple style classes which are generated by splitting
      * the given string with space are already set on the control via previous call(s) to addStyleClass().
      *
      * @returns Whether the given style(s) has been set before
      */
    def hasStyleClass(/**
      * the style to check for
      */
    sStyleClass: String): Boolean = js.native
    
    def invalidate(
      /**
      * Child control for which the method was called
      */
    oOrigin: typings.openui5.sapUiBaseManagedObjectMod.default
    ): Unit = js.native
    
    /**
      * @deprecated (since 1.15) - use {@link #getBusy} instead
      *
      * Check if the control is currently in busy state.
      */
    def isBusy(): Boolean = js.native
    
    /**
      * Function is called when the rendering of the control is completed.
      *
      * Applications must not call this hook method directly, it is called by the framework.
      *
      * Subclasses of Control should override this hook to implement any necessary actions after the rendering.
      */
    def onAfterRendering(/**
      * onAfterRendering event object
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Function is called before the rendering of the control is started.
      *
      * Applications must not call this hook method directly, it is called by the framework.
      *
      * Subclasses of Control should override this hook to implement any necessary actions before the rendering.
      */
    def onBeforeRendering(/**
      * onBeforeRendering event object
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Puts `this` control into the specified container (`oRef`) at the given position (`oPosition`).
      *
      * First it is checked whether `oRef` is a container element / control (has a multiple aggregation with
      * type `sap.ui.core.Control` and name 'content') or is an Id String of such a container. If this is not
      * the case `oRef` can either be a Dom Reference or Id String of the UIArea (if it does not yet exist implicitly
      * a new UIArea is created),
      *
      * The `oPosition` can be one of the following:
      *
      *
      * 	 - "first": The control is added as the first element to the container.
      * 	 - "last": The control is added as the last element to the container (default).
      * 	 - "only": All existing children of the container are removed (not destroyed!) and the control is added
      * 			as new child.
      * 	 - index: The control is added at the specified index to the container.
      *
      * @returns Returns `this` to allow method chaining
      */
    def placeAt(/**
      * container into which the control should be put
      */
    oRef: String): this.type = js.native
    def placeAt(
      /**
      * container into which the control should be put
      */
    oRef: String,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: String
    ): this.type = js.native
    def placeAt(
      /**
      * container into which the control should be put
      */
    oRef: String,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: int
    ): this.type = js.native
    def placeAt(/**
      * container into which the control should be put
      */
    oRef: Control): this.type = js.native
    def placeAt(
      /**
      * container into which the control should be put
      */
    oRef: Control,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: String
    ): this.type = js.native
    def placeAt(
      /**
      * container into which the control should be put
      */
    oRef: Control,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: int
    ): this.type = js.native
    def placeAt(/**
      * container into which the control should be put
      */
    oRef: Element): this.type = js.native
    def placeAt(
      /**
      * container into which the control should be put
      */
    oRef: Element,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: String
    ): this.type = js.native
    def placeAt(
      /**
      * container into which the control should be put
      */
    oRef: Element,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: int
    ): this.type = js.native
    
    /**
      * Removes the given string from the list of custom style classes that have been set previously. Regular
      * style classes like "sapUiBtn" cannot be removed.
      *
      * @returns Returns `this` to allow method chaining
      */
    def removeStyleClass(/**
      * the style to be removed
      */
    sStyleClass: String): this.type = js.native
    
    /**
      * Set the controls busy state.
      *
      * **Note:** The busy state can't be set on controls (e.g. sap.m.ColumnListItem) which renderings have the
      * following tags as DOM root element: area|base|br|col|embed|hr|img|input|keygen|link|menuitem|meta|param|source|track|wbr|tr
      *
      * @returns `this` to allow method chaining
      */
    def setBusy(/**
      * The new busy state to be set
      */
    bBusy: Boolean): this.type = js.native
    
    /**
      * Define the delay, after which the busy indicator will show up.
      *
      * @returns `this` to allow method chaining
      */
    def setBusyIndicatorDelay(/**
      * The delay in ms
      */
    iDelay: int): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getBusyIndicatorSize busyIndicatorSize}.
      *
      * The size of the BusyIndicator. For controls with a width smaller 3rem a `sap.ui.core.BusyIndicatorSize.Small`
      * should be used. If the size could vary in width and the width could get smaller than 3rem, the `sap.ui.core.BusyIndicatorSize.Auto`
      * option could be used. The default is set to `sap.ui.core.BusyIndicatorSize.Medium` For a full screen
      * BusyIndicator use `sap.ui.core.BusyIndicatorSize.Large`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'Medium'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBusyIndicatorSize(): this.type = js.native
    def setBusyIndicatorSize(
      /**
      * New value for property `busyIndicatorSize`
      */
    sBusyIndicatorSize: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BusyIndicatorSize * / any */ String
    ): this.type = js.native
    def setBusyIndicatorSize(/**
      * New value for property `busyIndicatorSize`
      */
    sBusyIndicatorSize: BusyIndicatorSize): this.type = js.native
    
    /**
      * @SINCE 1.31
      *
      * Sets a new value for property {@link #getFieldGroupIds fieldGroupIds}.
      *
      * The IDs of a logical field group that this control belongs to.
      *
      * All fields in a logical field group should share the same `fieldGroupId`. Once a logical field group
      * is left, the `validateFieldGroup` event is fired.
      *
      * For backward compatibility with older releases, field group IDs are syntactically not limited, but it
      * is suggested to use only valid {@link sap.ui.core.ID}s.
      *
      * See {@link #attachValidateFieldGroup} or consult the {@link topic:5b0775397e394b1fb973fa207554003e Field
      * Group} documentation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFieldGroupIds(): this.type = js.native
    def setFieldGroupIds(/**
      * New value for property `fieldGroupIds`
      */
    sFieldGroupIds: js.Array[String]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Whether the control should be visible on the screen.
      *
      * If set to false, a placeholder will be rendered to mark the location of the invisible control in the
      * DOM of the current page. The placeholder will be hidden and have zero dimensions (`display: none`).
      *
      * Also see {@link module:sap/ui/core/InvisibleRenderer InvisibleRenderer}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(): this.type = js.native
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
    
    /**
      * The string given as "sStyleClass" will be be either added to or removed from the "class" attribute of
      * this control's root HTML element, depending on the value of "bAdd": if bAdd is true, sStyleClass will
      * be added. If bAdd is not given, sStyleClass will be removed if it is currently present and will be added
      * if not present. If sStyleClass is null or empty string, the call is ignored.
      *
      * See addStyleClass and removeStyleClass for further documentation.
      *
      * @returns Returns `this` to allow method chaining
      */
    def toggleStyleClass(/**
      * the CSS class name to be added or removed
      */
    sStyleClass: String): this.type = js.native
    def toggleStyleClass(
      /**
      * the CSS class name to be added or removed
      */
    sStyleClass: String,
      /**
      * whether sStyleClass should be added (or removed); when this parameter is not given, sStyleClass will
      * be toggled (removed, if present, and added if not present)
      */
    bAdd: Boolean
    ): this.type = js.native
    
    /**
      * Triggers the `validateFieldGroup` event for this control.
      *
      * Called by `sap.ui.core.UIArea` if a field group should be validated after it lost the focus or when the
      * key combination was pressed that was configured to trigger validation.
      *
      * By default, the `RETURN` key without any modifier keys triggers validation. There's no public API to
      * change that key combination.
      *
      * See {@link #attachValidateFieldGroup}.
      */
    def triggerValidateFieldGroup(/**
      * IDs of the field groups that should be validated
      */
    aFieldGroupIds: js.Array[String]): Unit = js.native
  }
  
  trait ControlSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @deprecated (since 1.69) - The blocked property is deprecated. There is no accessibility support for
      * this property. Blocked controls should not be used inside Controls, which rely on keyboard navigation,
      * e.g. List controls.
      *
      * Whether the control is currently in blocked state.
      */
    var blocked: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether the control is currently in busy state.
      */
    var busy: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The delay in milliseconds, after which the busy indicator will show up for this control.
      */
    var busyIndicatorDelay: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * The size of the BusyIndicator. For controls with a width smaller 3rem a `sap.ui.core.BusyIndicatorSize.Small`
      * should be used. If the size could vary in width and the width could get smaller than 3rem, the `sap.ui.core.BusyIndicatorSize.Auto`
      * option could be used. The default is set to `sap.ui.core.BusyIndicatorSize.Medium` For a full screen
      * BusyIndicator use `sap.ui.core.BusyIndicatorSize.Large`.
      */
    var busyIndicatorSize: js.UndefOr[
        BusyIndicatorSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BusyIndicatorSize * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.31
      *
      * The IDs of a logical field group that this control belongs to.
      *
      * All fields in a logical field group should share the same `fieldGroupId`. Once a logical field group
      * is left, the `validateFieldGroup` event is fired.
      *
      * For backward compatibility with older releases, field group IDs are syntactically not limited, but it
      * is suggested to use only valid {@link sap.ui.core.ID}s.
      *
      * See {@link #attachValidateFieldGroup} or consult the {@link topic:5b0775397e394b1fb973fa207554003e Field
      * Group} documentation.
      */
    var fieldGroupIds: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired if a logical field group defined by `fieldGroupIds` of a control was left or when the
      * user explicitly pressed the key combination that triggers validation.
      *
      * By default, the `RETURN` key without any modifier keys triggers validation, see {@link #triggerValidateFieldGroup}.
      *
      * Listen to this event to validate data of the controls belonging to a field group. See {@link #setFieldGroupIds},
      * or consult the {@link topic:5b0775397e394b1fb973fa207554003e Field Group} documentation.
      */
    var validateFieldGroup: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Whether the control should be visible on the screen.
      *
      * If set to false, a placeholder will be rendered to mark the location of the invisible control in the
      * DOM of the current page. The placeholder will be hidden and have zero dimensions (`display: none`).
      *
      * Also see {@link module:sap/ui/core/InvisibleRenderer InvisibleRenderer}.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ControlSettings {
    
    inline def apply(): ControlSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlSettings]
    }
    
    extension [Self <: ControlSettings](x: Self) {
      
      inline def setBlocked(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
      
      inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
      
      inline def setBusy(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      inline def setBusyIndicatorDelay(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "busyIndicatorDelay", value.asInstanceOf[js.Any])
      
      inline def setBusyIndicatorDelayUndefined: Self = StObject.set(x, "busyIndicatorDelay", js.undefined)
      
      inline def setBusyIndicatorSize(
        value: BusyIndicatorSize | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BusyIndicatorSize * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "busyIndicatorSize", value.asInstanceOf[js.Any])
      
      inline def setBusyIndicatorSizeUndefined: Self = StObject.set(x, "busyIndicatorSize", js.undefined)
      
      inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
      
      inline def setFieldGroupIds(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "fieldGroupIds", value.asInstanceOf[js.Any])
      
      inline def setFieldGroupIdsUndefined: Self = StObject.set(x, "fieldGroupIds", js.undefined)
      
      inline def setFieldGroupIdsVarargs(value: String*): Self = StObject.set(x, "fieldGroupIds", js.Array(value*))
      
      inline def setValidateFieldGroup(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "validateFieldGroup", js.Any.fromFunction1(value))
      
      inline def setValidateFieldGroupUndefined: Self = StObject.set(x, "validateFieldGroup", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
