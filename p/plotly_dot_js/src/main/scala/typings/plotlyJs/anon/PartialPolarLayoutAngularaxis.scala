package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.circular
import typings.plotlyJs.plotlyJsStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.PolarLayout> */
trait PartialPolarLayoutAngularaxis extends StObject {
  
  var angularaxis: js.UndefOr[PartialLayoutAxisAngle] = js.undefined
  
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var domain: js.UndefOr[PartialDomain] = js.undefined
  
  var gridshape: js.UndefOr[circular | linear] = js.undefined
  
  var hole: js.UndefOr[Double] = js.undefined
  
  var radialaxis: js.UndefOr[PartialLayoutAxisAngle] = js.undefined
  
  var sector: js.UndefOr[js.Array[Double]] = js.undefined
  
  var uirevision: js.UndefOr[String | Double] = js.undefined
}
object PartialPolarLayoutAngularaxis {
  
  inline def apply(): PartialPolarLayoutAngularaxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPolarLayoutAngularaxis]
  }
  
  extension [Self <: PartialPolarLayoutAngularaxis](x: Self) {
    
    inline def setAngularaxis(value: PartialLayoutAxisAngle): Self = StObject.set(x, "angularaxis", value.asInstanceOf[js.Any])
    
    inline def setAngularaxisUndefined: Self = StObject.set(x, "angularaxis", js.undefined)
    
    inline def setBgcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setGridshape(value: circular | linear): Self = StObject.set(x, "gridshape", value.asInstanceOf[js.Any])
    
    inline def setGridshapeUndefined: Self = StObject.set(x, "gridshape", js.undefined)
    
    inline def setHole(value: Double): Self = StObject.set(x, "hole", value.asInstanceOf[js.Any])
    
    inline def setHoleUndefined: Self = StObject.set(x, "hole", js.undefined)
    
    inline def setRadialaxis(value: PartialLayoutAxisAngle): Self = StObject.set(x, "radialaxis", value.asInstanceOf[js.Any])
    
    inline def setRadialaxisUndefined: Self = StObject.set(x, "radialaxis", js.undefined)
    
    inline def setSector(value: js.Array[Double]): Self = StObject.set(x, "sector", value.asInstanceOf[js.Any])
    
    inline def setSectorUndefined: Self = StObject.set(x, "sector", js.undefined)
    
    inline def setSectorVarargs(value: Double*): Self = StObject.set(x, "sector", js.Array(value*))
    
    inline def setUirevision(value: String | Double): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    inline def setUirevisionUndefined: Self = StObject.set(x, "uirevision", js.undefined)
  }
}
