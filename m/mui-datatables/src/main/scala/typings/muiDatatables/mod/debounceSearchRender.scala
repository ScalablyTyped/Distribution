package typings.muiDatatables.mod

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mui-datatables", "debounceSearchRender")
@js.native
object debounceSearchRender extends js.Object {
  def apply(): js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Any, 
      /* hideSearch */ js.Any, 
      /* options */ js.Any, 
      (Component[js.Object, js.Object, _]) | Element
    ]
  ] = js.native
  def apply(debounceWait: Double): js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Any, 
      /* hideSearch */ js.Any, 
      /* options */ js.Any, 
      (Component[js.Object, js.Object, _]) | Element
    ]
  ] = js.native
}

