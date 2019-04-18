package typings
package nodeDashMailjetLib.nodeDashMailjetMod.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutResponseData extends js.Object {
  val Count: scala.Double
  val Data: js.Array[js.Object]
  val Total: scala.Double
}

object PutResponseData {
  @scala.inline
  def apply(Count: scala.Double, Data: js.Array[js.Object], Total: scala.Double): PutResponseData = {
    val __obj = js.Dynamic.literal(Count = Count, Data = Data, Total = Total)
  
    __obj.asInstanceOf[PutResponseData]
  }
}

