package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INetworkInformationService extends StObject {
  
  def clearOfflineWatch(): Unit
  
  def clearOnlineWatch(): Unit
  
  def getNetwork(): String
  
  def isOffline(): Boolean
  
  def isOnline(): Boolean
}
object INetworkInformationService {
  
  inline def apply(
    clearOfflineWatch: () => Unit,
    clearOnlineWatch: () => Unit,
    getNetwork: () => String,
    isOffline: () => Boolean,
    isOnline: () => Boolean
  ): INetworkInformationService = {
    val __obj = js.Dynamic.literal(clearOfflineWatch = js.Any.fromFunction0(clearOfflineWatch), clearOnlineWatch = js.Any.fromFunction0(clearOnlineWatch), getNetwork = js.Any.fromFunction0(getNetwork), isOffline = js.Any.fromFunction0(isOffline), isOnline = js.Any.fromFunction0(isOnline))
    __obj.asInstanceOf[INetworkInformationService]
  }
  
  extension [Self <: INetworkInformationService](x: Self) {
    
    inline def setClearOfflineWatch(value: () => Unit): Self = StObject.set(x, "clearOfflineWatch", js.Any.fromFunction0(value))
    
    inline def setClearOnlineWatch(value: () => Unit): Self = StObject.set(x, "clearOnlineWatch", js.Any.fromFunction0(value))
    
    inline def setGetNetwork(value: () => String): Self = StObject.set(x, "getNetwork", js.Any.fromFunction0(value))
    
    inline def setIsOffline(value: () => Boolean): Self = StObject.set(x, "isOffline", js.Any.fromFunction0(value))
    
    inline def setIsOnline(value: () => Boolean): Self = StObject.set(x, "isOnline", js.Any.fromFunction0(value))
  }
}
