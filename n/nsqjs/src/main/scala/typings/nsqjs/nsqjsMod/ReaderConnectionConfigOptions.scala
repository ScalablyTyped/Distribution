package typings.nsqjs.nsqjsMod

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
    deflateLevel: Int | Double = null,
    heartbeatInterval: Int | Double = null,
    lookupdHTTPAddresses: String | js.Array[String] = null,
    lookupdPollInterval: Int | Double = null,
    lookupdPollJitter: Int | Double = null,
    maxAttempts: Int | Double = null,
    maxBackoffDuration: Int | Double = null,
    maxInFlight: Int | Double = null,
    messageTimeout: Int | Double = null,
    name: String = null,
    nsqdTCPAddresses: String | js.Array[String] = null,
    outputBufferSize: Int | Double = null,
    outputBufferTimeout: Int | Double = null,
    requeueDelay: Int | Double = null,
    sampleRate: Int | Double = null,
    snappy: js.UndefOr[Boolean] = js.undefined,
    tls: js.UndefOr[Boolean] = js.undefined,
    tlsVerification: js.UndefOr[Boolean] = js.undefined
  ): ReaderConnectionConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (authSecret != null) __obj.updateDynamic("authSecret")(authSecret)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (!js.isUndefined(deflate)) __obj.updateDynamic("deflate")(deflate)
    if (deflateLevel != null) __obj.updateDynamic("deflateLevel")(deflateLevel.asInstanceOf[js.Any])
    if (heartbeatInterval != null) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.asInstanceOf[js.Any])
    if (lookupdHTTPAddresses != null) __obj.updateDynamic("lookupdHTTPAddresses")(lookupdHTTPAddresses.asInstanceOf[js.Any])
    if (lookupdPollInterval != null) __obj.updateDynamic("lookupdPollInterval")(lookupdPollInterval.asInstanceOf[js.Any])
    if (lookupdPollJitter != null) __obj.updateDynamic("lookupdPollJitter")(lookupdPollJitter.asInstanceOf[js.Any])
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (maxBackoffDuration != null) __obj.updateDynamic("maxBackoffDuration")(maxBackoffDuration.asInstanceOf[js.Any])
    if (maxInFlight != null) __obj.updateDynamic("maxInFlight")(maxInFlight.asInstanceOf[js.Any])
    if (messageTimeout != null) __obj.updateDynamic("messageTimeout")(messageTimeout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (nsqdTCPAddresses != null) __obj.updateDynamic("nsqdTCPAddresses")(nsqdTCPAddresses.asInstanceOf[js.Any])
    if (outputBufferSize != null) __obj.updateDynamic("outputBufferSize")(outputBufferSize.asInstanceOf[js.Any])
    if (outputBufferTimeout != null) __obj.updateDynamic("outputBufferTimeout")(outputBufferTimeout.asInstanceOf[js.Any])
    if (requeueDelay != null) __obj.updateDynamic("requeueDelay")(requeueDelay.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (!js.isUndefined(snappy)) __obj.updateDynamic("snappy")(snappy)
    if (!js.isUndefined(tls)) __obj.updateDynamic("tls")(tls)
    if (!js.isUndefined(tlsVerification)) __obj.updateDynamic("tlsVerification")(tlsVerification)
    __obj.asInstanceOf[ReaderConnectionConfigOptions]
  }
}

