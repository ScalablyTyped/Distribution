package typings.onfidoSdkUi.anon

import typings.onfidoSdkUi.mod.ChallengePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query
  extends StObject
     with ChallengePayload {
  
  var query: js.Array[Double]
  
  var `type`: /* "recite" */ String
}
object Query {
  
  inline def apply(query: js.Array[Double], `type`: /* "recite" */ String): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: js.Array[Double]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryVarargs(value: Double*): Self = StObject.set(x, "query", js.Array(value*))
    
    inline def setType(value: /* "recite" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
