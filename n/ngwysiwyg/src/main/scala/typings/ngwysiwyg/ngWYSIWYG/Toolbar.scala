package typings.ngwysiwyg.ngWYSIWYG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toolbar extends js.Object {
  var items: js.Array[String]
  var name: String
}

object Toolbar {
  @scala.inline
  def apply(items: js.Array[String], name: String): Toolbar = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toolbar]
  }
}

