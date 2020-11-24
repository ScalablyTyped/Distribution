package typings.nodeJose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exp extends js.Object {
  
  var exp: Boolean | typings.nodeJose.mod.JWS.Exp = js.native
}
object Exp {
  
  @scala.inline
  def apply(exp: Boolean | typings.nodeJose.mod.JWS.Exp): Exp = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exp]
  }
  
  @scala.inline
  implicit class ExpOps[Self <: Exp] (val x: Self) extends AnyVal {
    
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
    def setExp(value: Boolean | typings.nodeJose.mod.JWS.Exp): Self = this.set("exp", value.asInstanceOf[js.Any])
  }
}
