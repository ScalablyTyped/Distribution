package typings.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkInformationService extends js.Object {
  def clearOfflineWatch(): Unit
  def clearOnlineWatch(): Unit
  def getNetwork(): String
  def isOffline(): Boolean
  def isOnline(): Boolean
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
}

