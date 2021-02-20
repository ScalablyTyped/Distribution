package typings.phaser.phaserMod.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 2D point light.
  * 
  * These are typically created by a {@link Phaser.GameObjects.LightsManager}, available from within a scene via `this.lights`.
  * 
  * Any Game Objects using the Light2D pipeline will then be affected by these Lights.
  * 
  * They can also simply be used to represent a point light for your own purposes.
  */
@JSImport("phaser", "GameObjects.Light")
@js.native
class Light protected ()
  extends typings.phaser.Phaser.GameObjects.Light {
  /**
    * 
    * @param x The horizontal position of the light.
    * @param y The vertical position of the light.
    * @param radius The radius of the light.
    * @param r The red color of the light. A value between 0 and 1.
    * @param g The green color of the light. A value between 0 and 1.
    * @param b The blue color of the light. A value between 0 and 1.
    * @param intensity The intensity of the light.
    */
  def this(x: Double, y: Double, radius: Double, r: Double, g: Double, b: Double, intensity: Double) = this()
}
