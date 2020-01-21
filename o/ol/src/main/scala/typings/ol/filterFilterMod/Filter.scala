package typings.ol.filterFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def getTagName(): String
}

object Filter {
  @scala.inline
  def apply(getTagName: () => String): Filter = {
    val __obj = js.Dynamic.literal(getTagName = js.Any.fromFunction0(getTagName))
  
    __obj.asInstanceOf[Filter]
  }
}

