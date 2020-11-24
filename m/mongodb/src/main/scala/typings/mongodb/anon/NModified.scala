package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NModified extends js.Object {
  
  var n: Double = js.native
  
  var nModified: Double = js.native
  
  var ok: Double = js.native
}
object NModified {
  
  @scala.inline
  def apply(n: Double, nModified: Double, ok: Double): NModified = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[NModified]
  }
  
  @scala.inline
  implicit class NModifiedOps[Self <: NModified] (val x: Self) extends AnyVal {
    
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
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNModified(value: Double): Self = this.set("nModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: Double): Self = this.set("ok", value.asInstanceOf[js.Any])
  }
}
