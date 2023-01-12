package typings.plotlyJs.anon

import typings.plotlyJs.mod.XAxisName
import typings.plotlyJs.mod.YAxisName
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.end
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.onoff
import typings.plotlyJs.plotlyJsStrings.onout
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.pixel
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.start
import typings.plotlyJs.plotlyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Annotations> */
trait PartialAnnotations extends StObject {
  
  var align: js.UndefOr[left | center | right] = js.undefined
  
  var arrowcolor: js.UndefOr[String] = js.undefined
  
  var arrowhead: js.UndefOr[Double] = js.undefined
  
  var arrowside: js.UndefOr[end | start] = js.undefined
  
  var arrowsize: js.UndefOr[Double] = js.undefined
  
  var arrowwidth: js.UndefOr[Double] = js.undefined
  
  var ax: js.UndefOr[Double] = js.undefined
  
  var axref: js.UndefOr[pixel | XAxisName] = js.undefined
  
  var ay: js.UndefOr[Double] = js.undefined
  
  var ayref: js.UndefOr[pixel | YAxisName] = js.undefined
  
  var bgcolor: js.UndefOr[String] = js.undefined
  
  var bordercolor: js.UndefOr[String] = js.undefined
  
  var borderpad: js.UndefOr[Double] = js.undefined
  
  var borderwidth: js.UndefOr[Double] = js.undefined
  
  var captureevents: js.UndefOr[Boolean] = js.undefined
  
  var clicktoshow: js.UndefOr[`false` | onoff | onout] = js.undefined
  
  var font: js.UndefOr[PartialFont] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hoverlabel: js.UndefOr[PartialHoverLabelAlign] = js.undefined
  
  var hovertext: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var showarrow: js.UndefOr[Boolean] = js.undefined
  
  var standoff: js.UndefOr[Double] = js.undefined
  
  var startarrowhead: js.UndefOr[Double] = js.undefined
  
  var startarrowsize: js.UndefOr[Double] = js.undefined
  
  var startstandoff: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textangle: js.UndefOr[String] = js.undefined
  
  var valign: js.UndefOr[top | middle | bottom] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double | String] = js.undefined
  
  var xanchor: js.UndefOr[auto | left | center | right] = js.undefined
  
  var xclick: js.UndefOr[Any] = js.undefined
  
  var xref: js.UndefOr[paper | XAxisName] = js.undefined
  
  var xshift: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double | String] = js.undefined
  
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.undefined
  
  var yclick: js.UndefOr[Any] = js.undefined
  
  var yref: js.UndefOr[paper | YAxisName] = js.undefined
  
  var yshift: js.UndefOr[Double] = js.undefined
}
object PartialAnnotations {
  
