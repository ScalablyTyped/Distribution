package typings.notify

import org.scalablytyped.runtime.StringDictionary
import typings.notify.Notify.ClassCSS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends /* className */ StringDictionary[ClassCSS] {
  var base: js.UndefOr[ClassCSS] = js.undefined
}

object Anon_Base {
  @scala.inline
  def apply(StringDictionary: /* className */ StringDictionary[ClassCSS] = null, base: ClassCSS = null): Anon_Base = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (base != null) __obj.updateDynamic("base")(base)
    __obj.asInstanceOf[Anon_Base]
  }
}

