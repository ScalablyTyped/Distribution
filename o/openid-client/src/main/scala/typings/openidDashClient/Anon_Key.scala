package typings.openidDashClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var `x5t#S256`: js.UndefOr[String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, `x5t#S256`: String = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`x5t#S256` != null) __obj.updateDynamic("x5t#S256")(`x5t#S256`)
    __obj.asInstanceOf[Anon_Key]
  }
}

