package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerStats extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var nameEscaped: String
  var nameEscapedUrl: js.UndefOr[String] = js.undefined
  var platform: String
  var region: js.UndefOr[String] = js.undefined
  var stats: Stats
}

object PlayerStats {
  @scala.inline
  def apply(
    nameEscaped: String,
    platform: String,
    stats: Stats,
    name: String = null,
    nameEscapedUrl: String = null,
    region: String = null
  ): PlayerStats = {
    val __obj = js.Dynamic.literal(nameEscaped = nameEscaped.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameEscapedUrl != null) __obj.updateDynamic("nameEscapedUrl")(nameEscapedUrl.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerStats]
  }
}

