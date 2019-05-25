package typings
package olLib.formatFilterFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def getTagName(): java.lang.String
}

object Filter {
  @scala.inline
  def apply(getTagName: () => java.lang.String): Filter = {
    val __obj = js.Dynamic.literal(getTagName = js.Any.fromFunction0(getTagName))
  
    __obj.asInstanceOf[Filter]
  }
}

