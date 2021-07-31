package typings.plotlyJs.anon

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Slider> */
trait PartialSlider extends StObject {
  
  var active: js.UndefOr[Double] = js.undefined
  
  var activebgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var bordercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var borderwidth: js.UndefOr[Double] = js.undefined
  
  var currentvalue: js.UndefOr[Font] = js.undefined
  
  var font: js.UndefOr[typings.plotlyJs.mod.Font] = js.undefined
  
  var len: js.UndefOr[Double] = js.undefined
  
  var lenmode: js.UndefOr[fraction | pixels] = js.undefined
  
  var minorticklen: js.UndefOr[Double] = js.undefined
  
  var pad: js.UndefOr[PartialPadding] = js.undefined
  
  var steps: js.UndefOr[js.Array[PartialSliderStep]] = js.undefined
  
  var tickcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var ticklen: js.UndefOr[Double] = js.undefined
  
  var tickwidth: js.UndefOr[Double] = js.undefined
  
  var transition: js.UndefOr[Transition] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
  
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
}
object PartialSlider {
  
  @scala.inline
  def apply(): PartialSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSlider]
  }
  
  @scala.inline
  implicit class PartialSliderMutableBuilder[Self <: PartialSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setActivebgcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "activebgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivebgcolorUndefined: Self = StObject.set(x, "activebgcolor", js.undefined)
    
    @scala.inline
    def setActivebgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "activebgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBgcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    @scala.inline
    def setCurrentvalue(value: Font): Self = StObject.set(x, "currentvalue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentvalueUndefined: Self = StObject.set(x, "currentvalue", js.undefined)
    
    @scala.inline
    def setFont(value: typings.plotlyJs.mod.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    @scala.inline
    def setLenmode(value: fraction | pixels): Self = StObject.set(x, "lenmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenmodeUndefined: Self = StObject.set(x, "lenmode", js.undefined)
    
    @scala.inline
    def setMinorticklen(value: Double): Self = StObject.set(x, "minorticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorticklenUndefined: Self = StObject.set(x, "minorticklen", js.undefined)
    
    @scala.inline
    def setPad(value: PartialPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[PartialSliderStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: PartialSliderStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setTickcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "tickcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickcolorUndefined: Self = StObject.set(x, "tickcolor", js.undefined)
    
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "tickcolor", js.Array(value :_*))
    
    @scala.inline
    def setTicklen(value: Double): Self = StObject.set(x, "ticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicklenUndefined: Self = StObject.set(x, "ticklen", js.undefined)
    
    @scala.inline
    def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickwidthUndefined: Self = StObject.set(x, "tickwidth", js.undefined)
    
    @scala.inline
    def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
  }
}
