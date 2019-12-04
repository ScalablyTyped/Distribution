package typings.ol.styleAtlasManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var initialSize: js.UndefOr[Double] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var space: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(initialSize: Int | Double = null, maxSize: Int | Double = null, space: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (initialSize != null) __obj.updateDynamic("initialSize")(initialSize.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

