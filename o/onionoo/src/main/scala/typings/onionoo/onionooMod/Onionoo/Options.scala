package typings.onionoo.onionooMod.Onionoo

import typings.got.gotMod.Cache
import typings.onionoo.onionooNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * String to use as the base url for all API requests.
    * @default 'https://onionoo.torproject.org'
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
    * Storage adapter instance for storing cached data.
    * @default false
    */
  var cache: js.UndefOr[Cache | `false`] = js.undefined
}

object Options {
  @scala.inline
  def apply(baseUrl: String = null, cache: Cache | `false` = null): Options = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

