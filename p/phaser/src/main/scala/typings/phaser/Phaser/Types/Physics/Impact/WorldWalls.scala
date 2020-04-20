package typings.phaser.Phaser.Types.Physics.Impact

import typings.phaser.Phaser.Physics.Impact.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldWalls extends js.Object {
  /**
    * The bottom wall of the world bounds.
    */
  var bottom: Body
  /**
    * The left-side wall of the world bounds.
    */
  var left: Body
  /**
    * The right-side wall of the world bounds.
    */
  var right: Body
  /**
    * The top wall of the world bounds.
    */
  var top: Body
}

object WorldWalls {
  @scala.inline
  def apply(bottom: Body, left: Body, right: Body, top: Body): WorldWalls = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldWalls]
  }
}

