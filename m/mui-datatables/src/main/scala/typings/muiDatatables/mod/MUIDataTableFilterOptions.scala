package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableFilterOptions extends js.Object {
  
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
  ] = js.native
  
  /** Will force a filter option to take up the grid's full width. */
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * custom filter logic.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-filter/index.js)
    */
  var logic: js.UndefOr[js.Function2[/* prop */ String, /* filterValue */ js.Array[_], Boolean]] = js.native
  
  /**
    * Custom names for the filter fields.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/column-filters/index.js)
    */
  var names: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A function to customize filter choices.
    * Use case: changing empty strings to "(empty)" in a dropdown.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-filter/index.js)
    */
  var renderValue: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
}
object MUIDataTableFilterOptions {
  
  @scala.inline
  def apply(): MUIDataTableFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableFilterOptions]
  }
  
  @scala.inline
  implicit class MUIDataTableFilterOptionsOps[Self <: MUIDataTableFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplay(
      value: (/* filterList */ js.Array[js.Array[String]], /* onChange */ js.Function3[
          /* val */ String | js.Array[String], 
          /* index */ Double, 
          /* column */ MUIDataTableColumn, 
          Unit
        ], /* index */ Double, /* column */ MUIDataTableColumn, /* filterData */ js.Array[js.Array[String]]) => Unit
    ): Self = this.set("display", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setLogic(value: (/* prop */ String, /* filterValue */ js.Array[_]) => Boolean): Self = this.set("logic", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLogic: Self = this.set("logic", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    
    @scala.inline
    def setRenderValue(value: /* value */ String => String): Self = this.set("renderValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderValue: Self = this.set("renderValue", js.undefined)
  }
}
