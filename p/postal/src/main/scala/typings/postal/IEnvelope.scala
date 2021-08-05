package typings.postal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnvelope[T] extends StObject {
  
  /*Uses DEFAULT_CHANNEL if no channel is provided*/
  var channel: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[T] = js.undefined
  
  var timeStamp: js.UndefOr[String] = js.undefined
  
  var topic: String
}
object IEnvelope {
  
  inline def apply[T](topic: String): IEnvelope[T] = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnvelope[T]]
  }
  
  extension [Self <: IEnvelope[?], T](x: Self & IEnvelope[T]) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setTimeStamp(value: String): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
