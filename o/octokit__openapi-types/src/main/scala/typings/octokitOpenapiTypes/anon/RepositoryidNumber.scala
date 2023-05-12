package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryidNumber extends StObject {
  
  var repository_id: Double
  
  var secret_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
}
object RepositoryidNumber {
  
  inline def apply(
    repository_id: Double,
    secret_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
  ): RepositoryidNumber = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setSecret_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
    ): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
