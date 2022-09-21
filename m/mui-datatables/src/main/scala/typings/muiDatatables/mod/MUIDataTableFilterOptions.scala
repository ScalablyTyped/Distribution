package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableFilterOptions extends StObject {
  
  /**
    * Custom rendering inside the filter dialog.
    * `filterList` must be of the same type in the main column options, that is an array of arrays, where each array corresponds to the filter list for a given column.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-filter/index.js)
    */
  var display: js.UndefOr[
    js.Function5[
      /* filterList */ js.Array[js.Array[String]], 
      /* onChange */ js.Function3[
        /* val */ String | js.Array[String], 
        /* index */ Double, 
        /* column */ MUIDataTableColumn, 
        Unit
      ], 
      /* index */ Double, 
      /* column */ MUIDataTableColumn, 
      /* filterData */ js.Array[js.Array[String]], 
      Unit
    ]
  ] = js.undefined
  
  /** Will force a filter option to take up the grid's full width. */
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * custom filter logic.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-filter/index.js)
    */
  var logic: js.UndefOr[
    js.Function3[
      /* prop */ String, 
      /* filterValue */ js.Array[Any], 
      /* row */ js.UndefOr[js.Array[Any]], 
      Boolean
    ]
  ] = js.undefined
  
  /**
    * Custom names for the filter fields.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/column-filters/index.js)
    */
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A function to customize filter choices.
    * Use case: changing empty strings to "(empty)" in a dropdown.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-filter/index.js)
    */
  var renderValue: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
}
object MUIDataTableFilterOptions {
  
  inline def apply(): MUIDataTableFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableFilterOptions]
  }
  
  extension [Self <: MUIDataTableFilterOptions](x: Self) {
    
    inline def setDisplay(
      value: (/* filterList */ js.Array[js.Array[String]], /* onChange */ js.Function3[
          /* val */ String | js.Array[String], 
          /* index */ Double, 
          /* column */ MUIDataTableColumn, 
          Unit
        ], /* index */ Double, /* column */ MUIDataTableColumn, /* filterData */ js.Array[js.Array[String]]) => Unit
    ): Self = StObject.set(x, "display", js.Any.fromFunction5(value))
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setLogic(
      value: (/* prop */ String, /* filterValue */ js.Array[Any], /* row */ js.UndefOr[js.Array[Any]]) => Boolean
    ): Self = StObject.set(x, "logic", js.Any.fromFunction3(value))
    
    inline def setLogicUndefined: Self = StObject.set(x, "logic", js.undefined)
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setRenderValue(value: /* value */ String => String): Self = StObject.set(x, "renderValue", js.Any.fromFunction1(value))
    
    inline def setRenderValueUndefined: Self = StObject.set(x, "renderValue", js.undefined)
  }
}
