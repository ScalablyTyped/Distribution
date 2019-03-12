package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkInformationService extends js.Object {
  def clearOfflineWatch(): scala.Unit
  def clearOnlineWatch(): scala.Unit
  def getNetwork(): java.lang.String
  def isOffline(): scala.Boolean
  def isOnline(): scala.Boolean
}

object INetworkInformationService {
  @scala.inline
  def apply(
    clearOfflineWatch: () => scala.Unit,
    clearOnlineWatch: () => scala.Unit,
    getNetwork: () => java.lang.String,
    isOffline: () => scala.Boolean,
    isOnline: () => scala.Boolean
  ): INetworkInformationService = {
    val __obj = js.Dynamic.literal(clearOfflineWatch = js.Any.fromFunction0(clearOfflineWatch), clearOnlineWatch = js.Any.fromFunction0(clearOnlineWatch), getNetwork = js.Any.fromFunction0(getNetwork), isOffline = js.Any.fromFunction0(isOffline), isOnline = js.Any.fromFunction0(isOnline))
  
    __obj.asInstanceOf[INetworkInformationService]
  }
}

