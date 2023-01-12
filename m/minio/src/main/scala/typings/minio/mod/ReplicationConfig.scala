package typings.minio.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationConfig
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var role: String
  
  var rules: js.Array[Any]
}
object ReplicationConfig {
  
  inline def apply(role: String, rules: js.Array[Any]): ReplicationConfig = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationConfig] (val x: Self) extends AnyVal {
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRules(value: js.Array[Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: Any*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
