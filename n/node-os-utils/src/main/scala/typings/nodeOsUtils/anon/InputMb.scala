package typings.nodeOsUtils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputMb extends js.Object {
  
  var inputMb: Double = js.native
  
  var outputMb: Double = js.native
}
object InputMb {
  
  @scala.inline
  def apply(inputMb: Double, outputMb: Double): InputMb = {
    val __obj = js.Dynamic.literal(inputMb = inputMb.asInstanceOf[js.Any], outputMb = outputMb.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMb]
  }
  
  @scala.inline
  implicit class InputMbOps[Self <: InputMb] (val x: Self) extends AnyVal {
    
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
    def setInputMb(value: Double): Self = this.set("inputMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputMb(value: Double): Self = this.set("outputMb", value.asInstanceOf[js.Any])
  }
}
