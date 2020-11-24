package typings.openjscad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAGExtrudeOptions extends js.Object {
  
  var offset: js.UndefOr[js.Array[Double]] = js.native
  
  var twistangle: js.UndefOr[Double] = js.native
  
  var twiststeps: js.UndefOr[Double] = js.native
}
object CAGExtrudeOptions {
  
  @scala.inline
  def apply(): CAGExtrudeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CAGExtrudeOptions]
  }
  
  @scala.inline
  implicit class CAGExtrudeOptionsOps[Self <: CAGExtrudeOptions] (val x: Self) extends AnyVal {
    
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
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setTwistangle(value: Double): Self = this.set("twistangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwistangle: Self = this.set("twistangle", js.undefined)
    
    @scala.inline
    def setTwiststeps(value: Double): Self = this.set("twiststeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwiststeps: Self = this.set("twiststeps", js.undefined)
  }
}
