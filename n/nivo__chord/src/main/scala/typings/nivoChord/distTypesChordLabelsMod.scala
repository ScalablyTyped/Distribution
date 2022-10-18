package typings.nivoChord

import typings.nivoChord.distTypesTypesMod.ArcDatum
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesChordLabelsMod {
  
  @JSImport("@nivo/chord/dist/types/ChordLabels", "ChordLabels")
  @js.native
  val ChordLabels: MemoExoticComponent[js.Function1[/* hasArcsRadiusRotationColor */ ChordLabelsProps, Element]] = js.native
  
  trait ChordLabelsProps extends StObject {
    
    var arcs: js.Array[ArcDatum]
    
    var color: InheritedColorConfig[ArcDatum]
    
    var radius: Double
    
    var rotation: Double
  }
  object ChordLabelsProps {
    
    inline def apply(arcs: js.Array[ArcDatum], color: InheritedColorConfig[ArcDatum], radius: Double, rotation: Double): ChordLabelsProps = {
      val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChordLabelsProps]
    }
    
    extension [Self <: ChordLabelsProps](x: Self) {
      
      inline def setArcs(value: js.Array[ArcDatum]): Self = StObject.set(x, "arcs", value.asInstanceOf[js.Any])
      
      inline def setArcsVarargs(value: ArcDatum*): Self = StObject.set(x, "arcs", js.Array(value*))
      
      inline def setColor(value: InheritedColorConfig[ArcDatum]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    }
  }
}
