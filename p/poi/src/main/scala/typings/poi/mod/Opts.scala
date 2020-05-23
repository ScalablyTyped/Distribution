package typings.poi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts
  extends /* k */ StringDictionary[js.Any] {
  var mode: Mode
  var `type`: String
}

object Opts {
  @scala.inline
  def apply(mode: Mode, `type`: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): Opts = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Opts]
  }
}

