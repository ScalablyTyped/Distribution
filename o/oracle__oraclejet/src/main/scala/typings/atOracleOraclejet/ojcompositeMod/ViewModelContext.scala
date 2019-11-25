package typings.atOracleOraclejet.ojcompositeMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModelContext extends js.Object {
  var element: Element
  var properties: js.Object
  var slotCounts: js.Object
  var unique: String
  var uniqueId: String
}

object ViewModelContext {
  @scala.inline
  def apply(element: Element, properties: js.Object, slotCounts: js.Object, unique: String, uniqueId: String): ViewModelContext = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], slotCounts = slotCounts.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewModelContext]
  }
}

