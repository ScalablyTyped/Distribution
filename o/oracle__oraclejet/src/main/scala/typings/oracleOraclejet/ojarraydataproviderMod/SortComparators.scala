package typings.oracleOraclejet.ojarraydataproviderMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortComparators[D] extends js.Object {
  
  var comparators: Map[/* keyof D */ String, js.Function2[/* a */ _, /* b */ _, Double]] = js.native
}
object SortComparators {
  
  @scala.inline
  def apply[D](comparators: Map[/* keyof D */ String, js.Function2[/* a */ _, /* b */ _, Double]]): SortComparators[D] = {
    val __obj = js.Dynamic.literal(comparators = comparators.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortComparators[D]]
  }
  
  @scala.inline
  implicit class SortComparatorsOps[Self <: SortComparators[_], D] (val x: Self with SortComparators[D]) extends AnyVal {
    
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
    def setComparators(value: Map[/* keyof D */ String, js.Function2[/* a */ _, /* b */ _, Double]]): Self = this.set("comparators", value.asInstanceOf[js.Any])
  }
}
