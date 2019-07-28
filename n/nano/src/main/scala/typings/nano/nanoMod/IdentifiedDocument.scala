package typings.nano.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifiedDocument extends js.Object {
  var _id: String
}

object IdentifiedDocument {
  @scala.inline
  def apply(_id: String): IdentifiedDocument = {
    val __obj = js.Dynamic.literal(_id = _id)
  
    __obj.asInstanceOf[IdentifiedDocument]
  }
}

