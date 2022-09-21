package typings.nivoRadar

import typings.nivoRadar.nivoRadarStrings.circular
import typings.nivoRadar.nivoRadarStrings.linear
import typings.react.mod.global.JSX.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radarGridLevelsMod {
  
  @JSImport("@nivo/radar/dist/types/RadarGridLevels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RadarGridLevels[D /* <: Record[String, Any] */](hasShapeProps: RadarGridLevelsProps[D]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RadarGridLevels")(hasShapeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RadarGridLevelsProps[D /* <: Record[String, Any] */] extends StObject {
    
    var angleStep: Double
    
    var dataLength: Double
    
    var radius: Double
    
    var rotation: Double
    
    var shape: circular | linear
  }
  object RadarGridLevelsProps {
    
    inline def apply[D /* <: Record[String, Any] */](angleStep: Double, dataLength: Double, radius: Double, rotation: Double, shape: circular | linear): RadarGridLevelsProps[D] = {
      val __obj = js.Dynamic.literal(angleStep = angleStep.asInstanceOf[js.Any], dataLength = dataLength.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarGridLevelsProps[D]]
    }
    
    extension [Self <: RadarGridLevelsProps[?], D /* <: Record[String, Any] */](x: Self & RadarGridLevelsProps[D]) {
      
      inline def setAngleStep(value: Double): Self = StObject.set(x, "angleStep", value.asInstanceOf[js.Any])
      
      inline def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setShape(value: circular | linear): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
}
