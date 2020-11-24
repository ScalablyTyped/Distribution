package typings.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INetworkInformationService extends js.Object {
  
  def clearOfflineWatch(): Unit = js.native
  
  def clearOnlineWatch(): Unit = js.native
  
  def getNetwork(): String = js.native
  
  def isOffline(): Boolean = js.native
  
  def isOnline(): Boolean = js.native
}
object INetworkInformationService {
  
  @scala.inline
  def apply(
    clearOfflineWatch: () => Unit,
    clearOnlineWatch: () => Unit,
    getNetwork: () => String,
    isOffline: () => Boolean,
    isOnline: () => Boolean
  ): INetworkInformationService = {
    val __obj = js.Dynamic.literal(clearOfflineWatch = js.Any.fromFunction0(clearOfflineWatch), clearOnlineWatch = js.Any.fromFunction0(clearOnlineWatch), getNetwork = js.Any.fromFunction0(getNetwork), isOffline = js.Any.fromFunction0(isOffline), isOnline = js.Any.fromFunction0(isOnline))
    __obj.asInstanceOf[INetworkInformationService]
  }
  
  @scala.inline
  implicit class INetworkInformationServiceOps[Self <: INetworkInformationService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearOfflineWatch(value: () => Unit): Self = this.set("clearOfflineWatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearOnlineWatch(value: () => Unit): Self = this.set("clearOnlineWatch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNetwork(value: () => String): Self = this.set("getNetwork", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOffline(value: () => Boolean): Self = this.set("isOffline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOnline(value: () => Boolean): Self = this.set("isOnline", js.Any.fromFunction0(value))
  }
}
