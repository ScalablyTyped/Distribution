package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typings.oracleOraclejet.oracleOraclejetStrings.disable
import typings.oracleOraclejet.oracleOraclejetStrings.enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Width[K, D] extends js.Object {
  
  var height: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.native
  
  var width: enable | disable = js.native
}
object Width {
  
  @scala.inline
  def apply[K, D](width: enable | disable): Width[K, D] = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width[K, D]]
  }
  
  @scala.inline
  implicit class WidthOps[Self <: Width[_, _], K, D] (val x: Self with (Width[K, D])) extends AnyVal {
    
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
    def setWidth(value: enable | disable): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightFunction1(value: /* context */ HeaderContext[K, D] => String): Self = this.set("height", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: (js.Function1[/* context */ HeaderContext[K, D], String]) | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHeightNull: Self = this.set("height", null)
  }
}
