package typings.nginstackWebFramework

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvDataVisualizationDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/DataVisualizationDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataVisualizationDef {
    
    /* CompleteClass */
    var dataSourceQuery: (Record[Any, Any]) | Double = js.native
    
    /* CompleteClass */
    var dataSourceQueryKey: Double = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/DataVisualizationDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataVisualizationDef extends StObject {
    
    var dataSourceQuery: (Record[Any, Any]) | Double
    
    var dataSourceQueryKey: Double
  }
  object DataVisualizationDef {
    
    inline def apply(dataSourceQuery: (Record[Any, Any]) | Double, dataSourceQueryKey: Double): DataVisualizationDef = {
      val __obj = js.Dynamic.literal(dataSourceQuery = dataSourceQuery.asInstanceOf[js.Any], dataSourceQueryKey = dataSourceQueryKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataVisualizationDef]
    }
    
    extension [Self <: DataVisualizationDef](x: Self) {
      
      inline def setDataSourceQuery(value: (Record[Any, Any]) | Double): Self = StObject.set(x, "dataSourceQuery", value.asInstanceOf[js.Any])
      
      inline def setDataSourceQueryKey(value: Double): Self = StObject.set(x, "dataSourceQueryKey", value.asInstanceOf[js.Any])
    }
  }
}
