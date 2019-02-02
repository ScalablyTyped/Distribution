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

