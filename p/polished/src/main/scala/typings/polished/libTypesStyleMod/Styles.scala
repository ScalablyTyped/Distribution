package typings.polished.libTypesStyleMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styles extends /* ruleOrSelector */ StringDictionary[String | Double | Styles]

object Styles {
  @scala.inline
  def apply(StringDictionary: /* ruleOrSelector */ StringDictionary[String | Double | Styles] = null): Styles = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Styles]
  }
}