  inline def apply(): PartialAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAnnotations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAnnotations] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setArrowcolor(value: String): Self = StObject.set(x, "arrowcolor", value.asInstanceOf[js.Any])
    
    inline def setArrowcolorUndefined: Self = StObject.set(x, "arrowcolor", js.undefined)
    
    inline def setArrowhead(value: Double): Self = StObject.set(x, "arrowhead", value.asInstanceOf[js.Any])
    
    inline def setArrowheadUndefined: Self = StObject.set(x, "arrowhead", js.undefined)
    
    inline def setArrowside(value: end | start): Self = StObject.set(x, "arrowside", value.asInstanceOf[js.Any])
    
    inline def setArrowsideUndefined: Self = StObject.set(x, "arrowside", js.undefined)
    
    inline def setArrowsize(value: Double): Self = StObject.set(x, "arrowsize", value.asInstanceOf[js.Any])
    
    inline def setArrowsizeUndefined: Self = StObject.set(x, "arrowsize", js.undefined)
    
    inline def setArrowwidth(value: Double): Self = StObject.set(x, "arrowwidth", value.asInstanceOf[js.Any])
    
    inline def setArrowwidthUndefined: Self = StObject.set(x, "arrowwidth", js.undefined)
    
    inline def setAx(value: Double): Self = StObject.set(x, "ax", value.asInstanceOf[js.Any])
    
    inline def setAxUndefined: Self = StObject.set(x, "ax", js.undefined)
    
    inline def setAxref(value: pixel | XAxisName): Self = StObject.set(x, "axref", value.asInstanceOf[js.Any])
    
    inline def setAxrefUndefined: Self = StObject.set(x, "axref", js.undefined)
    
    inline def setAy(value: Double): Self = StObject.set(x, "ay", value.asInstanceOf[js.Any])
    
    inline def setAyUndefined: Self = StObject.set(x, "ay", js.undefined)
    
    inline def setAyref(value: pixel | YAxisName): Self = StObject.set(x, "ayref", value.asInstanceOf[js.Any])
    
    inline def setAyrefUndefined: Self = StObject.set(x, "ayref", js.undefined)
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBordercolor(value: String): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setBorderpad(value: Double): Self = StObject.set(x, "borderpad", value.asInstanceOf[js.Any])
    
    inline def setBorderpadUndefined: Self = StObject.set(x, "borderpad", js.undefined)
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    inline def setCaptureevents(value: Boolean): Self = StObject.set(x, "captureevents", value.asInstanceOf[js.Any])
    
    inline def setCaptureeventsUndefined: Self = StObject.set(x, "captureevents", js.undefined)
    
    inline def setClicktoshow(value: `false` | onoff | onout): Self = StObject.set(x, "clicktoshow", value.asInstanceOf[js.Any])
    
    inline def setClicktoshowUndefined: Self = StObject.set(x, "clicktoshow", js.undefined)
    
    inline def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHoverlabel(value: PartialHoverLabelAlign): Self = StObject.set(x, "hoverlabel", value.asInstanceOf[js.Any])
    
    inline def setHoverlabelUndefined: Self = StObject.set(x, "hoverlabel", js.undefined)
    
    inline def setHovertext(value: String): Self = StObject.set(x, "hovertext", value.asInstanceOf[js.Any])
    
    inline def setHovertextUndefined: Self = StObject.set(x, "hovertext", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setShowarrow(value: Boolean): Self = StObject.set(x, "showarrow", value.asInstanceOf[js.Any])
    
    inline def setShowarrowUndefined: Self = StObject.set(x, "showarrow", js.undefined)
    
    inline def setStandoff(value: Double): Self = StObject.set(x, "standoff", value.asInstanceOf[js.Any])
    
    inline def setStandoffUndefined: Self = StObject.set(x, "standoff", js.undefined)
    
    inline def setStartarrowhead(value: Double): Self = StObject.set(x, "startarrowhead", value.asInstanceOf[js.Any])
    
    inline def setStartarrowheadUndefined: Self = StObject.set(x, "startarrowhead", js.undefined)
    
    inline def setStartarrowsize(value: Double): Self = StObject.set(x, "startarrowsize", value.asInstanceOf[js.Any])
    
    inline def setStartarrowsizeUndefined: Self = StObject.set(x, "startarrowsize", js.undefined)
    
    inline def setStartstandoff(value: Double): Self = StObject.set(x, "startstandoff", value.asInstanceOf[js.Any])
    
    inline def setStartstandoffUndefined: Self = StObject.set(x, "startstandoff", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextangle(value: String): Self = StObject.set(x, "textangle", value.asInstanceOf[js.Any])
    
    inline def setTextangleUndefined: Self = StObject.set(x, "textangle", js.undefined)
    
    inline def setValign(value: top | middle | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setXanchorUndefined: Self = StObject.set(x, "xanchor", js.undefined)
    
    inline def setXclick(value: Any): Self = StObject.set(x, "xclick", value.asInstanceOf[js.Any])
    
    inline def setXclickUndefined: Self = StObject.set(x, "xclick", js.undefined)
    
    inline def setXref(value: paper | XAxisName): Self = StObject.set(x, "xref", value.asInstanceOf[js.Any])
    
    inline def setXrefUndefined: Self = StObject.set(x, "xref", js.undefined)
    
    inline def setXshift(value: Double): Self = StObject.set(x, "xshift", value.asInstanceOf[js.Any])
    
    inline def setXshiftUndefined: Self = StObject.set(x, "xshift", js.undefined)
    
    inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
    
    inline def setYanchorUndefined: Self = StObject.set(x, "yanchor", js.undefined)
    
    inline def setYclick(value: Any): Self = StObject.set(x, "yclick", value.asInstanceOf[js.Any])
    
    inline def setYclickUndefined: Self = StObject.set(x, "yclick", js.undefined)
    
    inline def setYref(value: paper | YAxisName): Self = StObject.set(x, "yref", value.asInstanceOf[js.Any])
    
    inline def setYrefUndefined: Self = StObject.set(x, "yref", js.undefined)
    
    inline def setYshift(value: Double): Self = StObject.set(x, "yshift", value.asInstanceOf[js.Any])
    
    inline def setYshiftUndefined: Self = StObject.set(x, "yshift", js.undefined)
  }
}
