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

