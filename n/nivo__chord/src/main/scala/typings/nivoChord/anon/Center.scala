package typings.nivoChord.anon

import typings.d3Chord.mod.ChordLayout
import typings.nivoChord.distTypesTypesMod.ArcDatum
import typings.nivoChord.distTypesTypesMod.RibbonDatum
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var arcGenerator: typings.nivoChord.distTypesTypesMod.ArcGenerator
  
  var arcs: js.Array[ArcDatum]
  
  var center: js.Tuple2[Double, Double]
  
  var chord: ChordLayout
  
  var getColor: OrdinalColorScale[OmitArcDatumlabelcolor]
  
  var innerRadius: Double
  
  var radius: Double
  
  var ribbonGenerator: typings.nivoChord.distTypesTypesMod.RibbonGenerator
  
  var ribbons: js.Array[RibbonDatum]
}
object Center {
  
  inline def apply(
    arcGenerator: typings.nivoChord.distTypesTypesMod.ArcGenerator,
    arcs: js.Array[ArcDatum],
    center: js.Tuple2[Double, Double],
    chord: ChordLayout,
    getColor: OmitArcDatumlabelcolor => String,
    innerRadius: Double,
    radius: Double,
    ribbonGenerator: typings.nivoChord.distTypesTypesMod.RibbonGenerator,
    ribbons: js.Array[RibbonDatum]
  ): Center = {
    val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], arcs = arcs.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], chord = chord.asInstanceOf[js.Any], getColor = js.Any.fromFunction1(getColor), innerRadius = innerRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], ribbonGenerator = ribbonGenerator.asInstanceOf[js.Any], ribbons = ribbons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    inline def setArcGenerator(value: typings.nivoChord.distTypesTypesMod.ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
    
    inline def setArcs(value: js.Array[ArcDatum]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
    
    inline def setArcsVarargs(value: ArcDatum*): Self = StObject.set(x, "arcs", js.Array(value*))
    
    inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setChord(value: ChordLayout): Self = StObject.set(x, "chord", value.asInstanceOf[js.Any])
    
    inline def setGetColor(value: OmitArcDatumlabelcolor => String): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRibbonGenerator(value: typings.nivoChord.distTypesTypesMod.RibbonGenerator): Self = StObject.set(x, "ribbonGenerator", value.asInstanceOf[js.Any])
    
    inline def setRibbons(value: js.Array[RibbonDatum]): Self = StObject.set(x, "ribbons", value.asInstanceOf[js.Any])
    
    inline def setRibbonsVarargs(value: RibbonDatum*): Self = StObject.set(x, "ribbons", js.Array(value*))
  }
}
