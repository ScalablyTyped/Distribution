package typings.nsqjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderConnectionConfigOptions extends ConnectionConfigOptions {
  var lookupdHTTPAddresses: js.UndefOr[String | js.Array[String]] = js.undefined
  var lookupdPollInterval: js.UndefOr[Double] = js.undefined
  var lookupdPollJitter: js.UndefOr[Double] = js.undefined
  var maxAttempts: js.UndefOr[Double] = js.undefined
  var maxBackoffDuration: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nsqdTCPAddresses: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ReaderConnectionConfigOptions {
  @scala.inline
  def apply(
    authSecret: String = null,
    clientId: String = null,
    deflate: js.UndefOr[Boolean] = js.undefined,
    deflateLevel: js.UndefOr[Double] = js.undefined,
    heartbeatInterval: js.UndefOr[Double] = js.undefined,
    lookupdHTTPAddresses: String | js.Array[String] = null,
    lookupdPollInterval: js.UndefOr[Double] = js.undefined,
    lookupdPollJitter: js.UndefOr[Double] = js.undefined,
    maxAttempts: js.UndefOr[Double] = js.undefined,
    maxBackoffDuration: js.UndefOr[Double] = js.undefined,
    maxInFlight: js.UndefOr[Double] = js.undefined,
    messageTimeout: js.UndefOr[Double] = js.undefined,
    name: String = null,
    nsqdTCPAddresses: String | js.Array[String] = null,
    outputBufferSize: js.UndefOr[Double] = js.undefined,
    outputBufferTimeout: js.UndefOr[Double] = js.undefined,
    requeueDelay: js.UndefOr[Double] = js.undefined,
    sampleRate: js.UndefOr[Double] = js.undefined,
    snappy: js.UndefOr[Boolean] = js.undefined,
    tls: js.UndefOr[Boolean] = js.undefined,
    tlsVerification: js.UndefOr[Boolean] = js.undefined
  ): ReaderConnectionConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (authSecret != null) __obj.updateDynamic("authSecret")(authSecret.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(deflate)) __obj.updateDynamic("deflate")(deflate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deflateLevel)) __obj.updateDynamic("deflateLevel")(deflateLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatInterval)) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.get.asInstanceOf[js.Any])
    if (lookupdHTTPAddresses != null) __obj.updateDynamic("lookupdHTTPAddresses")(lookupdHTTPAddresses.asInstanceOf[js.Any])
    if (!js.isUndefined(lookupdPollInterval)) __obj.updateDynamic("lookupdPollInterval")(lookupdPollInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lookupdPollJitter)) __obj.updateDynamic("lookupdPollJitter")(lookupdPollJitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttempts)) __obj.updateDynamic("maxAttempts")(maxAttempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBackoffDuration)) __obj.updateDynamic("maxBackoffDuration")(maxBackoffDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInFlight)) __obj.updateDynamic("maxInFlight")(maxInFlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(messageTimeout)) __obj.updateDynamic("messageTimeout")(messageTimeout.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nsqdTCPAddresses != null) __obj.updateDynamic("nsqdTCPAddresses")(nsqdTCPAddresses.asInstanceOf[js.Any])
    if (!js.isUndefined(outputBufferSize)) __obj.updateDynamic("outputBufferSize")(outputBufferSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outputBufferTimeout)) __obj.updateDynamic("outputBufferTimeout")(outputBufferTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requeueDelay)) __obj.updateDynamic("requeueDelay")(requeueDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snappy)) __obj.updateDynamic("snappy")(snappy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tlsVerification)) __obj.updateDynamic("tlsVerification")(tlsVerification.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderConnectionConfigOptions]
  }
}

