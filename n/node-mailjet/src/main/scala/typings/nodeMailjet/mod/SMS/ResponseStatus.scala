package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseStatus extends js.Object {
  val Code: Double
  val Description: String
  val Name: String
}

object ResponseStatus {
  @scala.inline
  def apply(Code: Double, Description: String, Name: String): ResponseStatus = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseStatus]
  }
}

