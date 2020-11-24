package typings.playable.previewServiceTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFramesData extends js.Object {
  
  var framesCount: Double = js.native
  
  var qualities: js.Array[IFramesQuality] = js.native
}
object IFramesData {
  
  @scala.inline
  def apply(framesCount: Double, qualities: js.Array[IFramesQuality]): IFramesData = {
    val __obj = js.Dynamic.literal(framesCount = framesCount.asInstanceOf[js.Any], qualities = qualities.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFramesData]
  }
  
  @scala.inline
  implicit class IFramesDataOps[Self <: IFramesData] (val x: Self) extends AnyVal {
    
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
    def setFramesCount(value: Double): Self = this.set("framesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualitiesVarargs(value: IFramesQuality*): Self = this.set("qualities", js.Array(value :_*))
    
    @scala.inline
    def setQualities(value: js.Array[IFramesQuality]): Self = this.set("qualities", value.asInstanceOf[js.Any])
  }
}
