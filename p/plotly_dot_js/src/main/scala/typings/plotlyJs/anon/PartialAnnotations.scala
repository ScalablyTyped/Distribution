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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Annotations> */
@js.native
trait PartialAnnotations extends js.Object {
  
  var align: js.UndefOr[left | center | right] = js.native
  
  var arrowcolor: js.UndefOr[String] = js.native
  
  var arrowhead: js.UndefOr[Double] = js.native
  
  var arrowside: js.UndefOr[end | start] = js.native
  
  var arrowsize: js.UndefOr[Double] = js.native
  
  var arrowwidth: js.UndefOr[Double] = js.native
  
  var ax: js.UndefOr[Double] = js.native
  
  var axref: js.UndefOr[pixel | XAxisName] = js.native
  
  var ay: js.UndefOr[Double] = js.native
  
  var ayref: js.UndefOr[pixel | YAxisName] = js.native
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var bordercolor: js.UndefOr[String] = js.native
  
  var borderpad: js.UndefOr[Double] = js.native
  
  var borderwidth: js.UndefOr[Double] = js.native
  
  var captureevents: js.UndefOr[Boolean] = js.native
  
  var clicktoshow: js.UndefOr[`false` | onoff | onout] = js.native
  
  var font: js.UndefOr[PartialFont] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hoverlabel: js.UndefOr[PartialHoverLabelAlign] = js.native
  
  var hovertext: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var showarrow: js.UndefOr[Boolean] = js.native
  
  var standoff: js.UndefOr[Double] = js.native
  
  var startarrowhead: js.UndefOr[Double] = js.native
  
  var startarrowsize: js.UndefOr[Double] = js.native
  
  var startstandoff: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textangle: js.UndefOr[String] = js.native
  
  var valign: js.UndefOr[top | middle | bottom] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double | String] = js.native
  
  var xanchor: js.UndefOr[auto | left | center | right] = js.native
  
  var xclick: js.UndefOr[js.Any] = js.native
  
  var xref: js.UndefOr[paper | XAxisName] = js.native
  
  var xshift: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double | String] = js.native
  
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.native
  
  var yclick: js.UndefOr[js.Any] = js.native
  
  var yref: js.UndefOr[paper | YAxisName] = js.native
  
  var yshift: js.UndefOr[Double] = js.native
}
object PartialAnnotations {
  
  @scala.inline
  def apply(): PartialAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAnnotations]
  }
  
  @scala.inline
  implicit class PartialAnnotationsOps[Self <: PartialAnnotations] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: left | center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setArrowcolor(value: String): Self = this.set("arrowcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowcolor: Self = this.set("arrowcolor", js.undefined)
    
    @scala.inline
    def setArrowhead(value: Double): Self = this.set("arrowhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowhead: Self = this.set("arrowhead", js.undefined)
    
    @scala.inline
    def setArrowside(value: end | start): Self = this.set("arrowside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowside: Self = this.set("arrowside", js.undefined)
    
    @scala.inline
    def setArrowsize(value: Double): Self = this.set("arrowsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowsize: Self = this.set("arrowsize", js.undefined)
    
    @scala.inline
    def setArrowwidth(value: Double): Self = this.set("arrowwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowwidth: Self = this.set("arrowwidth", js.undefined)
    
    @scala.inline
    def setAx(value: Double): Self = this.set("ax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAx: Self = this.set("ax", js.undefined)
    
    @scala.inline
    def setAxref(value: pixel | XAxisName): Self = this.set("axref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxref: Self = this.set("axref", js.undefined)
    
    @scala.inline
    def setAy(value: Double): Self = this.set("ay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAy: Self = this.set("ay", js.undefined)
    
    @scala.inline
    def setAyref(value: pixel | YAxisName): Self = this.set("ayref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAyref: Self = this.set("ayref", js.undefined)
    
    @scala.inline
    def setBgcolor(value: String): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    
    @scala.inline
    def setBordercolor(value: String): Self = this.set("bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordercolor: Self = this.set("bordercolor", js.undefined)
    
    @scala.inline
    def setBorderpad(value: Double): Self = this.set("borderpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderpad: Self = this.set("borderpad", js.undefined)
    
    @scala.inline
    def setBorderwidth(value: Double): Self = this.set("borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderwidth: Self = this.set("borderwidth", js.undefined)
    
    @scala.inline
    def setCaptureevents(value: Boolean): Self = this.set("captureevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureevents: Self = this.set("captureevents", js.undefined)
    
    @scala.inline
    def setClicktoshow(value: `false` | onoff | onout): Self = this.set("clicktoshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClicktoshow: Self = this.set("clicktoshow", js.undefined)
    
    @scala.inline
    def setFont(value: PartialFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHoverlabel(value: PartialHoverLabelAlign): Self = this.set("hoverlabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverlabel: Self = this.set("hoverlabel", js.undefined)
    
    @scala.inline
    def setHovertext(value: String): Self = this.set("hovertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHovertext: Self = this.set("hovertext", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setShowarrow(value: Boolean): Self = this.set("showarrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowarrow: Self = this.set("showarrow", js.undefined)
    
    @scala.inline
    def setStandoff(value: Double): Self = this.set("standoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandoff: Self = this.set("standoff", js.undefined)
    
    @scala.inline
    def setStartarrowhead(value: Double): Self = this.set("startarrowhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartarrowhead: Self = this.set("startarrowhead", js.undefined)
    
    @scala.inline
    def setStartarrowsize(value: Double): Self = this.set("startarrowsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartarrowsize: Self = this.set("startarrowsize", js.undefined)
    
    @scala.inline
    def setStartstandoff(value: Double): Self = this.set("startstandoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartstandoff: Self = this.set("startstandoff", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextangle(value: String): Self = this.set("textangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextangle: Self = this.set("textangle", js.undefined)
    
    @scala.inline
    def setValign(value: top | middle | bottom): Self = this.set("valign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValign: Self = this.set("valign", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXanchor(value: auto | left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXanchor: Self = this.set("xanchor", js.undefined)
    
    @scala.inline
    def setXclick(value: js.Any): Self = this.set("xclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXclick: Self = this.set("xclick", js.undefined)
    
    @scala.inline
    def setXref(value: paper | XAxisName): Self = this.set("xref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXref: Self = this.set("xref", js.undefined)
    
    @scala.inline
    def setXshift(value: Double): Self = this.set("xshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXshift: Self = this.set("xshift", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYanchor(value: auto | top | middle | bottom): Self = this.set("yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYanchor: Self = this.set("yanchor", js.undefined)
    
    @scala.inline
    def setYclick(value: js.Any): Self = this.set("yclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYclick: Self = this.set("yclick", js.undefined)
    
    @scala.inline
    def setYref(value: paper | YAxisName): Self = this.set("yref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYref: Self = this.set("yref", js.undefined)
    
    @scala.inline
    def setYshift(value: Double): Self = this.set("yshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYshift: Self = this.set("yshift", js.undefined)
  }
}
