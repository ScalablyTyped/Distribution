package typings.npmKeyword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Limits the amount of results.
  		@default 250
  		*/
  val size: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(size: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

