package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerInfo extends StObject {
  
  var active: Nanos
  
  var current: Boolean
  
  var lag: Double
  
  var name: String
  
  var offline: Boolean
}
object PeerInfo {
  
  inline def apply(active: Nanos, current: Boolean, lag: Double, name: String, offline: Boolean): PeerInfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], lag = lag.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerInfo]
  }
  
  extension [Self <: PeerInfo](x: Self) {
    
    inline def setActive(value: Nanos): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setLag(value: Double): Self = StObject.set(x, "lag", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
  }
}
