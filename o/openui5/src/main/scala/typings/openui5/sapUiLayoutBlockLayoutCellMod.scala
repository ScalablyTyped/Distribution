package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.HorizontalAlign
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.openui5.sapUiLayoutLibraryMod.BlockLayoutCellColorSet
import typings.openui5.sapUiLayoutLibraryMod.BlockLayoutCellColorShade
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutBlockLayoutCellMod {
  
  @JSImport("sap/ui/layout/BlockLayoutCell", JSImport.Default)
  @js.native
  /**
    * Constructor for a new BlockLayoutCell.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends BlockLayoutCell {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BlockLayoutCellSettings) = this()
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
    mSettings: BlockLayoutCellSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BlockLayoutCellSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/BlockLayoutCell", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.BlockLayoutCell with name `sClassName` and enriches it
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
    oClassInfo: ClassInfo[T, BlockLayoutCell]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BlockLayoutCell],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.BlockLayoutCell.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BlockLayoutCell
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Destroys the titleLink in the aggregation {@link #getTitleLink titleLink}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitleLink(): this.type = js.native
    
    /**
      * @SINCE 1.48
      *
      * Gets current value of property {@link #getBackgroundColorSet backgroundColorSet}.
      *
      * The Background color set from which the background color will be selected. **Note:** backgroundColorSet
      * should be used only in combination with backgroundColorShade.
      *
      * @returns Value of property `backgroundColorSet`
      */
    def getBackgroundColorSet(): BlockLayoutCellColorSet | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockLayoutCellColorSet * / any */ String) = js.native
    
    /**
      * @SINCE 1.48
      *
      * Gets current value of property {@link #getBackgroundColorShade backgroundColorShade}.
      *
      * The index of the background color in the color set from which the color will be selected. **Note:** backgroundColorShade
      * should be used only in combination with backgroundColorSet.
      *
      * @returns Value of property `backgroundColorShade`
      */
    def getBackgroundColorShade(): BlockLayoutCellColorShade | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockLayoutCellColorShade * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content to be included inside the cell
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the title of the cell. **Note:** When the `titleLink` aggregation is provided, the title of the
      * cell will be replaced with the text from the `titleLink`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitleAlignment titleAlignment}.
      *
      * Defines the alignment of the cell title
      *
      * Default value is `"Begin"`.
      *
      * @returns Value of property `titleAlignment`
      */
    def getTitleAlignment(): HorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTitleLevel titleLevel}.
      *
      * Defines the aria level of the title This information is e.g. used by assistive technologies like screenreaders
      * to create a hierarchical site map for faster navigation.
      *
      * Default value is `"Auto"`.
      *
      * @returns Value of property `titleLevel`
      */
    def getTitleLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * @SINCE 1.56
      *
      * Gets content of aggregation {@link #getTitleLink titleLink}.
      *
      * The link that will replace the title of the cell. **Note:** The only possible value is the `sap.m.Link`
      * control.
      */
    def getTitleLink(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the cell. Depending on the context of the cell - whether it's in scrollable, or
      * non scrollable row, this property is interpreted in two different ways. If the cell is placed inside
      * a scrollable row - this property defines the width of the cell in percentages. If no value is provided
      * - the default is 40%. If the cell is placed inside a non scrollable row - this property defines the grow
      * factor of the cell compared to the whole row. **For example:** If you have 2 cells, each with width of
      * 1, this means that they should be of equal size, and they need to fill the whole row. This results in
      * 50% width for each cell. If you have 2 cells, one with width of 1, the other with width of 3, this means
      * that the whole row width is 4, so the first cell will have a width of 25%, the second - 75%. According
      * to the visual guidelines, it is suggested that you only use 25%, 50%, 75% or 100% cells in you applications.
      * For example, 12,5% width is not desirable (1 cell with width 1, and another with width 7)
      *
      * Default value is `0`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
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
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def setBackgroundColorSet(
      /**
      * New value for property `backgroundColorSet`
      */
    sBackgroundColorSet: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockLayoutCellColorSet * / any */ String
    ): this.type = js.native
    /**
      * @SINCE 1.48
      *
      * Sets a new value for property {@link #getBackgroundColorSet backgroundColorSet}.
      *
      * The Background color set from which the background color will be selected. **Note:** backgroundColorSet
      * should be used only in combination with backgroundColorShade.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundColorSet(
      /**
      * New value for property `backgroundColorSet`
      */
    sBackgroundColorSet: BlockLayoutCellColorSet
    ): this.type = js.native
    
    def setBackgroundColorShade(
      /**
      * New value for property `backgroundColorShade`
      */
    sBackgroundColorShade: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockLayoutCellColorShade * / any */ String
    ): this.type = js.native
    /**
      * @SINCE 1.48
      *
      * Sets a new value for property {@link #getBackgroundColorShade backgroundColorShade}.
      *
      * The index of the background color in the color set from which the color will be selected. **Note:** backgroundColorShade
      * should be used only in combination with backgroundColorSet.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundColorShade(
      /**
      * New value for property `backgroundColorShade`
      */
    sBackgroundColorShade: BlockLayoutCellColorShade
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the title of the cell. **Note:** When the `titleLink` aggregation is provided, the title of the
      * cell will be replaced with the text from the `titleLink`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleAlignment titleAlignment}.
      *
      * Defines the alignment of the cell title
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Begin"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleAlignment(): this.type = js.native
    def setTitleAlignment(
      /**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String
    ): this.type = js.native
    def setTitleAlignment(/**
      * New value for property `titleAlignment`
      */
    sTitleAlignment: HorizontalAlign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleLevel titleLevel}.
      *
      * Defines the aria level of the title This information is e.g. used by assistive technologies like screenreaders
      * to create a hierarchical site map for faster navigation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Auto"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleLevel(): this.type = js.native
    def setTitleLevel(
      /**
      * New value for property `titleLevel`
      */
    sTitleLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setTitleLevel(/**
      * New value for property `titleLevel`
      */
    sTitleLevel: TitleLevel): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Sets the aggregated {@link #getTitleLink titleLink}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleLink(/**
      * The titleLink to set
      */
    oTitleLink: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets the Width.
      *
      * @returns this BlockLayoutCell reference for chaining.
      */
    def setWidth(/**
      * value.
      */
    iWidth: Double): this.type = js.native
  }
  
  trait BlockLayoutCellSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.48
      *
      * The Background color set from which the background color will be selected. **Note:** backgroundColorSet
      * should be used only in combination with backgroundColorShade.
      */
    var backgroundColorSet: js.UndefOr[
        BlockLayoutCellColorSet | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockLayoutCellColorSet * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.48
      *
      * The index of the background color in the color set from which the color will be selected. **Note:** backgroundColorShade
      * should be used only in combination with backgroundColorSet.
      */
    var backgroundColorShade: js.UndefOr[
        BlockLayoutCellColorShade | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockLayoutCellColorShade * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The content to be included inside the cell
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the title of the cell. **Note:** When the `titleLink` aggregation is provided, the title of the
      * cell will be replaced with the text from the `titleLink`.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the alignment of the cell title
      */
    var titleAlignment: js.UndefOr[
        HorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the aria level of the title This information is e.g. used by assistive technologies like screenreaders
      * to create a hierarchical site map for faster navigation.
      */
    var titleLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * The link that will replace the title of the cell. **Note:** The only possible value is the `sap.m.Link`
      * control.
      */
    var titleLink: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the width of the cell. Depending on the context of the cell - whether it's in scrollable, or
      * non scrollable row, this property is interpreted in two different ways. If the cell is placed inside
      * a scrollable row - this property defines the width of the cell in percentages. If no value is provided
      * - the default is 40%. If the cell is placed inside a non scrollable row - this property defines the grow
      * factor of the cell compared to the whole row. **For example:** If you have 2 cells, each with width of
      * 1, this means that they should be of equal size, and they need to fill the whole row. This results in
      * 50% width for each cell. If you have 2 cells, one with width of 1, the other with width of 3, this means
      * that the whole row width is 4, so the first cell will have a width of 25%, the second - 75%. According
      * to the visual guidelines, it is suggested that you only use 25%, 50%, 75% or 100% cells in you applications.
      * For example, 12,5% width is not desirable (1 cell with width 1, and another with width 7)
      */
    var width: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object BlockLayoutCellSettings {
    
    inline def apply(): BlockLayoutCellSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockLayoutCellSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockLayoutCellSettings] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColorSet(
        value: BlockLayoutCellColorSet | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockLayoutCellColorSet * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundColorSet", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorSetUndefined: Self = StObject.set(x, "backgroundColorSet", js.undefined)
      
      inline def setBackgroundColorShade(
        value: BlockLayoutCellColorShade | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockLayoutCellColorShade * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundColorShade", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorShadeUndefined: Self = StObject.set(x, "backgroundColorShade", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignment(
        value: HorizontalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleAlignment", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignmentUndefined: Self = StObject.set(x, "titleAlignment", js.undefined)
      
      inline def setTitleLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleLevel", value.asInstanceOf[js.Any])
      
      inline def setTitleLevelUndefined: Self = StObject.set(x, "titleLevel", js.undefined)
      
      inline def setTitleLink(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "titleLink", value.asInstanceOf[js.Any])
      
      inline def setTitleLinkUndefined: Self = StObject.set(x, "titleLink", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
