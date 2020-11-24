package typings.navermaps.naver.maps.drawing

import typings.navermaps.naver.maps.CircleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlPointOptions_ extends js.Object {
  
  var anchorPointOptions: CircleOptions = js.native
  
  var midPointOptions: CircleOptions = js.native
}
object ControlPointOptions_ {
  
  @scala.inline
  def apply(anchorPointOptions: CircleOptions, midPointOptions: CircleOptions): ControlPointOptions_ = {
    val __obj = js.Dynamic.literal(anchorPointOptions = anchorPointOptions.asInstanceOf[js.Any], midPointOptions = midPointOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlPointOptions_]
  }
  
  @scala.inline
  implicit class ControlPointOptions_Ops[Self <: ControlPointOptions_] (val x: Self) extends AnyVal {
    
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
    def setAnchorPointOptions(value: CircleOptions): Self = this.set("anchorPointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidPointOptions(value: CircleOptions): Self = this.set("midPointOptions", value.asInstanceOf[js.Any])
  }
}
