package typings
package phoneDashFormatterLib.phoneDashFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  var normalize: scala.Boolean
}

object FormatOptions {
  @scala.inline
  def apply(normalize: scala.Boolean): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("normalize")(normalize)
    __obj.asInstanceOf[FormatOptions]
  }
}

