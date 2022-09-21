package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transport extends StObject {
  
  /** The Pub/Sub topic and subscription used by Eventarc as a transport intermediary. */
  var pubsub: js.UndefOr[Pubsub] = js.undefined
}
object Transport {
  
  inline def apply(): Transport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transport]
  }
  
  extension [Self <: Transport](x: Self) {
    
    inline def setPubsub(value: Pubsub): Self = StObject.set(x, "pubsub", value.asInstanceOf[js.Any])
    
    inline def setPubsubUndefined: Self = StObject.set(x, "pubsub", js.undefined)
  }
}
