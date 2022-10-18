package typings.nivoRadar

import typings.nivoRadar.distTypesTypesMod.GridLabelComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadarGridLabelsMod {
  
  @JSImport("@nivo/radar/dist/types/RadarGridLabels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RadarGridLabels(hasRadiusAnglesIndicesLabelComponentLabelOffset: RadarGridLabelsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RadarGridLabels")(hasRadiusAnglesIndicesLabelComponentLabelOffset.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RadarGridLabelsProps extends StObject {
    
    var angles: js.Array[Double]
    
    var indices: js.Array[String]
    
    var label: GridLabelComponent
    
    var labelOffset: Double
    
    var radius: Double
  }
  object RadarGridLabelsProps {
    
    inline def apply(
      angles: js.Array[Double],
      indices: js.Array[String],
      label: GridLabelComponent,
      labelOffset: Double,
      radius: Double
    ): RadarGridLabelsProps = {
      val __obj = js.Dynamic.literal(angles = angles.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelOffset = labelOffset.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarGridLabelsProps]
    }
    
    extension [Self <: RadarGridLabelsProps](x: Self) {
      
      inline def setAngles(value: js.Array[Double]): Self = StObject.set(x, "angles", value.asInstanceOf[js.Any])
      
      inline def setAnglesVarargs(value: Double*): Self = StObject.set(x, "angles", js.Array(value*))
      
      inline def setIndices(value: js.Array[String]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesVarargs(value: String*): Self = StObject.set(x, "indices", js.Array(value*))
      
      inline def setLabel(value: GridLabelComponent): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
}
