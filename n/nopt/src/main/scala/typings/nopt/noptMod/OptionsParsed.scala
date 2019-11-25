package typings.nopt.noptMod

import org.scalablytyped.runtime.StringDictionary
import typings.nopt.Anon_Cooked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsParsed
  extends /* k */ StringDictionary[js.Any] {
  var argv: Anon_Cooked
}

object OptionsParsed {
  @scala.inline
  def apply(argv: Anon_Cooked, StringDictionary: /* k */ StringDictionary[js.Any] = null): OptionsParsed = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[OptionsParsed]
  }
}

