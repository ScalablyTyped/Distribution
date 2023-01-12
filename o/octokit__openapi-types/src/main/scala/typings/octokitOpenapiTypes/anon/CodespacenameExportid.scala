package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodespacenameExportid extends StObject {
  
  /** The name of the codespace. */
  var codespace_name: String
  
  /** The ID of the export operation, or `latest`. Currently only `latest` is currently supported. */
  var export_id: String
}
object CodespacenameExportid {
  
  inline def apply(codespace_name: String, export_id: String): CodespacenameExportid = {
    val __obj = js.Dynamic.literal(codespace_name = codespace_name.asInstanceOf[js.Any], export_id = export_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodespacenameExportid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodespacenameExportid] (val x: Self) extends AnyVal {
    
    inline def setCodespace_name(value: String): Self = StObject.set(x, "codespace_name", value.asInstanceOf[js.Any])
    
    inline def setExport_id(value: String): Self = StObject.set(x, "export_id", value.asInstanceOf[js.Any])
  }
}
