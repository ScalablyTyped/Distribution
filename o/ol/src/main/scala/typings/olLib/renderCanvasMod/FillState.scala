package typings
package olLib.renderCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillState extends js.Object {
  var fillStyle: olLib.colorlikeMod.ColorLike
}

object FillState {
  @scala.inline
  def apply(fillStyle: olLib.colorlikeMod.ColorLike): FillState = {
    val __obj = js.Dynamic.literal(fillStyle = fillStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FillState]
  }
}

