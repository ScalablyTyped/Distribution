package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiMdcConditionConditionMod.ConditionObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValuehelpBaseContentMod {
  
  @JSImport("sap/ui/mdc/valuehelp/base/Content", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Content`.
    *
    * This is the basis for different value help contents. It cannot be used directly.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Content {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: ContentSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element
      */
    mSettings: ContentSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: ContentSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/valuehelp/base/Content", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.valuehelp.base.Content with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Content]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Content],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.valuehelp.base.Content.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Content
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Content` itself.
      *
      * Fired if the change is cancelled.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Content` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Content` itself.
      *
      * Fired if the change is cancelled.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Content` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Content` itself.
      *
      * Fired if a change on the content is confirmed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentConfirmEvent, Unit]
    ): this.type = js.native
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentConfirmEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Content` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Content` itself.
      *
      * Fired if a change on the content is confirmed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentConfirmEvent, Unit]
    ): this.type = js.native
    def attachConfirm(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentConfirmEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Content` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigated navigated} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Content` itself.
      *
      * Fired if a navigation was executed in the content.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentNavigatedEvent, Unit]
    ): this.type = js.native
    def attachNavigated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentNavigatedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Content` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigated navigated} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Content` itself.
      *
      * Fired if a navigation was executed in the content.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigated(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentNavigatedEvent, Unit]
    ): this.type = js.native
    def attachNavigated(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentNavigatedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Content` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestSwitchToDialog requestSwitchToDialog }
      * event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Content` itself.
      *
      * Fired if the value help should switch to dialog mode.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRequestSwitchToDialog(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachRequestSwitchToDialog(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Content` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestSwitchToDialog requestSwitchToDialog }
      * event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Content` itself.
      *
      * Fired if the value help should switch to dialog mode.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRequestSwitchToDialog(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachRequestSwitchToDialog(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Content` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Content` itself.
      *
      * Fired if the selected condition changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentSelectEvent, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Content` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Content` itself.
      *
      * Fired if the selected condition changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentSelectEvent, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Content` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Provides access to the delegate initialization `Promise` of the value help.
      *
      * @returns `Promise` reflecting the delegate initialization
      */
    def awaitValueHelpDelegate(): js.Promise[Any] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Creates a condition based on the used operator.
      *
      * @returns The new condition object with the maintained operator along with `sKey` and `sDescription` as
      * `aValues`
      */
    def createCondition(/**
      * Value of the condition. For item conditions this must be the key.
      */
    vValue: Any): ConditionObject = js.native
    def createCondition(
      /**
      * Value of the condition. For item conditions this must be the key.
      */
    vValue: Any,
      /**
      * Description of the operator
      */
    sDescription: String
    ): ConditionObject = js.native
    def createCondition(
      /**
      * Value of the condition. For item conditions this must be the key.
      */
    vValue: Any,
      /**
      * Description of the operator
      */
    sDescription: String,
      /**
      * payload
      */
    oPayload: js.Object
    ): ConditionObject = js.native
    def createCondition(
      /**
      * Value of the condition. For item conditions this must be the key.
      */
    vValue: Any,
      /**
      * Description of the operator
      */
    sDescription: Unit,
      /**
      * payload
      */
    oPayload: js.Object
    ): ConditionObject = js.native
    
    /**
      * Destroys the displayContent in the aggregation {@link #getDisplayContent displayContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDisplayContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:confirm confirm} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentConfirmEvent, Unit]
    ): this.type = js.native
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentConfirmEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:navigated navigated} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavigated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentNavigatedEvent, Unit]
    ): this.type = js.native
    def detachNavigated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentNavigatedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:requestSwitchToDialog requestSwitchToDialog }
      * event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRequestSwitchToDialog(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachRequestSwitchToDialog(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.mdc.valuehelp.base.Content`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentSelectEvent, Unit]
    ): this.type = js.native
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContentSelectEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:cancel cancel} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCancel(): this.type = js.native
    def fireCancel(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:confirm confirm} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireConfirm(): this.type = js.native
    def fireConfirm(/**
      * Parameters to pass along with the event
      */
    mParameters: Content$ConfirmEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:navigated navigated} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavigated(): this.type = js.native
    def fireNavigated(/**
      * Parameters to pass along with the event
      */
    mParameters: Content$NavigatedEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:requestSwitchToDialog requestSwitchToDialog} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRequestSwitchToDialog(): this.type = js.native
    def fireRequestSwitchToDialog(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: Content$SelectEventParameters): this.type = js.native
    
    /**
      * Gets current value of property {@link #getConditions conditions}.
      *
      * Conditions of the value help
      *
      * **Note:** This property must not be set from outside, it is only to be used by the corresponding container
      *
      * Default value is `[]`.
      *
      * @returns Value of property `conditions`
      */
    def getConditions(): js.Array[js.Object] = js.native
    
    /**
      * Gets current value of property {@link #getConfig config}.
      *
      * Internal configuration
      *
      * **Note:** This property must not be set from outside, it is only to be used by the corresponding container
      *
      * Default value is `{}`.
      *
      * @returns Value of property `config`
      */
    def getConfig(): js.Object = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns control connected to value help
      *
      * @returns connected control
      */
    def getControl(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getDisplayContent displayContent}.
      *
      * Content control that is put inside the parent container
      *
      * **Note:** This aggregation must not be set from outside, it is only to be used by the corresponding container
      */
    def getDisplayContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getFilterValue filterValue}.
      *
      * Value for filtering ($search)
      *
      * **Note:** This property must not be set from outside, it is only to be used by the corresponding container
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `filterValue`
      */
    def getFilterValue(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns if the value help is used for single selection
      *
      * @returns `true` id single seletion
      */
    def getMaxConditions(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShortTitle shortTitle}.
      *
      * Title text that appears in the dialog header.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `shortTitle`
      */
    def getShortTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Title text that appears tab header.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTokenizerTitle tokenizerTitle}.
      *
      * Title text that appears in the dialog tokenizer panel, when ony one content exist.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `tokenizerTitle`
      */
    def getTokenizerTitle(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * returns the used `ValueHelpDelegate`
      *
      * @returns `Delegate` module
      */
    def getValueHelpDelegate(): Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Determines the `ValueHelp` instance
      *
      * @returns The `ValueHelp` instance
      */
    def getValueHelpInstance(): typings.openui5.sapUiMdcValueHelpMod.default = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Hide content temporary.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Called if the `conditions` property changed
      */
    def handleConditionsUpdate(/**
      * Change
      */
    oChanges: js.Object): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Called if the `filterValue` property changed
      */
    def handleFilterValueUpdate(/**
      * Change
      */
    oChanges: js.Object): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks if the parent container is open
      *
      * @returns `true` if open
      */
    def isContainerOpen(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks if the parent container is opening
      *
      * @returns `true` if opening
      */
    def isContainerOpening(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns if the value help is used for single selection
      *
      * @returns `true` id single seletion
      */
    def isSingleSelect(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Determines if the container of the content is used as typeAhead inside the value help
      *
      * **Note:** This function is used by the content and must not be used from outside
      *
      * @returns True if used as typeahead
      */
    def isTypeahead(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Determines if delegate of the value help is initialized
      *
      * @returns True if delegate is initialized
      */
    def isValueHelpDelegateInitialized(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Observes property and aggregation changes
      */
    def observeChanges(/**
      * Change
      */
    oChanges: js.Object): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Called if ValueHelp connection to Field changed
      */
    def onConnectionChange(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Performs logic needed if the container closes
      */
    def onContainerClose(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Performs logic needed if the container opens
      */
    def onContainerOpen(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Determines if the the content needs to provide a scrolling mechanism like a {@link sap.m.ScrollContainer ScrollContainer}
      *
      * **Note:** This function is used by the content and must not be used from outside
      *
      * @returns True a scrolling mechanism is needed
      */
    def provideScrolling(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getConditions conditions}.
      *
      * Conditions of the value help
      *
      * **Note:** This property must not be set from outside, it is only to be used by the corresponding container
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setConditions(): this.type = js.native
    def setConditions(/**
      * New value for property `conditions`
      */
    sConditions: js.Array[js.Object]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getConfig config}.
      *
      * Internal configuration
      *
      * **Note:** This property must not be set from outside, it is only to be used by the corresponding container
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `{}`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setConfig(): this.type = js.native
    def setConfig(/**
      * New value for property `config`
      */
    oConfig: js.Object): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getDisplayContent displayContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayContent(
      /**
      * The displayContent to set
      */
    oDisplayContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFilterValue filterValue}.
      *
      * Value for filtering ($search)
      *
      * **Note:** This property must not be set from outside, it is only to be used by the corresponding container
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterValue(): this.type = js.native
    def setFilterValue(/**
      * New value for property `filterValue`
      */
    sFilterValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShortTitle shortTitle}.
      *
      * Title text that appears in the dialog header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShortTitle(): this.type = js.native
    def setShortTitle(/**
      * New value for property `shortTitle`
      */
    sShortTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Title text that appears tab header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTokenizerTitle tokenizerTitle}.
      *
      * Title text that appears in the dialog tokenizer panel, when ony one content exist.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTokenizerTitle(): this.type = js.native
    def setTokenizerTitle(/**
      * New value for property `tokenizerTitle`
      */
    sTokenizerTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Hide content temporary.
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
  }
  
  trait Content$CancelEventParameters extends StObject
  
  trait Content$ConfirmEventParameters extends StObject {
    
    /**
      * True if the value help need to be closed
      */
    var close: js.UndefOr[Boolean] = js.undefined
  }
  object Content$ConfirmEventParameters {
    
    inline def apply(): Content$ConfirmEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content$ConfirmEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content$ConfirmEventParameters] (val x: Self) extends AnyVal {
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    }
  }
  
  trait Content$NavigatedEventParameters extends StObject {
    
    /**
      * Navigated condition.
      *
      * **Note:** A condition must have the structure of {@link sap.ui.mdc.condition.ConditionObject ConditionObject}.
      */
    var condition: js.UndefOr[js.Object] = js.undefined
    
    /**
      * ID of the navigated item. (This is needed to set the corresponding aria-attribute)
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /**
      * True if the focus should be set back to the field.
      */
    var leaveFocus: js.UndefOr[Boolean] = js.undefined
  }
  object Content$NavigatedEventParameters {
    
    inline def apply(): Content$NavigatedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content$NavigatedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content$NavigatedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setCondition(value: js.Object): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setLeaveFocus(value: Boolean): Self = StObject.set(x, "leaveFocus", value.asInstanceOf[js.Any])
      
      inline def setLeaveFocusUndefined: Self = StObject.set(x, "leaveFocus", js.undefined)
    }
  }
  
  trait Content$RequestSwitchToDialogEventParameters extends StObject
  
  trait Content$SelectEventParameters extends StObject {
    
    /**
      * Changed conditions
      *
      * **Note:** A condition must have the structure of {@link sap.ui.mdc.condition.ConditionObject ConditionObject}.
      */
    var conditions: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    /**
      * Type of the selection change (add, remove)
      */
    var `type`: js.UndefOr[/* was: sap.ui.mdc.enums.ValueHelpSelectionType */ Any] = js.undefined
  }
  object Content$SelectEventParameters {
    
    inline def apply(): Content$SelectEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Content$SelectEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content$SelectEventParameters] (val x: Self) extends AnyVal {
      
      inline def setConditions(value: js.Array[js.Object]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: js.Object*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setType(value: /* was: sap.ui.mdc.enums.ValueHelpSelectionType */ Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type ContentCancelEvent = typings.openui5.sapUiBaseEventMod.default[Content$CancelEventParameters]
  
  type ContentCancelEventParameters = Content$CancelEventParameters
  
  type ContentConfirmEvent = typings.openui5.sapUiBaseEventMod.default[Content$ConfirmEventParameters]
  
  type ContentConfirmEventParameters = Content$ConfirmEventParameters
  
  type ContentNavigatedEvent = typings.openui5.sapUiBaseEventMod.default[Content$NavigatedEventParameters]
  
  type ContentNavigatedEventParameters = Content$NavigatedEventParameters
  
  type ContentRequestSwitchToDialogEvent = typings.openui5.sapUiBaseEventMod.default[Content$RequestSwitchToDialogEventParameters]
  
  type ContentRequestSwitchToDialogEventParameters = Content$RequestSwitchToDialogEventParameters
  
  type ContentSelectEvent = typings.openui5.sapUiBaseEventMod.default[Content$SelectEventParameters]
  
  type ContentSelectEventParameters = Content$SelectEventParameters
  
  trait ContentSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Fired if the change is cancelled.
      */
    var cancel: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Conditions of the value help
      *
      * **Note:** This property must not be set from outside, it is only to be used by the corresponding container
      */
    var conditions: js.UndefOr[
        js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Internal configuration
      *
      * **Note:** This property must not be set from outside, it is only to be used by the corresponding container
      */
    var config: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired if a change on the content is confirmed.
      */
    var confirm: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Content$ConfirmEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Content control that is put inside the parent container
      *
      * **Note:** This aggregation must not be set from outside, it is only to be used by the corresponding container
      */
    var displayContent: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Value for filtering ($search)
      *
      * **Note:** This property must not be set from outside, it is only to be used by the corresponding container
      */
    var filterValue: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired if a navigation was executed in the content.
      */
    var navigated: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Content$NavigatedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Fired if the value help should switch to dialog mode.
      */
    var requestSwitchToDialog: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Fired if the selected condition changed.
      */
    var select: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Content$SelectEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Title text that appears in the dialog header.
      */
    var shortTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Title text that appears tab header.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Title text that appears in the dialog tokenizer panel, when ony one content exist.
      */
    var tokenizerTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Hide content temporary.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ContentSettings {
    
    inline def apply(): ContentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentSettings] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setConditions(
        value: js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: js.Object*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setConfig(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setConfirm(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Content$ConfirmEventParameters] => Unit
      ): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setDisplayContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "displayContent", value.asInstanceOf[js.Any])
      
      inline def setDisplayContentUndefined: Self = StObject.set(x, "displayContent", js.undefined)
      
      inline def setFilterValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
      
      inline def setNavigated(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Content$NavigatedEventParameters] => Unit
      ): Self = StObject.set(x, "navigated", js.Any.fromFunction1(value))
      
      inline def setNavigatedUndefined: Self = StObject.set(x, "navigated", js.undefined)
      
      inline def setRequestSwitchToDialog(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "requestSwitchToDialog", js.Any.fromFunction1(value))
      
      inline def setRequestSwitchToDialogUndefined: Self = StObject.set(x, "requestSwitchToDialog", js.undefined)
      
      inline def setSelect(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Content$SelectEventParameters] => Unit
      ): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setShortTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "shortTitle", value.asInstanceOf[js.Any])
      
      inline def setShortTitleUndefined: Self = StObject.set(x, "shortTitle", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTokenizerTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "tokenizerTitle", value.asInstanceOf[js.Any])
      
      inline def setTokenizerTitleUndefined: Self = StObject.set(x, "tokenizerTitle", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
