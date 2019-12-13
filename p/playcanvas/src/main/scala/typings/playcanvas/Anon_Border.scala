package typings.playcanvas

import typings.playcanvas.pc.Vec2
import typings.playcanvas.pc.Vec4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Border extends js.Object {
  var border: Vec4
  var pivot: Vec2
  var rect: Vec4
}

object Anon_Border {
  @scala.inline
  def apply(border: Vec4, pivot: Vec2, rect: Vec4): Anon_Border = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Border]
  }
}

