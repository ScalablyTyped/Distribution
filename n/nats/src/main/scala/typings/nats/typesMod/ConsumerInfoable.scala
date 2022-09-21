package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerInfoable extends StObject {
  
  def consumerInfo(): js.Promise[ConsumerInfo]
}
object ConsumerInfoable {
  
  inline def apply(consumerInfo: () => js.Promise[ConsumerInfo]): ConsumerInfoable = {
    val __obj = js.Dynamic.literal(consumerInfo = js.Any.fromFunction0(consumerInfo))
    __obj.asInstanceOf[ConsumerInfoable]
  }
  
  extension [Self <: ConsumerInfoable](x: Self) {
    
    inline def setConsumerInfo(value: () => js.Promise[ConsumerInfo]): Self = StObject.set(x, "consumerInfo", js.Any.fromFunction0(value))
  }
}
