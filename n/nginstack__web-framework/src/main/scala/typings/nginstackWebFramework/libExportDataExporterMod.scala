package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.OriginalIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExportDataExporterMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/export/DataExporter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataExporter
  @JSImport("@nginstack/web-framework/lib/export/DataExporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/export/DataExporter", "exportedFileLifetime")
  @js.native
  def exportedFileLifetime: Double = js.native
  inline def exportedFileLifetime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exportedFileLifetime")(x.asInstanceOf[js.Any])
  
  inline def purgeExpiredExportedFiles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeExpiredExportedFiles")().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/export/DataExporter", "tempExportDir")
  @js.native
  def tempExportDir: String = js.native
  inline def tempExportDir_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tempExportDir")(x.asInstanceOf[js.Any])
  
  @js.native
  trait DataExporter extends StObject {
    
    /* private */ var _getLookupValue: Any = js.native
    
    def addField(field: DataExporterFieldDef): Unit = js.native
    
    var dataSet: DataSet = js.native
    
    /* private */ var fieldIndexesByName_ : Any = js.native
    
    var fields: js.Array[Any] = js.native
    
    def formatFieldValue(field: DataExporterFieldDef): String = js.native
    def formatFieldValue(field: DataExporterFieldDef, showLookupKeys: Boolean): String = js.native
    
    def getField(fieldIdxOrName: String): DataExporterFieldDef = js.native
    def getField(fieldIdxOrName: Double): DataExporterFieldDef = js.native
    
    /* private */ var logger_ : Any = js.native
    
    def orderedGroupFields(): js.Array[OriginalIndex] = js.native
    
    var title: String = js.native
  }
  
  type DataExporterFieldDef = typings.nginstackWebFramework.libExportDataExporterFieldDefMod.^
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
