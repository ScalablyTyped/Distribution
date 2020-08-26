package typings.plotlyJs.anon

import typings.plotlyJs.mod.Padding
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.container
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  text :string,   font :std.Partial<plotly.js.plotly.js.Font>,   xref :'container' | 'paper',   yref :'container' | 'paper',   x :number,   y :number,   xanchor :'auto' | 'left' | 'center' | 'right',   yanchor :'auto' | 'top' | 'middle' | 'bottom',   pad :std.Partial<plotly.js.plotly.js.Padding>}> */
@js.native
trait PartialtextstringfontPartFont extends js.Object {
  var font: js.UndefOr[Partial[typings.plotlyJs.mod.Font]] = js.native
  var pad: js.UndefOr[Partial[Padding]] = js.native
  var text: js.UndefOr[String] = js.native
  var x: js.UndefOr[Double] = js.native
  var xanchor: js.UndefOr[auto | left | center | right] = js.native
  var xref: js.UndefOr[container | paper] = js.native
  var y: js.UndefOr[Double] = js.native
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.native
  var yref: js.UndefOr[container | paper] = js.native
}

object PartialtextstringfontPartFont {
  @scala.inline
  def apply(): PartialtextstringfontPartFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialtextstringfontPartFont]
  }
  @scala.inline
  implicit class PartialtextstringfontPartFontOps[Self <: PartialtextstringfontPartFont] (val x: Self) extends AnyVal {
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
    def setFont(value: Partial[typings.plotlyJs.mod.Font]): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setPad(value: Partial[Padding]): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXanchor: Self = this.set("xanchor", js.undefined)
    @scala.inline
    def setXref(value: container | paper): Self = this.set("xref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXref: Self = this.set("xref", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = this.set("yanchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYanchor: Self = this.set("yanchor", js.undefined)
    @scala.inline
    def setYref(value: container | paper): Self = this.set("yref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYref: Self = this.set("yref", js.undefined)
  }
  
}

