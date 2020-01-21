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
    deflateLevel: Int | Double = null,
    heartbeatInterval: Int | Double = null,
    maxInFlight: Int | Double = null,
    messageTimeout: Int | Double = null,
    outputBufferSize: Int | Double = null,
    outputBufferTimeout: Int | Double = null,
    requeueDelay: Int | Double = null,
    sampleRate: Int | Double = null,
    snappy: js.UndefOr[Boolean] = js.undefined,
    tls: js.UndefOr[Boolean] = js.undefined,
    tlsVerification: js.UndefOr[Boolean] = js.undefined
  ): ConnectionConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (authSecret != null) __obj.updateDynamic("authSecret")(authSecret.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(deflate)) __obj.updateDynamic("deflate")(deflate.asInstanceOf[js.Any])
    if (deflateLevel != null) __obj.updateDynamic("deflateLevel")(deflateLevel.asInstanceOf[js.Any])
    if (heartbeatInterval != null) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.asInstanceOf[js.Any])
    if (maxInFlight != null) __obj.updateDynamic("maxInFlight")(maxInFlight.asInstanceOf[js.Any])
    if (messageTimeout != null) __obj.updateDynamic("messageTimeout")(messageTimeout.asInstanceOf[js.Any])
    if (outputBufferSize != null) __obj.updateDynamic("outputBufferSize")(outputBufferSize.asInstanceOf[js.Any])
    if (outputBufferTimeout != null) __obj.updateDynamic("outputBufferTimeout")(outputBufferTimeout.asInstanceOf[js.Any])
    if (requeueDelay != null) __obj.updateDynamic("requeueDelay")(requeueDelay.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (!js.isUndefined(snappy)) __obj.updateDynamic("snappy")(snappy.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsVerification)) __obj.updateDynamic("tlsVerification")(tlsVerification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfigOptions]
  }
}

