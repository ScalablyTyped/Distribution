package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `453` extends StObject {
  
  var codespace_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['codespace-name'] */ js.Any
}
object `453` {
  
  inline def apply(
    codespace_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['codespace-name'] */ js.Any
  ): `453` = {
    val __obj = js.Dynamic.literal(codespace_name = codespace_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`453`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `453`] (val x: Self) extends AnyVal {
    
    inline def setCodespace_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['codespace-name'] */ js.Any
    ): Self = StObject.set(x, "codespace_name", value.asInstanceOf[js.Any])
  }
}
