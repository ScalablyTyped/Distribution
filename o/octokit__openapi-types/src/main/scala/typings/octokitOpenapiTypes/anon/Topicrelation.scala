package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topicrelation extends StObject {
  
  var topic_relation: js.UndefOr[Relationtype] = js.undefined
}
object Topicrelation {
  
  inline def apply(): Topicrelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Topicrelation]
  }
  
  extension [Self <: Topicrelation](x: Self) {
    
    inline def setTopic_relation(value: Relationtype): Self = StObject.set(x, "topic_relation", value.asInstanceOf[js.Any])
    
    inline def setTopic_relationUndefined: Self = StObject.set(x, "topic_relation", js.undefined)
  }
}
