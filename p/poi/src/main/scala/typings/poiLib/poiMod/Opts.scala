package typings
package poiLib.poiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts
  extends /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var mode: Mode
  var `type`: java.lang.String
}

object Opts {
  @scala.inline
  def apply(
    mode: Mode,
    `type`: java.lang.String,
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Opts = {
    val __obj = js.Dynamic.literal(mode = mode)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Opts]
  }
}

