package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias extends StObject {
  
  /**
    * the system alias which will be used as the origin
    */
  var alias: String
  
  /**
    * the system's client
    */
  var client: String
  
  /**
    * setting this flag to 'true' overrides the already existing origin
    */
  var force: String
  
  /**
    * the system id which will be used as the origin
    */
  var system: String
}
object Alias {
  
  inline def apply(alias: String, client: String, force: String, system: String): Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setForce(value: String): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
  }
}
