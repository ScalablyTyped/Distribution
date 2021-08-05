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
trait PartialSliderActive extends StObject {
  
  var active: js.UndefOr[Double] = js.undefined
  
  var activebgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var bordercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var borderwidth: js.UndefOr[Double] = js.undefined
  
  var currentvalue: js.UndefOr[Offset] = js.undefined
  
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
object PartialSliderActive {
  
  inline def apply(): PartialSliderActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderActive]
  }
  
  extension [Self <: PartialSliderActive](x: Self) {
    
    inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setActivebgcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "activebgcolor", value.asInstanceOf[js.Any])
    
    inline def setActivebgcolorUndefined: Self = StObject.set(x, "activebgcolor", js.undefined)
    
    inline def setActivebgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "activebgcolor", js.Array(value :_*))
    
    inline def setBgcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    inline def setBordercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value :_*))
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    inline def setCurrentvalue(value: Offset): Self = StObject.set(x, "currentvalue", value.asInstanceOf[js.Any])
    
    inline def setCurrentvalueUndefined: Self = StObject.set(x, "currentvalue", js.undefined)
    
    inline def setFont(value: typings.plotlyJs.mod.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
    
    inline def setLenmode(value: fraction | pixels): Self = StObject.set(x, "lenmode", value.asInstanceOf[js.Any])
    
    inline def setLenmodeUndefined: Self = StObject.set(x, "lenmode", js.undefined)
    
    inline def setMinorticklen(value: Double): Self = StObject.set(x, "minorticklen", value.asInstanceOf[js.Any])
    
    inline def setMinorticklenUndefined: Self = StObject.set(x, "minorticklen", js.undefined)
    
    inline def setPad(value: PartialPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setSteps(value: js.Array[PartialSliderStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: PartialSliderStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    inline def setTickcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "tickcolor", value.asInstanceOf[js.Any])
    
    inline def setTickcolorUndefined: Self = StObject.set(x, "tickcolor", js.undefined)
    
    inline def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "tickcolor", js.Array(value :_*))
    
    inline def setTicklen(value: Double): Self = StObject.set(x, "ticklen", value.asInstanceOf[js.Any])
    
    inline def setTicklenUndefined: Self = StObject.set(x, "ticklen", js.undefined)
    
    inline def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    inline def setTickwidthUndefined: Self = StObject.set(x, "tickwidth", js.undefined)
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    inline def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
  }
}
