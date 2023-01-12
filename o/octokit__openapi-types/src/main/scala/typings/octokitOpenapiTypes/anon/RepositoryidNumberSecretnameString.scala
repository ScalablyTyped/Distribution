package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryidNumberSecretnameString extends StObject {
  
  var repository_id: Double
  
  /** The name of the secret. */
  var secret_name: String
}
object RepositoryidNumberSecretnameString {
  
  inline def apply(repository_id: Double, secret_name: String): RepositoryidNumberSecretnameString = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryidNumberSecretnameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryidNumberSecretnameString] (val x: Self) extends AnyVal {
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
