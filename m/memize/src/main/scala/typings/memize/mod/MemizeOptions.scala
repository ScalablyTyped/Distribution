package typings.memize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Memize options object.
  */
trait MemizeOptions extends js.Object {
  /**
    * Maximum size of the cache.
    */
  var maxSize: js.UndefOr[Double] = js.undefined
}

object MemizeOptions {
  @scala.inline
  def apply(maxSize: js.UndefOr[Double] = js.undefined): MemizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemizeOptions]
  }
}

