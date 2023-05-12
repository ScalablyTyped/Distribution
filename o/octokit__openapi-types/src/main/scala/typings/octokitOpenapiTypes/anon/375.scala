package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `375` extends StObject {
  
  var secret_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
}
object `375` {
  
  inline def apply(
    secret_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
  ): `375` = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`375`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `375`] (val x: Self) extends AnyVal {
    
    inline def setSecret_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
    ): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
