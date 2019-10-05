package typings.nodeDashMailjet.nodeDashMailjetMod.SMS

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
    val __obj = js.Dynamic.literal(Code = Code, Description = Description, Name = Name)
  
    __obj.asInstanceOf[ResponseStatus]
  }
}

