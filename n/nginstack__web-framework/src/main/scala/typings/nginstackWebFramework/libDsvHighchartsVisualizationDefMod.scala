package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvHighchartsVisualizationDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/HighchartsVisualizationDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with HighchartsVisualizationDef {
    
    /* CompleteClass */
    var canExport: Boolean = js.native
    
    /* CompleteClass */
    override def onGetOptions(arg0: HighchartsVisualization, arg1: DataSet): Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/HighchartsVisualizationDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  type HighchartsVisualization = typings.nginstackWebFramework.libDsvHighchartsVisualizationMod.^
  
  trait HighchartsVisualizationDef extends StObject {
    
    var canExport: Boolean
    
    def onGetOptions(arg0: HighchartsVisualization, arg1: DataSet): Any
    
    var `type`: String
  }
  object HighchartsVisualizationDef {
    
    inline def apply(canExport: Boolean, onGetOptions: (HighchartsVisualization, DataSet) => Any, `type`: String): HighchartsVisualizationDef = {
      val __obj = js.Dynamic.literal(canExport = canExport.asInstanceOf[js.Any], onGetOptions = js.Any.fromFunction2(onGetOptions))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighchartsVisualizationDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighchartsVisualizationDef] (val x: Self) extends AnyVal {
      
      inline def setCanExport(value: Boolean): Self = StObject.set(x, "canExport", value.asInstanceOf[js.Any])
      
      inline def setOnGetOptions(value: (HighchartsVisualization, DataSet) => Any): Self = StObject.set(x, "onGetOptions", js.Any.fromFunction2(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
