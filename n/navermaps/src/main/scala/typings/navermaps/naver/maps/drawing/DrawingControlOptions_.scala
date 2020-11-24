package typings.navermaps.naver.maps.drawing

import typings.navermaps.naver.maps.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingControlOptions_ extends js.Object {
  
  var position: js.UndefOr[Position] = js.native
  
  var style: js.UndefOr[DrawingStyle] = js.native
}
object DrawingControlOptions_ {
  
  @scala.inline
  def apply(): DrawingControlOptions_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingControlOptions_]
  }
  
  @scala.inline
  implicit class DrawingControlOptions_Ops[Self <: DrawingControlOptions_] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setStyle(value: DrawingStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
