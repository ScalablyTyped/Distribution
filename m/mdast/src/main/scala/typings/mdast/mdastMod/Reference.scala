package typings.mdast.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends Association {
  var referenceType: ReferenceType
}

object Reference {
  @scala.inline
  def apply(identifier: String, referenceType: ReferenceType, label: String = null): Reference = {
    val __obj = js.Dynamic.literal(identifier = identifier, referenceType = referenceType)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Reference]
  }
}

