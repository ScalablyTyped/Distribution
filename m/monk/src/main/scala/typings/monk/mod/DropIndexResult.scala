package typings.monk.mod

import typings.monk.monkNumbers.`0`
import typings.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropIndexResult extends js.Object {
  
  var nIndexesWas: Double = js.native
  
  var ok: `1` | `0` = js.native
}
object DropIndexResult {
  
  @scala.inline
  def apply(nIndexesWas: Double, ok: `1` | `0`): DropIndexResult = {
    val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropIndexResult]
  }
  
  @scala.inline
  implicit class DropIndexResultOps[Self <: DropIndexResult] (val x: Self) extends AnyVal {
    
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
    def setNIndexesWas(value: Double): Self = this.set("nIndexesWas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: `1` | `0`): Self = this.set("ok", value.asInstanceOf[js.Any])
  }
}
