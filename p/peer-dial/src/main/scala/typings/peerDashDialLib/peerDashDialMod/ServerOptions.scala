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

