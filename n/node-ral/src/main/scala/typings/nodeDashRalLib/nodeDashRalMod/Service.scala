package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var balance: nodeDashRalLib.nodeDashRalLibStrings.random | nodeDashRalLib.nodeDashRalLibStrings.roundrobin | nodeDashRalLib.nodeDashRalLibStrings.hashring
  var data: js.UndefOr[js.Any] = js.undefined
  var encoding: js.UndefOr[
    nodeDashRalLib.nodeDashRalLibStrings.`utf-8` | nodeDashRalLib.nodeDashRalLibStrings.GBK
  ] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]] = js.undefined
  var hybird: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[
    nodeDashRalLib.nodeDashRalLibStrings.GET | nodeDashRalLib.nodeDashRalLibStrings.POST
  ] = js.undefined
  var pack: buildInConverter
  var path: js.UndefOr[java.lang.String] = js.undefined
  var protocol: nodeDashRalLib.nodeDashRalLibStrings.http | nodeDashRalLib.nodeDashRalLibStrings.https | nodeDashRalLib.nodeDashRalLibStrings.soap | nodeDashRalLib.nodeDashRalLibStrings.redis
  var query: js.UndefOr[js.Any] = js.undefined
  var retry: js.UndefOr[scala.Double] = js.undefined
  var server: js.Array[Server]
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var unpack: buildInConverter
}

object Service {
  @scala.inline
  def apply(
    balance: nodeDashRalLib.nodeDashRalLibStrings.random | nodeDashRalLib.nodeDashRalLibStrings.roundrobin | nodeDashRalLib.nodeDashRalLibStrings.hashring,
    pack: buildInConverter,
    protocol: nodeDashRalLib.nodeDashRalLibStrings.http | nodeDashRalLib.nodeDashRalLibStrings.https | nodeDashRalLib.nodeDashRalLibStrings.soap | nodeDashRalLib.nodeDashRalLibStrings.redis,
    server: js.Array[Server],
    unpack: buildInConverter,
    data: js.Any = null,
    encoding: nodeDashRalLib.nodeDashRalLibStrings.`utf-8` | nodeDashRalLib.nodeDashRalLibStrings.GBK = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double] = null,
    hybird: js.UndefOr[scala.Boolean] = js.undefined,
    method: nodeDashRalLib.nodeDashRalLibStrings.GET | nodeDashRalLib.nodeDashRalLibStrings.POST = null,
    path: java.lang.String = null,
    query: js.Any = null,
    retry: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): Service = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], pack = pack, protocol = protocol.asInstanceOf[js.Any], server = server, unpack = unpack)
    if (data != null) __obj.updateDynamic("data")(data)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(hybird)) __obj.updateDynamic("hybird")(hybird)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (query != null) __obj.updateDynamic("query")(query)
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

