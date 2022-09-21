package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `369` extends StObject {
  
  /** The name of the codespace. */
  var codespace_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['codespace-name'] */ js.Any
}
object `369` {
  
  inline def apply(
    codespace_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['codespace-name'] */ js.Any
  ): `369` = {
    val __obj = js.Dynamic.literal(codespace_name = codespace_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`369`]
  }
  
  extension [Self <: `369`](x: Self) {
    
    inline def setCodespace_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['codespace-name'] */ js.Any
    ): Self = StObject.set(x, "codespace_name", value.asInstanceOf[js.Any])
  }
}
