package typings.openui5

import typings.openui5.anon.Direction
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.SplitAppMode
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IPlaceholderSupport
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSplitContainerMod {
  
  @JSImport("sap/m/SplitContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SplitContainer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SplitContainer {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SplitContainerSettings) = this()
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
    mSettings: SplitContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SplitContainerSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IPlaceholderSupport: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SplitContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.SplitContainer with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, SplitContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SplitContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.SplitContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SplitContainer
    extends typings.openui5.sapUiCoreControlMod.default
       with IPlaceholderSupport {
    
    /**
      * Adds some detailPage to the aggregation {@link #getDetailPages detailPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addDetailPage(
      /**
      * The detailPage to add; if empty, nothing is inserted
      */
    oDetailPage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some masterPage to the aggregation {@link #getMasterPages masterPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMasterPage(
      /**
      * The masterPage to add; if empty, nothing is inserted
      */
    oMasterPage: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.11.1
      *
      * Adds a content entity either to master area or detail area depending on the master parameter.
      *
      * The method is provided mainly for providing API consistency between sap.m.SplitContainer and sap.m.App.
      * So that the same code line can be reused.
      */
    def addPage(
      /**
      * The content entities between which this SplitContainer navigates in either master area or detail area
      * depending on the master parameter. These can be of type sap.m.Page, sap.ui.core.mvc.View, sap.m.Carousel
      * or any other control with fullscreen/page semantics.
      */
    oPage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * States if the page should be added to the master area. If it's set to false, the page is added to detail
      * area.
      */
    bMaster: Boolean
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterDetailNavigate afterDetailNavigate} event
      * of this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when navigation between two pages in detail area has completed. NOTE: In case of animated transitions
      * this event is fired with some delay after the "navigate" event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterDetailNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterDetailNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterDetailNavigate afterDetailNavigate} event
      * of this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when navigation between two pages in detail area has completed. NOTE: In case of animated transitions
      * this event is fired with some delay after the "navigate" event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterDetailNavigate(
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
    def attachAfterDetailNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterMasterClose afterMasterClose} event of
      * this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when the master area is fully closed after the animation (if any).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterMasterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterMasterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterMasterClose afterMasterClose} event of
      * this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when the master area is fully closed after the animation (if any).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterMasterClose(
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
    def attachAfterMasterClose(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterMasterNavigate afterMasterNavigate} event
      * of this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when navigation between two pages in master area has completed. NOTE: In case of animated transitions
      * this event is fired with some delay after the navigate event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterMasterNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterMasterNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterMasterNavigate afterMasterNavigate} event
      * of this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when navigation between two pages in master area has completed. NOTE: In case of animated transitions
      * this event is fired with some delay after the navigate event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterMasterNavigate(
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
    def attachAfterMasterNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterMasterOpen afterMasterOpen} event of this
      * `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when the master area is fully opened after animation if any.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterMasterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterMasterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterMasterOpen afterMasterOpen} event of this
      * `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when the master area is fully opened after animation if any.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterMasterOpen(
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
    def attachAfterMasterOpen(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeMasterClose beforeMasterClose} event of
      * this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires before the master area is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeMasterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeMasterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeMasterClose beforeMasterClose} event of
      * this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires before the master area is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeMasterClose(
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
    def attachBeforeMasterClose(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeMasterOpen beforeMasterOpen} event of
      * this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires before the master area is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeMasterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeMasterOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeMasterOpen beforeMasterOpen} event of
      * this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires before the master area is opened.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeMasterOpen(
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
    def attachBeforeMasterOpen(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:detailNavigate detailNavigate} event of this
      * `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when navigation between two pages in detail area has been triggered. The transition (if any) to
      * the new page has not started yet. NOTE: This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDetailNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDetailNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:detailNavigate detailNavigate} event of this
      * `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when navigation between two pages in detail area has been triggered. The transition (if any) to
      * the new page has not started yet. NOTE: This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDetailNavigate(
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
    def attachDetailNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:masterButton masterButton} event of this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when a Master Button needs to be shown or hidden. This is necessary for custom headers when the
      * SplitContainer control does not handle the placement of the master button automatically.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMasterButton(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachMasterButton(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:masterButton masterButton} event of this `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when a Master Button needs to be shown or hidden. This is necessary for custom headers when the
      * SplitContainer control does not handle the placement of the master button automatically.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMasterButton(
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
    def attachMasterButton(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:masterNavigate masterNavigate} event of this
      * `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when navigation between two pages in master area has been triggered. The transition (if any) to
      * the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMasterNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachMasterNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:masterNavigate masterNavigate} event of this
      * `sap.m.SplitContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitContainer` itself.
      *
      * Fires when navigation between two pages in master area has been triggered. The transition (if any) to
      * the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMasterNavigate(
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
    def attachMasterNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SplitContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Navigates back to the previous detail page found in the history.
      */
    def backDetail(
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the back navigation. The event on the target page will contain this data object as backData property.
      * (The original data from the to() navigation will still be available as data property.)
      *
      * In scenarios where the entity triggering the navigation can or should not directly initialize the target
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
    ): Unit = js.native
    
    /**
      * Navigates back to the previous master page which is found in the history.
      */
    def backMaster(
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the back navigation. The event on the target page will contain this data object as backData property
      * (the original data from the to() navigation will still be available as data property).
      *
      * In scenarios where the entity triggering the navigation can or should not directly initialize the target
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
    ): Unit = js.native
    
    /**
      * @SINCE 1.10.0
      *
      * Navigates back to the nearest previous page in the SplitContainer history with the given ID (if there
      * is no such page among the previous pages, nothing happens). The transition effect, which had been used
      * to get to the current page is inverted and used for this navigation.
      *
      * Calling this navigation method, first triggers the (cancelable) navigate event on the SplitContainer,
      * then the BeforeHide pseudo event on the source page, BeforeFirstShow (if applicable), and BeforeShow
      * on the target page. Later, after the transition has completed, the AfterShow pseudo event is triggered
      * on the target page and AfterHide - on the page, which has been left. The given backData object is available
      * in the BeforeFirstShow, BeforeShow, and AfterShow event objects as data property. The original "data"
      * object from the "to" navigation is also available in these event objects.
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
    ): Unit = js.native
    
    /**
      * Navigates back to the initial/top level of Detail (this is the element aggregated as initialPage, or
      * the first added element). NOTE: If already on the initial page, nothing happens. The transition effect
      * which had been used to get to the current page is inverted and used for this navigation.
      */
    def backToTopDetail(
      /**
      * This optional object can carry any payload data which should be made available to the target page of
      * the back navigation. The event on the target page will contain this data object as backData property
      * (the original data from the to() navigation will still be available as data property).
      *
      * In scenarios where the entity triggering the navigation can or should not directly initialize the target
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
    ): Unit = js.native
    
    /**
      * Navigates back to the initial/top level of Master (this is the element aggregated as "initialPage", or
      * the first added element). NOTE: If already on the initial page, nothing happens. The transition effect
      * which had been used to get to the current page is inverted and used for this navigation.
      */
    def backToTopMaster(
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
    ): Unit = js.native
    
    /**
      * Destroys all the detailPages in the aggregation {@link #getDetailPages detailPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDetailPages(): this.type = js.native
    
    /**
      * Destroys all the masterPages in the aggregation {@link #getMasterPages masterPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMasterPages(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterDetailNavigate afterDetailNavigate} event
      * of this `sap.m.SplitContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterDetailNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterDetailNavigate(
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
      * Detaches event handler `fnFunction` from the {@link #event:afterMasterClose afterMasterClose} event of
      * this `sap.m.SplitContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterMasterClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterMasterClose(
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
      * Detaches event handler `fnFunction` from the {@link #event:afterMasterNavigate afterMasterNavigate} event
      * of this `sap.m.SplitContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterMasterNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterMasterNavigate(
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
      * Detaches event handler `fnFunction` from the {@link #event:afterMasterOpen afterMasterOpen} event of
      * this `sap.m.SplitContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterMasterOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterMasterOpen(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeMasterClose beforeMasterClose} event
      * of this `sap.m.SplitContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeMasterClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeMasterClose(
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
      * Detaches event handler `fnFunction` from the {@link #event:beforeMasterOpen beforeMasterOpen} event of
      * this `sap.m.SplitContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeMasterOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeMasterOpen(
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
      * Detaches event handler `fnFunction` from the {@link #event:detailNavigate detailNavigate} event of this
      * `sap.m.SplitContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDetailNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDetailNavigate(
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
      * Detaches event handler `fnFunction` from the {@link #event:masterButton masterButton} event of this `sap.m.SplitContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMasterButton(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachMasterButton(
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
      * Detaches event handler `fnFunction` from the {@link #event:masterNavigate masterNavigate} event of this
      * `sap.m.SplitContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMasterNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachMasterNavigate(
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
      * Fires event {@link #event:afterDetailNavigate afterDetailNavigate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterDetailNavigate(): this.type = js.native
    def fireAfterDetailNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): this.type = js.native
    
    /**
      * Fires event {@link #event:afterMasterClose afterMasterClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterMasterClose(): this.type = js.native
    def fireAfterMasterClose(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:afterMasterNavigate afterMasterNavigate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterMasterNavigate(): this.type = js.native
    def fireAfterMasterNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): this.type = js.native
    
    /**
      * Fires event {@link #event:afterMasterOpen afterMasterOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterMasterOpen(): this.type = js.native
    def fireAfterMasterOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:beforeMasterClose beforeMasterClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeMasterClose(): this.type = js.native
    def fireBeforeMasterClose(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:beforeMasterOpen beforeMasterOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeMasterOpen(): this.type = js.native
    def fireBeforeMasterOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:detailNavigate detailNavigate} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireDetailNavigate(): Boolean = js.native
    def fireDetailNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): Boolean = js.native
    
    /**
      * Fires event {@link #event:masterButton masterButton} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMasterButton(): this.type = js.native
    def fireMasterButton(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:masterNavigate masterNavigate} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireMasterNavigate(): Boolean = js.native
    def fireMasterNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Direction): Boolean = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Gets current value of property {@link #getBackgroundColor backgroundColor}.
      *
      * Determines the background color of the SplitContainer. If set, this color overrides the default one,
      * which is defined by the theme (should only be used when really required). Any configured background image
      * will be placed above this colored background, but any theme adaptation in the Theme Designer will override
      * this setting. Use the backgroundRepeat property to define whether this image should be stretched to cover
      * the complete SplitContainer or whether it should be tiled.
      *
      * @returns Value of property `backgroundColor`
      */
    def getBackgroundColor(): String = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Gets current value of property {@link #getBackgroundImage backgroundImage}.
      *
      * Sets the background image of the SplitContainer. When set, this image overrides the default background
      * defined by the theme (should only be used when really required). This background image will be placed
      * above any color set for the background, but any theme adaptation in the Theme Designer will override
      * this image setting. Use the backgroundRepeat property to define whether this image should be stretched
      * to cover the complete SplitContainer or whether it should be tiled.
      *
      * @returns Value of property `backgroundImage`
      */
    def getBackgroundImage(): URI = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Gets current value of property {@link #getBackgroundOpacity backgroundOpacity}.
      *
      * Defines the opacity of the background image - between 0 (fully transparent) and 1 (fully opaque). This
      * can be used to improve the content visibility by making the background image partly transparent.
      *
      * Default value is `1`.
      *
      * @returns Value of property `backgroundOpacity`
      */
    def getBackgroundOpacity(): float = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Gets current value of property {@link #getBackgroundRepeat backgroundRepeat}.
      *
      * Defines whether the background image (if configured) is proportionally stretched to cover the whole SplitContainer
      * (false) or whether it should be tiled (true).
      *
      * Default value is `false`.
      *
      * @returns Value of property `backgroundRepeat`
      */
    def getBackgroundRepeat(): Boolean = js.native
    
    /**
      * Returns the current displayed detail page.
      */
    def getCurrentDetailPage(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Returns the current displayed master page.
      */
    def getCurrentMasterPage(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.11.1
      *
      * Returns the currently displayed page either in master area or in detail area. When the parameter is set
      * to true, the current page in master area is returned, otherwise, the current page in detail area is returned.
      *
      * This method is provided mainly for API consistency between sap.m.SplitContainer and sap.m.App, so that
      * the same code line can be reused.
      */
    def getCurrentPage(
      /**
      * States if this function returns the current page in master area. If it's set to false, the current page
      * in detail area will be returned.
      */
    bMaster: Boolean
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getDefaultTransitionNameDetail defaultTransitionNameDetail}.
      *
      * Determines the type of the transition/animation to apply when to() is called without defining the transition
      * to use. The default is "slide", other options are "fade", "show", and the names of any registered custom
      * transitions.
      *
      * Default value is `"slide"`.
      *
      * @returns Value of property `defaultTransitionNameDetail`
      */
    def getDefaultTransitionNameDetail(): String = js.native
    
    /**
      * Gets current value of property {@link #getDefaultTransitionNameMaster defaultTransitionNameMaster}.
      *
      * Determines the type of the transition/animation to apply when to() is called, without defining the transition
      * to use. The default is "slide", other options are "fade", "show", and the names of any registered custom
      * transitions.
      *
      * Default value is `"slide"`.
      *
      * @returns Value of property `defaultTransitionNameMaster`
      */
    def getDefaultTransitionNameMaster(): String = js.native
    
    /**
      * @SINCE 1.11.1
      *
      * Returns the page with the given ID in detail area. If there's no page that has the given ID, null is
      * returned.
      *
      * @returns the requested page
      */
    def getDetailPage(/**
      * The ID of the page that needs to be fetched.
      */
    pageId: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Gets content of aggregation {@link #getDetailPages detailPages}.
      *
      * Determines the content entities, between which the SplitContainer navigates in detail area. These can
      * be of type sap.m.Page, sap.ui.core.mvc.View, sap.m.Carousel or any other control with fullscreen/page
      * semantics. These aggregated controls receive navigation events like {@link sap.m.NavContainerChild#event:BeforeShow
      * BeforeShow}, they are documented in the pseudo interface {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
      */
    def getDetailPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getInitialDetail initialDetail},
      * or `null`.
      */
    def getInitialDetail(): ID = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getInitialMaster initialMaster},
      * or `null`.
      */
    def getInitialMaster(): ID = js.native
    
    /**
      * Gets current value of property {@link #getMasterButtonText masterButtonText}.
      *
      * Determines the text displayed in master button, which has a default value "Navigation". This text is
      * only displayed in iOS platform and the icon from the current page in detail area is displayed in the
      * master button for the other platforms. The master button is shown/hidden depending on the orientation
      * of the device and whether the master area is opened or not. SplitContainer manages the show/hide of the
      * master button by itself only when the pages added to the detail area are sap.m.Page with built-in header
      * or sap.m.Page with built-in header, which is wrapped by one or several sap.ui.core.mvc.View. Otherwise,
      * the show/hide of master button needs to be managed by the application.
      *
      * @returns Value of property `masterButtonText`
      */
    def getMasterButtonText(): String = js.native
    
    /**
      * @SINCE 1.48
      *
      * Gets current value of property {@link #getMasterButtonTooltip masterButtonTooltip}.
      *
      * Specifies the tooltip of the master button. If the tooltip is not specified, the title of the page, which
      * is displayed is the master part, is set as tooltip to the master button.
      *
      * @returns Value of property `masterButtonTooltip`
      */
    def getMasterButtonTooltip(): String = js.native
    
    /**
      * @SINCE 1.11.1
      *
      * Returns the page with the given ID in master area (if there's no page that has the given ID, null is
      * returned).
      *
      * @returns The requested page
      */
    def getMasterPage(/**
      * The ID of the page that needs to be fetched
      */
    pageId: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Gets content of aggregation {@link #getMasterPages masterPages}.
      *
      * Determines the content entities, between which the SplitContainer navigates in master area. These can
      * be of type sap.m.Page, sap.ui.core.mvc.View, sap.m.Carousel or any other control with fullscreen/page
      * semantics. These aggregated controls receive navigation events like {@link sap.m.NavContainerChild#event:BeforeShow
      * BeforeShow}, they are documented in the pseudo interface {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
      */
    def getMasterPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMode mode}.
      *
      * Defines whether the master page will always be displayed (in portrait and landscape mode - StretchCompressMode),
      * or if it should be hidden when in portrait mode (ShowHideMode). Default is ShowHideMode. Other possible
      * values are Hide (Master is always hidden) and Popover (master is displayed in popover).
      *
      * Default value is `ShowHideMode`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): SplitAppMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SplitAppMode * / any */ String) = js.native
    
    /**
      * @SINCE 1.11.1
      *
      * Returns the page with the given ID from either master area, or detail area depending on the master parameter
      * (if there's no page that has the given ID, null is returned).
      */
    def getPage(
      /**
      * The ID of the page that needs to be fetched
      */
    pageId: String,
      /**
      * If the page with given ID should be fetched from the master area. If it's set to false, the page will
      * be fetched from detail area.
      */
    bMaster: Boolean
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Returns the previous page (the page, from which the user drilled down to the current page with to()).
      * Note: this is not the page, which the user has seen before, but the page which is the target of the next
      * back() navigation. If there is no previous page, "undefined" is returned.
      */
    def getPreviousPage(
      /**
      * States if this function returns the previous page in master area. If it's set to false, the previous
      * page in detail area will be returned.
      */
    bMaster: Boolean
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Used to hide the master page when in ShowHideMode and the device is in portrait mode.
      */
    def hideMaster(): this.type = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getDetailPages detailPages}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfDetailPage(
      /**
      * The detailPage whose index is looked for
      */
    oDetailPage: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getMasterPages masterPages}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMasterPage(
      /**
      * The masterPage whose index is looked for
      */
    oMasterPage: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a detailPage into the aggregation {@link #getDetailPages detailPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertDetailPage(
      /**
      * The detailPage to insert; if empty, nothing is inserted
      */
    oDetailPage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the detailPage should be inserted at; for a negative value of `iIndex`, the detailPage
      * is inserted at position 0; for a value greater than the current size of the aggregation, the detailPage
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a masterPage into the aggregation {@link #getMasterPages masterPages}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMasterPage(
      /**
      * The masterPage to insert; if empty, nothing is inserted
      */
    oMasterPage: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the masterPage should be inserted at; for a negative value of `iIndex`, the masterPage
      * is inserted at position 0; for a value greater than the current size of the aggregation, the masterPage
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts the page/control with the specified ID into the navigation history stack of the NavContainer.
      *
      * This can be used for deep-linking when the user directly reached a drilldown detail page using a bookmark
      * and then wants to navigate up in the drilldown hierarchy. Normally, such a back navigation would not
      * be possible as there is no previous page in the SplitContainer's history stack.
      */
    def insertPreviousPage(
      /**
      * The ID of the control/page/screen, which is inserted into the history stack. The respective control must
      * be aggregated by the SplitContainer, otherwise this will cause an error.
      */
    sPageId: String,
      /**
      * This optional object can carry any payload data which would have been given to the inserted previous
      * page if the user would have done a normal forward navigation to it.
      */
    oData: js.Object
    ): this.type = js.native
    /**
      * Inserts the page/control with the specified ID into the navigation history stack of the NavContainer.
      *
      * This can be used for deep-linking when the user directly reached a drilldown detail page using a bookmark
      * and then wants to navigate up in the drilldown hierarchy. Normally, such a back navigation would not
      * be possible as there is no previous page in the SplitContainer's history stack.
      */
    def insertPreviousPage(
      /**
      * The ID of the control/page/screen, which is inserted into the history stack. The respective control must
      * be aggregated by the SplitContainer, otherwise this will cause an error.
      */
    sPageId: String,
      /**
      * The type of the transition/animation which would have been used to navigate from the (inserted) previous
      * page to the current page. When navigating back, the inverse animation will be applied. Options are "slide"
      * (horizontal movement from the right), "baseSlide", "fade", "flip", and "show" and the names of any registered
      * custom transitions.
      */
    transitionName: String,
      /**
      * This optional object can carry any payload data which would have been given to the inserted previous
      * page if the user would have done a normal forward navigation to it.
      */
    oData: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.16.5
      *
      * Returns whether master area is currently displayed on the screen.
      *
      * In desktop browser or tablet, this method returns true when master area is displayed on the screen, regardless
      * if in portrait or landscape mode. On mobile phone devices, this method returns true when the currently
      * displayed page is from the pages, which are added to the master area, otherwise, it returns false.
      */
    def isMasterShown(): Boolean = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getDetailPages detailPages}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllDetailPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMasterPages masterPages}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMasterPages(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeDetailPage(/**
      * The detailPage to remove or its index or id
      */
    vDetailPage: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a detailPage from the aggregation {@link #getDetailPages detailPages}.
      *
      * @returns The removed detailPage or `null`
      */
    def removeDetailPage(/**
      * The detailPage to remove or its index or id
      */
    vDetailPage: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeDetailPage(
      /**
      * The detailPage to remove or its index or id
      */
    vDetailPage: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeMasterPage(/**
      * The masterPage to remove or its index or id
      */
    vMasterPage: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a masterPage from the aggregation {@link #getMasterPages masterPages}.
      *
      * @returns The removed masterPage or `null`
      */
    def removeMasterPage(/**
      * The masterPage to remove or its index or id
      */
    vMasterPage: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeMasterPage(
      /**
      * The masterPage to remove or its index or id
      */
    vMasterPage: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundColor backgroundColor}.
      *
      * Determines the background color of the SplitContainer. If set, this color overrides the default one,
      * which is defined by the theme (should only be used when really required). Any configured background image
      * will be placed above this colored background, but any theme adaptation in the Theme Designer will override
      * this setting. Use the backgroundRepeat property to define whether this image should be stretched to cover
      * the complete SplitContainer or whether it should be tiled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundColor(): this.type = js.native
    def setBackgroundColor(/**
      * New value for property `backgroundColor`
      */
    sBackgroundColor: String): this.type = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundImage backgroundImage}.
      *
      * Sets the background image of the SplitContainer. When set, this image overrides the default background
      * defined by the theme (should only be used when really required). This background image will be placed
      * above any color set for the background, but any theme adaptation in the Theme Designer will override
      * this image setting. Use the backgroundRepeat property to define whether this image should be stretched
      * to cover the complete SplitContainer or whether it should be tiled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundImage(): this.type = js.native
    def setBackgroundImage(/**
      * New value for property `backgroundImage`
      */
    sBackgroundImage: URI): this.type = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundOpacity backgroundOpacity}.
      *
      * Defines the opacity of the background image - between 0 (fully transparent) and 1 (fully opaque). This
      * can be used to improve the content visibility by making the background image partly transparent.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundOpacity(): this.type = js.native
    def setBackgroundOpacity(/**
      * New value for property `backgroundOpacity`
      */
    fBackgroundOpacity: float): this.type = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundRepeat backgroundRepeat}.
      *
      * Defines whether the background image (if configured) is proportionally stretched to cover the whole SplitContainer
      * (false) or whether it should be tiled (true).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundRepeat(): this.type = js.native
    def setBackgroundRepeat(/**
      * New value for property `backgroundRepeat`
      */
    bBackgroundRepeat: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDefaultTransitionNameDetail defaultTransitionNameDetail}.
      *
      * Determines the type of the transition/animation to apply when to() is called without defining the transition
      * to use. The default is "slide", other options are "fade", "show", and the names of any registered custom
      * transitions.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"slide"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultTransitionNameDetail(): this.type = js.native
    def setDefaultTransitionNameDetail(
      /**
      * New value for property `defaultTransitionNameDetail`
      */
    sDefaultTransitionNameDetail: String
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDefaultTransitionNameMaster defaultTransitionNameMaster}.
      *
      * Determines the type of the transition/animation to apply when to() is called, without defining the transition
      * to use. The default is "slide", other options are "fade", "show", and the names of any registered custom
      * transitions.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"slide"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultTransitionNameMaster(): this.type = js.native
    def setDefaultTransitionNameMaster(
      /**
      * New value for property `defaultTransitionNameMaster`
      */
    sDefaultTransitionNameMaster: String
    ): this.type = js.native
    
    def setInitialDetail(
      /**
      * ID of an element which becomes the new target of this initialDetail association; alternatively, an element
      * instance may be given
      */
    oInitialDetail: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getInitialDetail initialDetail}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialDetail(
      /**
      * ID of an element which becomes the new target of this initialDetail association; alternatively, an element
      * instance may be given
      */
    oInitialDetail: ID
    ): this.type = js.native
    
    def setInitialMaster(
      /**
      * ID of an element which becomes the new target of this initialMaster association; alternatively, an element
      * instance may be given
      */
    oInitialMaster: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getInitialMaster initialMaster}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialMaster(
      /**
      * ID of an element which becomes the new target of this initialMaster association; alternatively, an element
      * instance may be given
      */
    oInitialMaster: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMasterButtonText masterButtonText}.
      *
      * Determines the text displayed in master button, which has a default value "Navigation". This text is
      * only displayed in iOS platform and the icon from the current page in detail area is displayed in the
      * master button for the other platforms. The master button is shown/hidden depending on the orientation
      * of the device and whether the master area is opened or not. SplitContainer manages the show/hide of the
      * master button by itself only when the pages added to the detail area are sap.m.Page with built-in header
      * or sap.m.Page with built-in header, which is wrapped by one or several sap.ui.core.mvc.View. Otherwise,
      * the show/hide of master button needs to be managed by the application.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMasterButtonText(): this.type = js.native
    def setMasterButtonText(/**
      * New value for property `masterButtonText`
      */
    sMasterButtonText: String): this.type = js.native
    
    /**
      * @SINCE 1.48
      *
      * Sets a new value for property {@link #getMasterButtonTooltip masterButtonTooltip}.
      *
      * Specifies the tooltip of the master button. If the tooltip is not specified, the title of the page, which
      * is displayed is the master part, is set as tooltip to the master button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMasterButtonTooltip(): this.type = js.native
    def setMasterButtonTooltip(/**
      * New value for property `masterButtonTooltip`
      */
    sMasterButtonTooltip: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMode mode}.
      *
      * Defines whether the master page will always be displayed (in portrait and landscape mode - StretchCompressMode),
      * or if it should be hidden when in portrait mode (ShowHideMode). Default is ShowHideMode. Other possible
      * values are Hide (Master is always hidden) and Popover (master is displayed in popover).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `ShowHideMode`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMode(): this.type = js.native
    def setMode(
      /**
      * New value for property `mode`
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SplitAppMode * / any */ String
    ): this.type = js.native
    def setMode(/**
      * New value for property `mode`
      */
    sMode: SplitAppMode): this.type = js.native
    
    /**
      * Used to make the master page visible when in ShowHideMode and the device is in portrait mode.
      */
    def showMaster(): Unit = js.native
    
    /**
      * @SINCE 1.10.0
      *
      * Navigates to the given page inside the SplitContainer. The navigation is done inside the master area
      * if the page has been added, otherwise, it tries to do the page navigation in the detail area.
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
    ): Unit = js.native
    /**
      * @SINCE 1.10.0
      *
      * Navigates to the given page inside the SplitContainer. The navigation is done inside the master area
      * if the page has been added, otherwise, it tries to do the page navigation in the detail area.
      */
    def to(
      /**
      * The screen to which we are navigating to. The ID or the control itself can be given.
      */
    sPageId: String,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    transitionName: String,
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
    ): Unit = js.native
    
    /**
      * Navigates to a given detail page.
      */
    def toDetail(
      sPageId: String,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
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
    ): Unit = js.native
    
    /**
      * Navigates to a given master page.
      */
    def toMaster(
      /**
      * The screen to which drilldown should happen. The ID or the control itself can be given.
      */
    sPageId: String,
      /**
      * The type of the transition/animation to apply. Options are "slide" (horizontal movement from the right),
      * "baseSlide", "fade", "flip", and "show" and the names of any registered custom transitions.
      *
      * None of the standard transitions is currently making use of any given transition parameters.
      */
    sTransitionName: String,
      /**
      * Since version 1.7.1. This optional object can carry any payload data which should be made available to
      * the target page. The BeforeShow event on the target page will contain this data object as data property.
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
      * Since version 1.7.1. This optional object can contain additional information for the transition function,
      * like the DOM element, which triggered the transition or the desired transition duration.
      *
      * For a proper parameter order, the data parameter must be given when the transitionParameters parameter
      * is used (it can be given as "null").
      *
      * NOTE: it depends on the transition function how the object should be structured and which parameters
      * are actually used to influence the transition. The "show", "slide" and "fade" transitions do not use
      * any parameter.
      */
    oTransitionParameters: js.Object
    ): Unit = js.native
  }
  
  trait SplitContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fires when navigation between two pages in detail area has completed. NOTE: In case of animated transitions
      * this event is fired with some delay after the "navigate" event.
      */
    var afterDetailNavigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fires when the master area is fully closed after the animation (if any).
      */
    var afterMasterClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fires when navigation between two pages in master area has completed. NOTE: In case of animated transitions
      * this event is fired with some delay after the navigate event.
      */
    var afterMasterNavigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fires when the master area is fully opened after animation if any.
      */
    var afterMasterOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.11.2
      *
      * Determines the background color of the SplitContainer. If set, this color overrides the default one,
      * which is defined by the theme (should only be used when really required). Any configured background image
      * will be placed above this colored background, but any theme adaptation in the Theme Designer will override
      * this setting. Use the backgroundRepeat property to define whether this image should be stretched to cover
      * the complete SplitContainer or whether it should be tiled.
      */
    var backgroundColor: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.11.2
      *
      * Sets the background image of the SplitContainer. When set, this image overrides the default background
      * defined by the theme (should only be used when really required). This background image will be placed
      * above any color set for the background, but any theme adaptation in the Theme Designer will override
      * this image setting. Use the backgroundRepeat property to define whether this image should be stretched
      * to cover the complete SplitContainer or whether it should be tiled.
      */
    var backgroundImage: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.11.2
      *
      * Defines the opacity of the background image - between 0 (fully transparent) and 1 (fully opaque). This
      * can be used to improve the content visibility by making the background image partly transparent.
      */
    var backgroundOpacity: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.11.2
      *
      * Defines whether the background image (if configured) is proportionally stretched to cover the whole SplitContainer
      * (false) or whether it should be tiled (true).
      */
    var backgroundRepeat: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires before the master area is closed.
      */
    var beforeMasterClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fires before the master area is opened.
      */
    var beforeMasterOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines the type of the transition/animation to apply when to() is called without defining the transition
      * to use. The default is "slide", other options are "fade", "show", and the names of any registered custom
      * transitions.
      */
    var defaultTransitionNameDetail: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the type of the transition/animation to apply when to() is called, without defining the transition
      * to use. The default is "slide", other options are "fade", "show", and the names of any registered custom
      * transitions.
      */
    var defaultTransitionNameMaster: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fires when navigation between two pages in detail area has been triggered. The transition (if any) to
      * the new page has not started yet. NOTE: This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      */
    var detailNavigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines the content entities, between which the SplitContainer navigates in detail area. These can
      * be of type sap.m.Page, sap.ui.core.mvc.View, sap.m.Carousel or any other control with fullscreen/page
      * semantics. These aggregated controls receive navigation events like {@link sap.m.NavContainerChild#event:BeforeShow
      * BeforeShow}, they are documented in the pseudo interface {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
      */
    var detailPages: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the initial detail page, which is displayed on application launch.
      */
    var initialDetail: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Sets the initial master page, which is displayed on application launch.
      */
    var initialMaster: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Fires when a Master Button needs to be shown or hidden. This is necessary for custom headers when the
      * SplitContainer control does not handle the placement of the master button automatically.
      */
    var masterButton: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines the text displayed in master button, which has a default value "Navigation". This text is
      * only displayed in iOS platform and the icon from the current page in detail area is displayed in the
      * master button for the other platforms. The master button is shown/hidden depending on the orientation
      * of the device and whether the master area is opened or not. SplitContainer manages the show/hide of the
      * master button by itself only when the pages added to the detail area are sap.m.Page with built-in header
      * or sap.m.Page with built-in header, which is wrapped by one or several sap.ui.core.mvc.View. Otherwise,
      * the show/hide of master button needs to be managed by the application.
      */
    var masterButtonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.48
      *
      * Specifies the tooltip of the master button. If the tooltip is not specified, the title of the page, which
      * is displayed is the master part, is set as tooltip to the master button.
      */
    var masterButtonTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fires when navigation between two pages in master area has been triggered. The transition (if any) to
      * the new page has not started yet. This event can be aborted by the application with preventDefault(),
      * which means that there will be no navigation.
      */
    var masterNavigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines the content entities, between which the SplitContainer navigates in master area. These can
      * be of type sap.m.Page, sap.ui.core.mvc.View, sap.m.Carousel or any other control with fullscreen/page
      * semantics. These aggregated controls receive navigation events like {@link sap.m.NavContainerChild#event:BeforeShow
      * BeforeShow}, they are documented in the pseudo interface {@link sap.m.NavContainerChild sap.m.NavContainerChild}.
      */
    var masterPages: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the master page will always be displayed (in portrait and landscape mode - StretchCompressMode),
      * or if it should be hidden when in portrait mode (ShowHideMode). Default is ShowHideMode. Other possible
      * values are Hide (Master is always hidden) and Popover (master is displayed in popover).
      */
    var mode: js.UndefOr[
        SplitAppMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SplitAppMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object SplitContainerSettings {
    
    inline def apply(): SplitContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitContainerSettings]
    }
    
    extension [Self <: SplitContainerSettings](x: Self) {
      
      inline def setAfterDetailNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterDetailNavigate", js.Any.fromFunction1(value))
      
      inline def setAfterDetailNavigateUndefined: Self = StObject.set(x, "afterDetailNavigate", js.undefined)
      
      inline def setAfterMasterClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterMasterClose", js.Any.fromFunction1(value))
      
      inline def setAfterMasterCloseUndefined: Self = StObject.set(x, "afterMasterClose", js.undefined)
      
      inline def setAfterMasterNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterMasterNavigate", js.Any.fromFunction1(value))
      
      inline def setAfterMasterNavigateUndefined: Self = StObject.set(x, "afterMasterNavigate", js.undefined)
      
      inline def setAfterMasterOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterMasterOpen", js.Any.fromFunction1(value))
      
      inline def setAfterMasterOpenUndefined: Self = StObject.set(x, "afterMasterOpen", js.undefined)
      
      inline def setBackgroundColor(value: String | PropertyBindingInfo): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundImage(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setBackgroundOpacity(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundOpacity", value.asInstanceOf[js.Any])
      
      inline def setBackgroundOpacityUndefined: Self = StObject.set(x, "backgroundOpacity", js.undefined)
      
      inline def setBackgroundRepeat(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      inline def setBeforeMasterClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeMasterClose", js.Any.fromFunction1(value))
      
      inline def setBeforeMasterCloseUndefined: Self = StObject.set(x, "beforeMasterClose", js.undefined)
      
      inline def setBeforeMasterOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeMasterOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeMasterOpenUndefined: Self = StObject.set(x, "beforeMasterOpen", js.undefined)
      
      inline def setDefaultTransitionNameDetail(value: String | PropertyBindingInfo): Self = StObject.set(x, "defaultTransitionNameDetail", value.asInstanceOf[js.Any])
      
      inline def setDefaultTransitionNameDetailUndefined: Self = StObject.set(x, "defaultTransitionNameDetail", js.undefined)
      
      inline def setDefaultTransitionNameMaster(value: String | PropertyBindingInfo): Self = StObject.set(x, "defaultTransitionNameMaster", value.asInstanceOf[js.Any])
      
      inline def setDefaultTransitionNameMasterUndefined: Self = StObject.set(x, "defaultTransitionNameMaster", js.undefined)
      
      inline def setDetailNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "detailNavigate", js.Any.fromFunction1(value))
      
      inline def setDetailNavigateUndefined: Self = StObject.set(x, "detailNavigate", js.undefined)
      
      inline def setDetailPages(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "detailPages", value.asInstanceOf[js.Any])
      
      inline def setDetailPagesUndefined: Self = StObject.set(x, "detailPages", js.undefined)
      
      inline def setDetailPagesVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "detailPages", js.Array(value*))
      
      inline def setInitialDetail(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialDetail", value.asInstanceOf[js.Any])
      
      inline def setInitialDetailUndefined: Self = StObject.set(x, "initialDetail", js.undefined)
      
      inline def setInitialMaster(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialMaster", value.asInstanceOf[js.Any])
      
      inline def setInitialMasterUndefined: Self = StObject.set(x, "initialMaster", js.undefined)
      
      inline def setMasterButton(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "masterButton", js.Any.fromFunction1(value))
      
      inline def setMasterButtonText(value: String | PropertyBindingInfo): Self = StObject.set(x, "masterButtonText", value.asInstanceOf[js.Any])
      
      inline def setMasterButtonTextUndefined: Self = StObject.set(x, "masterButtonText", js.undefined)
      
      inline def setMasterButtonTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "masterButtonTooltip", value.asInstanceOf[js.Any])
      
      inline def setMasterButtonTooltipUndefined: Self = StObject.set(x, "masterButtonTooltip", js.undefined)
      
      inline def setMasterButtonUndefined: Self = StObject.set(x, "masterButton", js.undefined)
      
      inline def setMasterNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "masterNavigate", js.Any.fromFunction1(value))
      
      inline def setMasterNavigateUndefined: Self = StObject.set(x, "masterNavigate", js.undefined)
      
      inline def setMasterPages(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "masterPages", value.asInstanceOf[js.Any])
      
      inline def setMasterPagesUndefined: Self = StObject.set(x, "masterPages", js.undefined)
      
      inline def setMasterPagesVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "masterPages", js.Array(value*))
      
      inline def setMode(
        value: SplitAppMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SplitAppMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
