package typings.pDebounce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Call the `fn` on the [leading edge of the timeout](https://css-tricks.com/debouncing-throttling-explained-examples/#article-header-id-1). Meaning immediately, instead of waiting for `wait` milliseconds.
  		@default false
  		*/
  val leading: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(leading: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

