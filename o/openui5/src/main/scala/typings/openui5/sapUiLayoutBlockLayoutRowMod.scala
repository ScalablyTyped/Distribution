package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiLayoutLibraryMod.BlockRowColorSets
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutBlockLayoutRowMod {
  
  @JSImport("sap/ui/layout/BlockLayoutRow", JSImport.Default)
  @js.native
  /**
    * Constructor for a new BlockLayoutRow.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends BlockLayoutRow {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BlockLayoutRowSettings) = this()
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
    mSettings: BlockLayoutRowSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BlockLayoutRowSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/BlockLayoutRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.BlockLayoutRow with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, BlockLayoutRow]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BlockLayoutRow],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.BlockLayoutRow.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BlockLayoutRow
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @since 1.42
      *
      * Adds some accentCell into the association {@link #getAccentCells accentCells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAccentCell(/**
      * The accentCells to add; if empty, nothing is inserted
      */
    vAccentCell: ID): this.type = js.native
    def addAccentCell(
      /**
      * The accentCells to add; if empty, nothing is inserted
      */
    vAccentCell: typings.openui5.sapUiLayoutBlockLayoutCellMod.default
    ): this.type = js.native
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiLayoutBlockLayoutCellMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * @since 1.42
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAccentCells accentCells}.
      */
    def getAccentCells(): js.Array[ID] = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content cells to be included in the row.
      */
    def getContent(): js.Array[typings.openui5.sapUiLayoutBlockLayoutCellMod.default] = js.native
    
    /**
      * @since 1.42
      *
      * Gets current value of property {@link #getRowColorSet rowColorSet}.
      *
      * Defines background type for that row. There might be several rows with the same type
      *
      * @returns Value of property `rowColorSet`
      */
    def getRowColorSet(): BlockRowColorSets | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockRowColorSets * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getScrollable scrollable}.
      *
      * Sets the rendering mode of the BlockLayoutRow to scrollable. In scrollable mode, the cells get aligned
      * side by side, with horizontal scroll bar for the row.
      *
      * Default value is `false`.
      *
      * @returns Value of property `scrollable`
      */
    def getScrollable(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.layout.BlockLayoutCell` in the aggregation {@link #getContent content}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiLayoutBlockLayoutCellMod.default
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
    oContent: typings.openui5.sapUiLayoutBlockLayoutCellMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.42
      *
      * Removes an accentCell from the association named {@link #getAccentCells accentCells}.
      *
      * @returns The removed accentCell or `null`
      */
    def removeAccentCell(/**
      * The accentCell to be removed or its index or ID
      */
    vAccentCell: int): ID | Null = js.native
    def removeAccentCell(/**
      * The accentCell to be removed or its index or ID
      */
    vAccentCell: ID): ID | Null = js.native
    def removeAccentCell(
      /**
      * The accentCell to be removed or its index or ID
      */
    vAccentCell: typings.openui5.sapUiLayoutBlockLayoutCellMod.default
    ): ID | Null = js.native
    
    /**
      * @since 1.42
      *
      * Removes all the controls in the association named {@link #getAccentCells accentCells}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAccentCells(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiLayoutBlockLayoutCellMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiLayoutBlockLayoutCellMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiLayoutBlockLayoutCellMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiLayoutBlockLayoutCellMod.default
    ): typings.openui5.sapUiLayoutBlockLayoutCellMod.default | Null = js.native
    
    def setRowColorSet(
      sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockRowColorSets * / any */ String
    ): this.type = js.native
    /**
      * @since 1.42
      *
      * Changes dynamically row color set Note: this might invalidate cells inside and also change color sets
      * of the other BlockLayoutRow-s below it.
      */
    def setRowColorSet(sType: BlockRowColorSets): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getScrollable scrollable}.
      *
      * Sets the rendering mode of the BlockLayoutRow to scrollable. In scrollable mode, the cells get aligned
      * side by side, with horizontal scroll bar for the row.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScrollable(): this.type = js.native
    def setScrollable(/**
      * New value for property `scrollable`
      */
    bScrollable: Boolean): this.type = js.native
  }
  
  trait BlockLayoutRowSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.42
      *
      * Cells that would be accented. *Note:* This association has visual impact only for BlockLayouts with background
      * types "Mixed" and "Accent".
      *
      * Mixed: In this type, areas of 25% (on desktop) can have a dark background color. Per section one area
      * can be dark. Accent: Every section can contain multiple gray blocks, which are used alternately, beginning
      * with the bright one
      */
    var accentCells: js.UndefOr[js.Array[typings.openui5.sapUiLayoutBlockLayoutCellMod.default | String]] = js.undefined
    
    /**
      * The content cells to be included in the row.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiLayoutBlockLayoutCellMod.default] | typings.openui5.sapUiLayoutBlockLayoutCellMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.42
      *
      * Defines background type for that row. There might be several rows with the same type
      */
    var rowColorSet: js.UndefOr[
        BlockRowColorSets | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockRowColorSets * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Sets the rendering mode of the BlockLayoutRow to scrollable. In scrollable mode, the cells get aligned
      * side by side, with horizontal scroll bar for the row.
      */
    var scrollable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object BlockLayoutRowSettings {
    
    inline def apply(): BlockLayoutRowSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockLayoutRowSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockLayoutRowSettings] (val x: Self) extends AnyVal {
      
      inline def setAccentCells(value: js.Array[typings.openui5.sapUiLayoutBlockLayoutCellMod.default | String]): Self = StObject.set(x, "accentCells", value.asInstanceOf[js.Any])
      
      inline def setAccentCellsUndefined: Self = StObject.set(x, "accentCells", js.undefined)
      
      inline def setAccentCellsVarargs(value: (typings.openui5.sapUiLayoutBlockLayoutCellMod.default | String)*): Self = StObject.set(x, "accentCells", js.Array(value*))
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiLayoutBlockLayoutCellMod.default] | typings.openui5.sapUiLayoutBlockLayoutCellMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiLayoutBlockLayoutCellMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setRowColorSet(
        value: BlockRowColorSets | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BlockRowColorSets * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "rowColorSet", value.asInstanceOf[js.Any])
      
      inline def setRowColorSetUndefined: Self = StObject.set(x, "rowColorSet", js.undefined)
      
      inline def setScrollable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    }
  }
}
