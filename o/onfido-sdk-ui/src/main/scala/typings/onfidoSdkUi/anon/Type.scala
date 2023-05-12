package typings.onfidoSdkUi.anon

import typings.onfidoSdkUi.mod.ChallengePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with ChallengePayload {
  
  var query: String
  
  var `type`: /* "movement" */ String
}
object Type {
  
  inline def apply(query: String, `type`: /* "movement" */ String): Type = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "movement" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
