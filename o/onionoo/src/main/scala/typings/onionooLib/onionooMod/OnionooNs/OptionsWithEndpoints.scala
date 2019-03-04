package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithEndpoints extends Options {
  /**
    * Array of endpoints to be returned as methods on the `Onionoo` instance.
    * @default ['summary', 'details', 'bandwidth', 'weights', 'clients', 'uptime']
    */
  var endpoints: js.Array[
    onionooLib.onionooLibStrings.summary | onionooLib.onionooLibStrings.details | onionooLib.onionooLibStrings.bandwidth | onionooLib.onionooLibStrings.weights | onionooLib.onionooLibStrings.clients | onionooLib.onionooLibStrings.uptime
  ]
}

object OptionsWithEndpoints {
  @scala.inline
  def apply(
    endpoints: js.Array[
      onionooLib.onionooLibStrings.summary | onionooLib.onionooLibStrings.details | onionooLib.onionooLibStrings.bandwidth | onionooLib.onionooLibStrings.weights | onionooLib.onionooLibStrings.clients | onionooLib.onionooLibStrings.uptime
    ],
    baseUrl: java.lang.String = null,
    cache: gotLib.gotMod.gotNs.Cache | onionooLib.onionooLibNumbers.`false` = null
  ): OptionsWithEndpoints = {
    val __obj = js.Dynamic.literal(endpoints = endpoints)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithEndpoints]
  }
}

