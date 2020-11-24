package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialFont
import typings.plotlyJs.plotlyJsStrings.`bottom center`
import typings.plotlyJs.plotlyJsStrings.`bottom left`
import typings.plotlyJs.plotlyJsStrings.`bottom right`
import typings.plotlyJs.plotlyJsStrings.`line-center`
import typings.plotlyJs.plotlyJsStrings.`middle center`
import typings.plotlyJs.plotlyJsStrings.`top center`
import typings.plotlyJs.plotlyJsStrings.`top left`
import typings.plotlyJs.plotlyJsStrings.`top right`
import typings.plotlyJs.plotlyJsStrings.line
import typings.plotlyJs.plotlyJsStrings.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapboxSymbol extends js.Object {
  
  var icon: String = js.native
  
  var iconsize: Double = js.native
  
  var placement: point | line | `line-center` = js.native
  
  var text: String = js.native
  
  var textfont: PartialFont = js.native
  
  var textposition: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`) = js.native
}
object MapboxSymbol {
  
  @scala.inline
  def apply(
    icon: String,
    iconsize: Double,
    placement: point | line | `line-center`,
    text: String,
    textfont: PartialFont,
    textposition: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  ): MapboxSymbol = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], iconsize = iconsize.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textfont = textfont.asInstanceOf[js.Any], textposition = textposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxSymbol]
  }
  
  @scala.inline
  implicit class MapboxSymbolOps[Self <: MapboxSymbol] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsize(value: Double): Self = this.set("iconsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: point | line | `line-center`): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextfont(value: PartialFont): Self = this.set("textfont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextposition(
      value: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
    ): Self = this.set("textposition", value.asInstanceOf[js.Any])
  }
}
