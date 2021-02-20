package typings.plotlyJs.anon

import typings.plotlyJs.mod.Domain
import typings.plotlyJs.mod.LayoutAxis
import typings.plotlyJs.plotlyJsStrings.circular
import typings.plotlyJs.plotlyJsStrings.linear
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.PolarLayout> */
@js.native
trait PartialPolarLayoutBgcolor extends StObject {
  
  var angularaxis: js.UndefOr[Partial[LayoutAxis]] = js.native
  
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var domain: js.UndefOr[Partial[Domain]] = js.native
  
  var gridshape: js.UndefOr[circular | linear] = js.native
  
  var hole: js.UndefOr[Double] = js.native
  
  var radialaxis: js.UndefOr[Partial[LayoutAxis]] = js.native
  
  var sector: js.UndefOr[js.Array[Double]] = js.native
  
  var uirevision: js.UndefOr[String | Double] = js.native
}
object PartialPolarLayoutBgcolor {
  
  @scala.inline
  def apply(): PartialPolarLayoutBgcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPolarLayoutBgcolor]
  }
  
  @scala.inline
  implicit class PartialPolarLayoutBgcolorMutableBuilder[Self <: PartialPolarLayoutBgcolor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngularaxis(value: Partial[LayoutAxis]): Self = StObject.set(x, "angularaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularaxisUndefined: Self = StObject.set(x, "angularaxis", js.undefined)
    
    @scala.inline
    def setBgcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: Partial[Domain]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setGridshape(value: circular | linear): Self = StObject.set(x, "gridshape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridshapeUndefined: Self = StObject.set(x, "gridshape", js.undefined)
    
    @scala.inline
    def setHole(value: Double): Self = StObject.set(x, "hole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoleUndefined: Self = StObject.set(x, "hole", js.undefined)
    
    @scala.inline
    def setRadialaxis(value: Partial[LayoutAxis]): Self = StObject.set(x, "radialaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialaxisUndefined: Self = StObject.set(x, "radialaxis", js.undefined)
    
    @scala.inline
    def setSector(value: js.Array[Double]): Self = StObject.set(x, "sector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectorUndefined: Self = StObject.set(x, "sector", js.undefined)
    
    @scala.inline
    def setSectorVarargs(value: Double*): Self = StObject.set(x, "sector", js.Array(value :_*))
    
    @scala.inline
    def setUirevision(value: String | Double): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUirevisionUndefined: Self = StObject.set(x, "uirevision", js.undefined)
  }
}
