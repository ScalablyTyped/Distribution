package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SessionOptions extends js.Object {
  var maxDeflateDynamicTableSize: js.UndefOr[scala.Double] = js.undefined
  var maxReservedRemoteStreams: js.UndefOr[scala.Double] = js.undefined
  var maxSendHeaderBlockLength: js.UndefOr[scala.Double] = js.undefined
  var paddingStrategy: js.UndefOr[scala.Double] = js.undefined
  var peerMaxConcurrentStreams: js.UndefOr[scala.Double] = js.undefined
  var selectPadding: js.UndefOr[
    js.Function2[/* frameLen */ scala.Double, /* maxFrameLen */ scala.Double, scala.Double]
  ] = js.undefined
  var settings: js.UndefOr[Settings] = js.undefined
}

