package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryidNumber extends StObject {
  
  var repository_id: Double
  
  /** The name of the secret. */
  var secret_name: String
}
object RepositoryidNumber {
  
  inline def apply(repository_id: Double, secret_name: String): RepositoryidNumber = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryidNumber]
  }
  
  extension [Self <: RepositoryidNumber](x: Self) {
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
