package typings.phaser

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDict
  extends /* _ */ StringDictionary[js.Any] {
  var name: js.UndefOr[String] = js.undefined
}

object AnonDict {
  @scala.inline
  def apply(StringDictionary: /* _ */ StringDictionary[js.Any] = null, name: String = null): AnonDict = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDict]
  }
}

