package typings.openui5

import typings.openui5.anon.BeginColumn
import typings.openui5.anon.Direction
import typings.openui5.anon.IsNavigationArrow
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFLibraryMod.LayoutType
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IPlaceholderSupport
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFFlexibleColumnLayoutMod {
  
  @JSImport("sap/f/FlexibleColumnLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.f.FlexibleColumnLayout`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:59a0e11712e84a648bb990a1dba76bc7 Flexible Column Layout}
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/flexible-column-layout/ Flexible Column Layout}
    */
  open class default () extends FlexibleColumnLayout {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FlexibleColumnLayoutSettings) = this()
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
    mSettings: FlexibleColumnLayoutSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FlexibleColumnLayoutSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IPlaceholderSupport: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/FlexibleColumnLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.FlexibleColumnLayout with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, FlexibleColumnLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FlexibleColumnLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.FlexibleColumnLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FlexibleColumnLayout
    extends typings.openui5.sapUiCoreControlMod.default
       with IPlaceholderSupport {
    
    /**
      * Adds some beginColumnPage to the aggregation {@link #getBeginColumnPages beginColumnPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addBeginColumnPage(
      /**
      * The beginColumnPage to add; if empty, nothing is inserted
      */
    oBeginColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some endColumnPage to the aggregation {@link #getEndColumnPages endColumnPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addEndColumnPage(
      /**
      * The endColumnPage to add; if empty, nothing is inserted
      */
    oEndColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some midColumnPage to the aggregation {@link #getMidColumnPages midColumnPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMidColumnPage(
      /**
      * The midColumnPage to add; if empty, nothing is inserted
      */
    oMidColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterBeginColumnNavigate afterBeginColumnNavigate}
      * event of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `Begin` column has completed.
      *
      * NOTE: In case of animated transitions this event is fired with some delay after the navigate event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterBeginColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterBeginColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterBeginColumnNavigate afterBeginColumnNavigate}
      * event of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `Begin` column has completed.
      *
      * NOTE: In case of animated transitions this event is fired with some delay after the navigate event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterBeginColumnNavigate(
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
    def attachAfterBeginColumnNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterEndColumnNavigate afterEndColumnNavigate}
      * event of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `End` column has completed.
      *
      * NOTE: In case of animated transitions this event is fired with some delay after the navigate event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterEndColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterEndColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterEndColumnNavigate afterEndColumnNavigate}
      * event of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `End` column has completed.
      *
      * NOTE: In case of animated transitions this event is fired with some delay after the navigate event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterEndColumnNavigate(
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
    def attachAfterEndColumnNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterMidColumnNavigate afterMidColumnNavigate}
      * event of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `Mid` column has completed.
      *
      * NOTE: In case of animated transitions this event is fired with some delay after the navigate event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterMidColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterMidColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterMidColumnNavigate afterMidColumnNavigate}
      * event of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `Mid` column has completed.
      *
      * NOTE: In case of animated transitions this event is fired with some delay after the navigate event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterMidColumnNavigate(
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
    def attachAfterMidColumnNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beginColumnNavigate beginColumnNavigate} event
      * of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `Begin` column has been triggered. The transition (if
      * any) to the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeginColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeginColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beginColumnNavigate beginColumnNavigate} event
      * of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `Begin` column has been triggered. The transition (if
      * any) to the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeginColumnNavigate(
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
    def attachBeginColumnNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.76
      *
      * Attaches event handler `fnFunction` to the {@link #event:columnResize columnResize} event of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fired when resize of each column has completed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachColumnResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachColumnResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.76
      *
      * Attaches event handler `fnFunction` to the {@link #event:columnResize columnResize} event of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fired when resize of each column has completed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachColumnResize(
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
    def attachColumnResize(
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
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:endColumnNavigate endColumnNavigate} event of
      * this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `End` column has been triggered. The transition (if any)
      * to the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachEndColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachEndColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:endColumnNavigate endColumnNavigate} event of
      * this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `End` column has been triggered. The transition (if any)
      * to the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachEndColumnNavigate(
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
    def attachEndColumnNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:midColumnNavigate midColumnNavigate} event of
      * this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `Mid` column has been triggered. The transition (if any)
      * to the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMidColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachMidColumnNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:midColumnNavigate midColumnNavigate} event of
      * this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fires when navigation between two pages in the `Mid` column has been triggered. The transition (if any)
      * to the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMidColumnNavigate(
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
    def attachMidColumnNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:stateChange stateChange} event of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fired when there is a change in the `layout` property or in the maximum number of columns that can be
      * displayed at once.
      *
      *  The interactions that may lead to a state change are:
      * 	 - the property `layout` was changed indirectly by the user clicking a layout arrow
      * 	 - the user resized the browser beyond a breakpoint, thus changing the maximum number of columns that
      * 			can be displayed at once.
      *
      *  **Note: **The event is suppressed while the control has zero width and will be fired the first time
      * it gets a non-zero width
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:stateChange stateChange} event of this `sap.f.FlexibleColumnLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.FlexibleColumnLayout` itself.
      *
      * Fired when there is a change in the `layout` property or in the maximum number of columns that can be
      * displayed at once.
      *
      *  The interactions that may lead to a state change are:
      * 	 - the property `layout` was changed indirectly by the user clicking a layout arrow
      * 	 - the user resized the browser beyond a breakpoint, thus changing the maximum number of columns that
      * 			can be displayed at once.
      *
      *  **Note: **The event is suppressed while the control has zero width and will be fired the first time
      * it gets a non-zero width
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStateChange(
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
    def attachStateChange(
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
      * Context object to call the event handler with. Defaults to this `sap.f.FlexibleColumnLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Navigates back to a page in the `FlexibleColumnLayout`. Columns are scanned for the page in the following
      * order: `Begin`, `Mid`, `End`.
      *
      * Calling this navigation method, first triggers the (cancelable) navigate event on the SplitContainer,
      * then the BeforeHide pseudo event on the source page, BeforeFirstShow (if applicable), and BeforeShow
      * on the target page. Later, after the transition has completed, the AfterShow pseudo event is triggered
      * on the target page and AfterHide - on the page, which has been left. The given backData object is available
      * in the BeforeFirstShow, BeforeShow, and AfterShow event objects as data property. The original "data"
      * object from the "to" navigation is also available in these event objects.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def backToPage(
      /**
      * The screen to which is being navigated to. The ID or the control itself can be given.
      */
    sPageId: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the back navigation. The event on the target page will contain this data object as backData property.
      * (the original data from the to() navigation will still be available as data property).
      *
      * In scenarios, where the entity triggering the navigation can't or shouldn't directly initialize the target
      * page, it can fill this object and the target page itself (or a listener on it) can take over the initialization,
      * using the given data. For back navigation this can be used, for example, when returning from a detail
      * page to transfer any settings done there.
      *
      * When the transitionParameters object is used, this data object must also be given (either as object or
      * as null) in order to have a proper parameter order.
      */
    oBackData: js.Object,
      /**
      * This optional object can give additional information to the transition function, like the DOM element,
      * which triggered the transition or the desired transition duration. The animation type can NOT be selected
      * here - it is always the inverse of the "to" navigation.
      *
      * In order to use the transitionParameters property, the data property must be used (at least "null" must
      * be given) for a proper parameter order.
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    
    /**
      * Navigates back to the initial/top level of Begin column (this is the element aggregated as "initialPage",
      * or the first added element). NOTE: If already on the initial page, nothing happens. The transition effect
      * which had been used to get to the current page is inverted and used for this navigation.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def backToTopBeginColumn(
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the back navigation. The event on the target page will contain this data object as "backData" property.
      * (The original data from the "to()" navigation will still be available as "data" property.)
      *
      * In scenarios where the entity triggering the navigation can or should not directly initialize the target
      * page, it can fill this object and the target page itself (or a listener on it) can take over the initialization,
      * using the given data. For back navigation this can be used e.g. when returning from a detail page to
      * transfer any settings done there.
      *
      * When the "transitionParameters" object is used, this "data" object must also be given (either as object
      * or as null) in order to have a proper parameter order.
      */
    oBackData: js.Object,
      /**
      * This optional object can give additional information to the transition function, like the DOM element
      * which triggered the transition or the desired transition duration. The animation type can NOT be selected
      * here - it is always the inverse of the "to" navigation.
      *
      * In order to use the transitionParameters property, the data property must be used (at least "null" must
      * be given) for a proper parameter order.
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    
    /**
      * Navigates back to the initial/top level of End column (this is the element aggregated as "initialPage",
      * or the first added element). NOTE: If already on the initial page, nothing happens. The transition effect
      * which had been used to get to the current page is inverted and used for this navigation.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def backToTopEndColumn(
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the back navigation. The event on the target page will contain this data object as "backData" property.
      * (The original data from the "to()" navigation will still be available as "data" property.)
      *
      * In scenarios where the entity triggering the navigation can or should not directly initialize the target
      * page, it can fill this object and the target page itself (or a listener on it) can take over the initialization,
      * using the given data. For back navigation this can be used e.g. when returning from a detail page to
      * transfer any settings done there.
      *
      * When the "transitionParameters" object is used, this "data" object must also be given (either as object
      * or as null) in order to have a proper parameter order.
      */
    oBackData: js.Object,
      /**
      * This optional object can give additional information to the transition function, like the DOM element
      * which triggered the transition or the desired transition duration. The animation type can NOT be selected
      * here - it is always the inverse of the "to" navigation.
      *
      * In order to use the transitionParameters property, the data property must be used (at least "null" must
      * be given) for a proper parameter order.
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    
    /**
      * Navigates back to the initial/top level of Mid column (this is the element aggregated as "initialPage",
      * or the first added element). NOTE: If already on the initial page, nothing happens. The transition effect
      * which had been used to get to the current page is inverted and used for this navigation.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def backToTopMidColumn(
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the back navigation. The event on the target page will contain this data object as "backData" property.
      * (The original data from the "to()" navigation will still be available as "data" property.)
      *
      * In scenarios where the entity triggering the navigation can or should not directly initialize the target
      * page, it can fill this object and the target page itself (or a listener on it) can take over the initialization,
      * using the given data. For back navigation this can be used e.g. when returning from a detail page to
      * transfer any settings done there.
      *
      * When the "transitionParameters" object is used, this "data" object must also be given (either as object
      * or as null) in order to have a proper parameter order.
      */
    oBackData: js.Object,
      /**
      * This optional object can give additional information to the transition function, like the DOM element
      * which triggered the transition or the desired transition duration. The animation type can NOT be selected
      * here - it is always the inverse of the "to" navigation.
      *
      * In order to use the transitionParameters property, the data property must be used (at least "null" must
      * be given) for a proper parameter order.
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the beginColumnPages in the aggregation {@link #getBeginColumnPages beginColumnPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBeginColumnPages(): this.type = js.native
    
    /**
      * Destroys all the endColumnPages in the aggregation {@link #getEndColumnPages endColumnPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyEndColumnPages(): this.type = js.native
    
    /**
      * @SINCE 1.95
      *
      * Destroys the landmarkInfo in the aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLandmarkInfo(): this.type = js.native
    
    /**
      * Destroys all the midColumnPages in the aggregation {@link #getMidColumnPages midColumnPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMidColumnPages(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterBeginColumnNavigate afterBeginColumnNavigate}
      * event of this `sap.f.FlexibleColumnLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterBeginColumnNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterBeginColumnNavigate(
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
      * Detaches event handler `fnFunction` from the {@link #event:afterEndColumnNavigate afterEndColumnNavigate}
      * event of this `sap.f.FlexibleColumnLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterEndColumnNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterEndColumnNavigate(
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
      * Detaches event handler `fnFunction` from the {@link #event:afterMidColumnNavigate afterMidColumnNavigate}
      * event of this `sap.f.FlexibleColumnLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterMidColumnNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterMidColumnNavigate(
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
      * Detaches event handler `fnFunction` from the {@link #event:beginColumnNavigate beginColumnNavigate} event
      * of this `sap.f.FlexibleColumnLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeginColumnNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeginColumnNavigate(
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
      * @SINCE 1.76
      *
      * Detaches event handler `fnFunction` from the {@link #event:columnResize columnResize} event of this `sap.f.FlexibleColumnLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachColumnResize(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachColumnResize(
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
      * Detaches event handler `fnFunction` from the {@link #event:endColumnNavigate endColumnNavigate} event
      * of this `sap.f.FlexibleColumnLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachEndColumnNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachEndColumnNavigate(
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
      * Detaches event handler `fnFunction` from the {@link #event:midColumnNavigate midColumnNavigate} event
      * of this `sap.f.FlexibleColumnLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMidColumnNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachMidColumnNavigate(
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
      * Detaches event handler `fnFunction` from the {@link #event:stateChange stateChange} event of this `sap.f.FlexibleColumnLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachStateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachStateChange(
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
      * Fires event {@link #event:afterBeginColumnNavigate afterBeginColumnNavigate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterBeginColumnNavigate(): this.type = js.native
    def fireAfterBeginColumnNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): this.type = js.native
    
    /**
      * Fires event {@link #event:afterEndColumnNavigate afterEndColumnNavigate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterEndColumnNavigate(): this.type = js.native
    def fireAfterEndColumnNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): this.type = js.native
    
    /**
      * Fires event {@link #event:afterMidColumnNavigate afterMidColumnNavigate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterMidColumnNavigate(): this.type = js.native
    def fireAfterMidColumnNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): this.type = js.native
    
    /**
      * Fires event {@link #event:beginColumnNavigate beginColumnNavigate} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireBeginColumnNavigate(): Boolean = js.native
    def fireBeginColumnNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): Boolean = js.native
    
    /**
      * @SINCE 1.76
      *
      * Fires event {@link #event:columnResize columnResize} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireColumnResize(): this.type = js.native
    def fireColumnResize(/**
      * Parameters to pass along with the event
      */
    mParameters: BeginColumn): this.type = js.native
    
    /**
      * Fires event {@link #event:endColumnNavigate endColumnNavigate} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireEndColumnNavigate(): Boolean = js.native
    def fireEndColumnNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): Boolean = js.native
    
    /**
      * Fires event {@link #event:midColumnNavigate midColumnNavigate} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireMidColumnNavigate(): Boolean = js.native
    def fireMidColumnNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): Boolean = js.native
    
    /**
      * Fires event {@link #event:stateChange stateChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireStateChange(): this.type = js.native
    def fireStateChange(/**
      * Parameters to pass along with the event
      */
    mParameters: IsNavigationArrow): this.type = js.native
    
    /**
      * @SINCE 1.76
      *
      * Gets current value of property {@link #getAutoFocus autoFocus}.
      *
      * Determines whether the initial focus is set automatically on first rendering and after navigating to
      * a new page.
      *
      * For more information, see {@link sap.m.NavContainer#autoFocus}.
      *
      * Default value is `true`.
      *
      * @returns Value of property `autoFocus`
      */
    def getAutoFocus(): Boolean = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Specifies the background color of the content. The visualization of the different options depends on
      * the used theme.
      *
      * Default value is `Transparent`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getBeginColumnPages beginColumnPages}.
      *
      * The content entities between which the `FlexibleColumnLayout` navigates in the `Begin` column.
      *
      * These should be any control with page semantics. These aggregated controls will receive navigation events
      * like {@link sap.m.NavContainerChild#event:BeforeShow BeforeShow}, they are documented in the pseudo interface
      * {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
      */
    def getBeginColumnPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Returns the currently displayed Begin column page.
      *
      * @returns The UI5 control in the Begin column
      */
    def getCurrentBeginColumnPage(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Returns the currently displayed End column page.
      *
      * @returns The UI5 control in the End column
      */
    def getCurrentEndColumnPage(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Returns the currently displayed Mid column page.
      *
      * @returns The UI5 control in the Mid column
      */
    def getCurrentMidColumnPage(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getDefaultTransitionNameBeginColumn defaultTransitionNameBeginColumn}.
      *
      * Determines the type of the transition/animation to apply for the `Begin` column when `to()` is called
      * without defining the transition to use. The default is `slide`, other options are `fade`, `flip`, `show`,
      * and the names of any registered custom transitions.
      *
      * Default value is `"slide"`.
      *
      * @returns Value of property `defaultTransitionNameBeginColumn`
      */
    def getDefaultTransitionNameBeginColumn(): String = js.native
    
    /**
      * Gets current value of property {@link #getDefaultTransitionNameEndColumn defaultTransitionNameEndColumn}.
      *
      * Determines the type of the transition/animation to apply for the `End` column when `to()` is called without
      * defining the transition to use. The default is `slide`, other options are `fade`, `flip`, `show`, and
      * the names of any registered custom transitions.
      *
      * Default value is `"slide"`.
      *
      * @returns Value of property `defaultTransitionNameEndColumn`
      */
    def getDefaultTransitionNameEndColumn(): String = js.native
    
    /**
      * Gets current value of property {@link #getDefaultTransitionNameMidColumn defaultTransitionNameMidColumn}.
      *
      * Determines the type of the transition/animation to apply for the `Mid` column when `to()` is called without
      * defining the transition to use. The default is `slide`, other options are `fade`, `flip`, `show`, and
      * the names of any registered custom transitions.
      *
      * Default value is `"slide"`.
      *
      * @returns Value of property `defaultTransitionNameMidColumn`
      */
    def getDefaultTransitionNameMidColumn(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getEndColumnPages endColumnPages}.
      *
      * The content entities between which the `FlexibleColumnLayout` navigates in the `End` column.
      *
      * These should be any control with page semantics. These aggregated controls will receive navigation events
      * like {@link sap.m.NavContainerChild#event:BeforeShow BeforeShow}, they are documented in the pseudo interface
      * {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
      */
    def getEndColumnPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getInitialBeginColumnPage initialBeginColumnPage},
      * or `null`.
      */
    def getInitialBeginColumnPage(): ID = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getInitialEndColumnPage initialEndColumnPage},
      * or `null`.
      */
    def getInitialEndColumnPage(): ID = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getInitialMidColumnPage initialMidColumnPage},
      * or `null`.
      */
    def getInitialMidColumnPage(): ID = js.native
    
    /**
      * @SINCE 1.95
      *
      * Gets content of aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * Accessible landmark settings to be applied on the containers of the `sap.f.FlexibleColumnLayout` control.
      *
      * If not set, no landmarks will be written.
      */
    def getLandmarkInfo(): typings.openui5.sapFFlexibleColumnLayoutAccessibleLandmarkInfoMod.default = js.native
    
    /**
      * Gets current value of property {@link #getLayout layout}.
      *
      * Determines the layout of the control - number of visible columns and their relative sizes.
      *
      * For more details, see {@link topic:3b9f760da5b64adf8db7f95247879086 Types of Layout} in the documentation.
      *
      * Default value is `OneColumn`.
      *
      * @returns Value of property `layout`
      */
    def getLayout(): LayoutType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutType * / any */ String) = js.native
    
    /**
      * Returns the maximum number of columns that can be displayed at once based on the control width
      *
      * @returns The maximum number of columns
      */
    def getMaxColumnsCount(): Double = js.native
    
    /**
      * Gets content of aggregation {@link #getMidColumnPages midColumnPages}.
      *
      * The content entities between which the `FlexibleColumnLayout` navigates in the `Mid` column.
      *
      * These should be any control with page semantics. These aggregated controls will receive navigation events
      * like {@link sap.m.NavContainerChild#event:BeforeShow BeforeShow}, they are documented in the pseudo interface
      * {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
      */
    def getMidColumnPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.77
      *
      * Gets current value of property {@link #getRestoreFocusOnBackNavigation restoreFocusOnBackNavigation}.
      *
      * Determines whether the focus is restored to the last known when navigating back to a prevously opened
      * column, for example, upon closing of the end column and being transfered back to the mid column.
      *
      * Default value is `false`.
      *
      * @returns Value of property `restoreFocusOnBackNavigation`
      */
    def getRestoreFocusOnBackNavigation(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getBeginColumnPages beginColumnPages}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfBeginColumnPage(
      /**
      * The beginColumnPage whose index is looked for
      */
    oBeginColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getEndColumnPages endColumnPages}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfEndColumnPage(
      /**
      * The endColumnPage whose index is looked for
      */
    oEndColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getMidColumnPages midColumnPages}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMidColumnPage(
      /**
      * The midColumnPage whose index is looked for
      */
    oMidColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a beginColumnPage into the aggregation {@link #getBeginColumnPages beginColumnPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertBeginColumnPage(
      /**
      * The beginColumnPage to insert; if empty, nothing is inserted
      */
    oBeginColumnPage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the beginColumnPage should be inserted at; for a negative value of `iIndex`, the
      * beginColumnPage is inserted at position 0; for a value greater than the current size of the aggregation,
      * the beginColumnPage is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a endColumnPage into the aggregation {@link #getEndColumnPages endColumnPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertEndColumnPage(
      /**
      * The endColumnPage to insert; if empty, nothing is inserted
      */
    oEndColumnPage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the endColumnPage should be inserted at; for a negative value of `iIndex`, the endColumnPage
      * is inserted at position 0; for a value greater than the current size of the aggregation, the endColumnPage
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a midColumnPage into the aggregation {@link #getMidColumnPages midColumnPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMidColumnPage(
      /**
      * The midColumnPage to insert; if empty, nothing is inserted
      */
    oMidColumnPage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the midColumnPage should be inserted at; for a negative value of `iIndex`, the midColumnPage
      * is inserted at position 0; for a value greater than the current size of the aggregation, the midColumnPage
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getBeginColumnPages beginColumnPages}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllBeginColumnPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getEndColumnPages endColumnPages}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllEndColumnPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMidColumnPages midColumnPages}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMidColumnPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeBeginColumnPage(/**
      * The beginColumnPage to remove or its index or id
      */
    vBeginColumnPage: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a beginColumnPage from the aggregation {@link #getBeginColumnPages beginColumnPages}.
      *
      * @returns The removed beginColumnPage or `null`
      */
    def removeBeginColumnPage(/**
      * The beginColumnPage to remove or its index or id
      */
    vBeginColumnPage: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeBeginColumnPage(
      /**
      * The beginColumnPage to remove or its index or id
      */
    vBeginColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeEndColumnPage(/**
      * The endColumnPage to remove or its index or id
      */
    vEndColumnPage: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a endColumnPage from the aggregation {@link #getEndColumnPages endColumnPages}.
      *
      * @returns The removed endColumnPage or `null`
      */
    def removeEndColumnPage(/**
      * The endColumnPage to remove or its index or id
      */
    vEndColumnPage: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeEndColumnPage(
      /**
      * The endColumnPage to remove or its index or id
      */
    vEndColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeMidColumnPage(/**
      * The midColumnPage to remove or its index or id
      */
    vMidColumnPage: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a midColumnPage from the aggregation {@link #getMidColumnPages midColumnPages}.
      *
      * @returns The removed midColumnPage or `null`
      */
    def removeMidColumnPage(/**
      * The midColumnPage to remove or its index or id
      */
    vMidColumnPage: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeMidColumnPage(
      /**
      * The midColumnPage to remove or its index or id
      */
    vMidColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @SINCE 1.76
      *
      * Sets a new value for property {@link #getAutoFocus autoFocus}.
      *
      * Determines whether the initial focus is set automatically on first rendering and after navigating to
      * a new page.
      *
      * For more information, see {@link sap.m.NavContainer#autoFocus}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoFocus(): this.type = js.native
    def setAutoFocus(/**
      * New value for property `autoFocus`
      */
    bAutoFocus: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Specifies the background color of the content. The visualization of the different options depends on
      * the used theme.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Transparent`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(): this.type = js.native
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: BackgroundDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDefaultTransitionNameBeginColumn defaultTransitionNameBeginColumn}.
      *
      * Determines the type of the transition/animation to apply for the `Begin` column when `to()` is called
      * without defining the transition to use. The default is `slide`, other options are `fade`, `flip`, `show`,
      * and the names of any registered custom transitions.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"slide"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultTransitionNameBeginColumn(): this.type = js.native
    def setDefaultTransitionNameBeginColumn(
      /**
      * New value for property `defaultTransitionNameBeginColumn`
      */
    sDefaultTransitionNameBeginColumn: String
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDefaultTransitionNameEndColumn defaultTransitionNameEndColumn}.
      *
      * Determines the type of the transition/animation to apply for the `End` column when `to()` is called without
      * defining the transition to use. The default is `slide`, other options are `fade`, `flip`, `show`, and
      * the names of any registered custom transitions.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"slide"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultTransitionNameEndColumn(): this.type = js.native
    def setDefaultTransitionNameEndColumn(
      /**
      * New value for property `defaultTransitionNameEndColumn`
      */
    sDefaultTransitionNameEndColumn: String
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDefaultTransitionNameMidColumn defaultTransitionNameMidColumn}.
      *
      * Determines the type of the transition/animation to apply for the `Mid` column when `to()` is called without
      * defining the transition to use. The default is `slide`, other options are `fade`, `flip`, `show`, and
      * the names of any registered custom transitions.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"slide"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultTransitionNameMidColumn(): this.type = js.native
    def setDefaultTransitionNameMidColumn(
      /**
      * New value for property `defaultTransitionNameMidColumn`
      */
    sDefaultTransitionNameMidColumn: String
    ): this.type = js.native
    
    def setInitialBeginColumnPage(
      /**
      * ID of an element which becomes the new target of this initialBeginColumnPage association; alternatively,
      * an element instance may be given
      */
    oInitialBeginColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getInitialBeginColumnPage initialBeginColumnPage}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialBeginColumnPage(
      /**
      * ID of an element which becomes the new target of this initialBeginColumnPage association; alternatively,
      * an element instance may be given
      */
    oInitialBeginColumnPage: ID
    ): this.type = js.native
    
    def setInitialEndColumnPage(
      /**
      * ID of an element which becomes the new target of this initialEndColumnPage association; alternatively,
      * an element instance may be given
      */
    oInitialEndColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getInitialEndColumnPage initialEndColumnPage}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialEndColumnPage(
      /**
      * ID of an element which becomes the new target of this initialEndColumnPage association; alternatively,
      * an element instance may be given
      */
    oInitialEndColumnPage: ID
    ): this.type = js.native
    
    def setInitialMidColumnPage(
      /**
      * ID of an element which becomes the new target of this initialMidColumnPage association; alternatively,
      * an element instance may be given
      */
    oInitialMidColumnPage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getInitialMidColumnPage initialMidColumnPage}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialMidColumnPage(
      /**
      * ID of an element which becomes the new target of this initialMidColumnPage association; alternatively,
      * an element instance may be given
      */
    oInitialMidColumnPage: ID
    ): this.type = js.native
    
    /**
      * @SINCE 1.95
      *
      * Sets the aggregated {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLandmarkInfo(
      /**
      * The landmarkInfo to set
      */
    oLandmarkInfo: typings.openui5.sapFFlexibleColumnLayoutAccessibleLandmarkInfoMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLayout layout}.
      *
      * Determines the layout of the control - number of visible columns and their relative sizes.
      *
      * For more details, see {@link topic:3b9f760da5b64adf8db7f95247879086 Types of Layout} in the documentation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `OneColumn`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayout(): this.type = js.native
    def setLayout(
      /**
      * New value for property `layout`
      */
    sLayout: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutType * / any */ String
    ): this.type = js.native
    def setLayout(/**
      * New value for property `layout`
      */
    sLayout: LayoutType): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Sets a new value for property {@link #getRestoreFocusOnBackNavigation restoreFocusOnBackNavigation}.
      *
      * Determines whether the focus is restored to the last known when navigating back to a prevously opened
      * column, for example, upon closing of the end column and being transfered back to the mid column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRestoreFocusOnBackNavigation(): this.type = js.native
    def setRestoreFocusOnBackNavigation(
      /**
      * New value for property `restoreFocusOnBackNavigation`
      */
    bRestoreFocusOnBackNavigation: Boolean
    ): this.type = js.native
    
    /**
      * Navigates to the given page inside the FlexibleColumnLayout. Columns are scanned for the page in the
      * following order: `Begin`, `Mid`, `End`.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def to(
      /**
      * The screen to which we are navigating to. The ID or the control itself can be given.
      */
    sPageId: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page. The
      * BeforeShow event on the target page will contain this data object as data property.
      *
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the transitionParameters object is used, this "data" object must also be given (either as object
      * or as null) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * This optional object can contain additional information for the transition function, like the DOM element
      * which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the "data" parameter must be given when the transitionParameters parameter
      * is used (it can be given as "null").
      *
      * NOTE: It depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide" and "fade" transitions do not use
      * any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    /**
      * Navigates to the given page inside the FlexibleColumnLayout. Columns are scanned for the page in the
      * following order: `Begin`, `Mid`, `End`.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def to(
      /**
      * The screen to which we are navigating to. The ID or the control itself can be given.
      */
    sPageId: String,
      /**
      * The type of the transition/animation to apply. Options are: "slide" (horizontal movement from the right),
      * "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page. The
      * BeforeShow event on the target page will contain this data object as data property.
      *
      * Use case: in scenarios where the entity triggering the navigation can or should not directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the transitionParameters object is used, this "data" object must also be given (either as object
      * or as null) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * This optional object can contain additional information for the transition function, like the DOM element
      * which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the "data" parameter must be given when the transitionParameters parameter
      * is used (it can be given as "null").
      *
      * NOTE: It depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide" and "fade" transitions do not use
      * any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    
    /**
      * Navigates to a given Begin column page.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def toBeginColumnPage(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    sPageId: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page. The
      * BeforeShow event on the target page will contain this data object as data property.
      *
      * Use case: in scenarios where the entity triggering the navigation can't or shouldn't directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the transitionParameters object is used, this data object must also be given (either as object or
      * as null) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * This optional object can contain additional information for the transition function, like the DOM element,
      * which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the data parameter must be given when the transitionParameters parameter
      * is used (it can be given as "null").
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide" and "fade" transitions do not use
      * any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    /**
      * Navigates to a given Begin column page.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def toBeginColumnPage(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    sPageId: String,
      /**
      * The type of the transition/animation to apply. Options are: "slide" (horizontal movement from the right),
      * "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page. The
      * BeforeShow event on the target page will contain this data object as data property.
      *
      * Use case: in scenarios where the entity triggering the navigation can't or shouldn't directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the transitionParameters object is used, this data object must also be given (either as object or
      * as null) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * This optional object can contain additional information for the transition function, like the DOM element,
      * which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the data parameter must be given when the transitionParameters parameter
      * is used (it can be given as "null").
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide" and "fade" transitions do not use
      * any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    
    /**
      * Navigates to a given End column page.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def toEndColumnPage(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    sPageId: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page. The
      * BeforeShow event on the target page will contain this data object as data property.
      *
      * Use case: in scenarios where the entity triggering the navigation can't or shouldn't directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the transitionParameters object is used, this data object must also be given (either as object or
      * as null) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * This optional object can contain additional information for the transition function, like the DOM element,
      * which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the data parameter must be given when the transitionParameters parameter
      * is used (it can be given as "null").
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide" and "fade" transitions do not use
      * any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    /**
      * Navigates to a given End column page.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def toEndColumnPage(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    sPageId: String,
      /**
      * The type of the transition/animation to apply. Options are: "slide" (horizontal movement from the right),
      * "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page. The
      * BeforeShow event on the target page will contain this data object as data property.
      *
      * Use case: in scenarios where the entity triggering the navigation can't or shouldn't directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the transitionParameters object is used, this data object must also be given (either as object or
      * as null) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * This optional object can contain additional information for the transition function, like the DOM element,
      * which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the data parameter must be given when the transitionParameters parameter
      * is used (it can be given as "null").
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide" and "fade" transitions do not use
      * any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    
    /**
      * Navigates to a given Mid column page.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def toMidColumnPage(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    sPageId: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page. The
      * BeforeShow event on the target page will contain this data object as data property.
      *
      * Use case: in scenarios where the entity triggering the navigation can't or shouldn't directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the transitionParameters object is used, this data object must also be given (either as object or
      * as null) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * This optional object can contain additional information for the transition function, like the DOM element,
      * which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the data parameter must be given when the transitionParameters parameter
      * is used (it can be given as "null").
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide" and "fade" transitions do not use
      * any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
    /**
      * Navigates to a given Mid column page.
      *
      * @returns The `sap.f.FlexibleColumnLayout` instance
      */
    def toMidColumnPage(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    sPageId: String,
      /**
      * The type of the transition/animation to apply. Options are: "slide" (horizontal movement from the right),
      * "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String,
      /**
      * This optional object can carry any payload data which should be made available to the target page. The
      * BeforeShow event on the target page will contain this data object as data property.
      *
      * Use case: in scenarios where the entity triggering the navigation can't or shouldn't directly initialize
      * the target page, it can fill this object and the target page itself (or a listener on it) can take over
      * the initialization, using the given data.
      *
      * When the transitionParameters object is used, this data object must also be given (either as object or
      * as null) in order to have a proper parameter order.
      */
    oData: js.Object,
      /**
      * This optional object can contain additional information for the transition function, like the DOM element,
      * which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the data parameter must be given when the transitionParameters parameter
      * is used (it can be given as "null").
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide" and "fade" transitions do not use
      * any parameter.
      */
    oTransitionParameters: js.Object
    ): this.type = js.native
  }
  
  trait FlexibleColumnLayoutSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fires when navigation between two pages in the `Begin` column has completed.
      *
      * NOTE: In case of animated transitions this event is fired with some delay after the navigate event.
      */
    var afterBeginColumnNavigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fires when navigation between two pages in the `End` column has completed.
      *
      * NOTE: In case of animated transitions this event is fired with some delay after the navigate event.
      */
    var afterEndColumnNavigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fires when navigation between two pages in the `Mid` column has completed.
      *
      * NOTE: In case of animated transitions this event is fired with some delay after the navigate event.
      */
    var afterMidColumnNavigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.76
      *
      * Determines whether the initial focus is set automatically on first rendering and after navigating to
      * a new page.
      *
      * For more information, see {@link sap.m.NavContainer#autoFocus}.
      */
    var autoFocus: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Specifies the background color of the content. The visualization of the different options depends on
      * the used theme.
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fires when navigation between two pages in the `Begin` column has been triggered. The transition (if
      * any) to the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      */
    var beginColumnNavigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The content entities between which the `FlexibleColumnLayout` navigates in the `Begin` column.
      *
      * These should be any control with page semantics. These aggregated controls will receive navigation events
      * like {@link sap.m.NavContainerChild#event:BeforeShow BeforeShow}, they are documented in the pseudo interface
      * {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
      */
    var beginColumnPages: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.76
      *
      * Fired when resize of each column has completed.
      */
    var columnResize: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines the type of the transition/animation to apply for the `Begin` column when `to()` is called
      * without defining the transition to use. The default is `slide`, other options are `fade`, `flip`, `show`,
      * and the names of any registered custom transitions.
      */
    var defaultTransitionNameBeginColumn: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the type of the transition/animation to apply for the `End` column when `to()` is called without
      * defining the transition to use. The default is `slide`, other options are `fade`, `flip`, `show`, and
      * the names of any registered custom transitions.
      */
    var defaultTransitionNameEndColumn: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the type of the transition/animation to apply for the `Mid` column when `to()` is called without
      * defining the transition to use. The default is `slide`, other options are `fade`, `flip`, `show`, and
      * the names of any registered custom transitions.
      */
    var defaultTransitionNameMidColumn: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fires when navigation between two pages in the `End` column has been triggered. The transition (if any)
      * to the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      */
    var endColumnNavigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The content entities between which the `FlexibleColumnLayout` navigates in the `End` column.
      *
      * These should be any control with page semantics. These aggregated controls will receive navigation events
      * like {@link sap.m.NavContainerChild#event:BeforeShow BeforeShow}, they are documented in the pseudo interface
      * {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
      */
    var endColumnPages: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the initial `Begin` column page, which is displayed on application launch.
      */
    var initialBeginColumnPage: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Sets the initial `End` column page, which is displayed on application launch.
      */
    var initialEndColumnPage: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Sets the initial `Mid` column page, which is displayed on application launch.
      */
    var initialMidColumnPage: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.95
      *
      * Accessible landmark settings to be applied on the containers of the `sap.f.FlexibleColumnLayout` control.
      *
      * If not set, no landmarks will be written.
      */
    var landmarkInfo: js.UndefOr[typings.openui5.sapFFlexibleColumnLayoutAccessibleLandmarkInfoMod.default] = js.undefined
    
    /**
      * Determines the layout of the control - number of visible columns and their relative sizes.
      *
      * For more details, see {@link topic:3b9f760da5b64adf8db7f95247879086 Types of Layout} in the documentation.
      */
    var layout: js.UndefOr[
        LayoutType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fires when navigation between two pages in the `Mid` column has been triggered. The transition (if any)
      * to the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      */
    var midColumnNavigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The content entities between which the `FlexibleColumnLayout` navigates in the `Mid` column.
      *
      * These should be any control with page semantics. These aggregated controls will receive navigation events
      * like {@link sap.m.NavContainerChild#event:BeforeShow BeforeShow}, they are documented in the pseudo interface
      * {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
      */
    var midColumnPages: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.77
      *
      * Determines whether the focus is restored to the last known when navigating back to a prevously opened
      * column, for example, upon closing of the end column and being transfered back to the mid column.
      */
    var restoreFocusOnBackNavigation: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when there is a change in the `layout` property or in the maximum number of columns that can be
      * displayed at once.
      *
      *  The interactions that may lead to a state change are:
      * 	 - the property `layout` was changed indirectly by the user clicking a layout arrow
      * 	 - the user resized the browser beyond a breakpoint, thus changing the maximum number of columns that
      * 			can be displayed at once.
      *
      *  **Note: **The event is suppressed while the control has zero width and will be fired the first time
      * it gets a non-zero width
      */
    var stateChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object FlexibleColumnLayoutSettings {
    
    inline def apply(): FlexibleColumnLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexibleColumnLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlexibleColumnLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setAfterBeginColumnNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterBeginColumnNavigate", js.Any.fromFunction1(value))
      
      inline def setAfterBeginColumnNavigateUndefined: Self = StObject.set(x, "afterBeginColumnNavigate", js.undefined)
      
      inline def setAfterEndColumnNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterEndColumnNavigate", js.Any.fromFunction1(value))
      
      inline def setAfterEndColumnNavigateUndefined: Self = StObject.set(x, "afterEndColumnNavigate", js.undefined)
      
      inline def setAfterMidColumnNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterMidColumnNavigate", js.Any.fromFunction1(value))
      
      inline def setAfterMidColumnNavigateUndefined: Self = StObject.set(x, "afterMidColumnNavigate", js.undefined)
      
      inline def setAutoFocus(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setBeginColumnNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beginColumnNavigate", js.Any.fromFunction1(value))
      
      inline def setBeginColumnNavigateUndefined: Self = StObject.set(x, "beginColumnNavigate", js.undefined)
      
      inline def setBeginColumnPages(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "beginColumnPages", value.asInstanceOf[js.Any])
      
      inline def setBeginColumnPagesUndefined: Self = StObject.set(x, "beginColumnPages", js.undefined)
      
      inline def setBeginColumnPagesVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "beginColumnPages", js.Array(value*))
      
      inline def setColumnResize(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "columnResize", js.Any.fromFunction1(value))
      
      inline def setColumnResizeUndefined: Self = StObject.set(x, "columnResize", js.undefined)
      
      inline def setDefaultTransitionNameBeginColumn(value: String | PropertyBindingInfo): Self = StObject.set(x, "defaultTransitionNameBeginColumn", value.asInstanceOf[js.Any])
      
      inline def setDefaultTransitionNameBeginColumnUndefined: Self = StObject.set(x, "defaultTransitionNameBeginColumn", js.undefined)
      
      inline def setDefaultTransitionNameEndColumn(value: String | PropertyBindingInfo): Self = StObject.set(x, "defaultTransitionNameEndColumn", value.asInstanceOf[js.Any])
      
      inline def setDefaultTransitionNameEndColumnUndefined: Self = StObject.set(x, "defaultTransitionNameEndColumn", js.undefined)
      
      inline def setDefaultTransitionNameMidColumn(value: String | PropertyBindingInfo): Self = StObject.set(x, "defaultTransitionNameMidColumn", value.asInstanceOf[js.Any])
      
      inline def setDefaultTransitionNameMidColumnUndefined: Self = StObject.set(x, "defaultTransitionNameMidColumn", js.undefined)
      
      inline def setEndColumnNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "endColumnNavigate", js.Any.fromFunction1(value))
      
      inline def setEndColumnNavigateUndefined: Self = StObject.set(x, "endColumnNavigate", js.undefined)
      
      inline def setEndColumnPages(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "endColumnPages", value.asInstanceOf[js.Any])
      
      inline def setEndColumnPagesUndefined: Self = StObject.set(x, "endColumnPages", js.undefined)
      
      inline def setEndColumnPagesVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "endColumnPages", js.Array(value*))
      
      inline def setInitialBeginColumnPage(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialBeginColumnPage", value.asInstanceOf[js.Any])
      
      inline def setInitialBeginColumnPageUndefined: Self = StObject.set(x, "initialBeginColumnPage", js.undefined)
      
      inline def setInitialEndColumnPage(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialEndColumnPage", value.asInstanceOf[js.Any])
      
      inline def setInitialEndColumnPageUndefined: Self = StObject.set(x, "initialEndColumnPage", js.undefined)
      
      inline def setInitialMidColumnPage(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialMidColumnPage", value.asInstanceOf[js.Any])
      
      inline def setInitialMidColumnPageUndefined: Self = StObject.set(x, "initialMidColumnPage", js.undefined)
      
      inline def setLandmarkInfo(value: typings.openui5.sapFFlexibleColumnLayoutAccessibleLandmarkInfoMod.default): Self = StObject.set(x, "landmarkInfo", value.asInstanceOf[js.Any])
      
      inline def setLandmarkInfoUndefined: Self = StObject.set(x, "landmarkInfo", js.undefined)
      
      inline def setLayout(
        value: LayoutType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMidColumnNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "midColumnNavigate", js.Any.fromFunction1(value))
      
      inline def setMidColumnNavigateUndefined: Self = StObject.set(x, "midColumnNavigate", js.undefined)
      
      inline def setMidColumnPages(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "midColumnPages", value.asInstanceOf[js.Any])
      
      inline def setMidColumnPagesUndefined: Self = StObject.set(x, "midColumnPages", js.undefined)
      
      inline def setMidColumnPagesVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "midColumnPages", js.Array(value*))
      
      inline def setRestoreFocusOnBackNavigation(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "restoreFocusOnBackNavigation", value.asInstanceOf[js.Any])
      
      inline def setRestoreFocusOnBackNavigationUndefined: Self = StObject.set(x, "restoreFocusOnBackNavigation", js.undefined)
      
      inline def setStateChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "stateChange", js.Any.fromFunction1(value))
      
      inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
    }
  }
}
