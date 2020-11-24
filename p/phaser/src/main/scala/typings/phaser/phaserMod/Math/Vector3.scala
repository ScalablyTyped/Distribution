package typings.phaser.phaserMod.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a vector in 3D space.
  * 
  * A three-component vector.
  */
@JSImport("phaser", "Math.Vector3")
@js.native
/**
  * 
  * @param x The x component.
  * @param y The y component.
  * @param z The z component.
  */
class Vector3 ()
  extends typings.phaser.Phaser.Math.Vector3 {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
}
/* static members */
@JSImport("phaser", "Math.Vector3")
@js.native
object Vector3 extends js.Object {
  
  /**
    * A static back Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val BACK: typings.phaser.Phaser.Math.Vector3 = js.native
  
  /**
    * A static down Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val DOWN: typings.phaser.Phaser.Math.Vector3 = js.native
  
  /**
    * A static forward Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val FORWARD: typings.phaser.Phaser.Math.Vector3 = js.native
  
  /**
    * A static left Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val LEFT: typings.phaser.Phaser.Math.Vector3 = js.native
  
  /**
    * A static one Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val ONE: typings.phaser.Phaser.Math.Vector3 = js.native
  
  /**
    * A static right Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val RIGHT: typings.phaser.Phaser.Math.Vector3 = js.native
  
  /**
    * A static up Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val UP: typings.phaser.Phaser.Math.Vector3 = js.native
  
  /**
    * A static zero Vector3 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val ZERO: typings.phaser.Phaser.Math.Vector3 = js.native
}
