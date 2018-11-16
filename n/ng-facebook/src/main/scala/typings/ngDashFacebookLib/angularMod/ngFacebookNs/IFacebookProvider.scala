package typings
package ngDashFacebookLib.angularMod.ngFacebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFacebookProvider extends js.Object {
  def getAppId(): java.lang.String = js.native
  def getCustomInit(): fbLib.FBInitParams = js.native
  def getPermissions(): java.lang.String = js.native
  def getVersion(): java.lang.String = js.native
  def setAppId(appId: java.lang.String): IFacebookProvider = js.native
  def setCustomInit(customInit: fbLib.FBInitParams): IFacebookProvider = js.native
  def setPermissions(permissions: java.lang.String): IFacebookProvider = js.native
  def setPermissions(permissions: js.Array[java.lang.String]): IFacebookProvider = js.native
  def setVersion(version: java.lang.String): IFacebookProvider = js.native
}

