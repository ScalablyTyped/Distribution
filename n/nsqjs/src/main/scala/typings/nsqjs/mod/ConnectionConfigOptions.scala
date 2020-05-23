package typings.nsqjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfigOptions extends js.Object {
  var authSecret: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var deflate: js.UndefOr[Boolean] = js.undefined
  var deflateLevel: js.UndefOr[Double] = js.undefined
  var heartbeatInterval: js.UndefOr[Double] = js.undefined
  var maxInFlight: js.UndefOr[Double] = js.undefined
  var messageTimeout: js.UndefOr[Double] = js.undefined
  var outputBufferSize: js.UndefOr[Double] = js.undefined
  var outputBufferTimeout: js.UndefOr[Double] = js.undefined
  var requeueDelay: js.UndefOr[Double] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
  var snappy: js.UndefOr[Boolean] = js.undefined
  var tls: js.UndefOr[Boolean] = js.undefined
  var tlsVerification: js.UndefOr[Boolean] = js.undefined
}

object ConnectionConfigOptions {
  @scala.inline
  def apply(
    authSecret: String = null,
    clientId: String = null,
    deflate: js.UndefOr[Boolean] = js.undefined,
    deflateLevel: js.UndefOr[Double] = js.undefined,
    heartbeatInterval: js.UndefOr[Double] = js.undefined,
    maxInFlight: js.UndefOr[Double] = js.undefined,
    messageTimeout: js.UndefOr[Double] = js.undefined,
    outputBufferSize: js.UndefOr[Double] = js.undefined,
    outputBufferTimeout: js.UndefOr[Double] = js.undefined,
    requeueDelay: js.UndefOr[Double] = js.undefined,
    sampleRate: js.UndefOr[Double] = js.undefined,
    snappy: js.UndefOr[Boolean] = js.undefined,
    tls: js.UndefOr[Boolean] = js.undefined,
    tlsVerification: js.UndefOr[Boolean] = js.undefined
  ): ConnectionConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (authSecret != null) __obj.updateDynamic("authSecret")(authSecret.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(deflate)) __obj.updateDynamic("deflate")(deflate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deflateLevel)) __obj.updateDynamic("deflateLevel")(deflateLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatInterval)) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInFlight)) __obj.updateDynamic("maxInFlight")(maxInFlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageTimeout)) __obj.updateDynamic("messageTimeout")(messageTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outputBufferSize)) __obj.updateDynamic("outputBufferSize")(outputBufferSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outputBufferTimeout)) __obj.updateDynamic("outputBufferTimeout")(outputBufferTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requeueDelay)) __obj.updateDynamic("requeueDelay")(requeueDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snappy)) __obj.updateDynamic("snappy")(snappy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsVerification)) __obj.updateDynamic("tlsVerification")(tlsVerification.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfigOptions]
  }
}

