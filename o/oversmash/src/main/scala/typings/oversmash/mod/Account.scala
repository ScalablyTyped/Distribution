package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var level: Double
  var platform: String
  var portrait: String
  var public: Boolean
}

object Account {
  @scala.inline
  def apply(level: Double, platform: String, portrait: String, public: Boolean, displayName: String = null): Account = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], portrait = portrait.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

