package typings.notyf.notyfOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotyfIcon extends js.Object {
  var className: String
  var tagName: /* keyof notyf.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any
  var text: String
}

object INotyfIcon {
  @scala.inline
  def apply(
    className: String,
    tagName: /* keyof notyf.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any,
    text: String
  ): INotyfIcon = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotyfIcon]
  }
}

