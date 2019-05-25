package typings
package olLib.xmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStackItem extends js.Object {
  var node: stdLib.Node
}

object NodeStackItem {
  @scala.inline
  def apply(node: stdLib.Node): NodeStackItem = {
    val __obj = js.Dynamic.literal(node = node)
  
    __obj.asInstanceOf[NodeStackItem]
  }
}

