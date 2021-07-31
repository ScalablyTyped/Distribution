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
  
  @scala.inline
  def apply(uuid: String): SubscribeData = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeData]
  }
  
  @scala.inline
  implicit class SubscribeDataMutableBuilder[Self <: SubscribeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
