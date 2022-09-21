package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSetExporterMod {
  
  inline def apply(dataSet: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(dataSet.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/export/DataSetExporter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataSetExporter {
    def this(dataSet: Any) = this()
    
    /* CompleteClass */
    var dataSet: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/export/DataSetExporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataSetExporter extends StObject {
    
    var dataSet: Any
  }
  object DataSetExporter {
    
    inline def apply(dataSet: Any): DataSetExporter = {
      val __obj = js.Dynamic.literal(dataSet = dataSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSetExporter]
    }
    
    extension [Self <: DataSetExporter](x: Self) {
      
      inline def setDataSet(value: Any): Self = StObject.set(x, "dataSet", value.asInstanceOf[js.Any])
    }
  }
}
