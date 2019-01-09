package typings
package oauthDashShimLib.oauthDashShimMod.oauthShimNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handler
  extends expressLib.expressMod.eNs.RequestHandler {
  var credentials: oauthDashShimLib.Anon_Cb = js.native
  var interpret: expressLib.expressMod.eNs.RequestHandler = js.native
  var proxy: expressLib.expressMod.eNs.RequestHandler = js.native
  var redirect: expressLib.expressMod.eNs.RequestHandler = js.native
  var unhandled: expressLib.expressMod.eNs.RequestHandler = js.native
  def init(configs: js.Array[Config]): scala.Unit = js.native
}

