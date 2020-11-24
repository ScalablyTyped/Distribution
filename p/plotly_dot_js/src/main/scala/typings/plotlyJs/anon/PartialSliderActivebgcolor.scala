package typings.plotlyJs.anon

import typings.plotlyJs.mod.Padding
import typings.plotlyJs.mod.SliderStep
import typings.plotlyJs.mod.Transition
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.fraction
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.pixels
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Slider> */
@js.native
trait PartialSliderActivebgcolor extends js.Object {
  
  var active: js.UndefOr[Double] = js.native
  
  var activebgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var bordercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var borderwidth: js.UndefOr[Double] = js.native
  
  var currentvalue: js.UndefOr[Offset] = js.native
  
  var font: js.UndefOr[typings.plotlyJs.mod.Font] = js.native
  
  var len: js.UndefOr[Double] = js.native
  
  var lenmode: js.UndefOr[fraction | pixels] = js.native
  
  var minorticklen: js.UndefOr[Double] = js.native
  
  var pad: js.UndefOr[Partial[Padding]] = js.native
  
  var steps: js.UndefOr[js.Array[Partial[SliderStep]]] = js.native
  
  var tickcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var ticklen: js.UndefOr[Double] = js.native
  
  var tickwidth: js.UndefOr[Double] = js.native
  
  var transition: js.UndefOr[Transition] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var xanchor: js.UndefOr[auto | left | center | right] = js.native
  
  var y: js.UndefOr[Double] = js.native
  
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.native
}
object PartialSliderActivebgcolor {
  
  @scala.inline
  def apply(): PartialSliderActivebgcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderActivebgcolor]
  }
  
  @scala.inline
  implicit class PartialSliderActivebgcolorOps[Self <: PartialSliderActivebgcolor] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Double): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setActivebgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("activebgcolor", js.Array(value :_*))
    
    @scala.inline
    def setActivebgcolor(value: typings.plotlyJs.mod.Color): Self = this.set("activebgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivebgcolor: Self = this.set("activebgcolor", js.undefined)
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBgcolor(value: typings.plotlyJs.mod.Color): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: typings.plotlyJs.mod.Color): Self = this.set("bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordercolor: Self = this.set("bordercolor", js.undefined)
    
    @scala.inline
    def setBorderwidth(value: Double): Self = this.set("borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderwidth: Self = this.set("borderwidth", js.undefined)
    
    @scala.inline
    def setCurrentvalue(value: Offset): Self = this.set("currentvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentvalue: Self = this.set("currentvalue", js.undefined)
    
    @scala.inline
    def setFont(value: typings.plotlyJs.mod.Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setLen(value: Double): Self = this.set("len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLen: Self = this.set("len", js.undefined)
    
    @scala.inline
    def setLenmode(value: fraction | pixels): Self = this.set("lenmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLenmode: Self = this.set("lenmode", js.undefined)
    
    @scala.inline
    def setMinorticklen(value: Double): Self = this.set("minorticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorticklen: Self = this.set("minorticklen", js.undefined)
    
    @scala.inline
    def setPad(value: Partial[Padding]): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Partial[SliderStep]*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[Partial[SliderStep]]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("tickcolor", js.Array(value :_*))
    
    @scala.inline
    def setTickcolor(value: typings.plotlyJs.mod.Color): Self = this.set("tickcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickcolor: Self = this.set("tickcolor", js.undefined)
    
    @scala.inline
    def setTicklen(value: Double): Self = this.set("ticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicklen: Self = this.set("ticklen", js.undefined)
    
    @scala.inline
    def setTickwidth(value: Double): Self = this.set("tickwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickwidth: Self = this.set("tickwidth", js.undefined)
    
    @scala.inline
    def setTransition(value: Transition): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXanchor: Self = this.set("xanchor", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = this.set("yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYanchor: Self = this.set("yanchor", js.undefined)
  }
}
