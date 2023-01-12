package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exportid extends StObject {
  
  /** The name of the codespace. */
  var codespace_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['codespace-name'] */ js.Any
  
  /** The ID of the export operation, or `latest`. Currently only `latest` is currently supported. */
  var export_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['export-id'] */ js.Any
}
object Exportid {
  
  inline def apply(
    codespace_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['codespace-name'] */ js.Any,
    export_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['export-id'] */ js.Any
  ): Exportid = {
    val __obj = js.Dynamic.literal(codespace_name = codespace_name.asInstanceOf[js.Any], export_id = export_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exportid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exportid] (val x: Self) extends AnyVal {
    
    inline def setCodespace_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['codespace-name'] */ js.Any
    ): Self = StObject.set(x, "codespace_name", value.asInstanceOf[js.Any])
    
    inline def setExport_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['export-id'] */ js.Any
    ): Self = StObject.set(x, "export_id", value.asInstanceOf[js.Any])
  }
}
