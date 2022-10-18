package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialDomain
import typings.plotlyJs.anon.PartialLayoutAxisAngle
import typings.plotlyJs.plotlyJsStrings.circular
import typings.plotlyJs.plotlyJsStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolarLayout extends StObject {
  
  var angularaxis: PartialLayoutAxisAngle
  
  var bgcolor: Color
  
  var domain: PartialDomain
  
  var gridshape: circular | linear
  
  var hole: Double
  
  var radialaxis: PartialLayoutAxisAngle
  
  var sector: js.Array[Double]
  
  var uirevision: String | Double
}
object PolarLayout {
  
  inline def apply(
    angularaxis: PartialLayoutAxisAngle,
    bgcolor: Color,
    domain: PartialDomain,
    gridshape: circular | linear,
    hole: Double,
    radialaxis: PartialLayoutAxisAngle,
    sector: js.Array[Double],
    uirevision: String | Double
  ): PolarLayout = {
    val __obj = js.Dynamic.literal(angularaxis = angularaxis.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], gridshape = gridshape.asInstanceOf[js.Any], hole = hole.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], sector = sector.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarLayout]
  }
  
  extension [Self <: PolarLayout](x: Self) {
    
    inline def setAngularaxis(value: PartialLayoutAxisAngle): Self = StObject.set(x, "angularaxis", value.asInstanceOf[js.Any])
    
    inline def setBgcolor(value: Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setGridshape(value: circular | linear): Self = StObject.set(x, "gridshape", value.asInstanceOf[js.Any])
    
    inline def setHole(value: Double): Self = StObject.set(x, "hole", value.asInstanceOf[js.Any])
    
    inline def setRadialaxis(value: PartialLayoutAxisAngle): Self = StObject.set(x, "radialaxis", value.asInstanceOf[js.Any])
    
    inline def setSector(value: js.Array[Double]): Self = StObject.set(x, "sector", value.asInstanceOf[js.Any])
    
    inline def setSectorVarargs(value: Double*): Self = StObject.set(x, "sector", js.Array(value*))
    
    inline def setUirevision(value: String | Double): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
  }
}
