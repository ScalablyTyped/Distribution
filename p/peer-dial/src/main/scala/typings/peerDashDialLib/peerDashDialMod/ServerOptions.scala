package typings
package peerDashDialLib.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var corsAllowOrigins: java.lang.String | scala.Boolean
  var delegate: Delegate
  var expressApp: expressLib.expressMod.eNs.Express
  var extraHeaders: js.UndefOr[js.Object] = js.undefined
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var manufacturer: java.lang.String
  var maxContentLength: js.UndefOr[scala.Double] = js.undefined
  var modelName: java.lang.String
  var port: scala.Double
  var prefix: java.lang.String
  var uuid: js.UndefOr[nodeDashUuidLib.nodeDashUuidMod.UUIDOptions] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    corsAllowOrigins: java.lang.String | scala.Boolean,
    delegate: Delegate,
    expressApp: expressLib.expressMod.eNs.Express,
    manufacturer: java.lang.String,
    modelName: java.lang.String,
    port: scala.Double,
    prefix: java.lang.String,
    extraHeaders: js.Object = null,
    friendlyName: java.lang.String = null,
    host: java.lang.String = null,
    maxContentLength: scala.Int | scala.Double = null,
    uuid: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("corsAllowOrigins")(corsAllowOrigins.asInstanceOf[js.Any])
    __obj.updateDynamic("delegate")(delegate)
    __obj.updateDynamic("expressApp")(expressApp)
    __obj.updateDynamic("manufacturer")(manufacturer)
    __obj.updateDynamic("modelName")(modelName)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("prefix")(prefix)
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (host != null) __obj.updateDynamic("host")(host)
    if (maxContentLength != null) __obj.updateDynamic("maxContentLength")(maxContentLength.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[ServerOptions]
  }
}

