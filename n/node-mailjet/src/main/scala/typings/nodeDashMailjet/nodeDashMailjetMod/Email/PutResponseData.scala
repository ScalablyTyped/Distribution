package typings.nodeDashMailjet.nodeDashMailjetMod.Email

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
    val __obj = js.Dynamic.literal(Count = Count, Data = Data, Total = Total)
  
    __obj.asInstanceOf[PutResponseData]
  }
}

