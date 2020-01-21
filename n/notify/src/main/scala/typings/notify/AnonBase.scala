package typings.notify

import org.scalablytyped.runtime.StringDictionary
import typings.notify.Notify.ClassCSS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase extends /* className */ StringDictionary[ClassCSS] {
  var base: js.UndefOr[ClassCSS] = js.undefined
}

object AnonBase {
  @scala.inline
  def apply(StringDictionary: /* className */ StringDictionary[ClassCSS] = null, base: ClassCSS = null): AnonBase = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase]
  }
}

