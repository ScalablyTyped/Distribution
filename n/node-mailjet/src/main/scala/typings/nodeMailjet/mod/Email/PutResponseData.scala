package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutResponseData extends js.Object {
  val Count: Double
  val Data: js.Array[js.Object]
  val Total: Double
}

object PutResponseData {
  @scala.inline
  def apply(Count: Double, Data: js.Array[js.Object], Total: Double): PutResponseData = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Total = Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResponseData]
  }
}

