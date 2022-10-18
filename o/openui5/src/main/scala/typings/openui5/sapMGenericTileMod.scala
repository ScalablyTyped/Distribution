package typings.openui5

import typings.openui5.anon.Scope
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.FrameType
import typings.openui5.sapMLibraryMod.GenericTileMode
import typings.openui5.sapMLibraryMod.GenericTileScope
import typings.openui5.sapMLibraryMod.LoadState
import typings.openui5.sapMLibraryMod.Size
import typings.openui5.sapMLibraryMod.TileSizeBehavior
import typings.openui5.sapMLibraryMod.ValueColor
import typings.openui5.sapMLibraryMod.WrappingType
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMGenericTileMod {
  
  @JSImport("sap/m/GenericTile", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.m.GenericTile control.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GenericTile {
    def this(/**
      * initial settings for the new control
      */
    mSettings: GenericTileSettings) = this()
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
      * initial settings for the new control
      */
    mSettings: GenericTileSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: GenericTileSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/GenericTile", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.GenericTile with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, GenericTile]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GenericTile],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.GenericTile.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GenericTile
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Adds some actionButton to the aggregation {@link #getActionButtons actionButtons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addActionButton(
      /**
      * The actionButton to add; if empty, nothing is inserted
      */
    oActionButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Adds some tileContent to the aggregation {@link #getTileContent tileContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addTileContent(
      /**
      * The tileContent to add; if empty, nothing is inserted
      */
    oTileContent: typings.openui5.sapMTileContentMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.GenericTile`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.GenericTile` itself.
      *
      * The event is triggered when the user presses the tile.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.GenericTile` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.GenericTile`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.GenericTile` itself.
      *
      * The event is triggered when the user presses the tile.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
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
    def attachPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.GenericTile` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Binds aggregation {@link #getActionButtons actionButtons} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindActionButtons(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Binds aggregation {@link #getTileContent tileContent} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindTileContent(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Destroys all the actionButtons in the aggregation {@link #getActionButtons actionButtons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActionButtons(): this.type = js.native
    
    /**
      * @deprecated (since 1.36.0) - This aggregation is deprecated, use sap.m.ImageContent control to display
      * an icon instead.
      *
      * Destroys the icon in the aggregation {@link #getIcon icon}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyIcon(): this.type = js.native
    
    /**
      * Destroys all the tileContent in the aggregation {@link #getTileContent tileContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTileContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.GenericTile`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPress(
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
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: Scope): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Gets content of aggregation {@link #getActionButtons actionButtons}.
      *
      * Action buttons added in ActionMode.
      */
    def getActionButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * @SINCE 1.82
      *
      * Gets current value of property {@link #getAdditionalTooltip additionalTooltip}.
      *
      * Tooltip text which is added at the tooltip generated by the control.
      *
      * @returns Value of property `additionalTooltip`
      */
    def getAdditionalTooltip(): String = js.native
    
    /**
      * @SINCE 1.92.0
      * @EXPERIMENTAL (since 1.92)
      *
      * Gets current value of property {@link #getAppShortcut appShortcut}.
      *
      * Application information such as ID/Shortcut
      *
      * @returns Value of property `appShortcut`
      */
    def getAppShortcut(): String = js.native
    
    /**
      * @SINCE 1.50.0
      *
      * Gets current value of property {@link #getAriaLabel ariaLabel}.
      *
      * Additional description for aria-label. The aria-label is rendered before the standard aria-label.
      *
      * @returns Value of property `ariaLabel`
      */
    def getAriaLabel(): String = js.native
    
    /**
      * @SINCE 1.83
      *
      * Gets current value of property {@link #getAriaRole ariaRole}.
      *
      * Additional description for aria-role.
      *
      * @returns Value of property `ariaRole`
      */
    def getAriaRole(): String = js.native
    
    /**
      * @SINCE 1.83
      *
      * Gets current value of property {@link #getAriaRoleDescription ariaRoleDescription}.
      *
      * Additional description for aria-roledescription.
      *
      * @returns Value of property `ariaRoleDescription`
      */
    def getAriaRoleDescription(): String = js.native
    
    /**
      * @SINCE 1.96
      * @EXPERIMENTAL (since 1.96)
      *
      * Gets current value of property {@link #getBackgroundColor backgroundColor}.
      *
      * Background color of the GenericTile. Only applicable for IconMode.
      *
      * Default value is `...see text or source`.
      *
      * @returns Value of property `backgroundColor`
      */
    def getBackgroundColor(): String = js.native
    
    /**
      * Gets current value of property {@link #getBackgroundImage backgroundImage}.
      *
      * The URI of the background image.
      *
      * @returns Value of property `backgroundImage`
      */
    def getBackgroundImage(): URI = js.native
    
    /**
      * @EXPERIMENTAL (since 1.44.1)
      *
      * Provides an interface to the tile's layout information consistent in all modes and content densities.
      *
      * @returns An array containing all of the tile's bounding rectangles
      */
    def getBoundingRects(): js.Array[js.Object] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Gets current value of property {@link #getEnableNavigationButton enableNavigationButton}.
      *
      * Renders the given link as a button, enabling the option of opening the link in new tab/window functionality.
      * Works only in ArticleMode.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableNavigationButton`
      */
    def getEnableNavigationButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFailedText failedText}.
      *
      * The message that appears when the control is in the Failed state.
      *
      * @returns Value of property `failedText`
      */
    def getFailedText(): String = js.native
    
    /**
      * Gets current value of property {@link #getFrameType frameType}.
      *
      * The FrameType: OneByOne, TwoByOne, OneByHalf, or TwoByHalf. Default set to OneByOne if property is not
      * defined or set to Auto by the app.
      *
      * Default value is `OneByOne`.
      *
      * @returns Value of property `frameType`
      */
    def getFrameType(): FrameType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FrameType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getHeader header}.
      *
      * The header of the tile.
      *
      * @returns Value of property `header`
      */
    def getHeader(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeaderImage headerImage}.
      *
      * The image to be displayed as a graphical element within the header. This can be an image or an icon from
      * the icon font.
      *
      * @returns Value of property `headerImage`
      */
    def getHeaderImage(): URI = js.native
    
    /**
      * @deprecated (since 1.36.0) - This aggregation is deprecated, use sap.m.ImageContent control to display
      * an icon instead.
      *
      * Gets content of aggregation {@link #getIcon icon}.
      *
      * An icon or image to be displayed in the control. This aggregation is deprecated since version 1.36.0,
      * to display an icon or image use sap.m.ImageContent control instead.
      */
    def getIcon(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.103
      * @EXPERIMENTAL (since 1.103)
      *
      * Gets current value of property {@link #getIconLoaded iconLoaded}.
      *
      * The load state of the tileIcon.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconLoaded`
      */
    def getIconLoaded(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getImageDescription imageDescription}.
      *
      * Description of a header image that is used in the tooltip.
      *
      * @returns Value of property `imageDescription`
      */
    def getImageDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getMode mode}.
      *
      * The mode of the GenericTile.
      *
      * Default value is `ContentMode`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): GenericTileMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileMode * / any */ String) = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Gets current value of property {@link #getNavigationButtonText navigationButtonText}.
      *
      * Text for navigate action button. Default Value is "Read More". Works only in ArticleMode.
      *
      * @returns Value of property `navigationButtonText`
      */
    def getNavigationButtonText(): String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Gets current value of property {@link #getPressEnabled pressEnabled}.
      *
      * Disables press event for the tile control.
      *
      * Default value is `true`.
      *
      * @returns Value of property `pressEnabled`
      */
    def getPressEnabled(): Boolean = js.native
    
    /**
      * @SINCE 1.106
      * @EXPERIMENTAL (since 1.106)
      *
      * Gets current value of property {@link #getRenderOnThemeChange renderOnThemeChange}.
      *
      * The Tile rerenders on theme change.
      *
      * Default value is `false`.
      *
      * @returns Value of property `renderOnThemeChange`
      */
    def getRenderOnThemeChange(): Boolean = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Gets current value of property {@link #getScope scope}.
      *
      * Changes the visualization in order to enable additional actions with the Generic Tile.
      *
      * Default value is `Display`.
      *
      * @returns Value of property `scope`
      */
    def getScope(): GenericTileScope | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileScope * / any */ String) = js.native
    
    /**
      * @deprecated (since 1.38.0) - The GenericTile control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * Gets current value of property {@link #getSize size}.
      *
      * The size of the tile. If not set, then the default size is applied based on the device.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `size`
      */
    def getSize(): Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSizeBehavior sizeBehavior}.
      *
      * If set to `TileSizeBehavior.Small`, the tile size is the same as it would be on a small-screened phone
      * (374px wide and lower), regardless of the screen size of the actual device being used. If set to `TileSizeBehavior.Responsive`,
      * the tile size adapts to the size of the screen.
      *
      * Default value is `Responsive`.
      *
      * @returns Value of property `sizeBehavior`
      */
    def getSizeBehavior(): TileSizeBehavior | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TileSizeBehavior * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getState state}.
      *
      * The load status.
      *
      * Default value is `Loaded`.
      *
      * @returns Value of property `state`
      */
    def getState(): LoadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSubheader subheader}.
      *
      * The subheader of the tile.
      *
      * @returns Value of property `subheader`
      */
    def getSubheader(): String = js.native
    
    /**
      * @SINCE 1.92.0
      * @EXPERIMENTAL (since 1.92)
      *
      * Gets current value of property {@link #getSystemInfo systemInfo}.
      *
      * Backend system context information
      *
      * @returns Value of property `systemInfo`
      */
    def getSystemInfo(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getTileContent tileContent}.
      *
      * The content of the tile.
      */
    def getTileContent(): js.Array[typings.openui5.sapMTileContentMod.default] = js.native
    
    /**
      * @SINCE 1.96
      * @EXPERIMENTAL (since 1.96)
      *
      * Gets current value of property {@link #getTileIcon tileIcon}.
      *
      * Icon of the GenericTile. Only applicable for IconMode.
      *
      * @returns Value of property `tileIcon`
      */
    def getTileIcon(): URI = js.native
    
    /**
      * @SINCE 1.76
      *
      * Gets current value of property {@link #getUrl url}.
      *
      * Renders the given link as root element and therefore enables the open in new tab / window functionality
      *
      * @returns Value of property `url`
      */
    def getUrl(): URI = js.native
    
    /**
      * @SINCE 1.95
      * @EXPERIMENTAL (since 1.95)
      *
      * Gets current value of property {@link #getValueColor valueColor}.
      *
      * The semantic color of the value.
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `valueColor`
      */
    def getValueColor(): ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) = js.native
    
    /**
      * @SINCE 1.72
      *
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of the control.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.60
      *
      * Gets current value of property {@link #getWrappingType wrappingType}.
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * Default value is `Normal`.
      *
      * @returns Value of property `wrappingType`
      */
    def getWrappingType(): WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getActionButtons actionButtons}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfActionButton(
      /**
      * The actionButton whose index is looked for
      */
    oActionButton: typings.openui5.sapMButtonMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.TileContent` in the aggregation {@link #getTileContent tileContent}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfTileContent(
      /**
      * The tileContent whose index is looked for
      */
    oTileContent: typings.openui5.sapMTileContentMod.default
    ): int = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Inserts a actionButton into the aggregation {@link #getActionButtons actionButtons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertActionButton(
      /**
      * The actionButton to insert; if empty, nothing is inserted
      */
    oActionButton: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the actionButton should be inserted at; for a negative value of `iIndex`, the actionButton
      * is inserted at position 0; for a value greater than the current size of the aggregation, the actionButton
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a tileContent into the aggregation {@link #getTileContent tileContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertTileContent(
      /**
      * The tileContent to insert; if empty, nothing is inserted
      */
    oTileContent: typings.openui5.sapMTileContentMod.default,
      /**
      * The `0`-based index the tileContent should be inserted at; for a negative value of `iIndex`, the tileContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the tileContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeActionButton(/**
      * The actionButton to remove or its index or id
      */
    vActionButton: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Removes a actionButton from the aggregation {@link #getActionButtons actionButtons}.
      *
      * @returns The removed actionButton or `null`
      */
    def removeActionButton(/**
      * The actionButton to remove or its index or id
      */
    vActionButton: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeActionButton(
      /**
      * The actionButton to remove or its index or id
      */
    vActionButton: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Removes all the controls from the aggregation {@link #getActionButtons actionButtons}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActionButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getTileContent tileContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTileContent(): js.Array[typings.openui5.sapMTileContentMod.default] = js.native
    
    def removeTileContent(/**
      * The tileContent to remove or its index or id
      */
    vTileContent: String): typings.openui5.sapMTileContentMod.default | Null = js.native
    /**
      * Removes a tileContent from the aggregation {@link #getTileContent tileContent}.
      *
      * @returns The removed tileContent or `null`
      */
    def removeTileContent(/**
      * The tileContent to remove or its index or id
      */
    vTileContent: int): typings.openui5.sapMTileContentMod.default | Null = js.native
    def removeTileContent(
      /**
      * The tileContent to remove or its index or id
      */
    vTileContent: typings.openui5.sapMTileContentMod.default
    ): typings.openui5.sapMTileContentMod.default | Null = js.native
    
    /**
      * @SINCE 1.82
      *
      * Sets a new value for property {@link #getAdditionalTooltip additionalTooltip}.
      *
      * Tooltip text which is added at the tooltip generated by the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalTooltip(): this.type = js.native
    def setAdditionalTooltip(/**
      * New value for property `additionalTooltip`
      */
    sAdditionalTooltip: String): this.type = js.native
    
    /**
      * @SINCE 1.92.0
      * @EXPERIMENTAL (since 1.92)
      *
      * Sets a new value for property {@link #getAppShortcut appShortcut}.
      *
      * Application information such as ID/Shortcut
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAppShortcut(): this.type = js.native
    def setAppShortcut(/**
      * New value for property `appShortcut`
      */
    sAppShortcut: String): this.type = js.native
    
    /**
      * @SINCE 1.50.0
      *
      * Sets a new value for property {@link #getAriaLabel ariaLabel}.
      *
      * Additional description for aria-label. The aria-label is rendered before the standard aria-label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaLabel(): this.type = js.native
    def setAriaLabel(/**
      * New value for property `ariaLabel`
      */
    sAriaLabel: String): this.type = js.native
    
    /**
      * @SINCE 1.83
      *
      * Sets a new value for property {@link #getAriaRole ariaRole}.
      *
      * Additional description for aria-role.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaRole(): this.type = js.native
    def setAriaRole(/**
      * New value for property `ariaRole`
      */
    sAriaRole: String): this.type = js.native
    
    /**
      * @SINCE 1.83
      *
      * Sets a new value for property {@link #getAriaRoleDescription ariaRoleDescription}.
      *
      * Additional description for aria-roledescription.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaRoleDescription(): this.type = js.native
    def setAriaRoleDescription(/**
      * New value for property `ariaRoleDescription`
      */
    sAriaRoleDescription: String): this.type = js.native
    
    /**
      * @SINCE 1.96
      * @EXPERIMENTAL (since 1.96)
      *
      * Sets a new value for property {@link #getBackgroundColor backgroundColor}.
      *
      * Background color of the GenericTile. Only applicable for IconMode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundColor(): this.type = js.native
    def setBackgroundColor(/**
      * New value for property `backgroundColor`
      */
    sBackgroundColor: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBackgroundImage backgroundImage}.
      *
      * The URI of the background image.
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
      * @EXPERIMENTAL (since 1.96)
      *
      * Sets a new value for property {@link #getEnableNavigationButton enableNavigationButton}.
      *
      * Renders the given link as a button, enabling the option of opening the link in new tab/window functionality.
      * Works only in ArticleMode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableNavigationButton(): this.type = js.native
    def setEnableNavigationButton(/**
      * New value for property `enableNavigationButton`
      */
    bEnableNavigationButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFailedText failedText}.
      *
      * The message that appears when the control is in the Failed state.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFailedText(): this.type = js.native
    def setFailedText(/**
      * New value for property `failedText`
      */
    sFailedText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFrameType frameType}.
      *
      * The FrameType: OneByOne, TwoByOne, OneByHalf, or TwoByHalf. Default set to OneByOne if property is not
      * defined or set to Auto by the app.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `OneByOne`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFrameType(): this.type = js.native
    def setFrameType(
      /**
      * New value for property `frameType`
      */
    sFrameType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FrameType * / any */ String
    ): this.type = js.native
    def setFrameType(/**
      * New value for property `frameType`
      */
    sFrameType: FrameType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeader header}.
      *
      * The header of the tile.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeader(): this.type = js.native
    def setHeader(/**
      * New value for property `header`
      */
    sHeader: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderImage headerImage}.
      *
      * The image to be displayed as a graphical element within the header. This can be an image or an icon from
      * the icon font.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderImage(): this.type = js.native
    def setHeaderImage(/**
      * New value for property `headerImage`
      */
    sHeaderImage: URI): this.type = js.native
    
    /**
      * @deprecated (since 1.36.0) - This aggregation is deprecated, use sap.m.ImageContent control to display
      * an icon instead.
      *
      * Sets the aggregated {@link #getIcon icon}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(/**
      * The icon to set
      */
    oIcon: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @SINCE 1.103
      * @EXPERIMENTAL (since 1.103)
      *
      * Sets a new value for property {@link #getIconLoaded iconLoaded}.
      *
      * The load state of the tileIcon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconLoaded(): this.type = js.native
    def setIconLoaded(/**
      * New value for property `iconLoaded`
      */
    bIconLoaded: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getImageDescription imageDescription}.
      *
      * Description of a header image that is used in the tooltip.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setImageDescription(): this.type = js.native
    def setImageDescription(/**
      * New value for property `imageDescription`
      */
    sImageDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMode mode}.
      *
      * The mode of the GenericTile.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `ContentMode`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMode(): this.type = js.native
    def setMode(
      /**
      * New value for property `mode`
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileMode * / any */ String
    ): this.type = js.native
    def setMode(/**
      * New value for property `mode`
      */
    sMode: GenericTileMode): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Sets a new value for property {@link #getNavigationButtonText navigationButtonText}.
      *
      * Text for navigate action button. Default Value is "Read More". Works only in ArticleMode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNavigationButtonText(): this.type = js.native
    def setNavigationButtonText(/**
      * New value for property `navigationButtonText`
      */
    sNavigationButtonText: String): this.type = js.native
    
    /**
      * @SINCE 1.46
      *
      * Provides an interface to switch on or off the tile's press event. Used in SlideTile for Actions scope.
      */
    def setPressEnabled(/**
      * If set to true, the press event of the tile is active.
      */
    value: Boolean): Unit = js.native
    
    /**
      * @SINCE 1.106
      * @EXPERIMENTAL (since 1.106)
      *
      * Sets a new value for property {@link #getRenderOnThemeChange renderOnThemeChange}.
      *
      * The Tile rerenders on theme change.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRenderOnThemeChange(): this.type = js.native
    def setRenderOnThemeChange(/**
      * New value for property `renderOnThemeChange`
      */
    bRenderOnThemeChange: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Sets a new value for property {@link #getScope scope}.
      *
      * Changes the visualization in order to enable additional actions with the Generic Tile.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Display`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScope(): this.type = js.native
    def setScope(
      /**
      * New value for property `scope`
      */
    sScope: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileScope * / any */ String
    ): this.type = js.native
    def setScope(/**
      * New value for property `scope`
      */
    sScope: GenericTileScope): this.type = js.native
    
    /**
      * @deprecated (since 1.38.0) - The GenericTile control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * Sets a new value for property {@link #getSize size}.
      *
      * The size of the tile. If not set, then the default size is applied based on the device.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSize(): this.type = js.native
    def setSize(
      /**
      * New value for property `size`
      */
    sSize: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String
    ): this.type = js.native
    def setSize(/**
      * New value for property `size`
      */
    sSize: Size): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSizeBehavior sizeBehavior}.
      *
      * If set to `TileSizeBehavior.Small`, the tile size is the same as it would be on a small-screened phone
      * (374px wide and lower), regardless of the screen size of the actual device being used. If set to `TileSizeBehavior.Responsive`,
      * the tile size adapts to the size of the screen.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Responsive`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSizeBehavior(): this.type = js.native
    def setSizeBehavior(
      /**
      * New value for property `sizeBehavior`
      */
    sSizeBehavior: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TileSizeBehavior * / any */ String
    ): this.type = js.native
    def setSizeBehavior(/**
      * New value for property `sizeBehavior`
      */
    sSizeBehavior: TileSizeBehavior): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getState state}.
      *
      * The load status.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Loaded`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setState(): this.type = js.native
    def setState(
      /**
      * New value for property `state`
      */
    sState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadState * / any */ String
    ): this.type = js.native
    def setState(/**
      * New value for property `state`
      */
    sState: LoadState): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubheader subheader}.
      *
      * The subheader of the tile.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubheader(): this.type = js.native
    def setSubheader(/**
      * New value for property `subheader`
      */
    sSubheader: String): this.type = js.native
    
    /**
      * @SINCE 1.92.0
      * @EXPERIMENTAL (since 1.92)
      *
      * Sets a new value for property {@link #getSystemInfo systemInfo}.
      *
      * Backend system context information
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSystemInfo(): this.type = js.native
    def setSystemInfo(/**
      * New value for property `systemInfo`
      */
    sSystemInfo: String): this.type = js.native
    
    /**
      * @SINCE 1.96
      * @EXPERIMENTAL (since 1.96)
      *
      * Sets a new value for property {@link #getTileIcon tileIcon}.
      *
      * Icon of the GenericTile. Only applicable for IconMode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTileIcon(/**
      * New value for property `tileIcon`
      */
    sTileIcon: URI): this.type = js.native
    
    /**
      * @SINCE 1.76
      *
      * Sets a new value for property {@link #getUrl url}.
      *
      * Renders the given link as root element and therefore enables the open in new tab / window functionality
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUrl(): this.type = js.native
    def setUrl(/**
      * New value for property `url`
      */
    sUrl: URI): this.type = js.native
    
    /**
      * @SINCE 1.95
      * @EXPERIMENTAL (since 1.95)
      *
      * Sets a new value for property {@link #getValueColor valueColor}.
      *
      * The semantic color of the value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueColor(): this.type = js.native
    def setValueColor(
      /**
      * New value for property `valueColor`
      */
    sValueColor: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String
    ): this.type = js.native
    def setValueColor(/**
      * New value for property `valueColor`
      */
    sValueColor: ValueColor): this.type = js.native
    
    /**
      * @SINCE 1.72
      *
      * Sets a new value for property {@link #getWidth width}.
      *
      * Width of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.60
      *
      * Sets a new value for property {@link #getWrappingType wrappingType}.
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Normal`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrappingType(): this.type = js.native
    def setWrappingType(
      /**
      * New value for property `wrappingType`
      */
    sWrappingType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String
    ): this.type = js.native
    def setWrappingType(/**
      * New value for property `wrappingType`
      */
    sWrappingType: WrappingType): this.type = js.native
    
    /**
      * @SINCE 1.46
      *
      * Shows the actions scope view of GenericTile without changing the scope. Used in SlideTile for Actions
      * scope.
      */
    def showActionsView(/**
      * If set to true, actions view is showed.
      */
    value: Boolean): Unit = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Unbinds aggregation {@link #getActionButtons actionButtons} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindActionButtons(): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getTileContent tileContent} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindTileContent(): this.type = js.native
  }
  
  trait GenericTileSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Action buttons added in ActionMode.
      */
    var actionButtons: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.82
      *
      * Tooltip text which is added at the tooltip generated by the control.
      */
    var additionalTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.92.0
      * @EXPERIMENTAL (since 1.92)
      *
      * Application information such as ID/Shortcut
      */
    var appShortcut: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.50.0
      *
      * Additional description for aria-label. The aria-label is rendered before the standard aria-label.
      */
    var ariaLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.83
      *
      * Additional description for aria-role.
      */
    var ariaRole: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.83
      *
      * Additional description for aria-roledescription.
      */
    var ariaRoleDescription: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.96
      * @EXPERIMENTAL (since 1.96)
      *
      * Background color of the GenericTile. Only applicable for IconMode.
      */
    var backgroundColor: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The URI of the background image.
      */
    var backgroundImage: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Renders the given link as a button, enabling the option of opening the link in new tab/window functionality.
      * Works only in ArticleMode.
      */
    var enableNavigationButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The message that appears when the control is in the Failed state.
      */
    var failedText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The FrameType: OneByOne, TwoByOne, OneByHalf, or TwoByHalf. Default set to OneByOne if property is not
      * defined or set to Auto by the app.
      */
    var frameType: js.UndefOr[
        FrameType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FrameType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The header of the tile.
      */
    var header: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The image to be displayed as a graphical element within the header. This can be an image or an icon from
      * the icon font.
      */
    var headerImage: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.36.0) - This aggregation is deprecated, use sap.m.ImageContent control to display
      * an icon instead.
      *
      * An icon or image to be displayed in the control. This aggregation is deprecated since version 1.36.0,
      * to display an icon or image use sap.m.ImageContent control instead.
      */
    var icon: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @SINCE 1.103
      * @EXPERIMENTAL (since 1.103)
      *
      * The load state of the tileIcon.
      */
    var iconLoaded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Description of a header image that is used in the tooltip.
      */
    var imageDescription: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The mode of the GenericTile.
      */
    var mode: js.UndefOr[
        GenericTileMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Text for navigate action button. Default Value is "Read More". Works only in ArticleMode.
      */
    var navigationButtonText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The event is triggered when the user presses the tile.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Disables press event for the tile control.
      */
    var pressEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.106
      * @EXPERIMENTAL (since 1.106)
      *
      * The Tile rerenders on theme change.
      */
    var renderOnThemeChange: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.46.0
      *
      * Changes the visualization in order to enable additional actions with the Generic Tile.
      */
    var scope: js.UndefOr[
        GenericTileScope | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileScope * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @deprecated (since 1.38.0) - The GenericTile control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * The size of the tile. If not set, then the default size is applied based on the device.
      */
    var size: js.UndefOr[
        Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * If set to `TileSizeBehavior.Small`, the tile size is the same as it would be on a small-screened phone
      * (374px wide and lower), regardless of the screen size of the actual device being used. If set to `TileSizeBehavior.Responsive`,
      * the tile size adapts to the size of the screen.
      */
    var sizeBehavior: js.UndefOr[
        TileSizeBehavior | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TileSizeBehavior * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The load status.
      */
    var state: js.UndefOr[
        LoadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The subheader of the tile.
      */
    var subheader: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.92.0
      * @EXPERIMENTAL (since 1.92)
      *
      * Backend system context information
      */
    var systemInfo: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The content of the tile.
      */
    var tileContent: js.UndefOr[
        js.Array[typings.openui5.sapMTileContentMod.default] | typings.openui5.sapMTileContentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.96
      * @EXPERIMENTAL (since 1.96)
      *
      * Icon of the GenericTile. Only applicable for IconMode.
      */
    var tileIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.76
      *
      * Renders the given link as root element and therefore enables the open in new tab / window functionality
      */
    var url: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.95
      * @EXPERIMENTAL (since 1.95)
      *
      * The semantic color of the value.
      */
    var valueColor: js.UndefOr[
        ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.72
      *
      * Width of the control.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.60
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      */
    var wrappingType: js.UndefOr[
        WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object GenericTileSettings {
    
    inline def apply(): GenericTileSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericTileSettings]
    }
    
    extension [Self <: GenericTileSettings](x: Self) {
      
      inline def setActionButtons(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actionButtons", value.asInstanceOf[js.Any])
      
      inline def setActionButtonsUndefined: Self = StObject.set(x, "actionButtons", js.undefined)
      
      inline def setActionButtonsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "actionButtons", js.Array(value*))
      
      inline def setAdditionalTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "additionalTooltip", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTooltipUndefined: Self = StObject.set(x, "additionalTooltip", js.undefined)
      
      inline def setAppShortcut(value: String | PropertyBindingInfo): Self = StObject.set(x, "appShortcut", value.asInstanceOf[js.Any])
      
      inline def setAppShortcutUndefined: Self = StObject.set(x, "appShortcut", js.undefined)
      
      inline def setAriaLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaRole(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
      
      inline def setAriaRoleDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaRoleDescription", value.asInstanceOf[js.Any])
      
      inline def setAriaRoleDescriptionUndefined: Self = StObject.set(x, "ariaRoleDescription", js.undefined)
      
      inline def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
      
      inline def setBackgroundColor(value: String | PropertyBindingInfo): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundImage(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setEnableNavigationButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableNavigationButton", value.asInstanceOf[js.Any])
      
      inline def setEnableNavigationButtonUndefined: Self = StObject.set(x, "enableNavigationButton", js.undefined)
      
      inline def setFailedText(value: String | PropertyBindingInfo): Self = StObject.set(x, "failedText", value.asInstanceOf[js.Any])
      
      inline def setFailedTextUndefined: Self = StObject.set(x, "failedText", js.undefined)
      
      inline def setFrameType(
        value: FrameType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FrameType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "frameType", value.asInstanceOf[js.Any])
      
      inline def setFrameTypeUndefined: Self = StObject.set(x, "frameType", js.undefined)
      
      inline def setHeader(value: String | PropertyBindingInfo): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderImage(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerImage", value.asInstanceOf[js.Any])
      
      inline def setHeaderImageUndefined: Self = StObject.set(x, "headerImage", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIcon(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconLoaded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconLoaded", value.asInstanceOf[js.Any])
      
      inline def setIconLoadedUndefined: Self = StObject.set(x, "iconLoaded", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImageDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "imageDescription", value.asInstanceOf[js.Any])
      
      inline def setImageDescriptionUndefined: Self = StObject.set(x, "imageDescription", js.undefined)
      
      inline def setMode(
        value: GenericTileMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNavigationButtonText(value: String | PropertyBindingInfo): Self = StObject.set(x, "navigationButtonText", value.asInstanceOf[js.Any])
      
      inline def setNavigationButtonTextUndefined: Self = StObject.set(x, "navigationButtonText", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "pressEnabled", value.asInstanceOf[js.Any])
      
      inline def setPressEnabledUndefined: Self = StObject.set(x, "pressEnabled", js.undefined)
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setRenderOnThemeChange(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "renderOnThemeChange", value.asInstanceOf[js.Any])
      
      inline def setRenderOnThemeChangeUndefined: Self = StObject.set(x, "renderOnThemeChange", js.undefined)
      
      inline def setScope(
        value: GenericTileScope | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GenericTileScope * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSize(
        value: Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeBehavior(
        value: TileSizeBehavior | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TileSizeBehavior * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "sizeBehavior", value.asInstanceOf[js.Any])
      
      inline def setSizeBehaviorUndefined: Self = StObject.set(x, "sizeBehavior", js.undefined)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setState(
        value: LoadState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LoadState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSubheader(value: String | PropertyBindingInfo): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
      
      inline def setSystemInfo(value: String | PropertyBindingInfo): Self = StObject.set(x, "systemInfo", value.asInstanceOf[js.Any])
      
      inline def setSystemInfoUndefined: Self = StObject.set(x, "systemInfo", js.undefined)
      
      inline def setTileContent(
        value: js.Array[typings.openui5.sapMTileContentMod.default] | typings.openui5.sapMTileContentMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "tileContent", value.asInstanceOf[js.Any])
      
      inline def setTileContentUndefined: Self = StObject.set(x, "tileContent", js.undefined)
      
      inline def setTileContentVarargs(value: typings.openui5.sapMTileContentMod.default*): Self = StObject.set(x, "tileContent", js.Array(value*))
      
      inline def setTileIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "tileIcon", value.asInstanceOf[js.Any])
      
      inline def setTileIconUndefined: Self = StObject.set(x, "tileIcon", js.undefined)
      
      inline def setUrl(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setValueColor(
        value: ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueColor", value.asInstanceOf[js.Any])
      
      inline def setValueColorUndefined: Self = StObject.set(x, "valueColor", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrappingType(
        value: WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "wrappingType", value.asInstanceOf[js.Any])
      
      inline def setWrappingTypeUndefined: Self = StObject.set(x, "wrappingType", js.undefined)
    }
  }
}
