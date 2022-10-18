package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenGraphVideoActors extends StObject {
  
  var profile: String
  
  var role: js.UndefOr[String] = js.undefined
}
object OpenGraphVideoActors {
  
  inline def apply(profile: String): OpenGraphVideoActors = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGraphVideoActors]
  }
  
  extension [Self <: OpenGraphVideoActors](x: Self) {
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
