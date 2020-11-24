package typings.plotlyJs.anon

import typings.plotlyJs.mod.XAxisName
import typings.plotlyJs.mod.YAxisName
import typings.plotlyJs.plotlyJsStrings.above
import typings.plotlyJs.plotlyJsStrings.below
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.contain
import typings.plotlyJs.plotlyJsStrings.fill
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.paper
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.stretch
import typings.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Image> */
@js.native
trait PartialImage extends js.Object {
  
  var layer: js.UndefOr[above | below] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var sizex: js.UndefOr[Double] = js.native
  
  var sizey: js.UndefOr[Double] = js.native
  
  var sizing: js.UndefOr[fill | contain | stretch] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var x: js.UndefOr[Double | String] = js.native
  
  var xanchor: js.UndefOr[left | center | right] = js.native
  
  var xref: js.UndefOr[paper | XAxisName] = js.native
  
  var y: js.UndefOr[Double | String] = js.native
  
  var yanchor: js.UndefOr[top | middle | bottom] = js.native
  
  var yref: js.UndefOr[paper | YAxisName] = js.native
}
object PartialImage {
  
  @scala.inline
  def apply(): PartialImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialImage]
  }
  
  @scala.inline
  implicit class PartialImageOps[Self <: PartialImage] (val x: Self) extends AnyVal {
    
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
    def setLayer(value: above | below): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSizex(value: Double): Self = this.set("sizex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizex: Self = this.set("sizex", js.undefined)
    
    @scala.inline
    def setSizey(value: Double): Self = this.set("sizey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizey: Self = this.set("sizey", js.undefined)
    
    @scala.inline
    def setSizing(value: fill | contain | stretch): Self = this.set("sizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizing: Self = this.set("sizing", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXanchor(value: left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXanchor: Self = this.set("xanchor", js.undefined)
    
    @scala.inline
    def setXref(value: paper | XAxisName): Self = this.set("xref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXref: Self = this.set("xref", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYanchor(value: top | middle | bottom): Self = this.set("yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYanchor: Self = this.set("yanchor", js.undefined)
    
    @scala.inline
    def setYref(value: paper | YAxisName): Self = this.set("yref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYref: Self = this.set("yref", js.undefined)
  }
}
