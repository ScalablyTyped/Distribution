package typings.muiDatatables.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableCustomFilterListOptions extends StObject {
  
  /**
    * Function that return a string or array of strings use as the chip label(s).
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-filter/index.js)
    */
  var render: js.UndefOr[js.Function1[/* value */ js.Any, ReactNode]] = js.undefined
  
  /**
    * Function that returns a filterList allowing for custom filter updates
    * when removing the filter chip. FilterType must be set to 'custom'.
    *
    * [Example](https://github.com/gregnb/mui-datatables/blob/master/examples/customize-filter/index.js)
    */
  var update: js.UndefOr[
    js.Function3[
      /* filterList */ js.Array[js.Array[String]], 
      /* filterPos */ Double, 
      /* index */ Double, 
      js.Array[js.Array[String]]
    ]
  ] = js.undefined
}
object MUIDataTableCustomFilterListOptions {
  
  @scala.inline
  def apply(): MUIDataTableCustomFilterListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableCustomFilterListOptions]
  }
  
  @scala.inline
  implicit class MUIDataTableCustomFilterListOptionsMutableBuilder[Self <: MUIDataTableCustomFilterListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: /* value */ js.Any => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setUpdate(
      value: (/* filterList */ js.Array[js.Array[String]], /* filterPos */ Double, /* index */ Double) => js.Array[js.Array[String]]
    ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
