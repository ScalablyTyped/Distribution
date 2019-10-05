package typings.playcanvas

import typings.playcanvas.pc.Vec2
import typings.playcanvas.pc.Vec4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Border extends js.Object {
  var border: js.UndefOr[Vec4] = js.undefined
  var pivot: js.UndefOr[Vec2] = js.undefined
  var rect: js.UndefOr[Vec4] = js.undefined
}

object Anon_Border {
  @scala.inline
  def apply(border: Vec4 = null, pivot: Vec2 = null, rect: Vec4 = null): Anon_Border = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (pivot != null) __obj.updateDynamic("pivot")(pivot)
    if (rect != null) __obj.updateDynamic("rect")(rect)
    __obj.asInstanceOf[Anon_Border]
  }
}

