package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pull extends StObject {
  
  var admin: Boolean
  
  var maintain: Boolean
  
  var pull: Boolean
  
  var push: Boolean
  
  var triage: Boolean
}
object Pull {
  
  inline def apply(admin: Boolean, maintain: Boolean, pull: Boolean, push: Boolean, triage: Boolean): Pull = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], maintain = maintain.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], triage = triage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pull]
  }
  
  extension [Self <: Pull](x: Self) {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setMaintain(value: Boolean): Self = StObject.set(x, "maintain", value.asInstanceOf[js.Any])
    
    inline def setPull(value: Boolean): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
    
    inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setTriage(value: Boolean): Self = StObject.set(x, "triage", value.asInstanceOf[js.Any])
  }
}
