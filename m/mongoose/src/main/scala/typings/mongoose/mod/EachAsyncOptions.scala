package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EachAsyncOptions extends js.Object {
  /** defaults to 1 */
  var parallel: js.UndefOr[Double] = js.undefined
}

object EachAsyncOptions {
  @scala.inline
  def apply(parallel: Int | Double = null): EachAsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachAsyncOptions]
  }
}

