package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonElementParentNode extends js.Object {
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  def getElementById(elementId: java.lang.String): Element | scala.Null
}

object NonElementParentNode {
  @scala.inline
  def apply(getElementById: js.Function1[java.lang.String, Element | scala.Null]): NonElementParentNode = {
    val __obj = js.Dynamic.literal(getElementById = getElementById)
  
    __obj.asInstanceOf[NonElementParentNode]
  }
}

