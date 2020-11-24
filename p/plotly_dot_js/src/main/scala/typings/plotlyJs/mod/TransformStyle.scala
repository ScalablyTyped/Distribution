package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialPlotDataAutobinx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformStyle extends js.Object {
  
  var target: Double | String | (js.Array[Double | String]) = js.native
  
  var value: PartialPlotDataAutobinx = js.native
}
object TransformStyle {
  
  @scala.inline
  def apply(target: Double | String | (js.Array[Double | String]), value: PartialPlotDataAutobinx): TransformStyle = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStyle]
  }
  
  @scala.inline
  implicit class TransformStyleOps[Self <: TransformStyle] (val x: Self) extends AnyVal {
    
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
    def setTargetVarargs(value: (Double | String)*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: Double | String | (js.Array[Double | String])): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: PartialPlotDataAutobinx): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
