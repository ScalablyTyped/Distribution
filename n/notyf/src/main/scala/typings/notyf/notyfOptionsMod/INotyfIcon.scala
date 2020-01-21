package typings.notyf.notyfOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotyfIcon extends js.Object {
  var className: String
  var tagName: String
  var text: String
}

object INotyfIcon {
  @scala.inline
  def apply(className: String, tagName: String, text: String): INotyfIcon = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INotyfIcon]
  }
}

