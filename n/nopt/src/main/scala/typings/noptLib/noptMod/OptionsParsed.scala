package typings
package noptLib.noptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsParsed
  extends /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var argv: noptLib.Anon_Cooked
}

object OptionsParsed {
  @scala.inline
  def apply(
    argv: noptLib.Anon_Cooked,
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): OptionsParsed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argv")(argv)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[OptionsParsed]
  }
}

