package typings.nivoChord.anon

import typings.nivoChord.typesMod.ArcDatum
import typings.nivoChord.typesMod.RibbonDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arcs extends StObject {
  
  var arcs: js.Array[ArcDatum]
  
  var ribbons: js.Array[RibbonDatum]
}
object Arcs {
  
  inline def apply(arcs: js.Array[ArcDatum], ribbons: js.Array[RibbonDatum]): Arcs = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], ribbons = ribbons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arcs]
  }
  
  extension [Self <: Arcs](x: Self) {
    
    inline def setArcs(value: js.Array[ArcDatum]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
    
    inline def setArcsVarargs(value: ArcDatum*): Self = StObject.set(x, "arcs", js.Array(value*))
    
    inline def setRibbons(value: js.Array[RibbonDatum]): Self = StObject.set(x, "ribbons", value.asInstanceOf[js.Any])
    
    inline def setRibbonsVarargs(value: RibbonDatum*): Self = StObject.set(x, "ribbons", js.Array(value*))
  }
}
