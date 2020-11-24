package typings.ol.kmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GxTrackObject extends js.Object {
  
  var flatCoordinates: js.Array[Double] = js.native
  
  var whens: js.Array[Double] = js.native
}
object GxTrackObject {
  
  @scala.inline
  def apply(flatCoordinates: js.Array[Double], whens: js.Array[Double]): GxTrackObject = {
    val __obj = js.Dynamic.literal(flatCoordinates = flatCoordinates.asInstanceOf[js.Any], whens = whens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GxTrackObject]
  }
  
  @scala.inline
  implicit class GxTrackObjectOps[Self <: GxTrackObject] (val x: Self) extends AnyVal {
    
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
    def setFlatCoordinatesVarargs(value: Double*): Self = this.set("flatCoordinates", js.Array(value :_*))
    
    @scala.inline
    def setFlatCoordinates(value: js.Array[Double]): Self = this.set("flatCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhensVarargs(value: Double*): Self = this.set("whens", js.Array(value :_*))
    
    @scala.inline
    def setWhens(value: js.Array[Double]): Self = this.set("whens", value.asInstanceOf[js.Any])
  }
}
