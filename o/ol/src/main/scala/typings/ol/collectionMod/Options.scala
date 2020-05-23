package typings.ol.collectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var unique: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(unique: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

