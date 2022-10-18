package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgRepositoryid extends StObject {
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  /** The unique identifier of the repository. */
  var repository_id: Double
}
object OrgRepositoryid {
  
  inline def apply(org_ : String, repository_id: Double): OrgRepositoryid = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgRepositoryid]
  }
  
  extension [Self <: OrgRepositoryid](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
  }
}
