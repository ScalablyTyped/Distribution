package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * String to use as the base url for all API requests.
    * @default 'https://onionoo.torproject.org'
    */
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Storage adapter instance for storing cached data.
    * @default false
    */
  var cache: js.UndefOr[gotLib.gotMod.gotNs.Cache | onionooLib.onionooLibNumbers.`false`] = js.undefined
}

