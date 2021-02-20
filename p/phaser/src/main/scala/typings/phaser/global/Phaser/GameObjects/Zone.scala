package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Zone Game Object.
  * 
  * A Zone is a non-rendering rectangular Game Object that has a position and size.
  * It has no texture and never displays, but does live on the display list and
  * can be moved, scaled and rotated like any other Game Object.
  * 
  * Its primary use is for creating Drop Zones and Input Hit Areas and it has a couple of helper methods
  * specifically for this. It is also useful for object overlap checks, or as a base for your own
  * non-displaying Game Objects.
  * The default origin is 0.5, the center of the Zone, the same as with Game Objects.
  */
@JSGlobal("Phaser.GameObjects.Zone")
@js.native
class Zone protected ()
  extends typings.phaser.Phaser.GameObjects.Zone {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param width The width of the Game Object. Default 1.
    * @param height The height of the Game Object. Default 1.
    */
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Double, height: Double) = this()
}
