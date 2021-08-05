package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Broadcast extends StObject {
  
  var broadcastUrls: BroadcastUrlsResponse
  
  var id: String
  
  var status: String
}
object Broadcast {
  
  inline def apply(broadcastUrls: BroadcastUrlsResponse, id: String, status: String): Broadcast = {
    val __obj = js.Dynamic.literal(broadcastUrls = broadcastUrls.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadcast]
  }
  
  extension [Self <: Broadcast](x: Self) {
    
    inline def setBroadcastUrls(value: BroadcastUrlsResponse): Self = StObject.set(x, "broadcastUrls", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
