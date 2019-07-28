package typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for getting and setting the Scroll Factor of a Game Object.
  */
@js.native
trait ScrollFactor extends js.Object {
  /**
    * The horizontal scroll factor of this Game Object.
    * 
    * The scroll factor controls the influence of the movement of a Camera upon this Game Object.
    * 
    * When a camera scrolls it will change the location at which this Game Object is rendered on-screen.
    * It does not change the Game Objects actual position values.
    * 
    * A value of 1 means it will move exactly in sync with a camera.
    * A value of 0 means it will not move at all, even if the camera moves.
    * Other values control the degree to which the camera movement is mapped to this Game Object.
    * 
    * Please be aware that scroll factor values other than 1 are not taken in to consideration when
    * calculating physics collisions. Bodies always collide based on their world position, but changing
    * the scroll factor is a visual adjustment to where the textures are rendered, which can offset
    * them from physics bodies if not accounted for in your code.
    */
  var scrollFactorX: Double = js.native
  /**
    * The vertical scroll factor of this Game Object.
    * 
    * The scroll factor controls the influence of the movement of a Camera upon this Game Object.
    * 
    * When a camera scrolls it will change the location at which this Game Object is rendered on-screen.
    * It does not change the Game Objects actual position values.
    * 
    * A value of 1 means it will move exactly in sync with a camera.
    * A value of 0 means it will not move at all, even if the camera moves.
    * Other values control the degree to which the camera movement is mapped to this Game Object.
    * 
    * Please be aware that scroll factor values other than 1 are not taken in to consideration when
    * calculating physics collisions. Bodies always collide based on their world position, but changing
    * the scroll factor is a visual adjustment to where the textures are rendered, which can offset
    * them from physics bodies if not accounted for in your code.
    */
  var scrollFactorY: Double = js.native
  /**
    * Sets the scroll factor of this Game Object.
    * 
    * The scroll factor controls the influence of the movement of a Camera upon this Game Object.
    * 
    * When a camera scrolls it will change the location at which this Game Object is rendered on-screen.
    * It does not change the Game Objects actual position values.
    * 
    * A value of 1 means it will move exactly in sync with a camera.
    * A value of 0 means it will not move at all, even if the camera moves.
    * Other values control the degree to which the camera movement is mapped to this Game Object.
    * 
    * Please be aware that scroll factor values other than 1 are not taken in to consideration when
    * calculating physics collisions. Bodies always collide based on their world position, but changing
    * the scroll factor is a visual adjustment to where the textures are rendered, which can offset
    * them from physics bodies if not accounted for in your code.
    * @param x The horizontal scroll factor of this Game Object.
    * @param y The vertical scroll factor of this Game Object. If not set it will use the `x` value. Default x.
    */
  def setScrollFactor(x: Double): this.type = js.native
  def setScrollFactor(x: Double, y: Double): this.type = js.native
}

