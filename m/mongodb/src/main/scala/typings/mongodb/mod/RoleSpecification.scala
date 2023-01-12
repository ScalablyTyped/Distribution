package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleSpecification extends StObject {
  
  /** The database this user's role should effect. */
  var db: String
  
  /**
    * A role grants privileges to perform sets of actions on defined resources.
    * A given role applies to the database on which it is defined and can grant access down to a collection level of granularity.
    */
  var role: String
}
object RoleSpecification {
  
  inline def apply(db: String, role: String): RoleSpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoleSpecification] (val x: Self) extends AnyVal {
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
