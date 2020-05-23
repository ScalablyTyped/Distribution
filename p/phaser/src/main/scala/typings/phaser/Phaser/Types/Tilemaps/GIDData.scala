package typings.phaser.Phaser.Types.Tilemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GIDData extends js.Object {
  /**
    * Is flipped?
    */
  var flipped: Boolean
  /**
    * Diagonal flip flag.
    */
  var flippedAntiDiagonal: Boolean
  /**
    * Horizontal flip flag.
    */
  var flippedHorizontal: Boolean
  /**
    * Vertical flip flag.
    */
  var flippedVertical: Boolean
  /**
    * The Tiled GID.
    */
  var gid: Double
  /**
    * Amount of rotation.
    */
  var rotation: Double
}

object GIDData {
  @scala.inline
  def apply(
    flipped: Boolean,
    flippedAntiDiagonal: Boolean,
    flippedHorizontal: Boolean,
    flippedVertical: Boolean,
    gid: Double,
    rotation: Double
  ): GIDData = {
    val __obj = js.Dynamic.literal(flipped = flipped.asInstanceOf[js.Any], flippedAntiDiagonal = flippedAntiDiagonal.asInstanceOf[js.Any], flippedHorizontal = flippedHorizontal.asInstanceOf[js.Any], flippedVertical = flippedVertical.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GIDData]
  }
}

