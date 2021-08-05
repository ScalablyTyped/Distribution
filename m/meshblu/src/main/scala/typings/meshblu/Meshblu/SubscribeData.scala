package typings.meshblu.Meshblu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeData extends StObject {
  
  var topics: js.UndefOr[js.Array[String]] = js.undefined
  
  var types: js.UndefOr[js.Array[String]] = js.undefined
  
  var uuid: String
}
object SubscribeData {
  
  inline def apply(uuid: String): SubscribeData = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeData]
  }
  
  extension [Self <: SubscribeData](x: Self) {
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value :_*))
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
