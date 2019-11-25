package typings.nodeDashRal.nodeDashRalMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeDashRal.nodeDashRalStrings.GBK
import typings.nodeDashRal.nodeDashRalStrings.GET
import typings.nodeDashRal.nodeDashRalStrings.POST
import typings.nodeDashRal.nodeDashRalStrings.`utf-8`
import typings.nodeDashRal.nodeDashRalStrings.hashring
import typings.nodeDashRal.nodeDashRalStrings.http
import typings.nodeDashRal.nodeDashRalStrings.https
import typings.nodeDashRal.nodeDashRalStrings.random
import typings.nodeDashRal.nodeDashRalStrings.redis
import typings.nodeDashRal.nodeDashRalStrings.roundrobin
import typings.nodeDashRal.nodeDashRalStrings.soap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var balance: random | roundrobin | hashring
  var data: js.UndefOr[js.Any] = js.undefined
  var encoding: js.UndefOr[`utf-8` | GBK] = js.undefined
  var headers: js.UndefOr[StringDictionary[String | Double]] = js.undefined
  var hybird: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[GET | POST] = js.undefined
  var pack: buildInConverter
  var path: js.UndefOr[String] = js.undefined
  var protocol: http | https | soap | redis
  var query: js.UndefOr[js.Any] = js.undefined
  var retry: js.UndefOr[Double] = js.undefined
  var server: js.Array[Server]
  var timeout: js.UndefOr[Double] = js.undefined
  var unpack: buildInConverter
}

object Service {
  @scala.inline
  def apply(
    balance: random | roundrobin | hashring,
    pack: buildInConverter,
    protocol: http | https | soap | redis,
    server: js.Array[Server],
    unpack: buildInConverter,
    data: js.Any = null,
    encoding: `utf-8` | GBK = null,
    headers: StringDictionary[String | Double] = null,
    hybird: js.UndefOr[Boolean] = js.undefined,
    method: GET | POST = null,
    path: String = null,
    query: js.Any = null,
    retry: Int | Double = null,
    timeout: Int | Double = null
  ): Service = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], pack = pack.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], unpack = unpack.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(hybird)) __obj.updateDynamic("hybird")(hybird.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

