package typings.openui5

import typings.openui5.anon.DomRef_
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMAvatarColorMod.AvatarColor
import typings.openui5.sapMAvatarShapeMod.AvatarShape
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUxapLibraryMod.IHeaderTitle
import typings.openui5.sapUxapLibraryMod.ObjectPageHeaderDesign
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapObjectPageHeaderMod {
  
  @JSImport("sap/uxap/ObjectPageHeader", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ObjectPageHeader`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:0fecbce45e39406aa939bd25e89823f4 Object Page Classic Header}
    * 	{@link topic:d2ef0099542d44dc868719d908e576d0 Object Page Headers}
    * 	{@link topic:9c9d94fd28284539a9a5a57e9caf82a8 Object Page Headers Comparison}
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/snapping-header/ Object Page Header}
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/object-page/ UX Guidelines: Object Page}
    */
  open class default () extends ObjectPageHeader {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectPageHeaderSettings) = this()
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
    mSettings: ObjectPageHeaderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectPageHeaderSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_uxap_IHeaderTitle: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/ObjectPageHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.ObjectPageHeader with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, ObjectPageHeader]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageHeader],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.ObjectPageHeader.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectPageHeader
    extends typings.openui5.sapUiCoreControlMod.default
       with IHeaderTitle {
    
    /**
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.50) - use the `breadcrumbs` aggregation instead.
      *
      * Adds some breadCrumbLink to the aggregation {@link #getBreadCrumbsLinks breadCrumbsLinks}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addBreadCrumbLink(
      /**
      * The breadCrumbLink to add; if empty, nothing is inserted
      */
    oBreadCrumbLink: typings.openui5.sapMLinkMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:markChangesPress markChangesPress} event of
      * this `sap.uxap.ObjectPageHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageHeader` itself.
      *
      * The event is fired when the unsaved changes button is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMarkChangesPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachMarkChangesPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:markChangesPress markChangesPress} event of
      * this `sap.uxap.ObjectPageHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageHeader` itself.
      *
      * The event is fired when the unsaved changes button is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMarkChangesPress(
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
    def attachMarkChangesPress(
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
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:markLockedPress markLockedPress} event of this
      * `sap.uxap.ObjectPageHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageHeader` itself.
      *
      * The event is fired when the Locked button is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMarkLockedPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachMarkLockedPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:markLockedPress markLockedPress} event of this
      * `sap.uxap.ObjectPageHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageHeader` itself.
      *
      * The event is fired when the Locked button is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMarkLockedPress(
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
    def attachMarkLockedPress(
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
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:titleSelectorPress titleSelectorPress} event
      * of this `sap.uxap.ObjectPageHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageHeader` itself.
      *
      * The event is fired when the objectPage header title selector (down-arrow) is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitleSelectorPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTitleSelectorPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:titleSelectorPress titleSelectorPress} event
      * of this `sap.uxap.ObjectPageHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.uxap.ObjectPageHeader` itself.
      *
      * The event is fired when the objectPage header title selector (down-arrow) is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitleSelectorPress(
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
    def attachTitleSelectorPress(
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
      * Context object to call the event handler with. Defaults to this `sap.uxap.ObjectPageHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * @deprecated (since 1.50) - use the `breadcrumbs` aggregation instead.
      *
      * Destroys all the breadCrumbsLinks in the aggregation {@link #getBreadCrumbsLinks breadCrumbsLinks}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBreadCrumbsLinks(): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
      * Destroys the breadcrumbs in the aggregation {@link #getBreadcrumbs breadcrumbs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBreadcrumbs(): this.type = js.native
    
    /**
      * Destroys the navigationBar in the aggregation {@link #getNavigationBar navigationBar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNavigationBar(): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Destroys the sideContentButton in the aggregation {@link #getSideContentButton sideContentButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySideContentButton(): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Destroys the titleSelectorTooltip in the aggregation {@link #getTitleSelectorTooltip titleSelectorTooltip}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleSelectorTooltip(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:markChangesPress markChangesPress} event of
      * this `sap.uxap.ObjectPageHeader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMarkChangesPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachMarkChangesPress(
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
      * Detaches event handler `fnFunction` from the {@link #event:markLockedPress markLockedPress} event of
      * this `sap.uxap.ObjectPageHeader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMarkLockedPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachMarkLockedPress(
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
      * Detaches event handler `fnFunction` from the {@link #event:titleSelectorPress titleSelectorPress} event
      * of this `sap.uxap.ObjectPageHeader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTitleSelectorPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTitleSelectorPress(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:markChangesPress markChangesPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMarkChangesPress(): this.type = js.native
    def fireMarkChangesPress(/**
      * Parameters to pass along with the event
      */
    mParameters: DomRef_): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:markLockedPress markLockedPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMarkLockedPress(): this.type = js.native
    def fireMarkLockedPress(/**
      * Parameters to pass along with the event
      */
    mParameters: DomRef_): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:titleSelectorPress titleSelectorPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTitleSelectorPress(): this.type = js.native
    def fireTitleSelectorPress(/**
      * Parameters to pass along with the event
      */
    mParameters: DomRef_): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getActions actions}.
      *
      * List of actions that will be displayed in the header. You can use ObjectPageHeaderActionButton controls
      * to achieve a different visual representation of the action buttons in the action bar and the action sheet
      * (overflow menu). You can use ObjectPageHeaderLayoutData to display a visual separator.
      *
      * **Note:** If an action is placed inside the overflow area, an additional `bInOverflow` parameter is passed
      * along with the `press` event to indicate that a popup shouldn't be opened from that action and a dialog
      * should be used instead.
      */
    def getActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @deprecated (since 1.50) - use the `breadcrumbs` aggregation instead.
      *
      * Gets content of aggregation {@link #getBreadCrumbsLinks breadCrumbsLinks}.
      *
      * A list of all the active link elements in the BreadCrumbs control.
      */
    def getBreadCrumbsLinks(): js.Array[typings.openui5.sapMLinkMod.default] = js.native
    
    /**
      * @SINCE 1.50
      *
      * Gets content of aggregation {@link #getBreadcrumbs breadcrumbs}.
      *
      * The breadcrumbs displayed in the `ObjectPageHeader`. If this aggregation is set, the `breadCrumbsLinks`
      * aggregation is omitted.
      */
    def getBreadcrumbs(): typings.openui5.sapMBreadcrumbsMod.default = js.native
    
    /**
      * @deprecated (since 1.40.1)
      *
      * Gets current value of property {@link #getHeaderDesign headerDesign}.
      *
      * Determines the design of the header - Light or Dark. **Note: **This property is deprecated. It will continue
      * to work in the Blue Crystal theme, but it will not be taken into account for the Belize themes.
      *
      * Default value is `Light`.
      *
      * @returns Value of property `headerDesign`
      */
    def getHeaderDesign(): ObjectPageHeaderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageHeaderDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getIsActionAreaAlwaysVisible isActionAreaAlwaysVisible}.
      *
      * Determines whether the action buttons should always be visible or visible only when the header is snapped.
      *
      * Default value is `true`.
      *
      * @returns Value of property `isActionAreaAlwaysVisible`
      */
    def getIsActionAreaAlwaysVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIsObjectIconAlwaysVisible isObjectIconAlwaysVisible}.
      *
      * Determines whether the icon should always be visible or visible only when the header is snapped.
      *
      * Default value is `false`.
      *
      * @returns Value of property `isObjectIconAlwaysVisible`
      */
    def getIsObjectIconAlwaysVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIsObjectSubtitleAlwaysVisible isObjectSubtitleAlwaysVisible}.
      *
      * Determines whether the subtitle should always be visible or visible only when the header is snapped.
      *
      * Default value is `true`.
      *
      * @returns Value of property `isObjectSubtitleAlwaysVisible`
      */
    def getIsObjectSubtitleAlwaysVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIsObjectTitleAlwaysVisible isObjectTitleAlwaysVisible}.
      *
      * Determines whether the title should always be visible or visible only when the header is snapped.
      *
      * Default value is `true`.
      *
      * @returns Value of property `isObjectTitleAlwaysVisible`
      */
    def getIsObjectTitleAlwaysVisible(): Boolean = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getMarkChanges markChanges}.
      *
      * Marks that there are unsaved changes in the objectPageHeader. The markChanges state cannot be used together
      * with the markLocked state. If both are set to true, only the locked state will be displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `markChanges`
      */
    def getMarkChanges(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMarkFavorite markFavorite}.
      *
      * Set the favorite state to true or false. The showMarkers property must be true for this property to take
      * effect.
      *
      * Default value is `false`.
      *
      * @returns Value of property `markFavorite`
      */
    def getMarkFavorite(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMarkFlagged markFlagged}.
      *
      * Set the flagged state to true or false. The showMarkers property must be true for this property to take
      * effect.
      *
      * Default value is `false`.
      *
      * @returns Value of property `markFlagged`
      */
    def getMarkFlagged(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMarkLocked markLocked}.
      *
      * Set the locked state of the objectPageHeader.
      *
      * Default value is `false`.
      *
      * @returns Value of property `markLocked`
      */
    def getMarkLocked(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getNavigationBar navigationBar}.
      *
      * An instance of sap.m.Bar to be embedded in the header
      */
    def getNavigationBar(): typings.openui5.sapMBarMod.default = js.native
    
    /**
      * Gets current value of property {@link #getObjectImageAlt objectImageAlt}.
      *
      * The text to be used for the Alt and Tooltip attribute of the image, supplied via the objectImageURI property
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `objectImageAlt`
      */
    def getObjectImageAlt(): String = js.native
    
    /**
      * @SINCE 1.73
      *
      * Gets current value of property {@link #getObjectImageBackgroundColor objectImageBackgroundColor}.
      *
      * Determines the background color of the image placeholder or icon if valid icon URI is provided.
      *
      * Default value is `Accent6`.
      *
      * @returns Value of property `objectImageBackgroundColor`
      */
    def getObjectImageBackgroundColor(): AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getObjectImageDensityAware objectImageDensityAware}.
      *
      * The value of densityAware for the image, supplied via the objectImageURI property. See sap.m.Image for
      * more details on densityAware.
      *
      * Default value is `false`.
      *
      * @returns Value of property `objectImageDensityAware`
      */
    def getObjectImageDensityAware(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getObjectImageShape objectImageShape}.
      *
      * Determines whether the picture should be displayed in a square or with a circle-shaped mask.
      *
      * Default value is `Square`.
      *
      * @returns Value of property `objectImageShape`
      */
    def getObjectImageShape(): AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getObjectImageURI objectImageURI}.
      *
      * The URL of the image, representing the business object
      *
      * @returns Value of property `objectImageURI`
      */
    def getObjectImageURI(): String = js.native
    
    /**
      * Gets current value of property {@link #getObjectSubtitle objectSubtitle}.
      *
      * The description of the object
      *
      * @returns Value of property `objectSubtitle`
      */
    def getObjectSubtitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getObjectTitle objectTitle}.
      *
      * The title of the object
      *
      * @returns Value of property `objectTitle`
      */
    def getObjectTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getShowMarkers showMarkers}.
      *
      * Indicates if object page header title supports showing markers such as flagged and favorite.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showMarkers`
      */
    def getShowMarkers(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowPlaceholder showPlaceholder}.
      *
      * Enables support of a placeholder image in case no image is specified or the URL of the provided image
      * is invalid.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showPlaceholder`
      */
    def getShowPlaceholder(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowTitleSelector showTitleSelector}.
      *
      * When set to true, the selector arrow icon/image is shown and can be pressed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showTitleSelector`
      */
    def getShowTitleSelector(): Boolean = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets content of aggregation {@link #getSideContentButton sideContentButton}.
      *
      * A button that is used for opening the side content of the page or some additional content.
      */
    def getSideContentButton(): typings.openui5.sapMButtonMod.default = js.native
    
    /**
      * @SINCE 1.56
      *
      * Gets content of aggregation {@link #getTitleSelectorTooltip titleSelectorTooltip}.
      *
      * A custom tooltip for the title selector button.
      *
      * The custom tooltip will be visible if the `showTitleSelector` property is set to `true`.
      *
      * **Note:** If the aggregation is destroyed or set to invalid value, the default tooltip will be set. The
      * default tooltip text is "Related options".
      */
    def getTitleSelectorTooltip(): typings.openui5.sapUiCoreTooltipBaseMod.default | String = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getActions actions}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(
      /**
      * The action whose index is looked for
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * @deprecated (since 1.50) - use the `breadcrumbs` aggregation instead.
      *
      * Checks for the provided `sap.m.Link` in the aggregation {@link #getBreadCrumbsLinks breadCrumbsLinks}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfBreadCrumbLink(
      /**
      * The breadCrumbLink whose index is looked for
      */
    oBreadCrumbLink: typings.openui5.sapMLinkMod.default
    ): int = js.native
    
    /**
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.50) - use the `breadcrumbs` aggregation instead.
      *
      * Inserts a breadCrumbLink into the aggregation {@link #getBreadCrumbsLinks breadCrumbsLinks}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertBreadCrumbLink(
      /**
      * The breadCrumbLink to insert; if empty, nothing is inserted
      */
    oBreadCrumbLink: typings.openui5.sapMLinkMod.default,
      /**
      * The `0`-based index the breadCrumbLink should be inserted at; for a negative value of `iIndex`, the breadCrumbLink
      * is inserted at position 0; for a value greater than the current size of the aggregation, the breadCrumbLink
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @deprecated (since 1.50) - use the `breadcrumbs` aggregation instead.
      *
      * Removes all the controls from the aggregation {@link #getBreadCrumbsLinks breadCrumbsLinks}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllBreadCrumbsLinks(): js.Array[typings.openui5.sapMLinkMod.default] = js.native
    
    def removeBreadCrumbLink(/**
      * The breadCrumbLink to remove or its index or id
      */
    vBreadCrumbLink: String): typings.openui5.sapMLinkMod.default | Null = js.native
    /**
      * @deprecated (since 1.50) - use the `breadcrumbs` aggregation instead.
      *
      * Removes a breadCrumbLink from the aggregation {@link #getBreadCrumbsLinks breadCrumbsLinks}.
      *
      * @returns The removed breadCrumbLink or `null`
      */
    def removeBreadCrumbLink(/**
      * The breadCrumbLink to remove or its index or id
      */
    vBreadCrumbLink: int): typings.openui5.sapMLinkMod.default | Null = js.native
    def removeBreadCrumbLink(
      /**
      * The breadCrumbLink to remove or its index or id
      */
    vBreadCrumbLink: typings.openui5.sapMLinkMod.default
    ): typings.openui5.sapMLinkMod.default | Null = js.native
    
    /**
      * @SINCE 1.50
      *
      * Sets the aggregated {@link #getBreadcrumbs breadcrumbs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBreadcrumbs(/**
      * The breadcrumbs to set
      */
    oBreadcrumbs: typings.openui5.sapMBreadcrumbsMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIsActionAreaAlwaysVisible isActionAreaAlwaysVisible}.
      *
      * Determines whether the action buttons should always be visible or visible only when the header is snapped.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIsActionAreaAlwaysVisible(): this.type = js.native
    def setIsActionAreaAlwaysVisible(
      /**
      * New value for property `isActionAreaAlwaysVisible`
      */
    bIsActionAreaAlwaysVisible: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIsObjectIconAlwaysVisible isObjectIconAlwaysVisible}.
      *
      * Determines whether the icon should always be visible or visible only when the header is snapped.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIsObjectIconAlwaysVisible(): this.type = js.native
    def setIsObjectIconAlwaysVisible(
      /**
      * New value for property `isObjectIconAlwaysVisible`
      */
    bIsObjectIconAlwaysVisible: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIsObjectSubtitleAlwaysVisible isObjectSubtitleAlwaysVisible}.
      *
      * Determines whether the subtitle should always be visible or visible only when the header is snapped.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIsObjectSubtitleAlwaysVisible(): this.type = js.native
    def setIsObjectSubtitleAlwaysVisible(
      /**
      * New value for property `isObjectSubtitleAlwaysVisible`
      */
    bIsObjectSubtitleAlwaysVisible: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIsObjectTitleAlwaysVisible isObjectTitleAlwaysVisible}.
      *
      * Determines whether the title should always be visible or visible only when the header is snapped.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIsObjectTitleAlwaysVisible(): this.type = js.native
    def setIsObjectTitleAlwaysVisible(
      /**
      * New value for property `isObjectTitleAlwaysVisible`
      */
    bIsObjectTitleAlwaysVisible: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getMarkChanges markChanges}.
      *
      * Marks that there are unsaved changes in the objectPageHeader. The markChanges state cannot be used together
      * with the markLocked state. If both are set to true, only the locked state will be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMarkChanges(): this.type = js.native
    def setMarkChanges(/**
      * New value for property `markChanges`
      */
    bMarkChanges: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMarkFavorite markFavorite}.
      *
      * Set the favorite state to true or false. The showMarkers property must be true for this property to take
      * effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMarkFavorite(): this.type = js.native
    def setMarkFavorite(/**
      * New value for property `markFavorite`
      */
    bMarkFavorite: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMarkFlagged markFlagged}.
      *
      * Set the flagged state to true or false. The showMarkers property must be true for this property to take
      * effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMarkFlagged(): this.type = js.native
    def setMarkFlagged(/**
      * New value for property `markFlagged`
      */
    bMarkFlagged: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMarkLocked markLocked}.
      *
      * Set the locked state of the objectPageHeader.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMarkLocked(): this.type = js.native
    def setMarkLocked(/**
      * New value for property `markLocked`
      */
    bMarkLocked: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getNavigationBar navigationBar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNavigationBar(/**
      * The navigationBar to set
      */
    oNavigationBar: typings.openui5.sapMBarMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getObjectImageAlt objectImageAlt}.
      *
      * The text to be used for the Alt and Tooltip attribute of the image, supplied via the objectImageURI property
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setObjectImageAlt(): this.type = js.native
    def setObjectImageAlt(/**
      * New value for property `objectImageAlt`
      */
    sObjectImageAlt: String): this.type = js.native
    
    /**
      * @SINCE 1.73
      *
      * Sets a new value for property {@link #getObjectImageBackgroundColor objectImageBackgroundColor}.
      *
      * Determines the background color of the image placeholder or icon if valid icon URI is provided.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Accent6`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setObjectImageBackgroundColor(): this.type = js.native
    def setObjectImageBackgroundColor(
      /**
      * New value for property `objectImageBackgroundColor`
      */
    sObjectImageBackgroundColor: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String
    ): this.type = js.native
    def setObjectImageBackgroundColor(
      /**
      * New value for property `objectImageBackgroundColor`
      */
    sObjectImageBackgroundColor: AvatarColor
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getObjectImageDensityAware objectImageDensityAware}.
      *
      * The value of densityAware for the image, supplied via the objectImageURI property. See sap.m.Image for
      * more details on densityAware.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setObjectImageDensityAware(): this.type = js.native
    def setObjectImageDensityAware(/**
      * New value for property `objectImageDensityAware`
      */
    bObjectImageDensityAware: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getObjectImageShape objectImageShape}.
      *
      * Determines whether the picture should be displayed in a square or with a circle-shaped mask.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Square`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setObjectImageShape(): this.type = js.native
    def setObjectImageShape(
      /**
      * New value for property `objectImageShape`
      */
    sObjectImageShape: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String
    ): this.type = js.native
    def setObjectImageShape(/**
      * New value for property `objectImageShape`
      */
    sObjectImageShape: AvatarShape): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getObjectImageURI objectImageURI}.
      *
      * The URL of the image, representing the business object
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setObjectImageURI(): this.type = js.native
    def setObjectImageURI(/**
      * New value for property `objectImageURI`
      */
    sObjectImageURI: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getObjectSubtitle objectSubtitle}.
      *
      * The description of the object
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setObjectSubtitle(): this.type = js.native
    def setObjectSubtitle(/**
      * New value for property `objectSubtitle`
      */
    sObjectSubtitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getObjectTitle objectTitle}.
      *
      * The title of the object
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setObjectTitle(): this.type = js.native
    def setObjectTitle(/**
      * New value for property `objectTitle`
      */
    sObjectTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowMarkers showMarkers}.
      *
      * Indicates if object page header title supports showing markers such as flagged and favorite.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowMarkers(): this.type = js.native
    def setShowMarkers(/**
      * New value for property `showMarkers`
      */
    bShowMarkers: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowPlaceholder showPlaceholder}.
      *
      * Enables support of a placeholder image in case no image is specified or the URL of the provided image
      * is invalid.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowPlaceholder(): this.type = js.native
    def setShowPlaceholder(/**
      * New value for property `showPlaceholder`
      */
    bShowPlaceholder: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowTitleSelector showTitleSelector}.
      *
      * When set to true, the selector arrow icon/image is shown and can be pressed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTitleSelector(): this.type = js.native
    def setShowTitleSelector(/**
      * New value for property `showTitleSelector`
      */
    bShowTitleSelector: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Sets the aggregated {@link #getSideContentButton sideContentButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSideContentButton(
      /**
      * The sideContentButton to set
      */
    oSideContentButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    def setTitleSelectorTooltip(/**
      * The titleSelectorTooltip to set
      */
    vTitleSelectorTooltip: String): this.type = js.native
    /**
      * @SINCE 1.56
      *
      * Sets the aggregated {@link #getTitleSelectorTooltip titleSelectorTooltip}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleSelectorTooltip(
      /**
      * The titleSelectorTooltip to set
      */
    vTitleSelectorTooltip: typings.openui5.sapUiCoreTooltipBaseMod.default
    ): this.type = js.native
  }
  
  trait ObjectPageHeaderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * List of actions that will be displayed in the header. You can use ObjectPageHeaderActionButton controls
      * to achieve a different visual representation of the action buttons in the action bar and the action sheet
      * (overflow menu). You can use ObjectPageHeaderLayoutData to display a visual separator.
      *
      * **Note:** If an action is placed inside the overflow area, an additional `bInOverflow` parameter is passed
      * along with the `press` event to indicate that a popup shouldn't be opened from that action and a dialog
      * should be used instead.
      */
    var actions: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.50) - use the `breadcrumbs` aggregation instead.
      *
      * A list of all the active link elements in the BreadCrumbs control.
      */
    var breadCrumbsLinks: js.UndefOr[
        js.Array[typings.openui5.sapMLinkMod.default] | typings.openui5.sapMLinkMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.50
      *
      * The breadcrumbs displayed in the `ObjectPageHeader`. If this aggregation is set, the `breadCrumbsLinks`
      * aggregation is omitted.
      */
    var breadcrumbs: js.UndefOr[typings.openui5.sapMBreadcrumbsMod.default] = js.undefined
    
    /**
      * @deprecated (since 1.40.1)
      *
      * Determines the design of the header - Light or Dark. **Note: **This property is deprecated. It will continue
      * to work in the Blue Crystal theme, but it will not be taken into account for the Belize themes.
      */
    var headerDesign: js.UndefOr[
        ObjectPageHeaderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageHeaderDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines whether the action buttons should always be visible or visible only when the header is snapped.
      */
    var isActionAreaAlwaysVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the icon should always be visible or visible only when the header is snapped.
      */
    var isObjectIconAlwaysVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the subtitle should always be visible or visible only when the header is snapped.
      */
    var isObjectSubtitleAlwaysVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the title should always be visible or visible only when the header is snapped.
      */
    var isObjectTitleAlwaysVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * Marks that there are unsaved changes in the objectPageHeader. The markChanges state cannot be used together
      * with the markLocked state. If both are set to true, only the locked state will be displayed.
      */
    var markChanges: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The event is fired when the unsaved changes button is pressed
      */
    var markChangesPress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Set the favorite state to true or false. The showMarkers property must be true for this property to take
      * effect.
      */
    var markFavorite: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Set the flagged state to true or false. The showMarkers property must be true for this property to take
      * effect.
      */
    var markFlagged: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Set the locked state of the objectPageHeader.
      */
    var markLocked: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The event is fired when the Locked button is pressed
      */
    var markLockedPress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * An instance of sap.m.Bar to be embedded in the header
      */
    var navigationBar: js.UndefOr[typings.openui5.sapMBarMod.default] = js.undefined
    
    /**
      * The text to be used for the Alt and Tooltip attribute of the image, supplied via the objectImageURI property
      */
    var objectImageAlt: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.73
      *
      * Determines the background color of the image placeholder or icon if valid icon URI is provided.
      */
    var objectImageBackgroundColor: js.UndefOr[
        AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The value of densityAware for the image, supplied via the objectImageURI property. See sap.m.Image for
      * more details on densityAware.
      */
    var objectImageDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the picture should be displayed in a square or with a circle-shaped mask.
      */
    var objectImageShape: js.UndefOr[
        AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The URL of the image, representing the business object
      */
    var objectImageURI: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The description of the object
      */
    var objectSubtitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The title of the object
      */
    var objectTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Indicates if object page header title supports showing markers such as flagged and favorite.
      */
    var showMarkers: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables support of a placeholder image in case no image is specified or the URL of the provided image
      * is invalid.
      */
    var showPlaceholder: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * When set to true, the selector arrow icon/image is shown and can be pressed.
      */
    var showTitleSelector: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * A button that is used for opening the side content of the page or some additional content.
      */
    var sideContentButton: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
    
    /**
      * The event is fired when the objectPage header title selector (down-arrow) is pressed
      */
    var titleSelectorPress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * A custom tooltip for the title selector button.
      *
      * The custom tooltip will be visible if the `showTitleSelector` property is set to `true`.
      *
      * **Note:** If the aggregation is destroyed or set to invalid value, the default tooltip will be set. The
      * default tooltip text is "Related options".
      */
    var titleSelectorTooltip: js.UndefOr[String | typings.openui5.sapUiCoreTooltipBaseMod.default | PropertyBindingInfo] = js.undefined
  }
  object ObjectPageHeaderSettings {
    
    inline def apply(): ObjectPageHeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectPageHeaderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectPageHeaderSettings] (val x: Self) extends AnyVal {
      
      inline def setActions(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setBreadCrumbsLinks(
        value: js.Array[typings.openui5.sapMLinkMod.default] | typings.openui5.sapMLinkMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "breadCrumbsLinks", value.asInstanceOf[js.Any])
      
      inline def setBreadCrumbsLinksUndefined: Self = StObject.set(x, "breadCrumbsLinks", js.undefined)
      
      inline def setBreadCrumbsLinksVarargs(value: typings.openui5.sapMLinkMod.default*): Self = StObject.set(x, "breadCrumbsLinks", js.Array(value*))
      
      inline def setBreadcrumbs(value: typings.openui5.sapMBreadcrumbsMod.default): Self = StObject.set(x, "breadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbsUndefined: Self = StObject.set(x, "breadcrumbs", js.undefined)
      
      inline def setHeaderDesign(
        value: ObjectPageHeaderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ObjectPageHeaderDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerDesign", value.asInstanceOf[js.Any])
      
      inline def setHeaderDesignUndefined: Self = StObject.set(x, "headerDesign", js.undefined)
      
      inline def setIsActionAreaAlwaysVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "isActionAreaAlwaysVisible", value.asInstanceOf[js.Any])
      
      inline def setIsActionAreaAlwaysVisibleUndefined: Self = StObject.set(x, "isActionAreaAlwaysVisible", js.undefined)
      
      inline def setIsObjectIconAlwaysVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "isObjectIconAlwaysVisible", value.asInstanceOf[js.Any])
      
      inline def setIsObjectIconAlwaysVisibleUndefined: Self = StObject.set(x, "isObjectIconAlwaysVisible", js.undefined)
      
      inline def setIsObjectSubtitleAlwaysVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "isObjectSubtitleAlwaysVisible", value.asInstanceOf[js.Any])
      
      inline def setIsObjectSubtitleAlwaysVisibleUndefined: Self = StObject.set(x, "isObjectSubtitleAlwaysVisible", js.undefined)
      
      inline def setIsObjectTitleAlwaysVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "isObjectTitleAlwaysVisible", value.asInstanceOf[js.Any])
      
      inline def setIsObjectTitleAlwaysVisibleUndefined: Self = StObject.set(x, "isObjectTitleAlwaysVisible", js.undefined)
      
      inline def setMarkChanges(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "markChanges", value.asInstanceOf[js.Any])
      
      inline def setMarkChangesPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "markChangesPress", js.Any.fromFunction1(value))
      
      inline def setMarkChangesPressUndefined: Self = StObject.set(x, "markChangesPress", js.undefined)
      
      inline def setMarkChangesUndefined: Self = StObject.set(x, "markChanges", js.undefined)
      
      inline def setMarkFavorite(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "markFavorite", value.asInstanceOf[js.Any])
      
      inline def setMarkFavoriteUndefined: Self = StObject.set(x, "markFavorite", js.undefined)
      
      inline def setMarkFlagged(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "markFlagged", value.asInstanceOf[js.Any])
      
      inline def setMarkFlaggedUndefined: Self = StObject.set(x, "markFlagged", js.undefined)
      
      inline def setMarkLocked(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "markLocked", value.asInstanceOf[js.Any])
      
      inline def setMarkLockedPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "markLockedPress", js.Any.fromFunction1(value))
      
      inline def setMarkLockedPressUndefined: Self = StObject.set(x, "markLockedPress", js.undefined)
      
      inline def setMarkLockedUndefined: Self = StObject.set(x, "markLocked", js.undefined)
      
      inline def setNavigationBar(value: typings.openui5.sapMBarMod.default): Self = StObject.set(x, "navigationBar", value.asInstanceOf[js.Any])
      
      inline def setNavigationBarUndefined: Self = StObject.set(x, "navigationBar", js.undefined)
      
      inline def setObjectImageAlt(value: String | PropertyBindingInfo): Self = StObject.set(x, "objectImageAlt", value.asInstanceOf[js.Any])
      
      inline def setObjectImageAltUndefined: Self = StObject.set(x, "objectImageAlt", js.undefined)
      
      inline def setObjectImageBackgroundColor(
        value: AvatarColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "objectImageBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setObjectImageBackgroundColorUndefined: Self = StObject.set(x, "objectImageBackgroundColor", js.undefined)
      
      inline def setObjectImageDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "objectImageDensityAware", value.asInstanceOf[js.Any])
      
      inline def setObjectImageDensityAwareUndefined: Self = StObject.set(x, "objectImageDensityAware", js.undefined)
      
      inline def setObjectImageShape(
        value: AvatarShape | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AvatarShape * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "objectImageShape", value.asInstanceOf[js.Any])
      
      inline def setObjectImageShapeUndefined: Self = StObject.set(x, "objectImageShape", js.undefined)
      
      inline def setObjectImageURI(value: String | PropertyBindingInfo): Self = StObject.set(x, "objectImageURI", value.asInstanceOf[js.Any])
      
      inline def setObjectImageURIUndefined: Self = StObject.set(x, "objectImageURI", js.undefined)
      
      inline def setObjectSubtitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "objectSubtitle", value.asInstanceOf[js.Any])
      
      inline def setObjectSubtitleUndefined: Self = StObject.set(x, "objectSubtitle", js.undefined)
      
      inline def setObjectTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "objectTitle", value.asInstanceOf[js.Any])
      
      inline def setObjectTitleUndefined: Self = StObject.set(x, "objectTitle", js.undefined)
      
      inline def setShowMarkers(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showMarkers", value.asInstanceOf[js.Any])
      
      inline def setShowMarkersUndefined: Self = StObject.set(x, "showMarkers", js.undefined)
      
      inline def setShowPlaceholder(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setShowPlaceholderUndefined: Self = StObject.set(x, "showPlaceholder", js.undefined)
      
      inline def setShowTitleSelector(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTitleSelector", value.asInstanceOf[js.Any])
      
      inline def setShowTitleSelectorUndefined: Self = StObject.set(x, "showTitleSelector", js.undefined)
      
      inline def setSideContentButton(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "sideContentButton", value.asInstanceOf[js.Any])
      
      inline def setSideContentButtonUndefined: Self = StObject.set(x, "sideContentButton", js.undefined)
      
      inline def setTitleSelectorPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "titleSelectorPress", js.Any.fromFunction1(value))
      
      inline def setTitleSelectorPressUndefined: Self = StObject.set(x, "titleSelectorPress", js.undefined)
      
      inline def setTitleSelectorTooltip(value: String | typings.openui5.sapUiCoreTooltipBaseMod.default | PropertyBindingInfo): Self = StObject.set(x, "titleSelectorTooltip", value.asInstanceOf[js.Any])
      
      inline def setTitleSelectorTooltipUndefined: Self = StObject.set(x, "titleSelectorTooltip", js.undefined)
    }
  }
}
