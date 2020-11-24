package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberOfRetries extends js.Object {
  
  var numberOfRetries: js.UndefOr[Double] = js.native
  
  var tailableRetryInterval: js.UndefOr[Double] = js.native
}
object NumberOfRetries {
  
  @scala.inline
  def apply(): NumberOfRetries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberOfRetries]
  }
  
  @scala.inline
  implicit class NumberOfRetriesOps[Self <: NumberOfRetries] (val x: Self) extends AnyVal {
    
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
    def setNumberOfRetries(value: Double): Self = this.set("numberOfRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfRetries: Self = this.set("numberOfRetries", js.undefined)
    
    @scala.inline
    def setTailableRetryInterval(value: Double): Self = this.set("tailableRetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTailableRetryInterval: Self = this.set("tailableRetryInterval", js.undefined)
  }
}
