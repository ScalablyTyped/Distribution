package typings.phaser.phaserMod.Math

import typings.phaser.Phaser.Types.Math.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a vector in 2D space.
  * 
  * A two-component vector.
  */
@JSImport("phaser", "Math.Vector2")
@js.native
/**
  * 
  * @param x The x component, or an object with `x` and `y` properties.
  * @param y The y component.
  */
class Vector2 ()
  extends typings.phaser.Phaser.Math.Vector2 {
  def this(x: Double) = this()
  def this(x: Vector2Like) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Vector2Like, y: Double) = this()
}

/* static members */
@JSImport("phaser", "Math.Vector2")
@js.native
object Vector2 extends js.Object {
  /**
    * A static down Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val DOWN: typings.phaser.Phaser.Math.Vector2 = js.native
  /**
    * A static left Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val LEFT: typings.phaser.Phaser.Math.Vector2 = js.native
  /**
    * A static one Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val ONE: typings.phaser.Phaser.Math.Vector2 = js.native
  /**
    * A static right Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val RIGHT: typings.phaser.Phaser.Math.Vector2 = js.native
  /**
    * A static up Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val UP: typings.phaser.Phaser.Math.Vector2 = js.native
  /**
    * A static zero Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val ZERO: typings.phaser.Phaser.Math.Vector2 = js.native
}

