package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseStatus extends js.Object {
  val Code: scala.Double
  val Description: java.lang.String
  val Name: java.lang.String
}

object ResponseStatus {
  @scala.inline
  def apply(Code: scala.Double, Description: java.lang.String, Name: java.lang.String): ResponseStatus = {
    val __obj = js.Dynamic.literal(Code = Code, Description = Description, Name = Name)
  
    __obj.asInstanceOf[ResponseStatus]
  }
}

