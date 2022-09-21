package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Display.RGB
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Geom.Circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 2D point light.
  * 
  * These are typically created by a {@link Phaser.GameObjects.LightsManager}, available from within a scene via `this.lights`.
  * 
  * Any Game Objects using the Light2D pipeline will then be affected by these Lights as long as they have a normal map.
  * 
  * They can also simply be used to represent a point light for your own purposes.
  */
@js.native
trait Light
  extends StObject
     with Circle
     with ScrollFactor
     with Visible {
  
  /**
    * The color of the light.
    */
  var color: RGB = js.native
  
  /**
    * The intensity of the light.
    */
  var intensity: Double = js.native
  
  /**
    * Set the color of the light from a single integer RGB value.
    * @param rgb The integer RGB color of the light.
    */
  def setColor(rgb: Double): this.type = js.native
  
  /**
    * Set the intensity of the light.
    * @param intensity The intensity of the light.
    */
  def setIntensity(intensity: Double): this.type = js.native
  
  /**
    * Set the radius of the light.
    * @param radius The radius of the light.
    */
  def setRadius(radius: Double): this.type = js.native
  
  /**
    * Compares the renderMask with the renderFlags to see if this Game Object will render or not.
    * Also checks the Game Object against the given Cameras exclusion list.
    * @param camera The Camera to check against this Game Object.
    */
  def willRender(camera: Camera): Boolean = js.native
}
