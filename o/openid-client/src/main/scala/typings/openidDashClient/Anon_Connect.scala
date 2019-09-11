package typings.openidDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connect extends js.Object {
  var connect: js.UndefOr[Double] = js.undefined
  var lookup: js.UndefOr[Double] = js.undefined
  var request: js.UndefOr[Double] = js.undefined
  var response: js.UndefOr[Double] = js.undefined
  var secureConnect: js.UndefOr[Double] = js.undefined
  var send: js.UndefOr[Double] = js.undefined
  var socket: js.UndefOr[Double] = js.undefined
}

object Anon_Connect {
  @scala.inline
  def apply(
    connect: Int | Double = null,
    lookup: Int | Double = null,
    request: Int | Double = null,
    response: Int | Double = null,
    secureConnect: Int | Double = null,
    send: Int | Double = null,
    socket: Int | Double = null
  ): Anon_Connect = {
    val __obj = js.Dynamic.literal()
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (secureConnect != null) __obj.updateDynamic("secureConnect")(secureConnect.asInstanceOf[js.Any])
    if (send != null) __obj.updateDynamic("send")(send.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Connect]
  }
}

