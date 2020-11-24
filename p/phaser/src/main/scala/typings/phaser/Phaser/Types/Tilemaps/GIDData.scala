package typings.phaser.Phaser.Types.Tilemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GIDData extends js.Object {
  
  /**
    * Is flipped?
    */
  var flipped: Boolean = js.native
  
  /**
    * Diagonal flip flag.
    */
  var flippedAntiDiagonal: Boolean = js.native
  
  /**
    * Horizontal flip flag.
    */
  var flippedHorizontal: Boolean = js.native
  
  /**
    * Vertical flip flag.
    */
  var flippedVertical: Boolean = js.native
  
  /**
    * The Tiled GID.
    */
  var gid: Double = js.native
  
  /**
    * Amount of rotation.
    */
  var rotation: Double = js.native
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
  
  @scala.inline
  implicit class GIDDataOps[Self <: GIDData] (val x: Self) extends AnyVal {
    
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
    def setFlipped(value: Boolean): Self = this.set("flipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlippedAntiDiagonal(value: Boolean): Self = this.set("flippedAntiDiagonal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlippedHorizontal(value: Boolean): Self = this.set("flippedHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlippedVertical(value: Boolean): Self = this.set("flippedVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
  }
}
