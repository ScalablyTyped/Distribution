package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValuehelpBaseContainerMod {
  
  @JSImport("sap/ui/mdc/valuehelp/base/Container", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Container`.
    *
    * This is the basis for different value help containers. It cannot be used directly.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Container {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: ContainerSettings) = this()
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
    mSettings: ContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: ContainerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/valuehelp/base/Container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.valuehelp.base.Container with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, Container]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Container],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.valuehelp.base.Container.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Container
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseContentMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
      *
      * Fired if the value help is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
      *
      * Fired if the value help is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
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
    def attachClosed(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
      *
      * Fired if a change on the value help is confirmed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerConfirmEvent, Unit]
    ): this.type = js.native
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerConfirmEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
      *
      * Fired if a change on the value help is confirmed
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
    fnFunction: js.Function1[/* p1 */ ContainerConfirmEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ ContainerConfirmEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigated navigated} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
      *
      * Fired if a navigation was executed in the content of the container
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerNavigatedEvent, Unit]
    ): this.type = js.native
    def attachNavigated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerNavigatedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigated navigated} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
      *
      * Fired if a navigation was executed in the content of the container
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
    fnFunction: js.Function1[/* p1 */ ContainerNavigatedEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ ContainerNavigatedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:opened opened} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
      *
      * Fired if the value help is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:opened opened} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
      *
      * Fired if the value help is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpened(
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
    def attachOpened(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestDelegateContent requestDelegateContent }
      * event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
      *
      * Fired if the Container requests the delegate content.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRequestDelegateContent(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerRequestDelegateContentEvent, Unit]
    ): this.type = js.native
    def attachRequestDelegateContent(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerRequestDelegateContentEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestDelegateContent requestDelegateContent }
      * event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
      *
      * Fired if the Container requests the delegate content.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRequestDelegateContent(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerRequestDelegateContentEvent, Unit]
    ): this.type = js.native
    def attachRequestDelegateContent(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerRequestDelegateContentEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestSwitchToDialog requestSwitchToDialog }
      * event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestSwitchToDialog requestSwitchToDialog }
      * event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
      *
      * Fired if the selected condition changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerSelectEvent, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.base.Container` itself.
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
    fnFunction: js.Function1[/* p1 */ ContainerSelectEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ ContainerSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.base.Container`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Binds the content to the container
      */
    def bindContentToContainer(/**
      * content
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseContentMod.default): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Closes the container control or element
      */
    def closeContainer(): Unit = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.ui.mdc.valuehelp.base.Container`.
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
      * Detaches event handler `fnFunction` from the {@link #event:closed closed} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachClosed(
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
      * Detaches event handler `fnFunction` from the {@link #event:confirm confirm} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerConfirmEvent, Unit]
    ): this.type = js.native
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerConfirmEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:navigated navigated} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavigated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerNavigatedEvent, Unit]
    ): this.type = js.native
    def detachNavigated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerNavigatedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:opened opened} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpened(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachOpened(
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
      * Detaches event handler `fnFunction` from the {@link #event:requestDelegateContent requestDelegateContent }
      * event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRequestDelegateContent(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerRequestDelegateContentEvent, Unit]
    ): this.type = js.native
    def detachRequestDelegateContent(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerRequestDelegateContentEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:requestSwitchToDialog requestSwitchToDialog }
      * event of this `sap.ui.mdc.valuehelp.base.Container`.
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
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.mdc.valuehelp.base.Container`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerSelectEvent, Unit]
    ): this.type = js.native
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ContainerSelectEvent, Unit],
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
      * Fires event {@link #event:closed closed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClosed(): this.type = js.native
    def fireClosed(/**
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
    mParameters: Container$ConfirmEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:navigated navigated} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavigated(): this.type = js.native
    def fireNavigated(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Container$NavigatedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:opened opened} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOpened(): this.type = js.native
    def fireOpened(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:requestDelegateContent requestDelegateContent} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRequestDelegateContent(): this.type = js.native
    def fireRequestDelegateContent(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Container$RequestDelegateContentEventParameters
    ): this.type = js.native
    
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
    mParameters: Container$SelectEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the confoguration for a specific content
      *
      * @returns configuration
      */
    def getContainerConfig(/**
      * content
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseContentMod.default): js.Object = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the container control or element to be opened (for example Popover or Dialog)
      */
    def getContainerControl(): Unit = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Content of the container. This aggregation holds the actual controls enabling the user to select items
      * or create conditions (e.g. tables or condition panels)
      */
    def getContent(): js.Array[typings.openui5.sapUiMdcValuehelpBaseContentMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns control connected to value help
      *
      * @returns connected control
      */
    def getControl(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getLocalFilterValue localFilterValue}.
      *
      * This property may be used by FilterableListContents to share basic search state in collective search
      * scenarios
      *
      * @returns Value of property `localFilterValue`
      */
    def getLocalFilterValue(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the maximum allowed number of conditions, -1 if no limit is set
      *
      * @returns maximum allowed number of conditions
      */
    def getMaxConditions(): int = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the promise for content creation
      *
      * @returns Promise for delegate content
      */
    def getRetrieveDelegateContentPromise(): js.Promise[Any] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Return the currently used content
      *
      * @returns currently used content
      */
    def getSelectedContent(): typings.openui5.sapUiMdcValuehelpBaseContentMod.default = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Title text that appears in the dialog or tab header.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the UIArea of the content
      *
      * @returns The UI area of the content or `null`
      */
    def getUIAreaForContent(): typings.openui5.sapUiCoreUiareaMod.default | Null = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Handles the `cancelled` event of the content
      *
      * Here the {@link #events/cancel cancel} event needs to be fired.
      */
    def handleCanceled(/**
      * event
      */
    oEvent: typings.openui5.sapUiBaseEventMod.default[js.Object]): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Handles the `closed` event of the container control or element
      */
    def handleClosed(/**
      * event
      */
    oEvent: typings.openui5.sapUiBaseEventMod.default[js.Object]): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Handles the `confirmed` event of the content
      *
      * Here the {@link #events/confirm confirm} event needs to be fired.
      */
    def handleConfirmed(/**
      * event
      */
    oEvent: typings.openui5.sapUiBaseEventMod.default[js.Object]): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Handles the `requestSwitchToDialog` event of the content
      */
    def handleNavigated(/**
      * event
      */
    oEvent: typings.openui5.sapUiBaseEventMod.default[js.Object]): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Handles the `opened` event of the container control or element
      */
    def handleOpened(/**
      * event
      */
    oEvent: typings.openui5.sapUiBaseEventMod.default[js.Object]): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Handles the `navigated` event of the content
      */
    def handleRequestSwitchToDialog(/**
      * event
      */
    oEvent: typings.openui5.sapUiBaseEventMod.default[js.Object]): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Handles the `select` event of the content
      *
      * Here the {@link #events/select select} event needs to be fired.
      */
    def handleSelect(/**
      * event
      */
    oEvent: typings.openui5.sapUiBaseEventMod.default[js.Object]): Unit = js.native
    
    /**
      * Checks for the provided `sap.ui.mdc.valuehelp.base.Content` in the aggregation {@link #getContent content}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseContentMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseContentMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
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
      * Triggers navigation in the content of the container.
      */
    def navigateInContent(
      /**
      * Number of steps for navigation (e.g. 1 means next item, -1 means previous item)
      */
    iStep: int
    ): Unit = js.native
    
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
      * Opens the container control or element
      */
    def openContainer(
      /**
      * container
      */
    oContainer: typings.openui5.sapUiCoreElementMod.default,
      /**
      * if set, container is opened for typeahead
      */
    bTypeahead: Boolean
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Places the content into the container control or element
      *
      * @returns container
      */
    def placeContent(/**
      * container
      */
    oContainer: typings.openui5.sapUiCoreElementMod.default): typings.openui5.sapUiCoreElementMod.default = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiMdcValuehelpBaseContentMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiMdcValuehelpBaseContentMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiMdcValuehelpBaseContentMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiMdcValuehelpBaseContentMod.default
    ): typings.openui5.sapUiMdcValuehelpBaseContentMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getLocalFilterValue localFilterValue}.
      *
      * This property may be used by FilterableListContents to share basic search state in collective search
      * scenarios
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLocalFilterValue(/**
      * New value for property `localFilterValue`
      */
    sLocalFilterValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Title text that appears in the dialog or tab header.
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
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Unbinds the content from the container
      */
    def unbindContentFromContainer(/**
      * content
      */
    oContent: typings.openui5.sapUiMdcValuehelpBaseContentMod.default): Unit = js.native
  }
  
  trait Container$CancelEventParameters extends StObject
  
  trait Container$ClosedEventParameters extends StObject
  
  trait Container$ConfirmEventParameters extends StObject {
    
    /**
      * True if the value help needs to be closed
      */
    var close: js.UndefOr[Boolean] = js.undefined
  }
  object Container$ConfirmEventParameters {
    
    inline def apply(): Container$ConfirmEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Container$ConfirmEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Container$ConfirmEventParameters] (val x: Self) extends AnyVal {
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    }
  }
  
  trait Container$NavigatedEventParameters extends StObject {
    
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
  object Container$NavigatedEventParameters {
    
    inline def apply(): Container$NavigatedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Container$NavigatedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Container$NavigatedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setCondition(value: js.Object): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setLeaveFocus(value: Boolean): Self = StObject.set(x, "leaveFocus", value.asInstanceOf[js.Any])
      
      inline def setLeaveFocusUndefined: Self = StObject.set(x, "leaveFocus", js.undefined)
    }
  }
  
  trait Container$OpenedEventParameters extends StObject
  
  trait Container$RequestDelegateContentEventParameters extends StObject {
    
    /**
      * Content wrapper id for which contents are requested
      */
    var contentId: js.UndefOr[String] = js.undefined
  }
  object Container$RequestDelegateContentEventParameters {
    
    inline def apply(): Container$RequestDelegateContentEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Container$RequestDelegateContentEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Container$RequestDelegateContentEventParameters] (val x: Self) extends AnyVal {
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    }
  }
  
  trait Container$RequestSwitchToDialogEventParameters extends StObject
  
  trait Container$SelectEventParameters extends StObject {
    
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
  object Container$SelectEventParameters {
    
    inline def apply(): Container$SelectEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Container$SelectEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Container$SelectEventParameters] (val x: Self) extends AnyVal {
      
      inline def setConditions(value: js.Array[js.Object]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: js.Object*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setType(value: /* was: sap.ui.mdc.enums.ValueHelpSelectionType */ Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type ContainerCancelEvent = typings.openui5.sapUiBaseEventMod.default[Container$CancelEventParameters]
  
  type ContainerCancelEventParameters = Container$CancelEventParameters
  
  type ContainerClosedEvent = typings.openui5.sapUiBaseEventMod.default[Container$ClosedEventParameters]
  
  type ContainerClosedEventParameters = Container$ClosedEventParameters
  
  type ContainerConfirmEvent = typings.openui5.sapUiBaseEventMod.default[Container$ConfirmEventParameters]
  
  type ContainerConfirmEventParameters = Container$ConfirmEventParameters
  
  type ContainerNavigatedEvent = typings.openui5.sapUiBaseEventMod.default[Container$NavigatedEventParameters]
  
  type ContainerNavigatedEventParameters = Container$NavigatedEventParameters
  
  type ContainerOpenedEvent = typings.openui5.sapUiBaseEventMod.default[Container$OpenedEventParameters]
  
  type ContainerOpenedEventParameters = Container$OpenedEventParameters
  
  type ContainerRequestDelegateContentEvent = typings.openui5.sapUiBaseEventMod.default[Container$RequestDelegateContentEventParameters]
  
  type ContainerRequestDelegateContentEventParameters = Container$RequestDelegateContentEventParameters
  
  type ContainerRequestSwitchToDialogEvent = typings.openui5.sapUiBaseEventMod.default[Container$RequestSwitchToDialogEventParameters]
  
  type ContainerRequestSwitchToDialogEventParameters = Container$RequestSwitchToDialogEventParameters
  
  type ContainerSelectEvent = typings.openui5.sapUiBaseEventMod.default[Container$SelectEventParameters]
  
  type ContainerSelectEventParameters = Container$SelectEventParameters
  
  trait ContainerSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Fired if the change is cancelled.
      */
    var cancel: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Fired if the value help is closed.
      */
    var closed: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Fired if a change on the value help is confirmed
      */
    var confirm: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Container$ConfirmEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Content of the container. This aggregation holds the actual controls enabling the user to select items
      * or create conditions (e.g. tables or condition panels)
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiMdcValuehelpBaseContentMod.default] | typings.openui5.sapUiMdcValuehelpBaseContentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property may be used by FilterableListContents to share basic search state in collective search
      * scenarios
      */
    var localFilterValue: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired if a navigation was executed in the content of the container
      */
    var navigated: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Container$NavigatedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Fired if the value help is opened.
      */
    var opened: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Fired if the Container requests the delegate content.
      */
    var requestDelegateContent: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Container$RequestDelegateContentEventParameters], 
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
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Container$SelectEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Title text that appears in the dialog or tab header.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ContainerSettings {
    
    inline def apply(): ContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerSettings] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setClosed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setConfirm(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Container$ConfirmEventParameters] => Unit
      ): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiMdcValuehelpBaseContentMod.default] | typings.openui5.sapUiMdcValuehelpBaseContentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiMdcValuehelpBaseContentMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setLocalFilterValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "localFilterValue", value.asInstanceOf[js.Any])
      
      inline def setLocalFilterValueUndefined: Self = StObject.set(x, "localFilterValue", js.undefined)
      
      inline def setNavigated(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Container$NavigatedEventParameters] => Unit
      ): Self = StObject.set(x, "navigated", js.Any.fromFunction1(value))
      
      inline def setNavigatedUndefined: Self = StObject.set(x, "navigated", js.undefined)
      
      inline def setOpened(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "opened", js.Any.fromFunction1(value))
      
      inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
      
      inline def setRequestDelegateContent(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Container$RequestDelegateContentEventParameters] => Unit
      ): Self = StObject.set(x, "requestDelegateContent", js.Any.fromFunction1(value))
      
      inline def setRequestDelegateContentUndefined: Self = StObject.set(x, "requestDelegateContent", js.undefined)
      
      inline def setRequestSwitchToDialog(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "requestSwitchToDialog", js.Any.fromFunction1(value))
      
      inline def setRequestSwitchToDialogUndefined: Self = StObject.set(x, "requestSwitchToDialog", js.undefined)
      
      inline def setSelect(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Container$SelectEventParameters] => Unit
      ): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
