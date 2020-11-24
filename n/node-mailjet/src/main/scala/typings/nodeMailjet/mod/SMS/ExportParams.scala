package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportParams extends js.Object {
  
  var FromTS: Double = js.native
  
  var ToTS: Double = js.native
}
object ExportParams {
  
  @scala.inline
  def apply(FromTS: Double, ToTS: Double): ExportParams = {
    val __obj = js.Dynamic.literal(FromTS = FromTS.asInstanceOf[js.Any], ToTS = ToTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportParams]
  }
  
  @scala.inline
  implicit class ExportParamsOps[Self <: ExportParams] (val x: Self) extends AnyVal {
    
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
    def setFromTS(value: Double): Self = this.set("FromTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToTS(value: Double): Self = this.set("ToTS", value.asInstanceOf[js.Any])
  }
}
