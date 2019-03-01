package typings
package ngwysiwygLib.ngWYSIWYGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Toolbar extends js.Object {
  var items: js.Array[java.lang.String]
  var name: java.lang.String
}

object Toolbar {
  @scala.inline
  def apply(items: js.Array[java.lang.String], name: java.lang.String): Toolbar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Toolbar]
  }
}

