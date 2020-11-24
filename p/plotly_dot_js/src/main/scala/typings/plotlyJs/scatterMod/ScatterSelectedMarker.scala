package typings.plotlyJs.scatterMod

import typings.plotlyJs.anon.ColorColor
import typings.plotlyJs.anon.Partialopacitynumbercolor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScatterSelectedMarker extends js.Object {
  
  var marker: Partialopacitynumbercolor = js.native
  
  var textfont: ColorColor = js.native
}
object ScatterSelectedMarker {
  
  @scala.inline
  def apply(marker: Partialopacitynumbercolor, textfont: ColorColor): ScatterSelectedMarker = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], textfont = textfont.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterSelectedMarker]
  }
  
  @scala.inline
  implicit class ScatterSelectedMarkerOps[Self <: ScatterSelectedMarker] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: Partialopacitynumbercolor): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextfont(value: ColorColor): Self = this.set("textfont", value.asInstanceOf[js.Any])
  }
}
