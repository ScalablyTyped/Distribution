package typings.nopt.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nopt.anon.Cooked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsParsed
  extends /* k */ StringDictionary[js.Any] {
  var argv: Cooked
}

object OptionsParsed {
  @scala.inline
  def apply(argv: Cooked, StringDictionary: /* name */ StringDictionary[js.Any] = null): OptionsParsed = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[OptionsParsed]
  }
}

