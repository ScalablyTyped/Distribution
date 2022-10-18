package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repositoryid extends StObject {
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  var repository_id: Double
  
  /** The name of the secret. */
  var secret_name: String
}
object Repositoryid {
  
  inline def apply(org_ : String, repository_id: Double, secret_name: String): Repositoryid = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repositoryid]
  }
  
  extension [Self <: Repositoryid](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
