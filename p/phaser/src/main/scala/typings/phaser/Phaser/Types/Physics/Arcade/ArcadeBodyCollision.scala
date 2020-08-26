package typings.phaser.Phaser.Types.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcadeBodyCollision extends js.Object {
  /**
    * True if the Body is colliding on its lower edge.
    */
  var down: Boolean = js.native
  /**
    * True if the Body is colliding on its left edge.
    */
  var left: Boolean = js.native
  /**
    * True if the Body is not colliding.
    */
  var none: Boolean = js.native
  /**
    * True if the Body is colliding on its right edge.
    */
  var right: Boolean = js.native
  /**
    * True if the Body is colliding on its upper edge.
    */
  var up: Boolean = js.native
}

object ArcadeBodyCollision {
  @scala.inline
  def apply(down: Boolean, left: Boolean, none: Boolean, right: Boolean, up: Boolean): ArcadeBodyCollision = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcadeBodyCollision]
  }
  @scala.inline
  implicit class ArcadeBodyCollisionOps[Self <: ArcadeBodyCollision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDown(value: Boolean): Self = this.set("down", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Boolean): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: Boolean): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Boolean): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setUp(value: Boolean): Self = this.set("up", value.asInstanceOf[js.Any])
  }
  
}

