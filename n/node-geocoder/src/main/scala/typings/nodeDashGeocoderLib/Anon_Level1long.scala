package typings
package nodeDashGeocoderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level1long extends js.Object {
  var level1long: js.UndefOr[java.lang.String] = js.undefined
  var level1short: js.UndefOr[java.lang.String] = js.undefined
  var level2long: js.UndefOr[java.lang.String] = js.undefined
  var level2short: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Level1long {
  @scala.inline
  def apply(
    level1long: java.lang.String = null,
    level1short: java.lang.String = null,
    level2long: java.lang.String = null,
    level2short: java.lang.String = null
  ): Anon_Level1long = {
    val __obj = js.Dynamic.literal()
    if (level1long != null) __obj.updateDynamic("level1long")(level1long)
    if (level1short != null) __obj.updateDynamic("level1short")(level1short)
    if (level2long != null) __obj.updateDynamic("level2long")(level2long)
    if (level2short != null) __obj.updateDynamic("level2short")(level2short)
    __obj.asInstanceOf[Anon_Level1long]
  }
}

