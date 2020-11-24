package typings.motorHat.anon

import typings.motorHat.mod.Motor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait W2 extends js.Object {
  
  var W1: Motor = js.native
  
  var W2: Motor = js.native
}
object W2 {
  
  @scala.inline
  def apply(W1: Motor, W2: Motor): W2 = {
    val __obj = js.Dynamic.literal(W1 = W1.asInstanceOf[js.Any], W2 = W2.asInstanceOf[js.Any])
    __obj.asInstanceOf[W2]
  }
  
  @scala.inline
  implicit class W2Ops[Self <: W2] (val x: Self) extends AnyVal {
    
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
    def setW1(value: Motor): Self = this.set("W1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW2(value: Motor): Self = this.set("W2", value.asInstanceOf[js.Any])
  }
}
