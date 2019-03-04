package typings
package atOracleOraclejetLib.ojcompositeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModelContext extends js.Object {
  var element: stdLib.Element
  var properties: js.Object
  var slotCounts: js.Object
  var unique: java.lang.String
  var uniqueId: java.lang.String
}

object ViewModelContext {
  @scala.inline
  def apply(
    element: stdLib.Element,
    properties: js.Object,
    slotCounts: js.Object,
    unique: java.lang.String,
    uniqueId: java.lang.String
  ): ViewModelContext = {
    val __obj = js.Dynamic.literal(element = element, properties = properties, slotCounts = slotCounts, unique = unique, uniqueId = uniqueId)
  
    __obj.asInstanceOf[ViewModelContext]
  }
}

