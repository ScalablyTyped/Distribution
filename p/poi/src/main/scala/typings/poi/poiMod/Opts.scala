package typings.poi.poiMod

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
  def apply(mode: Mode, `type`: String, StringDictionary: /* k */ StringDictionary[js.Any] = null): Opts = {
    val __obj = js.Dynamic.literal(mode = mode)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Opts]
  }
}

