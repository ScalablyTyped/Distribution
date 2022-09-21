package typings.nats.typesMod

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JetStreamManager extends StObject {
  
  def advisories(): AsyncIterable[Advisory]
  
  var consumers: ConsumerAPI
  
  def getAccountInfo(): js.Promise[JetStreamAccountStats]
  
  var streams: StreamAPI
}
object JetStreamManager {
  
  inline def apply(
    advisories: () => AsyncIterable[Advisory],
    consumers: ConsumerAPI,
    getAccountInfo: () => js.Promise[JetStreamAccountStats],
    streams: StreamAPI
  ): JetStreamManager = {
    val __obj = js.Dynamic.literal(advisories = js.Any.fromFunction0(advisories), consumers = consumers.asInstanceOf[js.Any], getAccountInfo = js.Any.fromFunction0(getAccountInfo), streams = streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[JetStreamManager]
  }
  
  extension [Self <: JetStreamManager](x: Self) {
    
    inline def setAdvisories(value: () => AsyncIterable[Advisory]): Self = StObject.set(x, "advisories", js.Any.fromFunction0(value))
    
    inline def setConsumers(value: ConsumerAPI): Self = StObject.set(x, "consumers", value.asInstanceOf[js.Any])
    
    inline def setGetAccountInfo(value: () => js.Promise[JetStreamAccountStats]): Self = StObject.set(x, "getAccountInfo", js.Any.fromFunction0(value))
    
    inline def setStreams(value: StreamAPI): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
  }
}
