package typings.motorHat.anon

import typings.motorHat.mod.PinDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait W1 extends js.Object {
  
  /**
    * Pin definition for winding 1 of the stepper
    */
  var W1: PinDefinition = js.native
  
  /**
    * Pin definition for winding 2 of the stepper
    */
  var W2: PinDefinition = js.native
}
object W1 {
  
  @scala.inline
  def apply(W1: PinDefinition, W2: PinDefinition): W1 = {
    val __obj = js.Dynamic.literal(W1 = W1.asInstanceOf[js.Any], W2 = W2.asInstanceOf[js.Any])
    __obj.asInstanceOf[W1]
  }
  
  @scala.inline
  implicit class W1Ops[Self <: W1] (val x: Self) extends AnyVal {
    
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
    def setW1Varargs(value: Double*): Self = this.set("W1", js.Array(value :_*))
    
    @scala.inline
    def setW1(value: PinDefinition): Self = this.set("W1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW2Varargs(value: Double*): Self = this.set("W2", js.Array(value :_*))
    
    @scala.inline
    def setW2(value: PinDefinition): Self = this.set("W2", value.asInstanceOf[js.Any])
  }
}
