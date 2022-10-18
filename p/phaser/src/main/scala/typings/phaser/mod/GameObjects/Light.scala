package typings.phaser.mod.GameObjects

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
@JSImport("phaser", "GameObjects.Light")
@js.native
open class Light protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.Light {
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
  
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
object Light {
  
  /**
    * The bitmask that `GameObject.renderFlags` is compared against to determine if the Game Object will render or not.
    */
  /* static member */
  @JSImport("phaser", "GameObjects.Light.RENDER_MASK")
  @js.native
  val RENDER_MASK: Double = js.native
}
