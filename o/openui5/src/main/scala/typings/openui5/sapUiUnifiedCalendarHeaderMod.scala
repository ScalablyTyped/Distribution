package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedCalendarHeaderMod {
  
  @JSImport("sap/ui/unified/calendar/Header", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Header.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Header {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: HeaderSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: HeaderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: HeaderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/calendar/Header", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.calendar.Header with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, Header]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Header],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.calendar.Header.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Header
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @SINCE 1.32.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:pressButton0 pressButton0} event of this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * First button pressed (normally day)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressButton0(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPressButton0(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.32.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:pressButton0 pressButton0} event of this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * First button pressed (normally day)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressButton0(
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
    def attachPressButton0(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pressButton1 pressButton1} event of this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * Second button pressed (normally month)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressButton1(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPressButton1(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pressButton1 pressButton1} event of this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * Second button pressed (normally month)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressButton1(
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
    def attachPressButton1(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pressButton2 pressButton2} event of this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * Third button pressed (normally year)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressButton2(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPressButton2(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pressButton2 pressButton2} event of this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * Third button pressed (normally year)
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressButton2(
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
    def attachPressButton2(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pressCurrentDate pressCurrentDate} event of
      * this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * Current date button pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressCurrentDate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPressCurrentDate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pressCurrentDate pressCurrentDate} event of
      * this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * Current date button pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressCurrentDate(
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
    def attachPressCurrentDate(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pressNext pressNext} event of this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * Next button pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressNext(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPressNext(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pressNext pressNext} event of this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * Next button pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressNext(
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
    def attachPressNext(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pressPrevious pressPrevious} event of this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * Previous button pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressPrevious(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPressPrevious(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:pressPrevious pressPrevious} event of this `sap.ui.unified.calendar.Header`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.calendar.Header` itself.
      *
      * Previous button pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPressPrevious(
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
    def attachPressPrevious(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.calendar.Header` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:pressButton0 pressButton0} event of this `sap.ui.unified.calendar.Header`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPressButton0(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPressButton0(
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
      * Detaches event handler `fnFunction` from the {@link #event:pressButton1 pressButton1} event of this `sap.ui.unified.calendar.Header`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPressButton1(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPressButton1(
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
      * Detaches event handler `fnFunction` from the {@link #event:pressButton2 pressButton2} event of this `sap.ui.unified.calendar.Header`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPressButton2(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPressButton2(
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
      * Detaches event handler `fnFunction` from the {@link #event:pressCurrentDate pressCurrentDate} event of
      * this `sap.ui.unified.calendar.Header`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPressCurrentDate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPressCurrentDate(
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
      * Detaches event handler `fnFunction` from the {@link #event:pressNext pressNext} event of this `sap.ui.unified.calendar.Header`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPressNext(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPressNext(
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
      * Detaches event handler `fnFunction` from the {@link #event:pressPrevious pressPrevious} event of this
      * `sap.ui.unified.calendar.Header`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPressPrevious(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPressPrevious(
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
      * @SINCE 1.32.0
      *
      * Fires event {@link #event:pressButton0 pressButton0} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePressButton0(): this.type = js.native
    def firePressButton0(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:pressButton1 pressButton1} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePressButton1(): this.type = js.native
    def firePressButton1(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:pressButton2 pressButton2} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePressButton2(): this.type = js.native
    def firePressButton2(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:pressCurrentDate pressCurrentDate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePressCurrentDate(): this.type = js.native
    def firePressCurrentDate(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:pressNext pressNext} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePressNext(): this.type = js.native
    def firePressNext(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:pressPrevious pressPrevious} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePressPrevious(): this.type = js.native
    def firePressPrevious(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getAdditionalTextButton0 additionalTextButton0}.
      *
      * Additional text of the first button (normally day)
      *
      * @returns Value of property `additionalTextButton0`
      */
    def getAdditionalTextButton0(): String = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getAdditionalTextButton1 additionalTextButton1}.
      *
      * Additional text of the second button (normally month)
      *
      * @returns Value of property `additionalTextButton1`
      */
    def getAdditionalTextButton1(): String = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getAdditionalTextButton2 additionalTextButton2}.
      *
      * Additional text of the third button (normally year)
      *
      * @returns Value of property `additionalTextButton2`
      */
    def getAdditionalTextButton2(): String = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Gets current value of property {@link #getAriaLabelButton0 ariaLabelButton0}.
      *
      * aria-label of the first button (normally day)
      *
      * @returns Value of property `ariaLabelButton0`
      */
    def getAriaLabelButton0(): String = js.native
    
    /**
      * Gets current value of property {@link #getAriaLabelButton1 ariaLabelButton1}.
      *
      * aria-label of the second button (normally month)
      *
      * @returns Value of property `ariaLabelButton1`
      */
    def getAriaLabelButton1(): String = js.native
    
    /**
      * Gets current value of property {@link #getAriaLabelButton2 ariaLabelButton2}.
      *
      * aria-label of the third button (normally year)
      *
      * @returns Value of property `ariaLabelButton2`
      */
    def getAriaLabelButton2(): String = js.native
    
    /**
      * Gets current value of property {@link #getEnabledNext enabledNext}.
      *
      * Enables the Next button
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabledNext`
      */
    def getEnabledNext(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabledPrevious enabledPrevious}.
      *
      * Enables the previous button
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabledPrevious`
      */
    def getEnabledPrevious(): Boolean = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Gets current value of property {@link #getTextButton0 textButton0}.
      *
      * Text of the first button (normally day)
      *
      * @returns Value of property `textButton0`
      */
    def getTextButton0(): String = js.native
    
    /**
      * Gets current value of property {@link #getTextButton1 textButton1}.
      *
      * Text of the second button (normally month)
      *
      * @returns Value of property `textButton1`
      */
    def getTextButton1(): String = js.native
    
    /**
      * Gets current value of property {@link #getTextButton2 textButton2}.
      *
      * Text of the third button (normally year)
      *
      * @returns Value of property `textButton2`
      */
    def getTextButton2(): String = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Gets current value of property {@link #getVisibleButton0 visibleButton0}.
      *
      * If set, the first button will be displayed
      *
      * **Note:** The default is set to false to be compatible to older versions
      *
      * Default value is `false`.
      *
      * @returns Value of property `visibleButton0`
      */
    def getVisibleButton0(): Boolean = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Gets current value of property {@link #getVisibleButton1 visibleButton1}.
      *
      * If set, the second button will be displayed
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleButton1`
      */
    def getVisibleButton1(): Boolean = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Gets current value of property {@link #getVisibleButton2 visibleButton2}.
      *
      * If set, the third button will be displayed
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleButton2`
      */
    def getVisibleButton2(): Boolean = js.native
    
    /**
      * @SINCE 1.95.0
      *
      * Gets current value of property {@link #getVisibleCurrentDateButton visibleCurrentDateButton}.
      *
      * If set, the Current date button will be displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `visibleCurrentDateButton`
      */
    def getVisibleCurrentDateButton(): Boolean = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getAdditionalTextButton0 additionalTextButton0}.
      *
      * Additional text of the first button (normally day)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalTextButton0(/**
      * New value for property `additionalTextButton0`
      */
    sAdditionalTextButton0: String): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getAdditionalTextButton1 additionalTextButton1}.
      *
      * Additional text of the second button (normally month)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalTextButton1(/**
      * New value for property `additionalTextButton1`
      */
    sAdditionalTextButton1: String): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getAdditionalTextButton2 additionalTextButton2}.
      *
      * Additional text of the third button (normally year)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalTextButton2(/**
      * New value for property `additionalTextButton2`
      */
    sAdditionalTextButton2: String): this.type = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Sets a new value for property {@link #getAriaLabelButton0 ariaLabelButton0}.
      *
      * aria-label of the first button (normally day)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaLabelButton0(/**
      * New value for property `ariaLabelButton0`
      */
    sAriaLabelButton0: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAriaLabelButton1 ariaLabelButton1}.
      *
      * aria-label of the second button (normally month)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaLabelButton1(/**
      * New value for property `ariaLabelButton1`
      */
    sAriaLabelButton1: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAriaLabelButton2 ariaLabelButton2}.
      *
      * aria-label of the third button (normally year)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaLabelButton2(/**
      * New value for property `ariaLabelButton2`
      */
    sAriaLabelButton2: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabledNext enabledNext}.
      *
      * Enables the Next button
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabledNext(): this.type = js.native
    def setEnabledNext(/**
      * New value for property `enabledNext`
      */
    bEnabledNext: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabledPrevious enabledPrevious}.
      *
      * Enables the previous button
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabledPrevious(): this.type = js.native
    def setEnabledPrevious(/**
      * New value for property `enabledPrevious`
      */
    bEnabledPrevious: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Sets a new value for property {@link #getTextButton0 textButton0}.
      *
      * Text of the first button (normally day)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextButton0(/**
      * New value for property `textButton0`
      */
    sTextButton0: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTextButton1 textButton1}.
      *
      * Text of the second button (normally month)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextButton1(/**
      * New value for property `textButton1`
      */
    sTextButton1: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTextButton2 textButton2}.
      *
      * Text of the third button (normally year)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextButton2(/**
      * New value for property `textButton2`
      */
    sTextButton2: String): this.type = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Sets a new value for property {@link #getVisibleButton0 visibleButton0}.
      *
      * If set, the first button will be displayed
      *
      * **Note:** The default is set to false to be compatible to older versions
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleButton0(): this.type = js.native
    def setVisibleButton0(/**
      * New value for property `visibleButton0`
      */
    bVisibleButton0: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Sets a new value for property {@link #getVisibleButton1 visibleButton1}.
      *
      * If set, the second button will be displayed
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleButton1(): this.type = js.native
    def setVisibleButton1(/**
      * New value for property `visibleButton1`
      */
    bVisibleButton1: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Sets a new value for property {@link #getVisibleButton2 visibleButton2}.
      *
      * If set, the third button will be displayed
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleButton2(): this.type = js.native
    def setVisibleButton2(/**
      * New value for property `visibleButton2`
      */
    bVisibleButton2: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.95.0
      *
      * Sets a new value for property {@link #getVisibleCurrentDateButton visibleCurrentDateButton}.
      *
      * If set, the Current date button will be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleCurrentDateButton(): this.type = js.native
    def setVisibleCurrentDateButton(/**
      * New value for property `visibleCurrentDateButton`
      */
    bVisibleCurrentDateButton: Boolean): this.type = js.native
  }
  
  trait HeaderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.34.0
      *
      * Additional text of the first button (normally day)
      */
    var additionalTextButton0: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Additional text of the second button (normally month)
      */
    var additionalTextButton1: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Additional text of the third button (normally year)
      */
    var additionalTextButton2: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.32.0
      *
      * aria-label of the first button (normally day)
      */
    var ariaLabelButton0: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * aria-label of the second button (normally month)
      */
    var ariaLabelButton1: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * aria-label of the third button (normally year)
      */
    var ariaLabelButton2: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Enables the Next button
      */
    var enabledNext: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables the previous button
      */
    var enabledPrevious: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.32.0
      *
      * First button pressed (normally day)
      */
    var pressButton0: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Second button pressed (normally month)
      */
    var pressButton1: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Third button pressed (normally year)
      */
    var pressButton2: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Current date button pressed
      */
    var pressCurrentDate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Next button pressed
      */
    var pressNext: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Previous button pressed
      */
    var pressPrevious: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.32.0
      *
      * Text of the first button (normally day)
      */
    var textButton0: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Text of the second button (normally month)
      */
    var textButton1: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Text of the third button (normally year)
      */
    var textButton2: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.32.0
      *
      * If set, the first button will be displayed
      *
      * **Note:** The default is set to false to be compatible to older versions
      */
    var visibleButton0: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.32.0
      *
      * If set, the second button will be displayed
      */
    var visibleButton1: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.32.0
      *
      * If set, the third button will be displayed
      */
    var visibleButton2: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.95.0
      *
      * If set, the Current date button will be displayed.
      */
    var visibleCurrentDateButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object HeaderSettings {
    
    inline def apply(): HeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderSettings]
    }
    
    extension [Self <: HeaderSettings](x: Self) {
      
      inline def setAdditionalTextButton0(value: String | PropertyBindingInfo): Self = StObject.set(x, "additionalTextButton0", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextButton0Undefined: Self = StObject.set(x, "additionalTextButton0", js.undefined)
      
      inline def setAdditionalTextButton1(value: String | PropertyBindingInfo): Self = StObject.set(x, "additionalTextButton1", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextButton1Undefined: Self = StObject.set(x, "additionalTextButton1", js.undefined)
      
      inline def setAdditionalTextButton2(value: String | PropertyBindingInfo): Self = StObject.set(x, "additionalTextButton2", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextButton2Undefined: Self = StObject.set(x, "additionalTextButton2", js.undefined)
      
      inline def setAriaLabelButton0(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaLabelButton0", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelButton0Undefined: Self = StObject.set(x, "ariaLabelButton0", js.undefined)
      
      inline def setAriaLabelButton1(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaLabelButton1", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelButton1Undefined: Self = StObject.set(x, "ariaLabelButton1", js.undefined)
      
      inline def setAriaLabelButton2(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaLabelButton2", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelButton2Undefined: Self = StObject.set(x, "ariaLabelButton2", js.undefined)
      
      inline def setEnabledNext(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabledNext", value.asInstanceOf[js.Any])
      
      inline def setEnabledNextUndefined: Self = StObject.set(x, "enabledNext", js.undefined)
      
      inline def setEnabledPrevious(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabledPrevious", value.asInstanceOf[js.Any])
      
      inline def setEnabledPreviousUndefined: Self = StObject.set(x, "enabledPrevious", js.undefined)
      
      inline def setPressButton0(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "pressButton0", js.Any.fromFunction1(value))
      
      inline def setPressButton0Undefined: Self = StObject.set(x, "pressButton0", js.undefined)
      
      inline def setPressButton1(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "pressButton1", js.Any.fromFunction1(value))
      
      inline def setPressButton1Undefined: Self = StObject.set(x, "pressButton1", js.undefined)
      
      inline def setPressButton2(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "pressButton2", js.Any.fromFunction1(value))
      
      inline def setPressButton2Undefined: Self = StObject.set(x, "pressButton2", js.undefined)
      
      inline def setPressCurrentDate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "pressCurrentDate", js.Any.fromFunction1(value))
      
      inline def setPressCurrentDateUndefined: Self = StObject.set(x, "pressCurrentDate", js.undefined)
      
      inline def setPressNext(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "pressNext", js.Any.fromFunction1(value))
      
      inline def setPressNextUndefined: Self = StObject.set(x, "pressNext", js.undefined)
      
      inline def setPressPrevious(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "pressPrevious", js.Any.fromFunction1(value))
      
      inline def setPressPreviousUndefined: Self = StObject.set(x, "pressPrevious", js.undefined)
      
      inline def setTextButton0(value: String | PropertyBindingInfo): Self = StObject.set(x, "textButton0", value.asInstanceOf[js.Any])
      
      inline def setTextButton0Undefined: Self = StObject.set(x, "textButton0", js.undefined)
      
      inline def setTextButton1(value: String | PropertyBindingInfo): Self = StObject.set(x, "textButton1", value.asInstanceOf[js.Any])
      
      inline def setTextButton1Undefined: Self = StObject.set(x, "textButton1", js.undefined)
      
      inline def setTextButton2(value: String | PropertyBindingInfo): Self = StObject.set(x, "textButton2", value.asInstanceOf[js.Any])
      
      inline def setTextButton2Undefined: Self = StObject.set(x, "textButton2", js.undefined)
      
      inline def setVisibleButton0(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleButton0", value.asInstanceOf[js.Any])
      
      inline def setVisibleButton0Undefined: Self = StObject.set(x, "visibleButton0", js.undefined)
      
      inline def setVisibleButton1(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleButton1", value.asInstanceOf[js.Any])
      
      inline def setVisibleButton1Undefined: Self = StObject.set(x, "visibleButton1", js.undefined)
      
      inline def setVisibleButton2(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleButton2", value.asInstanceOf[js.Any])
      
      inline def setVisibleButton2Undefined: Self = StObject.set(x, "visibleButton2", js.undefined)
      
      inline def setVisibleCurrentDateButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleCurrentDateButton", value.asInstanceOf[js.Any])
      
      inline def setVisibleCurrentDateButtonUndefined: Self = StObject.set(x, "visibleCurrentDateButton", js.undefined)
    }
  }
}
