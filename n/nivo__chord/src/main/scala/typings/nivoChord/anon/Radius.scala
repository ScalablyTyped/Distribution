package typings.nivoChord.anon

import typings.nivoChord.distTypesTypesMod.ArcDatum
import typings.nivoChord.distTypesTypesMod.RibbonDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radius extends StObject {
  
  var arcGenerator: Any
  
  var arcs: js.Array[ArcDatum]
  
  var center: js.Tuple2[Double, Double]
  
  var radius: Double
  
  var ribbonGenerator: Any
  
  var ribbons: js.Array[RibbonDatum]
}
object Radius {
  
  inline def apply(
    arcGenerator: Any,
    arcs: js.Array[ArcDatum],
    center: js.Tuple2[Double, Double],
    radius: Double,
    ribbonGenerator: Any,
    ribbons: js.Array[RibbonDatum]
  ): Radius = {
    val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], arcs = arcs.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], ribbonGenerator = ribbonGenerator.asInstanceOf[js.Any], ribbons = ribbons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Radius] (val x: Self) extends AnyVal {
    
    inline def setArcGenerator(value: Any): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
    
    inline def setArcs(value: js.Array[ArcDatum]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
    
    inline def setArcsVarargs(value: ArcDatum*): Self = StObject.set(x, "arcs", js.Array(value*))
    
    inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRibbonGenerator(value: Any): Self = StObject.set(x, "ribbonGenerator", value.asInstanceOf[js.Any])
    
    inline def setRibbons(value: js.Array[RibbonDatum]): Self = StObject.set(x, "ribbons", value.asInstanceOf[js.Any])
    
    inline def setRibbonsVarargs(value: RibbonDatum*): Self = StObject.set(x, "ribbons", js.Array(value*))
  }
}
