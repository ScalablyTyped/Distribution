package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridExporterMod {
  
  inline def apply(grid: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(grid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/GridExporter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GridExporter {
    def this(grid: Any) = this()
    
    /* private */ /* CompleteClass */
    var _addFields: Any = js.native
    
    /* CompleteClass */
    var dataSet: Any = js.native
    
    /* CompleteClass */
    override def fieldIsExportable(field: Any): Boolean = js.native
    
    /* CompleteClass */
    var grid: Any = js.native
    
    /* CompleteClass */
    var title: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/GridExporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GridExporter extends StObject {
    
    /* private */ var _addFields: Any
    
    var dataSet: Any
    
    def fieldIsExportable(field: Any): Boolean
    
    var grid: Any
    
    var title: Any
  }
  object GridExporter {
    
    inline def apply(_addFields: Any, dataSet: Any, fieldIsExportable: Any => Boolean, grid: Any, title: Any): GridExporter = {
      val __obj = js.Dynamic.literal(_addFields = _addFields.asInstanceOf[js.Any], dataSet = dataSet.asInstanceOf[js.Any], fieldIsExportable = js.Any.fromFunction1(fieldIsExportable), grid = grid.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridExporter]
    }
    
    extension [Self <: GridExporter](x: Self) {
      
      inline def setDataSet(value: Any): Self = StObject.set(x, "dataSet", value.asInstanceOf[js.Any])
      
      inline def setFieldIsExportable(value: Any => Boolean): Self = StObject.set(x, "fieldIsExportable", js.Any.fromFunction1(value))
      
      inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def set_addFields(value: Any): Self = StObject.set(x, "_addFields", value.asInstanceOf[js.Any])
    }
  }
}
