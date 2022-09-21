package typings.nats.typesMod

import typings.nats.anon.PartialConsumerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerAPI extends StObject {
  
  def add(stream: String, cfg: PartialConsumerConfig): js.Promise[ConsumerInfo]
  
  def delete(stream: String, consumer: String): js.Promise[Boolean]
  
  def info(stream: String, consumer: String): js.Promise[ConsumerInfo]
  
  def list(stream: String): Lister[ConsumerInfo]
  
  def update(stream: String, durable: String, cfg: ConsumerUpdateConfig): js.Promise[ConsumerInfo]
}
object ConsumerAPI {
  
  inline def apply(
    add: (String, PartialConsumerConfig) => js.Promise[ConsumerInfo],
    delete: (String, String) => js.Promise[Boolean],
    info: (String, String) => js.Promise[ConsumerInfo],
    list: String => Lister[ConsumerInfo],
    update: (String, String, ConsumerUpdateConfig) => js.Promise[ConsumerInfo]
  ): ConsumerAPI = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), delete = js.Any.fromFunction2(delete), info = js.Any.fromFunction2(info), list = js.Any.fromFunction1(list), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[ConsumerAPI]
  }
  
  extension [Self <: ConsumerAPI](x: Self) {
    
    inline def setAdd(value: (String, PartialConsumerConfig) => js.Promise[ConsumerInfo]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setDelete(value: (String, String) => js.Promise[Boolean]): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    inline def setInfo(value: (String, String) => js.Promise[ConsumerInfo]): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
    
    inline def setList(value: String => Lister[ConsumerInfo]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: (String, String, ConsumerUpdateConfig) => js.Promise[ConsumerInfo]): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
