package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMListItemBaseMod.ListItemBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.VerticalAlign
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMColumnListItemMod {
  
  @JSImport("sap/m/ColumnListItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ColumnListItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ColumnListItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ColumnListItemSettings) = this()
    def this(/**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: ColumnListItemSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ColumnListItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ColumnListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ColumnListItem with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListItemBase.extend}.
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
    oClassInfo: ClassInfo[T, ColumnListItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ColumnListItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ColumnListItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ColumnListItem
    extends typings.openui5.sapMListItemBaseMod.default {
    
    /**
      * @SINCE 1.26
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns pop-in DOMRef as a jQuery Object
      */
    @JSName("$Popin")
    def $Popin(): Unit = js.native
    
    /**
      * Adds some cell to the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCell(
      /**
      * The cell to add; if empty, nothing is inserted
      */
    oCell: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getCells cells} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindCells(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the cells in the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCells(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getCells cells}.
      *
      * Every `control` inside the `cells` aggregation defines one cell of the row. **Note:** The order of the
      * `cells` aggregation must match the order of the `columns` aggregation of `sap.m.Table`.
      */
    def getCells(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @SINCE 1.30.9
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns the pop-in element.
      */
    def getPopin(): Unit = js.native
    
    /**
      * @SINCE 1.20
      *
      * Gets current value of property {@link #getVAlign vAlign}.
      *
      * Sets the vertical alignment of all the cells within the table row (including selection and navigation).
      * **Note:** `vAlign` property of `sap.m.Column` overrides the property for cell vertical alignment if both
      * are set.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `vAlign`
      */
    def getVAlign(): VerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String) = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Determines whether control has pop-in or not.
      */
    def hasPopin(): Unit = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getCells cells}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCell(/**
      * The cell whose index is looked for
      */
    oCell: typings.openui5.sapUiCoreControlMod.default): int = js.native
    
    /**
      * Inserts a cell into the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCell(
      /**
      * The cell to insert; if empty, nothing is inserted
      */
    oCell: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the cell should be inserted at; for a negative value of `iIndex`, the cell is inserted
      * at position 0; for a value greater than the current size of the aggregation, the cell is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getCells cells}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCells(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeCell(/**
      * The cell to remove or its index or id
      */
    vCell: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a cell from the aggregation {@link #getCells cells}.
      *
      * @returns The removed cell or `null`
      */
    def removeCell(/**
      * The cell to remove or its index or id
      */
    vCell: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeCell(
      /**
      * The cell to remove or its index or id
      */
    vCell: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Pemove pop-in from DOM
      */
    def removePopin(): Unit = js.native
    
    /**
      * @SINCE 1.20
      *
      * Sets a new value for property {@link #getVAlign vAlign}.
      *
      * Sets the vertical alignment of all the cells within the table row (including selection and navigation).
      * **Note:** `vAlign` property of `sap.m.Column` overrides the property for cell vertical alignment if both
      * are set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVAlign(): this.type = js.native
    def setVAlign(
      /**
      * New value for property `vAlign`
      */
    sVAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String
    ): this.type = js.native
    def setVAlign(/**
      * New value for property `vAlign`
      */
    sVAlign: VerticalAlign): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getCells cells} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindCells(): this.type = js.native
  }
  
  trait ColumnListItemSettings
    extends StObject
       with ListItemBaseSettings {
    
    /**
      * Every `control` inside the `cells` aggregation defines one cell of the row. **Note:** The order of the
      * `cells` aggregation must match the order of the `columns` aggregation of `sap.m.Table`.
      */
    var cells: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.20
      *
      * Sets the vertical alignment of all the cells within the table row (including selection and navigation).
      * **Note:** `vAlign` property of `sap.m.Column` overrides the property for cell vertical alignment if both
      * are set.
      */
    var vAlign: js.UndefOr[
        VerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ColumnListItemSettings {
    
    inline def apply(): ColumnListItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnListItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnListItemSettings] (val x: Self) extends AnyVal {
      
      inline def setCells(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCellsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setVAlign(
        value: VerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      inline def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
}
