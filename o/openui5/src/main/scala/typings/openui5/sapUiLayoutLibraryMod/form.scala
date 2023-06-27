package typings.openui5.sapUiLayoutLibraryMod

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object form {
  
  @js.native
  sealed trait SimpleFormLayout extends StObject
  /**
    * @since 1.16.0
    *
    * Available `FormLayouts` used to render a `SimpleForm`.
    */
  @JSImport("sap/ui/layout/library", "form.SimpleFormLayout")
  @js.native
  object SimpleFormLayout extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SimpleFormLayout & String] = js.native
    
    /**
      * @since 1.56.0
      *
      * Uses the `ColumnLayout` layout to render the `SimpleForm` control
      */
    @js.native
    sealed trait ColumnLayout
      extends StObject
         with SimpleFormLayout
    /* "ColumnLayout" */ val ColumnLayout: typings.openui5.sapUiLayoutLibraryMod.form.SimpleFormLayout.ColumnLayout & String = js.native
    
    /**
      * @deprecated (since 1.67.0) - as the `sap.ui.commons` library is deprecated, and the `GridLayout` must
      * not be used in responsive applications. Please use `ResponsiveGridLayout` or `ColumnLayout` instead.
      *
      * Uses the `GridLayout` layout to render the `SimpleForm` control
      */
    @js.native
    sealed trait GridLayout
      extends StObject
         with SimpleFormLayout
    /* "GridLayout" */ val GridLayout: typings.openui5.sapUiLayoutLibraryMod.form.SimpleFormLayout.GridLayout & String = js.native
    
    /**
      * @since 1.16.0
      *
      * Uses the `ResponsiveGridLayout` layout to render the `SimpleForm` control
      */
    @js.native
    sealed trait ResponsiveGridLayout
      extends StObject
         with SimpleFormLayout
    /* "ResponsiveGridLayout" */ val ResponsiveGridLayout: typings.openui5.sapUiLayoutLibraryMod.form.SimpleFormLayout.ResponsiveGridLayout & String = js.native
    
    /**
      * @deprecated (since 1.93) - replaced by {@link sap.ui.layout.form.SimpleFormLayout.ColumnLayout ColumnLayout}
      *
      * Uses the `ResponsiveLayout` layout to render the `SimpleForm` control
      */
    @js.native
    sealed trait ResponsiveLayout
      extends StObject
         with SimpleFormLayout
    /* "ResponsiveLayout" */ val ResponsiveLayout: typings.openui5.sapUiLayoutLibraryMod.form.SimpleFormLayout.ResponsiveLayout & String = js.native
  }
  
  /**
    * @since 1.56.0
    *
    * An `int` type that defines how many cells a control inside of a column of a `Form` control using the
    * `ColumnLayout` control as layout can use.
    *
    * Allowed values are numbers from 1 to 12 and -1. -1 means the value is calculated.
    */
  type ColumnCells = int
  
  /**
    * @since 1.56.0
    *
    * An `int` type that defines how many columns a `Form` control using the `ColumnLayout` as layout can have
    * if it has large size
    *
    * Allowed values are numbers from 1 to 3.
    */
  type ColumnsL = int
  
  /**
    * @since 1.56.0
    *
    * An `int` type that defines how many columns a `Form` control using the `ColumnLayout` as layout can have
    * if it has medium size
    *
    * Allowed values are numbers from 1 to 2.
    */
  type ColumnsM = int
  
  /**
    * @since 1.56.0
    *
    * An `int` type that defines how many columns a `Form` control using the `ColumnLayout` as layout can have
    * if it has extra-large size
    *
    * Allowed values are numbers from 1 to 6. **Note:** In versions lower than 1.89 only 4 columns are allowed.
    */
  type ColumnsXL = int
  
  /**
    * @since 1.56.0
    *
    * An `int` type that defines how many cells beside the controls inside of a column of a `Form` control
    * using the `ColumnLayout` control as layout are empty.
    *
    * Allowed values are numbers from 0 to 11.
    */
  type EmptyCells = int
  
  /**
    * A string that defines the number of used cells in a `GridLayout`. This can be a number from 1 to 16,
    * "auto" or "full". If set to "auto" the size is determined by the number of fields and the available cells.
    * For labels the auto size is 3 cells. If set to "full" only one field is allowed within the `FormElement`.
    * It gets the full width of the row and the label is displayed above. **Note:** For labels full size has
    * no effect.
    */
  type GridElementCells = String
}
