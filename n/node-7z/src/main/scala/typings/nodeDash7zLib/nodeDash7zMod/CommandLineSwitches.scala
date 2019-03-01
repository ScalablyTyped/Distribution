package typings
package nodeDash7zLib.nodeDash7zMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Options are mapped to the 7z program so there is no idea to define all possible types here
trait CommandLineSwitches
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var raw: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CommandLineSwitches {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    raw: js.Array[java.lang.String] = null
  ): CommandLineSwitches = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[CommandLineSwitches]
  }
}

