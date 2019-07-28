package typings.ngwysiwyg.ngWYSIWYGNs

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
    val __obj = js.Dynamic.literal(items = items, name = name)
  
    __obj.asInstanceOf[Toolbar]
  }
}

