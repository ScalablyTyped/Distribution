package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Totalms extends js.Object {
  
  var total_ms: Double = js.native
}
object Totalms {
  
  @scala.inline
  def apply(total_ms: Double): Totalms = {
    val __obj = js.Dynamic.literal(total_ms = total_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Totalms]
  }
  
  @scala.inline
  implicit class TotalmsOps[Self <: Totalms] (val x: Self) extends AnyVal {
    
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
    def setTotal_ms(value: Double): Self = this.set("total_ms", value.asInstanceOf[js.Any])
  }
}
