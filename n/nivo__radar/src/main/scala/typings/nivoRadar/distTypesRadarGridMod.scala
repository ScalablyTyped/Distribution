package typings.nivoRadar

import typings.nivoRadar.distTypesTypesMod.GridLabelComponent
import typings.nivoRadar.nivoRadarStrings.circular
import typings.nivoRadar.nivoRadarStrings.linear
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadarGridMod {
  
  @JSImport("@nivo/radar/dist/types/RadarGrid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RadarGrid[D /* <: Record[String, Any] */](param0: RadarGridProps[D]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RadarGrid")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RadarGridProps[D /* <: Record[String, Any] */] extends StObject {
    
    var angleStep: Double
    
    var indices: js.Array[String]
    
    var label: GridLabelComponent
    
    var labelOffset: Double
    
    var levels: Double
    
    var radius: Double
    
    var rotation: Double
    
    var shape: circular | linear
  }
  object RadarGridProps {
    
    inline def apply[D /* <: Record[String, Any] */](
      angleStep: Double,
      indices: js.Array[String],
      label: GridLabelComponent,
      labelOffset: Double,
      levels: Double,
      radius: Double,
      rotation: Double,
      shape: circular | linear
    ): RadarGridProps[D] = {
      val __obj = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelOffset = labelOffset.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarGridProps[D]]
    }
    
    extension [Self <: RadarGridProps[?], D /* <: Record[String, Any] */](x: Self & RadarGridProps[D]) {
      
      inline def setAngleStep(value: Double): Self = StObject.set(x, "angleStep", value.asInstanceOf[js.Any])
      
      inline def setIndices(value: js.Array[String]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesVarargs(value: String*): Self = StObject.set(x, "indices", js.Array(value*))
      
      inline def setLabel(value: GridLabelComponent): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLevels(value: Double): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setShape(value: circular | linear): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
}
