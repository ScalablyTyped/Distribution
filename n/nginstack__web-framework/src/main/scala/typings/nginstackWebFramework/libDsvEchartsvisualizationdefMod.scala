package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvEchartsvisualizationdefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/EChartsVisualizationDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EChartsVisualizationDef {
    
    /* CompleteClass */
    var canExport: Boolean = js.native
    
    /* CompleteClass */
    var height: String | Double = js.native
    
    /* CompleteClass */
    override def onGetOptions(arg0: EChartsVisualization, arg1: DataSet): Any = js.native
    
    /* CompleteClass */
    var theme: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var width: String | Double = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/EChartsVisualizationDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  type EChartsVisualization = typings.nginstackWebFramework.libDsvEchartsvisualizationMod.^
  
  trait EChartsVisualizationDef extends StObject {
    
    var canExport: Boolean
    
    var height: String | Double
    
    def onGetOptions(arg0: EChartsVisualization, arg1: DataSet): Any
    
    var theme: String
    
    var `type`: String
    
    var width: String | Double
  }
  object EChartsVisualizationDef {
    
    inline def apply(
      canExport: Boolean,
      height: String | Double,
      onGetOptions: (EChartsVisualization, DataSet) => Any,
      theme: String,
      `type`: String,
      width: String | Double
    ): EChartsVisualizationDef = {
      val __obj = js.Dynamic.literal(canExport = canExport.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onGetOptions = js.Any.fromFunction2(onGetOptions), theme = theme.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EChartsVisualizationDef]
    }
    
    extension [Self <: EChartsVisualizationDef](x: Self) {
      
      inline def setCanExport(value: Boolean): Self = StObject.set(x, "canExport", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOnGetOptions(value: (EChartsVisualization, DataSet) => Any): Self = StObject.set(x, "onGetOptions", js.Any.fromFunction2(value))
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
