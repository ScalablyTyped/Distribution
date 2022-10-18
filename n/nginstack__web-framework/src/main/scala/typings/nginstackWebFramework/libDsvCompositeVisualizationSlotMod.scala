package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvCompositeVisualizationSlotMod {
  
  inline def apply(item: Any, width: Double, height: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(item.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/CompositeVisualizationSlot", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CompositeVisualizationSlot {
    def this(item: Any, width: Double, height: Double) = this()
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var verticalAlignment: Any = js.native
    
    /* CompleteClass */
    var visualization: Visualization = js.native
    
    /* CompleteClass */
    var width: Double = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/CompositeVisualizationSlot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CompositeVisualizationSlot extends StObject {
    
    var height: Double
    
    var verticalAlignment: Any
    
    var visualization: Visualization
    
    var width: Double
  }
  object CompositeVisualizationSlot {
    
    inline def apply(height: Double, verticalAlignment: Any, visualization: Visualization, width: Double): CompositeVisualizationSlot = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositeVisualizationSlot]
    }
    
    extension [Self <: CompositeVisualizationSlot](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignment(value: Any): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      inline def setVisualization(value: Visualization): Self = StObject.set(x, "visualization", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type DataExporter = typings.nginstackWebFramework.libExportDataExporterMod.^
  
  type Visualization = typings.nginstackWebFramework.libDsvVisualizationMod.^
}
