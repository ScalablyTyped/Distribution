package typings
package nsqjsLib.nsqjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfigOptions extends js.Object {
  var authSecret: js.UndefOr[java.lang.String] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var deflate: js.UndefOr[scala.Boolean] = js.undefined
  var deflateLevel: js.UndefOr[scala.Double] = js.undefined
  var heartbeatInterval: js.UndefOr[scala.Double] = js.undefined
  var maxInFlight: js.UndefOr[scala.Double] = js.undefined
  var messageTimeout: js.UndefOr[scala.Double] = js.undefined
  var outputBufferSize: js.UndefOr[scala.Double] = js.undefined
  var outputBufferTimeout: js.UndefOr[scala.Double] = js.undefined
  var requeueDelay: js.UndefOr[scala.Double] = js.undefined
  var sampleRate: js.UndefOr[scala.Double] = js.undefined
  var snappy: js.UndefOr[scala.Boolean] = js.undefined
  var tls: js.UndefOr[scala.Boolean] = js.undefined
  var tlsVerification: js.UndefOr[scala.Boolean] = js.undefined
}

object ConnectionConfigOptions {
  @scala.inline
  def apply(
    authSecret: java.lang.String = null,
    clientId: java.lang.String = null,
    deflate: js.UndefOr[scala.Boolean] = js.undefined,
    deflateLevel: scala.Int | scala.Double = null,
    heartbeatInterval: scala.Int | scala.Double = null,
    maxInFlight: scala.Int | scala.Double = null,
    messageTimeout: scala.Int | scala.Double = null,
    outputBufferSize: scala.Int | scala.Double = null,
    outputBufferTimeout: scala.Int | scala.Double = null,
    requeueDelay: scala.Int | scala.Double = null,
    sampleRate: scala.Int | scala.Double = null,
    snappy: js.UndefOr[scala.Boolean] = js.undefined,
    tls: js.UndefOr[scala.Boolean] = js.undefined,
    tlsVerification: js.UndefOr[scala.Boolean] = js.undefined
  ): ConnectionConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (authSecret != null) __obj.updateDynamic("authSecret")(authSecret)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (!js.isUndefined(deflate)) __obj.updateDynamic("deflate")(deflate)
    if (deflateLevel != null) __obj.updateDynamic("deflateLevel")(deflateLevel.asInstanceOf[js.Any])
    if (heartbeatInterval != null) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.asInstanceOf[js.Any])
    if (maxInFlight != null) __obj.updateDynamic("maxInFlight")(maxInFlight.asInstanceOf[js.Any])
    if (messageTimeout != null) __obj.updateDynamic("messageTimeout")(messageTimeout.asInstanceOf[js.Any])
    if (outputBufferSize != null) __obj.updateDynamic("outputBufferSize")(outputBufferSize.asInstanceOf[js.Any])
    if (outputBufferTimeout != null) __obj.updateDynamic("outputBufferTimeout")(outputBufferTimeout.asInstanceOf[js.Any])
    if (requeueDelay != null) __obj.updateDynamic("requeueDelay")(requeueDelay.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (!js.isUndefined(snappy)) __obj.updateDynamic("snappy")(snappy)
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls)
    if (!js.isUndefined(tlsVerification)) __obj.updateDynamic("tlsVerification")(tlsVerification)
    __obj.asInstanceOf[ConnectionConfigOptions]
  }
}

