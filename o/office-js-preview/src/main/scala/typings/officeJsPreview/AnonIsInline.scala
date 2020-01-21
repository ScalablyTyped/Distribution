package typings.officeJsPreview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsInline extends js.Object {
  var isInline: Boolean
}

object AnonIsInline {
  @scala.inline
  def apply(isInline: Boolean): AnonIsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsInline]
  }
}

