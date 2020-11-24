package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposListLanguagesResponseData extends js.Object {
  
  var C: Double = js.native
  
  var Python: Double = js.native
}
object ReposListLanguagesResponseData {
  
  @scala.inline
  def apply(C: Double, Python: Double): ReposListLanguagesResponseData = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], Python = Python.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListLanguagesResponseData]
  }
  
  @scala.inline
  implicit class ReposListLanguagesResponseDataOps[Self <: ReposListLanguagesResponseData] (val x: Self) extends AnyVal {
    
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
    def setC(value: Double): Self = this.set("C", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPython(value: Double): Self = this.set("Python", value.asInstanceOf[js.Any])
  }
}
