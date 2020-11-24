package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialDomain
import typings.plotlyJs.anon.PartialLayoutAxisAnchor
import typings.plotlyJs.plotlyJsStrings.circular
import typings.plotlyJs.plotlyJsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolarLayout extends js.Object {
  
  var angularaxis: PartialLayoutAxisAnchor = js.native
  
  var bgcolor: Color = js.native
  
  var domain: PartialDomain = js.native
  
  var gridshape: circular | linear = js.native
  
  var hole: Double = js.native
  
  var radialaxis: PartialLayoutAxisAnchor = js.native
  
  var sector: js.Array[Double] = js.native
  
  var uirevision: String | Double = js.native
}
object PolarLayout {
  
  @scala.inline
  def apply(
    angularaxis: PartialLayoutAxisAnchor,
    bgcolor: Color,
    domain: PartialDomain,
    gridshape: circular | linear,
    hole: Double,
    radialaxis: PartialLayoutAxisAnchor,
    sector: js.Array[Double],
    uirevision: String | Double
  ): PolarLayout = {
    val __obj = js.Dynamic.literal(angularaxis = angularaxis.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], gridshape = gridshape.asInstanceOf[js.Any], hole = hole.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], sector = sector.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarLayout]
  }
  
  @scala.inline
  implicit class PolarLayoutOps[Self <: PolarLayout] (val x: Self) extends AnyVal {
    
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
    def setAngularaxis(value: PartialLayoutAxisAnchor): Self = this.set("angularaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBgcolor(value: Color): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: PartialDomain): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridshape(value: circular | linear): Self = this.set("gridshape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHole(value: Double): Self = this.set("hole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialaxis(value: PartialLayoutAxisAnchor): Self = this.set("radialaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectorVarargs(value: Double*): Self = this.set("sector", js.Array(value :_*))
    
    @scala.inline
    def setSector(value: js.Array[Double]): Self = this.set("sector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUirevision(value: String | Double): Self = this.set("uirevision", value.asInstanceOf[js.Any])
  }
}
