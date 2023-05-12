package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameStringOrgStringRepositoryidNumber extends StObject {
  
  var name: String
  
  @JSName("org")
  var org_ : String
  
  var repository_id: Double
}
object NameStringOrgStringRepositoryidNumber {
  
  inline def apply(name: String, org_ : String, repository_id: Double): NameStringOrgStringRepositoryidNumber = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameStringOrgStringRepositoryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameStringOrgStringRepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
  }
}
