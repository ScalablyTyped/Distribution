package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.OriginalIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataExporterMod {
  
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
  val exportedFileLifetime: Double = js.native
  
  inline def purgeExpiredExportedFiles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeExpiredExportedFiles")().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/export/DataExporter", "tempExportDir")
  @js.native
  val tempExportDir: String = js.native
  
  @js.native
  trait DataExporter extends StObject {
    
    /* private */ var _getLookupValue: Any = js.native
    
    def addField(field: Any): Unit = js.native
    
    var dataSet: Any = js.native
    
    /* private */ var fieldIndexesByName_ : Any = js.native
    
    var fields: js.Array[Any] = js.native
    
    def formatFieldValue(field: Any): String = js.native
    def formatFieldValue(field: Any, showLookupKeys: Boolean): String = js.native
    
    def getField(fieldIdxOrName: String): Any = js.native
    def getField(fieldIdxOrName: Double): Any = js.native
    
    /* private */ var logger_ : Any = js.native
    
    def orderedGroupFields(): js.Array[OriginalIndex] = js.native
    
    var title: String = js.native
  }
}
