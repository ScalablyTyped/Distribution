package typings.nodeDash7z.nodeDash7zMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Options are mapped to the 7z program so there is no idea to define all possible types here
trait CommandLineSwitches
  extends /* key */ StringDictionary[js.Any] {
  var raw: js.UndefOr[js.Array[String]] = js.undefined
}

object CommandLineSwitches {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, raw: js.Array[String] = null): CommandLineSwitches = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineSwitches]
  }
}

