package typings.openui5

import typings.openui5.anon.Fixed
import typings.openui5.anon.Pinned
import typings.openui5.anon.Section
import typings.openui5.anon.VisibleSubSections
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapMLibraryMod.IBar
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.openui5.sapUxapLibraryMod.IHeaderTitle
import typings.openui5.sapUxapLibraryMod.ObjectPageSubSectionLayout
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapObjectPageLayoutMod {
  
  @JSImport("sap/uxap/ObjectPageLayout", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ObjectPageLayout`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:2e61ab6c68a2480eb666c1927a707658 Object Page Layout}
    * 	{@link topic:d2ef0099542d44dc868719d908e576d0 Object Page Headers}
    * 	{@link topic:370b67986497463187336fa130aebbf1 Anchor Bar}
    * 	{@link topic:4527729576cb4a4888275b6935aad03a Object Page Blocks}
    * 	{@link topic:2978f6064742456ebed31c5ccf4d051d Creating Blocks}
    * 	{@link topic:bc410e94e46540efa02857e15aae583f Object Page Scrolling}
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/object-page/ Object Page Layout}
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/snapping-header/ UX Guidelines: Object Page
    * - Snapping Header}
    */
  open class default () extends ObjectPageLayout {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectPageLayoutSettings) = this()
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
    mSettings: ObjectPageLayoutSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectPageLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/ObjectPageLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.ObjectPageLayout with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, ObjectPageLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.ObjectPageLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectPageLayout
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some headerContent to the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeaderContent(
      /**
      * The headerContent to add; if empty, nothing is inserted
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some section to the aggregation {@link #getSections sections}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSection(
      /**
      * The section to add; if empty, nothing is inserted
      */
    oSection: typings.openui5.sapUxapObjectPageSectionMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:editHeaderButtonPress editHeaderButtonPress}
      * event of this `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * The event is fired when the Edit Header button is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachEditHeaderButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachEditHeaderButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:editHeaderButtonPress editHeaderButtonPress}
      * event of this `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * The event is fired when the Edit Header button is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachEditHeaderButtonPress(
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
    def attachEditHeaderButtonPress(
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
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.93
      *
      * Attaches event handler `fnFunction` to the {@link #event:headerContentPinnedStateChange headerContentPinnedStateChange}
      * event of this `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * The event is fired when the `headerContentPinned` property is changed via user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachHeaderContentPinnedStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachHeaderContentPinnedStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.93
      *
      * Attaches event handler `fnFunction` to the {@link #event:headerContentPinnedStateChange headerContentPinnedStateChange}
      * event of this `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * The event is fired when the `headerContentPinned` property is changed via user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachHeaderContentPinnedStateChange(
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
    def attachHeaderContentPinnedStateChange(
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
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.40
      *
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * The event is fired when the selected section is changed using the navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.40
      *
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * The event is fired when the selected section is changed using the navigation.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
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
    def attachNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.73
      *
      * Attaches event handler `fnFunction` to the {@link #event:sectionChange sectionChange} event of this `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * Fired when the current section is changed by scrolling.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.73
      *
      * Attaches event handler `fnFunction` to the {@link #event:sectionChange sectionChange} event of this `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * Fired when the current section is changed by scrolling.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSectionChange(
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
    def attachSectionChange(
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
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Attaches event handler `fnFunction` to the {@link #event:subSectionVisibilityChange subSectionVisibilityChange}
      * event of this `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * Fired when the visibility of subsections is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSubSectionVisibilityChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSubSectionVisibilityChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.77
      *
      * Attaches event handler `fnFunction` to the {@link #event:subSectionVisibilityChange subSectionVisibilityChange}
      * event of this `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * Fired when the visibility of subsections is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSubSectionVisibilityChange(
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
    def attachSubSectionVisibilityChange(
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
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleAnchorBar toggleAnchorBar} event of this
      * `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * The event is fired when the Anchor bar is switched from moving to fixed or the other way round.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleAnchorBar(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToggleAnchorBar(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleAnchorBar toggleAnchorBar} event of this
      * `sap.uxap.ObjectPageLayout`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageLayout` itself.
      *
      * The event is fired when the Anchor bar is switched from moving to fixed or the other way round.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleAnchorBar(
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
    def attachToggleAnchorBar(
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
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageLayout` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.40
      *
      * Destroys the footer in the aggregation {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFooter(): this.type = js.native
    
    /**
      * Destroys all the headerContent in the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderContent(): this.type = js.native
    
    /**
      * Destroys the headerTitle in the aggregation {@link #getHeaderTitle headerTitle}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderTitle(): this.type = js.native
    
    /**
      * @SINCE 1.61
      *
      * Destroys the landmarkInfo in the aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLandmarkInfo(): this.type = js.native
    
    /**
      * Destroys all the sections in the aggregation {@link #getSections sections}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySections(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:editHeaderButtonPress editHeaderButtonPress}
      * event of this `sap.uxap.ObjectPageLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachEditHeaderButtonPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachEditHeaderButtonPress(
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
      * @SINCE 1.93
      *
      * Detaches event handler `fnFunction` from the {@link #event:headerContentPinnedStateChange headerContentPinnedStateChange}
      * event of this `sap.uxap.ObjectPageLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachHeaderContentPinnedStateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachHeaderContentPinnedStateChange(
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
      * @SINCE 1.40
      *
      * Detaches event handler `fnFunction` from the {@link #event:navigate navigate} event of this `sap.uxap.ObjectPageLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachNavigate(
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
      * @SINCE 1.73
      *
      * Detaches event handler `fnFunction` from the {@link #event:sectionChange sectionChange} event of this
      * `sap.uxap.ObjectPageLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSectionChange(
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
      * @SINCE 1.77
      *
      * Detaches event handler `fnFunction` from the {@link #event:subSectionVisibilityChange subSectionVisibilityChange}
      * event of this `sap.uxap.ObjectPageLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSubSectionVisibilityChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSubSectionVisibilityChange(
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
      * Detaches event handler `fnFunction` from the {@link #event:toggleAnchorBar toggleAnchorBar} event of
      * this `sap.uxap.ObjectPageLayout`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToggleAnchorBar(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachToggleAnchorBar(
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
      * Fires event {@link #event:editHeaderButtonPress editHeaderButtonPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireEditHeaderButtonPress(): this.type = js.native
    def fireEditHeaderButtonPress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.93
      *
      * Fires event {@link #event:headerContentPinnedStateChange headerContentPinnedStateChange} to attached
      * listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireHeaderContentPinnedStateChange(): this.type = js.native
    def fireHeaderContentPinnedStateChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Pinned): this.type = js.native
    
    /**
      * @SINCE 1.40
      *
      * Fires event {@link #event:navigate navigate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavigate(): this.type = js.native
    def fireNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: Section): this.type = js.native
    
    /**
      * @SINCE 1.73
      *
      * Fires event {@link #event:sectionChange sectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSectionChange(): this.type = js.native
    def fireSectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Section): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Fires event {@link #event:subSectionVisibilityChange subSectionVisibilityChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSubSectionVisibilityChange(): this.type = js.native
    def fireSubSectionVisibilityChange(/**
      * Parameters to pass along with the event
      */
    mParameters: VisibleSubSections): this.type = js.native
    
    /**
      * Fires event {@link #event:toggleAnchorBar toggleAnchorBar} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireToggleAnchorBar(): this.type = js.native
    def fireToggleAnchorBar(/**
      * Parameters to pass along with the event
      */
    mParameters: Fixed): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getAlwaysShowContentHeader alwaysShowContentHeader}.
      *
      * Determines whether Header Content will always be expanded on desktop.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      *
      * Default value is `false`.
      *
      * @returns Value of property `alwaysShowContentHeader`
      */
    def getAlwaysShowContentHeader(): Boolean = js.native
    
    /**
      * @SINCE 1.58
      *
      * Gets current value of property {@link #getBackgroundDesignAnchorBar backgroundDesignAnchorBar}.
      *
      * Determines the background color of the `AnchorBar`.
      *
      * **Note:** The default value of `backgroundDesignAnchorBar` property is null. If the property is not set,
      * the color of the background is `@sapUiObjectHeaderBackground`, which depends on the specific theme.
      *
      * @returns Value of property `backgroundDesignAnchorBar`
      */
    def getBackgroundDesignAnchorBar(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getEnableLazyLoading enableLazyLoading}.
      *
      * Enable lazy loading for the Object page Subsections.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableLazyLoading`
      */
    def getEnableLazyLoading(): Boolean = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getFlexEnabled flexEnabled}.
      *
      * Specifies whether the object page enables flexibility features, such as hiding and adding sections.
      *  For more information about SAPUI5 flexibility, refer to the Developer Guide.
      *
      * Default value is `false`.
      *
      * @returns Value of property `flexEnabled`
      */
    def getFlexEnabled(): Boolean = js.native
    
    /**
      * @SINCE 1.40
      *
      * Gets content of aggregation {@link #getFooter footer}.
      *
      * Object page floating footer.
      */
    def getFooter(): IBar = js.native
    
    /**
      * Gets content of aggregation {@link #getHeaderContent headerContent}.
      *
      * Object page header content - the dynamic part of the Object page header.
      */
    def getHeaderContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getHeaderContentPinnable headerContentPinnable}.
      *
      * Determines whether the Header Content area can be pinned.
      *
      * When set to `true`, a pin button is displayed within the Header Content area. The pin button allows the
      * user to make the Header Content always visible at the top of the page above any scrollable content.
      *
      * **Note:** This property is only taken into account if an instance of `sap.uxap.ObjectPageDynamicHeaderTitle`
      * is used for the `headerTitle` aggregation.
      *
      * Default value is `true`.
      *
      * @returns Value of property `headerContentPinnable`
      */
    def getHeaderContentPinnable(): Boolean = js.native
    
    /**
      * @SINCE 1.93
      *
      * Gets current value of property {@link #getHeaderContentPinned headerContentPinned}.
      *
      * Determines whether the `sap.uxap.ObjectPageDynamicHeaderContent` is pinned.
      *
      * The property can be changed explicitly with its setter or in the occurrence of the following user interactions:
      *
      * 	 - Toggling the pin/unpin button of `sap.uxap.ObjectPageDynamicHeaderContent`
      * 	 - Snapping the `sap.uxap.ObjectPageDynamicHeaderContent` by explicitly clicking on the `sap.uxap.ObjectPageDynamicHeaderTitle`
      *
      *
      * **Note: ** The property will only apply if the following rules are currently in use:
      * 	 - An instance of `sap.uxap.ObjectPageDynamicHeaderTitle` is used for the `headerTitle` aggregation.
      *
      * 	 - The `headerContentPinnable` property is `true`
      * 	 - The `sap.uxap.ObjectPageDynamicHeaderContent` is expanded
      * 	 - The `preserveHeaderStateOnScroll` property or the rules for it to work are `false`
      *
      * Default value is `false`.
      *
      * @returns Value of property `headerContentPinned`
      */
    def getHeaderContentPinned(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getHeaderTitle headerTitle}.
      *
      * Object page header title - the upper, always static, part of the Object page header.
      */
    def getHeaderTitle(): IHeaderTitle = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Determines the height of the ObjectPage.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getIsChildPage isChildPage}.
      *
      * Determines whether the page is a child page and renders it with a different design. Child pages have
      * an additional (darker/lighter) stripe on the left side of their header content area.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      *
      * Default value is `false`.
      *
      * @returns Value of property `isChildPage`
      */
    def getIsChildPage(): Boolean = js.native
    
    /**
      * @SINCE 1.61
      *
      * Gets content of aggregation {@link #getLandmarkInfo landmarkInfo}.
      *
      * Accessible landmark settings to be applied on the containers of the `sap.uxap.ObjectPageLayout` control.
      *
      * If not set, no landmarks will be written.
      */
    def getLandmarkInfo(): typings.openui5.sapUxapObjectPageAccessibleLandmarkInfoMod.default = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getPreserveHeaderStateOnScroll preserveHeaderStateOnScroll}.
      *
      * Preserves the current header state when scrolling. For example, if the user expands the header by clicking
      * on the title and then scrolls down the page, the header will remain expanded.
      *
      * **Notes:**
      * 	 - This property is only taken into account if an instance of `sap.uxap.ObjectPageDynamicHeaderTitle`
      * 			is used for the `headerTitle` aggregation.
      * 	 - Based on internal rules, the value of the property is not always taken into account - for example,
      * 			when the control is rendered on tablet or mobile and the control`s title and header are with height larger
      * 			than the given threshold.
      *
      * Default value is `false`.
      *
      * @returns Value of property `preserveHeaderStateOnScroll`
      */
    def getPreserveHeaderStateOnScroll(): Boolean = js.native
    
    /**
      * Returns the `sap.ui.core.ScrollEnablement` delegate which is used with this control.
      *
      * @returns The scroll delegate instance
      */
    def getScrollDelegate(): typings.openui5.sapUiCoreDelegateScrollEnablementMod.default = js.native
    
    /**
      * Returns the UI5 ID of the Section that is currently being scrolled.
      */
    def getScrollingSectionId(): String = js.native
    
    /**
      * @SINCE 1.44.0
      *
      * Gets current value of property {@link #getSectionTitleLevel sectionTitleLevel}.
      *
      * Determines the ARIA level of the `ObjectPageSection` and `ObjectPageSubSection` titles. The ARIA level
      * is used by assisting technologies, such as screen readers, to create a hierarchical site map for faster
      * navigation.
      *
      *
      * **Note:**
      * 	 - Defining a `sectionTitleLevel` will add `aria-level` attribute from 1 to 6 instead of changing the
      * 			titles` HTML tag from H1 to H6.
      * For example: if `sectionTitleLevel` is `TitleLevel.H1`, it will result as aria-level of 1 added to the
      * `ObjectPageSection` title.
      *
      *
      * 	 -  The `ObjectPageSubSection` title would have `aria-level` one level lower than the defined. For example:
      * 			if `sectionTitleLevel` is `TitleLevel.H1`, it will result as aria-level of 2 added to the `ObjectPageSubSection`
      * 			title.
      *
      *
      * 	 -  It is possible to define a `titleLevel` on `ObjectPageSection` or `ObjectPageSubSection` level.
      * 			In this case the value of this property will be ignored.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `sectionTitleLevel`
      */
    def getSectionTitleLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getSections sections}.
      *
      * The sections that make up the Object page content area.
      */
    def getSections(): js.Array[typings.openui5.sapUxapObjectPageSectionMod.default] = js.native
    
    /**
      * @SINCE 1.44.0
      *
      * ID of the element which is the current target of the association {@link #getSelectedSection selectedSection},
      * or `null`.
      */
    def getSelectedSection(): ID = js.native
    
    /**
      * Gets current value of property {@link #getShowAnchorBar showAnchorBar}.
      *
      * Determines whether the Navigation bar (Anchor bar) is displayed.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showAnchorBar`
      */
    def getShowAnchorBar(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowAnchorBarPopover showAnchorBarPopover}.
      *
      * Determines whether to show a Popover with Subsection links when clicking on Section links in the Anchor
      * bar.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showAnchorBarPopover`
      */
    def getShowAnchorBarPopover(): Boolean = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getShowEditHeaderButton showEditHeaderButton}.
      *
      * Determines whether an Edit button will be displayed in Header Content.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showEditHeaderButton`
      */
    def getShowEditHeaderButton(): Boolean = js.native
    
    /**
      * @SINCE 1.40
      *
      * Gets current value of property {@link #getShowFooter showFooter}.
      *
      * Determines whether the footer is visible.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showFooter`
      */
    def getShowFooter(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowHeaderContent showHeaderContent}.
      *
      * Determines the visibility of the Header content (headerContent aggregation).
      *
      * Default value is `true`.
      *
      * @returns Value of property `showHeaderContent`
      */
    def getShowHeaderContent(): Boolean = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Gets current value of property {@link #getShowOnlyHighImportance showOnlyHighImportance}.
      *
      * Determines whether sections and subsections with importance Low and Medium are hidden even on large screens.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showOnlyHighImportance`
      */
    def getShowOnlyHighImportance(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowTitleInHeaderContent showTitleInHeaderContent}.
      *
      * Determines whether the title, image, markers and selectTitleArrow are shown in the Header content area.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showTitleInHeaderContent`
      */
    def getShowTitleInHeaderContent(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSubSectionLayout subSectionLayout}.
      *
      * Determines whether Subsection titles are displayed on top or to the left of the Subsection content.
      *
      * Default value is `TitleOnTop`.
      *
      * @returns Value of property `subSectionLayout`
      */
    def getSubSectionLayout(): ObjectPageSubSectionLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageSubSectionLayout * / any */ String) = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getToggleHeaderOnTitleClick toggleHeaderOnTitleClick}.
      *
      * Determines whether the user can switch between the expanded/collapsed states of the `sap.uxap.ObjectPageDynamicHeaderContent`
      * by clicking on the `sap.uxap.ObjectPageDynamicHeaderTitle`. If set to `false`, the `sap.uxap.ObjectPageDynamicHeaderTitle`
      * is not clickable and the application must provide other means for expanding/collapsing the `sap.uxap.ObjectPageDynamicHeaderContent`,
      * if necessary.
      *
      * **Note:** This property is only taken into account if an instance of `sap.uxap.ObjectPageDynamicHeaderTitle`
      * is used for the `headerTitle` aggregation.
      *
      * Default value is `true`.
      *
      * @returns Value of property `toggleHeaderOnTitleClick`
      */
    def getToggleHeaderOnTitleClick(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getUpperCaseAnchorBar upperCaseAnchorBar}.
      *
      * Determines whether the Anchor bar items are displayed in upper case.
      *
      * Default value is `true`.
      *
      * @returns Value of property `upperCaseAnchorBar`
      */
    def getUpperCaseAnchorBar(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getUseIconTabBar useIconTabBar}.
      *
      * Determines whether the navigation mode is tab-based instead of the default anchor bar. If enabled, the
      * sections are displayed separately on each tab rather than having all of them visible at the same time.
      *
      * **Note:** Keep in mind that the `sap.m.IconTabBar` control is no longer used for the tab navigation mode.
      *
      * Default value is `false`.
      *
      * @returns Value of property `useIconTabBar`
      */
    def getUseIconTabBar(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getUseTwoColumnsForLargeScreen useTwoColumnsForLargeScreen}.
      *
      * Determines whether the to use two column layout for the L screen size.
      *
      * Default value is `false`.
      *
      * @returns Value of property `useTwoColumnsForLargeScreen`
      */
    def getUseTwoColumnsForLargeScreen(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getHeaderContent headerContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeaderContent(
      /**
      * The headerContent whose index is looked for
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.uxap.ObjectPageSection` in the aggregation {@link #getSections sections}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSection(
      /**
      * The section whose index is looked for
      */
    oSection: typings.openui5.sapUxapObjectPageSectionMod.default
    ): int = js.native
    
    /**
      * Inserts a headerContent into the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeaderContent(
      /**
      * The headerContent to insert; if empty, nothing is inserted
      */
    oHeaderContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the headerContent should be inserted at; for a negative value of `iIndex`, the headerContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the headerContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a section into the aggregation {@link #getSections sections}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSection(
      /**
      * The section to insert; if empty, nothing is inserted
      */
    oSection: typings.openui5.sapUxapObjectPageSectionMod.default,
      /**
      * The `0`-based index the section should be inserted at; for a negative value of `iIndex`, the section
      * is inserted at position 0; for a value greater than the current size of the aggregation, the section
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeaderContent headerContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeaderContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSections sections}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSections(): js.Array[typings.openui5.sapUxapObjectPageSectionMod.default] = js.native
    
    def removeHeaderContent(/**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a headerContent from the aggregation {@link #getHeaderContent headerContent}.
      *
      * @returns The removed headerContent or `null`
      */
    def removeHeaderContent(/**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeHeaderContent(
      /**
      * The headerContent to remove or its index or id
      */
    vHeaderContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeSection(/**
      * The section to remove or its index or id
      */
    vSection: String): typings.openui5.sapUxapObjectPageSectionMod.default | Null = js.native
    /**
      * Removes a section from the aggregation {@link #getSections sections}.
      *
      * @returns The removed section or `null`
      */
    def removeSection(/**
      * The section to remove or its index or id
      */
    vSection: int): typings.openui5.sapUxapObjectPageSectionMod.default | Null = js.native
    def removeSection(
      /**
      * The section to remove or its index or id
      */
    vSection: typings.openui5.sapUxapObjectPageSectionMod.default
    ): typings.openui5.sapUxapObjectPageSectionMod.default | Null = js.native
    
    /**
      * Scrolls the Object page to the given Section.
      */
    def scrollToSection(/**
      * The Section ID to scroll to
      */
    sId: String): Unit = js.native
    def scrollToSection(
      /**
      * The Section ID to scroll to
      */
    sId: String,
      /**
      * Scroll duration (in ms)
      */
    iDuration: Unit,
      /**
      * Additional pixels to scroll
      */
    iOffset: int
    ): Unit = js.native
    def scrollToSection(
      /**
      * The Section ID to scroll to
      */
    sId: String,
      /**
      * Scroll duration (in ms)
      */
    iDuration: int
    ): Unit = js.native
    def scrollToSection(
      /**
      * The Section ID to scroll to
      */
    sId: String,
      /**
      * Scroll duration (in ms)
      */
    iDuration: int,
      /**
      * Additional pixels to scroll
      */
    iOffset: int
    ): Unit = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getAlwaysShowContentHeader alwaysShowContentHeader}.
      *
      * Determines whether Header Content will always be expanded on desktop.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAlwaysShowContentHeader(): this.type = js.native
    def setAlwaysShowContentHeader(/**
      * New value for property `alwaysShowContentHeader`
      */
    bAlwaysShowContentHeader: Boolean): this.type = js.native
    
    def setBackgroundDesignAnchorBar(
      /**
      * new value of the `backgroundDesignAnchorBar`
      */
    sBackgroundDesignAnchorBar: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    /**
      * @SINCE 1.58
      *
      * Sets the value of the `backgroundDesignAnchorBar` property.
      *
      * @returns `this` to allow method chaining
      */
    def setBackgroundDesignAnchorBar(
      /**
      * new value of the `backgroundDesignAnchorBar`
      */
    sBackgroundDesignAnchorBar: BackgroundDesign
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableLazyLoading enableLazyLoading}.
      *
      * Enable lazy loading for the Object page Subsections.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableLazyLoading(): this.type = js.native
    def setEnableLazyLoading(/**
      * New value for property `enableLazyLoading`
      */
    bEnableLazyLoading: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getFlexEnabled flexEnabled}.
      *
      * Specifies whether the object page enables flexibility features, such as hiding and adding sections.
      *  For more information about SAPUI5 flexibility, refer to the Developer Guide.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFlexEnabled(): this.type = js.native
    def setFlexEnabled(/**
      * New value for property `flexEnabled`
      */
    bFlexEnabled: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.40
      *
      * Sets the aggregated {@link #getFooter footer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooter(/**
      * The footer to set
      */
    oFooter: IBar): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getHeaderContentPinnable headerContentPinnable}.
      *
      * Determines whether the Header Content area can be pinned.
      *
      * When set to `true`, a pin button is displayed within the Header Content area. The pin button allows the
      * user to make the Header Content always visible at the top of the page above any scrollable content.
      *
      * **Note:** This property is only taken into account if an instance of `sap.uxap.ObjectPageDynamicHeaderTitle`
      * is used for the `headerTitle` aggregation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderContentPinnable(): this.type = js.native
    def setHeaderContentPinnable(/**
      * New value for property `headerContentPinnable`
      */
    bHeaderContentPinnable: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.93
      *
      * Sets a new value for property {@link #getHeaderContentPinned headerContentPinned}.
      *
      * Determines whether the `sap.uxap.ObjectPageDynamicHeaderContent` is pinned.
      *
      * The property can be changed explicitly with its setter or in the occurrence of the following user interactions:
      *
      * 	 - Toggling the pin/unpin button of `sap.uxap.ObjectPageDynamicHeaderContent`
      * 	 - Snapping the `sap.uxap.ObjectPageDynamicHeaderContent` by explicitly clicking on the `sap.uxap.ObjectPageDynamicHeaderTitle`
      *
      *
      * **Note: ** The property will only apply if the following rules are currently in use:
      * 	 - An instance of `sap.uxap.ObjectPageDynamicHeaderTitle` is used for the `headerTitle` aggregation.
      *
      * 	 - The `headerContentPinnable` property is `true`
      * 	 - The `sap.uxap.ObjectPageDynamicHeaderContent` is expanded
      * 	 - The `preserveHeaderStateOnScroll` property or the rules for it to work are `false`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderContentPinned(): this.type = js.native
    def setHeaderContentPinned(/**
      * New value for property `headerContentPinned`
      */
    bHeaderContentPinned: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getHeaderTitle headerTitle}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderTitle(/**
      * The headerTitle to set
      */
    oHeaderTitle: IHeaderTitle): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Determines the height of the ObjectPage.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getIsChildPage isChildPage}.
      *
      * Determines whether the page is a child page and renders it with a different design. Child pages have
      * an additional (darker/lighter) stripe on the left side of their header content area.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIsChildPage(): this.type = js.native
    def setIsChildPage(/**
      * New value for property `isChildPage`
      */
    bIsChildPage: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.61
      *
      * Sets the aggregated {@link #getLandmarkInfo landmarkInfo}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLandmarkInfo(
      /**
      * The landmarkInfo to set
      */
    oLandmarkInfo: typings.openui5.sapUxapObjectPageAccessibleLandmarkInfoMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getPreserveHeaderStateOnScroll preserveHeaderStateOnScroll}.
      *
      * Preserves the current header state when scrolling. For example, if the user expands the header by clicking
      * on the title and then scrolls down the page, the header will remain expanded.
      *
      * **Notes:**
      * 	 - This property is only taken into account if an instance of `sap.uxap.ObjectPageDynamicHeaderTitle`
      * 			is used for the `headerTitle` aggregation.
      * 	 - Based on internal rules, the value of the property is not always taken into account - for example,
      * 			when the control is rendered on tablet or mobile and the control`s title and header are with height larger
      * 			than the given threshold.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPreserveHeaderStateOnScroll(): this.type = js.native
    def setPreserveHeaderStateOnScroll(
      /**
      * New value for property `preserveHeaderStateOnScroll`
      */
    bPreserveHeaderStateOnScroll: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.44.0
      *
      * Sets a new value for property {@link #getSectionTitleLevel sectionTitleLevel}.
      *
      * Determines the ARIA level of the `ObjectPageSection` and `ObjectPageSubSection` titles. The ARIA level
      * is used by assisting technologies, such as screen readers, to create a hierarchical site map for faster
      * navigation.
      *
      *
      * **Note:**
      * 	 - Defining a `sectionTitleLevel` will add `aria-level` attribute from 1 to 6 instead of changing the
      * 			titles` HTML tag from H1 to H6.
      * For example: if `sectionTitleLevel` is `TitleLevel.H1`, it will result as aria-level of 1 added to the
      * `ObjectPageSection` title.
      *
      *
      * 	 -  The `ObjectPageSubSection` title would have `aria-level` one level lower than the defined. For example:
      * 			if `sectionTitleLevel` is `TitleLevel.H1`, it will result as aria-level of 2 added to the `ObjectPageSubSection`
      * 			title.
      *
      *
      * 	 -  It is possible to define a `titleLevel` on `ObjectPageSection` or `ObjectPageSubSection` level.
      * 			In this case the value of this property will be ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSectionTitleLevel(): this.type = js.native
    def setSectionTitleLevel(
      /**
      * New value for property `sectionTitleLevel`
      */
    sSectionTitleLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setSectionTitleLevel(/**
      * New value for property `sectionTitleLevel`
      */
    sSectionTitleLevel: TitleLevel): this.type = js.native
    
    /**
      * Sets the section that should be selected.
      *
      * The section can either be given by itself or by its id.
      *
      * If left unspecified, then the page automatically sets the value to the first visible section before rendering.
      * The value never remains empty because `sap.uxap.ObjectPageLayout` should always have one of its sections
      * selected (unless it has 0 visible sections).
      *
      * **Note:** Updating the `selectedSection` with a value of `null` resets the `selectedSection` to the first
      * visible section and scrolls the page to the top.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setSelectedSection(
      /**
      * The ID or the section instance that should be selected Note that `undefined` is not a valid argument
      */
    sId: String
    ): this.type = js.native
    def setSelectedSection(
      /**
      * The ID or the section instance that should be selected Note that `undefined` is not a valid argument
      */
    sId: typings.openui5.sapUxapObjectPageSectionMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowAnchorBar showAnchorBar}.
      *
      * Determines whether the Navigation bar (Anchor bar) is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowAnchorBar(): this.type = js.native
    def setShowAnchorBar(/**
      * New value for property `showAnchorBar`
      */
    bShowAnchorBar: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowAnchorBarPopover showAnchorBarPopover}.
      *
      * Determines whether to show a Popover with Subsection links when clicking on Section links in the Anchor
      * bar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowAnchorBarPopover(): this.type = js.native
    def setShowAnchorBarPopover(/**
      * New value for property `showAnchorBarPopover`
      */
    bShowAnchorBarPopover: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getShowEditHeaderButton showEditHeaderButton}.
      *
      * Determines whether an Edit button will be displayed in Header Content.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowEditHeaderButton(): this.type = js.native
    def setShowEditHeaderButton(/**
      * New value for property `showEditHeaderButton`
      */
    bShowEditHeaderButton: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.40
      *
      * Sets a new value for property {@link #getShowFooter showFooter}.
      *
      * Determines whether the footer is visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowFooter(): this.type = js.native
    def setShowFooter(/**
      * New value for property `showFooter`
      */
    bShowFooter: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHeaderContent showHeaderContent}.
      *
      * Determines the visibility of the Header content (headerContent aggregation).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHeaderContent(): this.type = js.native
    def setShowHeaderContent(/**
      * New value for property `showHeaderContent`
      */
    bShowHeaderContent: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.32.0
      *
      * Sets a new value for property {@link #getShowOnlyHighImportance showOnlyHighImportance}.
      *
      * Determines whether sections and subsections with importance Low and Medium are hidden even on large screens.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowOnlyHighImportance(): this.type = js.native
    def setShowOnlyHighImportance(/**
      * New value for property `showOnlyHighImportance`
      */
    bShowOnlyHighImportance: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowTitleInHeaderContent showTitleInHeaderContent}.
      *
      * Determines whether the title, image, markers and selectTitleArrow are shown in the Header content area.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTitleInHeaderContent(): this.type = js.native
    def setShowTitleInHeaderContent(/**
      * New value for property `showTitleInHeaderContent`
      */
    bShowTitleInHeaderContent: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubSectionLayout subSectionLayout}.
      *
      * Determines whether Subsection titles are displayed on top or to the left of the Subsection content.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `TitleOnTop`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubSectionLayout(): this.type = js.native
    def setSubSectionLayout(
      /**
      * New value for property `subSectionLayout`
      */
    sSubSectionLayout: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageSubSectionLayout * / any */ String
    ): this.type = js.native
    def setSubSectionLayout(
      /**
      * New value for property `subSectionLayout`
      */
    sSubSectionLayout: ObjectPageSubSectionLayout
    ): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getToggleHeaderOnTitleClick toggleHeaderOnTitleClick}.
      *
      * Determines whether the user can switch between the expanded/collapsed states of the `sap.uxap.ObjectPageDynamicHeaderContent`
      * by clicking on the `sap.uxap.ObjectPageDynamicHeaderTitle`. If set to `false`, the `sap.uxap.ObjectPageDynamicHeaderTitle`
      * is not clickable and the application must provide other means for expanding/collapsing the `sap.uxap.ObjectPageDynamicHeaderContent`,
      * if necessary.
      *
      * **Note:** This property is only taken into account if an instance of `sap.uxap.ObjectPageDynamicHeaderTitle`
      * is used for the `headerTitle` aggregation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setToggleHeaderOnTitleClick(): this.type = js.native
    def setToggleHeaderOnTitleClick(/**
      * New value for property `toggleHeaderOnTitleClick`
      */
    bToggleHeaderOnTitleClick: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUpperCaseAnchorBar upperCaseAnchorBar}.
      *
      * Determines whether the Anchor bar items are displayed in upper case.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUpperCaseAnchorBar(): this.type = js.native
    def setUpperCaseAnchorBar(/**
      * New value for property `upperCaseAnchorBar`
      */
    bUpperCaseAnchorBar: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUseIconTabBar useIconTabBar}.
      *
      * Determines whether the navigation mode is tab-based instead of the default anchor bar. If enabled, the
      * sections are displayed separately on each tab rather than having all of them visible at the same time.
      *
      * **Note:** Keep in mind that the `sap.m.IconTabBar` control is no longer used for the tab navigation mode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseIconTabBar(): this.type = js.native
    def setUseIconTabBar(/**
      * New value for property `useIconTabBar`
      */
    bUseIconTabBar: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUseTwoColumnsForLargeScreen useTwoColumnsForLargeScreen}.
      *
      * Determines whether the to use two column layout for the L screen size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseTwoColumnsForLargeScreen(): this.type = js.native
    def setUseTwoColumnsForLargeScreen(
      /**
      * New value for property `useTwoColumnsForLargeScreen`
      */
    bUseTwoColumnsForLargeScreen: Boolean
    ): this.type = js.native
  }
  
  trait ObjectPageLayoutSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.34.0
      *
      * Determines whether Header Content will always be expanded on desktop.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      */
    var alwaysShowContentHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.58
      *
      * Determines the background color of the `AnchorBar`.
      *
      * **Note:** The default value of `backgroundDesignAnchorBar` property is null. If the property is not set,
      * the color of the background is `@sapUiObjectHeaderBackground`, which depends on the specific theme.
      */
    var backgroundDesignAnchorBar: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The event is fired when the Edit Header button is pressed
      */
    var editHeaderButtonPress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Enable lazy loading for the Object page Subsections.
      */
    var enableLazyLoading: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Specifies whether the object page enables flexibility features, such as hiding and adding sections.
      *  For more information about SAPUI5 flexibility, refer to the Developer Guide.
      */
    var flexEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.40
      *
      * Object page floating footer.
      */
    var footer: js.UndefOr[IBar] = js.undefined
    
    /**
      * Object page header content - the dynamic part of the Object page header.
      */
    var headerContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Determines whether the Header Content area can be pinned.
      *
      * When set to `true`, a pin button is displayed within the Header Content area. The pin button allows the
      * user to make the Header Content always visible at the top of the page above any scrollable content.
      *
      * **Note:** This property is only taken into account if an instance of `sap.uxap.ObjectPageDynamicHeaderTitle`
      * is used for the `headerTitle` aggregation.
      */
    var headerContentPinnable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.93
      *
      * Determines whether the `sap.uxap.ObjectPageDynamicHeaderContent` is pinned.
      *
      * The property can be changed explicitly with its setter or in the occurrence of the following user interactions:
      *
      * 	 - Toggling the pin/unpin button of `sap.uxap.ObjectPageDynamicHeaderContent`
      * 	 - Snapping the `sap.uxap.ObjectPageDynamicHeaderContent` by explicitly clicking on the `sap.uxap.ObjectPageDynamicHeaderTitle`
      *
      *
      * **Note: ** The property will only apply if the following rules are currently in use:
      * 	 - An instance of `sap.uxap.ObjectPageDynamicHeaderTitle` is used for the `headerTitle` aggregation.
      *
      * 	 - The `headerContentPinnable` property is `true`
      * 	 - The `sap.uxap.ObjectPageDynamicHeaderContent` is expanded
      * 	 - The `preserveHeaderStateOnScroll` property or the rules for it to work are `false`
      */
    var headerContentPinned: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.93
      *
      * The event is fired when the `headerContentPinned` property is changed via user interaction.
      */
    var headerContentPinnedStateChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Object page header title - the upper, always static, part of the Object page header.
      */
    var headerTitle: js.UndefOr[IHeaderTitle] = js.undefined
    
    /**
      * Determines the height of the ObjectPage.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Determines whether the page is a child page and renders it with a different design. Child pages have
      * an additional (darker/lighter) stripe on the left side of their header content area.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      */
    var isChildPage: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.61
      *
      * Accessible landmark settings to be applied on the containers of the `sap.uxap.ObjectPageLayout` control.
      *
      * If not set, no landmarks will be written.
      */
    var landmarkInfo: js.UndefOr[typings.openui5.sapUxapObjectPageAccessibleLandmarkInfoMod.default] = js.undefined
    
    /**
      * @SINCE 1.40
      *
      * The event is fired when the selected section is changed using the navigation.
      */
    var navigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Preserves the current header state when scrolling. For example, if the user expands the header by clicking
      * on the title and then scrolls down the page, the header will remain expanded.
      *
      * **Notes:**
      * 	 - This property is only taken into account if an instance of `sap.uxap.ObjectPageDynamicHeaderTitle`
      * 			is used for the `headerTitle` aggregation.
      * 	 - Based on internal rules, the value of the property is not always taken into account - for example,
      * 			when the control is rendered on tablet or mobile and the control`s title and header are with height larger
      * 			than the given threshold.
      */
    var preserveHeaderStateOnScroll: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.73
      *
      * Fired when the current section is changed by scrolling.
      */
    var sectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.44.0
      *
      * Determines the ARIA level of the `ObjectPageSection` and `ObjectPageSubSection` titles. The ARIA level
      * is used by assisting technologies, such as screen readers, to create a hierarchical site map for faster
      * navigation.
      *
      *
      * **Note:**
      * 	 - Defining a `sectionTitleLevel` will add `aria-level` attribute from 1 to 6 instead of changing the
      * 			titles` HTML tag from H1 to H6.
      * For example: if `sectionTitleLevel` is `TitleLevel.H1`, it will result as aria-level of 1 added to the
      * `ObjectPageSection` title.
      *
      *
      * 	 -  The `ObjectPageSubSection` title would have `aria-level` one level lower than the defined. For example:
      * 			if `sectionTitleLevel` is `TitleLevel.H1`, it will result as aria-level of 2 added to the `ObjectPageSubSection`
      * 			title.
      *
      *
      * 	 -  It is possible to define a `titleLevel` on `ObjectPageSection` or `ObjectPageSubSection` level.
      * 			In this case the value of this property will be ignored.
      */
    var sectionTitleLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The sections that make up the Object page content area.
      */
    var sections: js.UndefOr[
        js.Array[typings.openui5.sapUxapObjectPageSectionMod.default] | typings.openui5.sapUxapObjectPageSectionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.44.0
      *
      * The section that is selected by default on load.
      */
    var selectedSection: js.UndefOr[typings.openui5.sapUxapObjectPageSectionMod.default | String] = js.undefined
    
    /**
      * Determines whether the Navigation bar (Anchor bar) is displayed.
      */
    var showAnchorBar: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether to show a Popover with Subsection links when clicking on Section links in the Anchor
      * bar.
      */
    var showAnchorBarPopover: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Determines whether an Edit button will be displayed in Header Content.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      */
    var showEditHeaderButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.40
      *
      * Determines whether the footer is visible.
      */
    var showFooter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the visibility of the Header content (headerContent aggregation).
      */
    var showHeaderContent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.32.0
      *
      * Determines whether sections and subsections with importance Low and Medium are hidden even on large screens.
      */
    var showOnlyHighImportance: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the title, image, markers and selectTitleArrow are shown in the Header content area.
      *
      * **Note**: This property is only taken into account if an instance of `sap.uxap.ObjectPageHeader` is used
      * for the `headerTitle` aggregation.
      */
    var showTitleInHeaderContent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether Subsection titles are displayed on top or to the left of the Subsection content.
      */
    var subSectionLayout: js.UndefOr[
        ObjectPageSubSectionLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageSubSectionLayout * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.77
      *
      * Fired when the visibility of subsections is changed.
      */
    var subSectionVisibilityChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The event is fired when the Anchor bar is switched from moving to fixed or the other way round.
      */
    var toggleAnchorBar: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Determines whether the user can switch between the expanded/collapsed states of the `sap.uxap.ObjectPageDynamicHeaderContent`
      * by clicking on the `sap.uxap.ObjectPageDynamicHeaderTitle`. If set to `false`, the `sap.uxap.ObjectPageDynamicHeaderTitle`
      * is not clickable and the application must provide other means for expanding/collapsing the `sap.uxap.ObjectPageDynamicHeaderContent`,
      * if necessary.
      *
      * **Note:** This property is only taken into account if an instance of `sap.uxap.ObjectPageDynamicHeaderTitle`
      * is used for the `headerTitle` aggregation.
      */
    var toggleHeaderOnTitleClick: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the Anchor bar items are displayed in upper case.
      */
    var upperCaseAnchorBar: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the navigation mode is tab-based instead of the default anchor bar. If enabled, the
      * sections are displayed separately on each tab rather than having all of them visible at the same time.
      *
      * **Note:** Keep in mind that the `sap.m.IconTabBar` control is no longer used for the tab navigation mode.
      */
    var useIconTabBar: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the to use two column layout for the L screen size.
      */
    var useTwoColumnsForLargeScreen: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ObjectPageLayoutSettings {
    
    inline def apply(): ObjectPageLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectPageLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectPageLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setAlwaysShowContentHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "alwaysShowContentHeader", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowContentHeaderUndefined: Self = StObject.set(x, "alwaysShowContentHeader", js.undefined)
      
      inline def setBackgroundDesignAnchorBar(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesignAnchorBar", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignAnchorBarUndefined: Self = StObject.set(x, "backgroundDesignAnchorBar", js.undefined)
      
      inline def setEditHeaderButtonPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "editHeaderButtonPress", js.Any.fromFunction1(value))
      
      inline def setEditHeaderButtonPressUndefined: Self = StObject.set(x, "editHeaderButtonPress", js.undefined)
      
      inline def setEnableLazyLoading(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableLazyLoading", value.asInstanceOf[js.Any])
      
      inline def setEnableLazyLoadingUndefined: Self = StObject.set(x, "enableLazyLoading", js.undefined)
      
      inline def setFlexEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "flexEnabled", value.asInstanceOf[js.Any])
      
      inline def setFlexEnabledUndefined: Self = StObject.set(x, "flexEnabled", js.undefined)
      
      inline def setFooter(value: IBar): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeaderContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentPinnable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerContentPinnable", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentPinnableUndefined: Self = StObject.set(x, "headerContentPinnable", js.undefined)
      
      inline def setHeaderContentPinned(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerContentPinned", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentPinnedStateChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "headerContentPinnedStateChange", js.Any.fromFunction1(value))
      
      inline def setHeaderContentPinnedStateChangeUndefined: Self = StObject.set(x, "headerContentPinnedStateChange", js.undefined)
      
      inline def setHeaderContentPinnedUndefined: Self = StObject.set(x, "headerContentPinned", js.undefined)
      
      inline def setHeaderContentUndefined: Self = StObject.set(x, "headerContent", js.undefined)
      
      inline def setHeaderContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "headerContent", js.Array(value*))
      
      inline def setHeaderTitle(value: IHeaderTitle): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsChildPage(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "isChildPage", value.asInstanceOf[js.Any])
      
      inline def setIsChildPageUndefined: Self = StObject.set(x, "isChildPage", js.undefined)
      
      inline def setLandmarkInfo(value: typings.openui5.sapUxapObjectPageAccessibleLandmarkInfoMod.default): Self = StObject.set(x, "landmarkInfo", value.asInstanceOf[js.Any])
      
      inline def setLandmarkInfoUndefined: Self = StObject.set(x, "landmarkInfo", js.undefined)
      
      inline def setNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      inline def setPreserveHeaderStateOnScroll(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "preserveHeaderStateOnScroll", value.asInstanceOf[js.Any])
      
      inline def setPreserveHeaderStateOnScrollUndefined: Self = StObject.set(x, "preserveHeaderStateOnScroll", js.undefined)
      
      inline def setSectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "sectionChange", js.Any.fromFunction1(value))
      
      inline def setSectionChangeUndefined: Self = StObject.set(x, "sectionChange", js.undefined)
      
      inline def setSectionTitleLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "sectionTitleLevel", value.asInstanceOf[js.Any])
      
      inline def setSectionTitleLevelUndefined: Self = StObject.set(x, "sectionTitleLevel", js.undefined)
      
      inline def setSections(
        value: js.Array[typings.openui5.sapUxapObjectPageSectionMod.default] | typings.openui5.sapUxapObjectPageSectionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
      
      inline def setSectionsVarargs(value: typings.openui5.sapUxapObjectPageSectionMod.default*): Self = StObject.set(x, "sections", js.Array(value*))
      
      inline def setSelectedSection(value: typings.openui5.sapUxapObjectPageSectionMod.default | String): Self = StObject.set(x, "selectedSection", value.asInstanceOf[js.Any])
      
      inline def setSelectedSectionUndefined: Self = StObject.set(x, "selectedSection", js.undefined)
      
      inline def setShowAnchorBar(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showAnchorBar", value.asInstanceOf[js.Any])
      
      inline def setShowAnchorBarPopover(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showAnchorBarPopover", value.asInstanceOf[js.Any])
      
      inline def setShowAnchorBarPopoverUndefined: Self = StObject.set(x, "showAnchorBarPopover", js.undefined)
      
      inline def setShowAnchorBarUndefined: Self = StObject.set(x, "showAnchorBar", js.undefined)
      
      inline def setShowEditHeaderButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showEditHeaderButton", value.asInstanceOf[js.Any])
      
      inline def setShowEditHeaderButtonUndefined: Self = StObject.set(x, "showEditHeaderButton", js.undefined)
      
      inline def setShowFooter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      inline def setShowHeaderContent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeaderContent", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderContentUndefined: Self = StObject.set(x, "showHeaderContent", js.undefined)
      
      inline def setShowOnlyHighImportance(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showOnlyHighImportance", value.asInstanceOf[js.Any])
      
      inline def setShowOnlyHighImportanceUndefined: Self = StObject.set(x, "showOnlyHighImportance", js.undefined)
      
      inline def setShowTitleInHeaderContent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTitleInHeaderContent", value.asInstanceOf[js.Any])
      
      inline def setShowTitleInHeaderContentUndefined: Self = StObject.set(x, "showTitleInHeaderContent", js.undefined)
      
      inline def setSubSectionLayout(
        value: ObjectPageSubSectionLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageSubSectionLayout * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "subSectionLayout", value.asInstanceOf[js.Any])
      
      inline def setSubSectionLayoutUndefined: Self = StObject.set(x, "subSectionLayout", js.undefined)
      
      inline def setSubSectionVisibilityChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "subSectionVisibilityChange", js.Any.fromFunction1(value))
      
      inline def setSubSectionVisibilityChangeUndefined: Self = StObject.set(x, "subSectionVisibilityChange", js.undefined)
      
      inline def setToggleAnchorBar(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "toggleAnchorBar", js.Any.fromFunction1(value))
      
      inline def setToggleAnchorBarUndefined: Self = StObject.set(x, "toggleAnchorBar", js.undefined)
      
      inline def setToggleHeaderOnTitleClick(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "toggleHeaderOnTitleClick", value.asInstanceOf[js.Any])
      
      inline def setToggleHeaderOnTitleClickUndefined: Self = StObject.set(x, "toggleHeaderOnTitleClick", js.undefined)
      
      inline def setUpperCaseAnchorBar(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "upperCaseAnchorBar", value.asInstanceOf[js.Any])
      
      inline def setUpperCaseAnchorBarUndefined: Self = StObject.set(x, "upperCaseAnchorBar", js.undefined)
      
      inline def setUseIconTabBar(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useIconTabBar", value.asInstanceOf[js.Any])
      
      inline def setUseIconTabBarUndefined: Self = StObject.set(x, "useIconTabBar", js.undefined)
      
      inline def setUseTwoColumnsForLargeScreen(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useTwoColumnsForLargeScreen", value.asInstanceOf[js.Any])
      
      inline def setUseTwoColumnsForLargeScreenUndefined: Self = StObject.set(x, "useTwoColumnsForLargeScreen", js.undefined)
    }
  }
}
