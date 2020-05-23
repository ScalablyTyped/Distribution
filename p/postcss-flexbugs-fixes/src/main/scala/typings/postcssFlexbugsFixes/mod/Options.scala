package typings.postcssFlexbugsFixes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * @default true
    */
  var bug4: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var bug6: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var bug81a: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bug4: js.UndefOr[Boolean] = js.undefined,
    bug6: js.UndefOr[Boolean] = js.undefined,
    bug81a: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bug4)) __obj.updateDynamic("bug4")(bug4.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bug6)) __obj.updateDynamic("bug6")(bug6.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bug81a)) __obj.updateDynamic("bug81a")(bug81a.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

