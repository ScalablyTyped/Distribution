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
    clearOfflineWatch: js.Function0[scala.Unit],
    clearOnlineWatch: js.Function0[scala.Unit],
    getNetwork: js.Function0[java.lang.String],
    isOffline: js.Function0[scala.Boolean],
    isOnline: js.Function0[scala.Boolean]
  ): INetworkInformationService = {
    val __obj = js.Dynamic.literal(clearOfflineWatch = clearOfflineWatch, clearOnlineWatch = clearOnlineWatch, getNetwork = getNetwork, isOffline = isOffline, isOnline = isOnline)
  
    __obj.asInstanceOf[INetworkInformationService]
  }
}

