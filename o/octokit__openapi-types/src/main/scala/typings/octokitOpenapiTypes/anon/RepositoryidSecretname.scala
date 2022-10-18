package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryidSecretname extends StObject {
  
  /** The name of the environment. */
  var environment_name: String
  
  /** The unique identifier of the repository. */
  var repository_id: Double
  
  /** The name of the secret. */
  var secret_name: String
}
object RepositoryidSecretname {
  
  inline def apply(environment_name: String, repository_id: Double, secret_name: String): RepositoryidSecretname = {
    val __obj = js.Dynamic.literal(environment_name = environment_name.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryidSecretname]
  }
  
  extension [Self <: RepositoryidSecretname](x: Self) {
    
    inline def setEnvironment_name(value: String): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
