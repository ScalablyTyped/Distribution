package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var referenceType: ReferenceType
}

object Reference {
  @scala.inline
  def apply(referenceType: ReferenceType): Reference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("referenceType")(referenceType)
    __obj.asInstanceOf[Reference]
  }
}

