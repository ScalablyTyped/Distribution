package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsLayoutMatrixLayoutRowMod {
  
  @JSImport("sap/ui/commons/layout/MatrixLayoutRow", JSImport.Default)
  @js.native
  /**
    * Constructor for a new layout/MatrixLayoutRow.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MatrixLayoutRow {
    def this(/**
      * initial settings for the new control
      */
    mSettings: MatrixLayoutRowSettings) = this()
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
    mSettings: MatrixLayoutRowSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: MatrixLayoutRowSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/layout/MatrixLayoutRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.layout.MatrixLayoutRow with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, MatrixLayoutRow]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MatrixLayoutRow],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.layout.MatrixLayoutRow.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MatrixLayoutRow
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some cell to the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCell(
      /**
      * The cell to add; if empty, nothing is inserted
      */
    oCell: typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default
    ): this.type = js.native
    
    /**
      * The string given as "sStyleClass" will be added to the "class" attribute of this element's root HTML
      * element.
      *
      * This method is intended to be used to mark controls as being of a special type for which special styling
      * can be provided using CSS selectors that reference this style class name.
      *
      *
      * ```javascript
      *
      * Example:
      * myButton.addStyleClass("myRedTextButton"); // add a CSS class to one button instance
      *
      * ...and in CSS:
      * .myRedTextButton {
      * color: red;
      * }
      * ```
      *
      *
      * This will add the CSS class "myRedTextButton" to the Button HTML and the CSS code above will then make
      * the text in this particular button red.
      *
      * Only characters allowed inside HTML attributes are allowed. Quotes are not allowed and this method will
      * ignore any strings containing quotes. Strings containing spaces are interpreted as ONE custom style class
      * (even though CSS selectors interpret them as different classes) and can only removed later by calling
      * removeStyleClass() with exactly the same (space-containing) string as parameter. Multiple calls with
      * the same sStyleClass will have no different effect than calling once. If sStyleClass is null, the call
      * is ignored.
      *
      * Returns `this` to allow method chaining
      */
    def addStyleClass(/**
      * the CSS class name to be added
      */
    sStyleClass: String): this.type = js.native
    
    /**
      * Destroys all the cells in the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCells(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getCells cells}.
      *
      * The matrix layout row's individual cells.
      */
    def getCells(): js.Array[typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Height of the row.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Returns true if the given style class string is valid and if this Element has this style class set via
      * a previous call to addStyleClass().
      */
    def hasStyleClass(/**
      * the style to check for
      */
    sStyleClass: String): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.layout.MatrixLayoutCell` in the aggregation {@link #getCells cells}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCell(
      /**
      * The cell whose index is looked for
      */
    oCell: typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default
    ): int = js.native
    
    /**
      * Inserts a cell into the aggregation {@link #getCells cells}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCell(
      /**
      * The cell to insert; if empty, nothing is inserted
      */
    oCell: typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default,
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
    def removeAllCells(): js.Array[typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default] = js.native
    
    def removeCell(/**
      * The cell to remove or its index or id
      */
    vCell: String): typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default | Null = js.native
    /**
      * Removes a cell from the aggregation {@link #getCells cells}.
      *
      * @returns The removed cell or `null`
      */
    def removeCell(/**
      * The cell to remove or its index or id
      */
    vCell: int): typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default | Null = js.native
    def removeCell(
      /**
      * The cell to remove or its index or id
      */
    vCell: typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default
    ): typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default | Null = js.native
    
    /**
      * Removes the given string from the list of custom style classes that have been set previously. Regular
      * style classes like "sapUiBtn" cannot be removed.
      *
      * Returns `this` to allow method chaining
      */
    def removeStyleClass(/**
      * the style to be removed
      */
    sStyleClass: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Height of the row.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
  }
  
  trait MatrixLayoutRowSettings
    extends StObject
       with ElementSettings {
    
    /**
      * The matrix layout row's individual cells.
      */
    var cells: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default] | typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Height of the row.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MatrixLayoutRowSettings {
    
    inline def apply(): MatrixLayoutRowSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatrixLayoutRowSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatrixLayoutRowSettings] (val x: Self) extends AnyVal {
      
      inline def setCells(
        value: js.Array[typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default] | typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCellsVarargs(value: typings.openui5.sapUiCommonsLayoutMatrixLayoutCellMod.default*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    }
  }
}
