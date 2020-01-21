package typings.onionoo.mod.Onionoo

import typings.got.mod.Cache
import typings.onionoo.onionooBooleans.`false`
import typings.onionoo.onionooStrings.bandwidth
import typings.onionoo.onionooStrings.clients
import typings.onionoo.onionooStrings.details
import typings.onionoo.onionooStrings.summary
import typings.onionoo.onionooStrings.uptime
import typings.onionoo.onionooStrings.weights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithEndpoints extends Options {
  /**
    * Array of endpoints to be returned as methods on the `Onionoo` instance.
    * @default ['summary', 'details', 'bandwidth', 'weights', 'clients', 'uptime']
    */
  var endpoints: js.Array[summary | details | bandwidth | weights | clients | uptime]
}

object OptionsWithEndpoints {
  @scala.inline
  def apply(
    endpoints: js.Array[summary | details | bandwidth | weights | clients | uptime],
    baseUrl: String = null,
    cache: Cache | `false` = null
  ): OptionsWithEndpoints = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithEndpoints]
  }
}

