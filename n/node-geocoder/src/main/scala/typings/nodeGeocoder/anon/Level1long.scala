package typings.nodeGeocoder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level1long extends js.Object {
  var level1long: js.UndefOr[String] = js.undefined
  var level1short: js.UndefOr[String] = js.undefined
  var level2long: js.UndefOr[String] = js.undefined
  var level2short: js.UndefOr[String] = js.undefined
}

object Level1long {
  @scala.inline
  def apply(
    level1long: String = null,
    level1short: String = null,
    level2long: String = null,
    level2short: String = null
  ): Level1long = {
    val __obj = js.Dynamic.literal()
    if (level1long != null) __obj.updateDynamic("level1long")(level1long.asInstanceOf[js.Any])
    if (level1short != null) __obj.updateDynamic("level1short")(level1short.asInstanceOf[js.Any])
    if (level2long != null) __obj.updateDynamic("level2long")(level2long.asInstanceOf[js.Any])
    if (level2short != null) __obj.updateDynamic("level2short")(level2short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level1long]
  }
}

