package typings.ol.canvasMod

import typings.ol.fillMod.default
import typings.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextState extends js.Object {
  
  var backgroundFill: js.UndefOr[default] = js.native
  
  var backgroundStroke: js.UndefOr[typings.ol.strokeMod.default] = js.native
  
  var font: String = js.native
  
  var maxAngle: js.UndefOr[Double] = js.native
  
  var overflow: js.UndefOr[Boolean] = js.native
  
  var padding: js.UndefOr[js.Array[Double]] = js.native
  
  var placement: js.UndefOr[String] = js.native
  
  var scale: js.UndefOr[Size] = js.native
  
  var textAlign: js.UndefOr[String] = js.native
  
  var textBaseline: String = js.native
}
object TextState {
  
  @scala.inline
  def apply(font: String, textBaseline: String): TextState = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextState]
  }
  
  @scala.inline
  implicit class TextStateOps[Self <: TextState] (val x: Self) extends AnyVal {
    
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
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBaseline(value: String): Self = this.set("textBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundFill(value: default): Self = this.set("backgroundFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundFill: Self = this.set("backgroundFill", js.undefined)
    
    @scala.inline
    def setBackgroundStroke(value: typings.ol.strokeMod.default): Self = this.set("backgroundStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundStroke: Self = this.set("backgroundStroke", js.undefined)
    
    @scala.inline
    def setMaxAngle(value: Double): Self = this.set("maxAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAngle: Self = this.set("maxAngle", js.undefined)
    
    @scala.inline
    def setOverflow(value: Boolean): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setScale(value: Size): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
  }
}
