package typings
package memLib.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cache: js.UndefOr[js.Any] = js.undefined
  var cacheKey: js.UndefOr[js.Function1[/* repeated */ js.Any, java.lang.String]] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cache: js.Any = null,
    cacheKey: /* repeated */ js.Any => java.lang.String = null,
    maxAge: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(js.Any.fromFunction1(cacheKey))
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

