package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsByGameType[T] extends js.Object {
  var competitive: js.Array[T]
  var quickplay: js.Array[T]
}

object StatsByGameType {
  @scala.inline
  def apply[T](competitive: js.Array[T], quickplay: js.Array[T]): StatsByGameType[T] = {
    val __obj = js.Dynamic.literal(competitive = competitive, quickplay = quickplay)
  
    __obj.asInstanceOf[StatsByGameType[T]]
  }
}

