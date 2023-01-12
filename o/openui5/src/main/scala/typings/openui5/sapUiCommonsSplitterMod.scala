package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.SplitterSize
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.Orientation
import typings.openui5.sapUiCoreLibraryMod.Percentage
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsSplitterMod {
  
  @JSImport("sap/ui/commons/Splitter", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Splitter.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Splitter {
    def this(/**
      * initial settings for the new control
      */
    mSettings: SplitterSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: SplitterSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: SplitterSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Splitter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Splitter with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Splitter]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Splitter],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Splitter.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Splitter
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some firstPaneContent to the aggregation {@link #getFirstPaneContent firstPaneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFirstPaneContent(
      /**
      * The firstPaneContent to add; if empty, nothing is inserted
      */
    oFirstPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some secondPaneContent to the aggregation {@link #getSecondPaneContent secondPaneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSecondPaneContent(
      /**
      * The secondPaneContent to add; if empty, nothing is inserted
      */
    oSecondPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the firstPaneContent in the aggregation {@link #getFirstPaneContent firstPaneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFirstPaneContent(): this.type = js.native
    
    /**
      * Destroys all the secondPaneContent in the aggregation {@link #getSecondPaneContent secondPaneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySecondPaneContent(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getFirstPaneContent firstPaneContent}.
      *
      * Controls inside the first pane. These are the left ones in case of defining a vertical splitter, and
      * the top ones in case of using the horizontal splitter.
      */
    def getFirstPaneContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The height of the split area in px or in %
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): SplitterSize = js.native
    
    /**
      * Gets current value of property {@link #getMinSizeFirstPane minSizeFirstPane}.
      *
      * The minimum size (width for vertical splitter or height for horizontal splitter) of the first Pane
      *
      * Default value is `'0%'`.
      *
      * @returns Value of property `minSizeFirstPane`
      */
    def getMinSizeFirstPane(): Percentage = js.native
    
    /**
      * Gets current value of property {@link #getMinSizeSecondPane minSizeSecondPane}.
      *
      * The minimum size (width for vertical splitter or height for horizontal splitter) of the second Pane
      *
      * Default value is `'0%'`.
      *
      * @returns Value of property `minSizeSecondPane`
      */
    def getMinSizeSecondPane(): Percentage = js.native
    
    /**
      * Gets content of aggregation {@link #getSecondPaneContent secondPaneContent}.
      *
      * Controls inside the second pane. These are the right ones in case of defining a vertical splitter, and
      * the bottom ones in case of using the horizontal splitter.
      */
    def getSecondPaneContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getShowScrollBars showScrollBars}.
      *
      * Specifies if the browser should display scroll bars or simply cut the content of a splitter pane when
      * the content does not fit into its pane.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showScrollBars`
      */
    def getShowScrollBars(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSplitterBarVisible splitterBarVisible}.
      *
      * set the splitter bar to be visible or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `splitterBarVisible`
      */
    def getSplitterBarVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSplitterOrientation splitterOrientation}.
      *
      * The splitter can have horizontal or vertical orientation.
      *
      * Default value is `Vertical`.
      *
      * @returns Value of property `splitterOrientation`
      */
    def getSplitterOrientation(): Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSplitterPosition splitterPosition}.
      *
      * Position of splitter bar in percentage. The default value means that the splitter is positioned in the
      * middle of the area that is available for the splitter.
      *
      * Default value is `'50%'`.
      *
      * @returns Value of property `splitterPosition`
      */
    def getSplitterPosition(): Percentage = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the split area in px or in %
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): SplitterSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getFirstPaneContent firstPaneContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFirstPaneContent(
      /**
      * The firstPaneContent whose index is looked for
      */
    oFirstPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getSecondPaneContent secondPaneContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSecondPaneContent(
      /**
      * The secondPaneContent whose index is looked for
      */
    oSecondPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a firstPaneContent into the aggregation {@link #getFirstPaneContent firstPaneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFirstPaneContent(
      /**
      * The firstPaneContent to insert; if empty, nothing is inserted
      */
    oFirstPaneContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the firstPaneContent should be inserted at; for a negative value of `iIndex`, the
      * firstPaneContent is inserted at position 0; for a value greater than the current size of the aggregation,
      * the firstPaneContent is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a secondPaneContent into the aggregation {@link #getSecondPaneContent secondPaneContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSecondPaneContent(
      /**
      * The secondPaneContent to insert; if empty, nothing is inserted
      */
    oSecondPaneContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the secondPaneContent should be inserted at; for a negative value of `iIndex`, the
      * secondPaneContent is inserted at position 0; for a value greater than the current size of the aggregation,
      * the secondPaneContent is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFirstPaneContent firstPaneContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFirstPaneContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSecondPaneContent secondPaneContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSecondPaneContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeFirstPaneContent(/**
      * The firstPaneContent to remove or its index or id
      */
    vFirstPaneContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a firstPaneContent from the aggregation {@link #getFirstPaneContent firstPaneContent}.
      *
      * @returns The removed firstPaneContent or `null`
      */
    def removeFirstPaneContent(/**
      * The firstPaneContent to remove or its index or id
      */
    vFirstPaneContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeFirstPaneContent(
      /**
      * The firstPaneContent to remove or its index or id
      */
    vFirstPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeSecondPaneContent(/**
      * The secondPaneContent to remove or its index or id
      */
    vSecondPaneContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a secondPaneContent from the aggregation {@link #getSecondPaneContent secondPaneContent}.
      *
      * @returns The removed secondPaneContent or `null`
      */
    def removeSecondPaneContent(/**
      * The secondPaneContent to remove or its index or id
      */
    vSecondPaneContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeSecondPaneContent(
      /**
      * The secondPaneContent to remove or its index or id
      */
    vSecondPaneContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * The height of the split area in px or in %
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: SplitterSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinSizeFirstPane minSizeFirstPane}.
      *
      * The minimum size (width for vertical splitter or height for horizontal splitter) of the first Pane
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'0%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinSizeFirstPane(): this.type = js.native
    def setMinSizeFirstPane(/**
      * New value for property `minSizeFirstPane`
      */
    sMinSizeFirstPane: Percentage): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinSizeSecondPane minSizeSecondPane}.
      *
      * The minimum size (width for vertical splitter or height for horizontal splitter) of the second Pane
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'0%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinSizeSecondPane(): this.type = js.native
    def setMinSizeSecondPane(/**
      * New value for property `minSizeSecondPane`
      */
    sMinSizeSecondPane: Percentage): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowScrollBars showScrollBars}.
      *
      * Specifies if the browser should display scroll bars or simply cut the content of a splitter pane when
      * the content does not fit into its pane.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowScrollBars(): this.type = js.native
    def setShowScrollBars(/**
      * New value for property `showScrollBars`
      */
    bShowScrollBars: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSplitterBarVisible splitterBarVisible}.
      *
      * set the splitter bar to be visible or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSplitterBarVisible(): this.type = js.native
    def setSplitterBarVisible(/**
      * New value for property `splitterBarVisible`
      */
    bSplitterBarVisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSplitterOrientation splitterOrientation}.
      *
      * The splitter can have horizontal or vertical orientation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Vertical`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSplitterOrientation(): this.type = js.native
    def setSplitterOrientation(
      /**
      * New value for property `splitterOrientation`
      */
    sSplitterOrientation: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String
    ): this.type = js.native
    def setSplitterOrientation(/**
      * New value for property `splitterOrientation`
      */
    sSplitterOrientation: Orientation): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSplitterPosition splitterPosition}.
      *
      * Position of splitter bar in percentage. The default value means that the splitter is positioned in the
      * middle of the area that is available for the splitter.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'50%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSplitterPosition(): this.type = js.native
    def setSplitterPosition(/**
      * New value for property `splitterPosition`
      */
    sSplitterPosition: Percentage): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width of the split area in px or in %
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: SplitterSize): this.type = js.native
  }
  
  trait SplitterSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Controls inside the first pane. These are the left ones in case of defining a vertical splitter, and
      * the top ones in case of using the horizontal splitter.
      */
    var firstPaneContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The height of the split area in px or in %
      */
    var height: js.UndefOr[
        SplitterSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The minimum size (width for vertical splitter or height for horizontal splitter) of the first Pane
      */
    var minSizeFirstPane: js.UndefOr[
        Percentage | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The minimum size (width for vertical splitter or height for horizontal splitter) of the second Pane
      */
    var minSizeSecondPane: js.UndefOr[
        Percentage | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Controls inside the second pane. These are the right ones in case of defining a vertical splitter, and
      * the bottom ones in case of using the horizontal splitter.
      */
    var secondPaneContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies if the browser should display scroll bars or simply cut the content of a splitter pane when
      * the content does not fit into its pane.
      */
    var showScrollBars: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * set the splitter bar to be visible or not.
      */
    var splitterBarVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The splitter can have horizontal or vertical orientation.
      */
    var splitterOrientation: js.UndefOr[
        Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Position of splitter bar in percentage. The default value means that the splitter is positioned in the
      * middle of the area that is available for the splitter.
      */
    var splitterPosition: js.UndefOr[
        Percentage | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The width of the split area in px or in %
      */
    var width: js.UndefOr[
        SplitterSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SplitterSettings {
    
    inline def apply(): SplitterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitterSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitterSettings] (val x: Self) extends AnyVal {
      
      inline def setFirstPaneContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "firstPaneContent", value.asInstanceOf[js.Any])
      
      inline def setFirstPaneContentUndefined: Self = StObject.set(x, "firstPaneContent", js.undefined)
      
      inline def setFirstPaneContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "firstPaneContent", js.Array(value*))
      
      inline def setHeight(value: SplitterSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMinSizeFirstPane(value: Percentage | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minSizeFirstPane", value.asInstanceOf[js.Any])
      
      inline def setMinSizeFirstPaneUndefined: Self = StObject.set(x, "minSizeFirstPane", js.undefined)
      
      inline def setMinSizeSecondPane(value: Percentage | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minSizeSecondPane", value.asInstanceOf[js.Any])
      
      inline def setMinSizeSecondPaneUndefined: Self = StObject.set(x, "minSizeSecondPane", js.undefined)
      
      inline def setSecondPaneContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "secondPaneContent", value.asInstanceOf[js.Any])
      
      inline def setSecondPaneContentUndefined: Self = StObject.set(x, "secondPaneContent", js.undefined)
      
      inline def setSecondPaneContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "secondPaneContent", js.Array(value*))
      
      inline def setShowScrollBars(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showScrollBars", value.asInstanceOf[js.Any])
      
      inline def setShowScrollBarsUndefined: Self = StObject.set(x, "showScrollBars", js.undefined)
      
      inline def setSplitterBarVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "splitterBarVisible", value.asInstanceOf[js.Any])
      
      inline def setSplitterBarVisibleUndefined: Self = StObject.set(x, "splitterBarVisible", js.undefined)
      
      inline def setSplitterOrientation(
        value: Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "splitterOrientation", value.asInstanceOf[js.Any])
      
      inline def setSplitterOrientationUndefined: Self = StObject.set(x, "splitterOrientation", js.undefined)
      
      inline def setSplitterPosition(value: Percentage | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "splitterPosition", value.asInstanceOf[js.Any])
      
      inline def setSplitterPositionUndefined: Self = StObject.set(x, "splitterPosition", js.undefined)
      
      inline def setWidth(value: SplitterSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
