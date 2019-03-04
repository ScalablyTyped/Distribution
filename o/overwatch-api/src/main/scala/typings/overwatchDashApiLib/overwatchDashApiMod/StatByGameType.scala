package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatByGameType[T, U] extends js.Object {
  var competitive: U
  var quickplay: T
}

object StatByGameType {
  @scala.inline
  def apply[T, U](competitive: U, quickplay: T): StatByGameType[T, U] = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatByGameType[T, U]]
  }
}

