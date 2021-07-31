package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transport extends StObject {
  
  /** The Pub/Sub topic and subscription that maybe created by Eventarc as delivery intermediary. */
  var pubsub: js.UndefOr[Pubsub] = js.undefined
}
object Transport {
  
  @scala.inline
  def apply(): Transport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transport]
  }
  
  @scala.inline
  implicit class TransportMutableBuilder[Self <: Transport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPubsub(value: Pubsub): Self = StObject.set(x, "pubsub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubUndefined: Self = StObject.set(x, "pubsub", js.undefined)
  }
}
