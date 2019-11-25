package typings.phoneDashFormatter.phoneDashFormatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  var normalize: Boolean
}

object FormatOptions {
  @scala.inline
  def apply(normalize: Boolean): FormatOptions = {
    val __obj = js.Dynamic.literal(normalize = normalize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormatOptions]
  }
}

