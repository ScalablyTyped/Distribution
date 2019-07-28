package typings.ol.renderCanvasMod

import typings.ol.colorlikeMod.ColorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillState extends js.Object {
  var fillStyle: ColorLike
}

object FillState {
  @scala.inline
  def apply(fillStyle: ColorLike): FillState = {
    val __obj = js.Dynamic.literal(fillStyle = fillStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FillState]
  }
}

