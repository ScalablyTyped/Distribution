package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridGridExporterMod {
  
  inline def apply(grid: Grid): Unit = ^.asInstanceOf[js.Dynamic].apply(grid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/GridExporter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GridExporter {
    def this(grid: Grid) = this()
    
    /* private */ /* CompleteClass */
    var _addFields: Any = js.native
    
    /* CompleteClass */
    var dataSet: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    override def fieldIsExportable(field: GridField): Boolean = js.native
    
    /* CompleteClass */
    var grid: Grid = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/GridExporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Grid = typings.nginstackWebFramework.libGridGridMod.^
  
  trait GridExporter extends StObject {
    
    /* private */ var _addFields: Any
    
    var dataSet: typings.nginstackEngine.libDatasetDataSetMod.^
    
    def fieldIsExportable(field: GridField): Boolean
    
    var grid: Grid
    
    var title: String
  }
  object GridExporter {
    
    inline def apply(
      _addFields: Any,
      dataSet: typings.nginstackEngine.libDatasetDataSetMod.^,
      fieldIsExportable: GridField => Boolean,
      grid: Grid,
      title: String
    ): GridExporter = {
      val __obj = js.Dynamic.literal(_addFields = _addFields.asInstanceOf[js.Any], dataSet = dataSet.asInstanceOf[js.Any], fieldIsExportable = js.Any.fromFunction1(fieldIsExportable), grid = grid.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridExporter]
    }
    
    extension [Self <: GridExporter](x: Self) {
      
      inline def setDataSet(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "dataSet", value.asInstanceOf[js.Any])
      
      inline def setFieldIsExportable(value: GridField => Boolean): Self = StObject.set(x, "fieldIsExportable", js.Any.fromFunction1(value))
      
      inline def setGrid(value: Grid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def set_addFields(value: Any): Self = StObject.set(x, "_addFields", value.asInstanceOf[js.Any])
    }
  }
  
  type GridField = typings.nginstackWebFramework.libGridGridFieldMod.^
}
