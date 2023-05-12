package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Point Light Game Object provides a way to add a point light effect into your game,
  * without the expensive shader processing requirements of the traditional Light Game Object.
  * 
  * The difference is that the Point Light renders using a custom shader, designed to give the
  * impression of a point light source, of variable radius, intensity and color, in your game.
  * However, unlike the Light Game Object, it does not impact any other Game Objects, or use their
  * normal maps for calcuations. This makes them extremely fast to render compared to Lights
  * and perfect for special effects, such as flickering torches or muzzle flashes.
  * 
  * For maximum performance you should batch Point Light Game Objects together. This means
  * ensuring they follow each other consecutively on the display list. Ideally, use a Layer
  * Game Object and then add just Point Lights to it, so that it can batch together the rendering
  * of the lights. You don't _have_ to do this, and if you've only a handful of Point Lights in
  * your game then it's perfectly safe to mix them into the dislay list as normal. However, if
  * you're using a large number of them, please consider how they are mixed into the display list.
  * 
  * The renderer will automatically cull Point Lights. Those with a radius that does not intersect
  * with the Camera will be skipped in the rendering list. This happens automatically and the
  * culled state is refreshed every frame, for every camera.
  * 
  * The origin of a Point Light is always 0.5 and it cannot be changed.
  * 
  * Point Lights are a WebGL only feature and do not have a Canvas counterpart.
  */
@JSGlobal("Phaser.GameObjects.PointLight")
@js.native
open class PointLight protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.PointLight {
  /**
    * 
    * @param scene The Scene to which this Point Light belongs. A Point Light can only belong to one Scene at a time.
    * @param x The horizontal position of this Point Light in the world.
    * @param y The vertical position of this Point Light in the world.
    * @param color The color of the Point Light, given as a hex value. Default 0xffffff.
    * @param radius The radius of the Point Light. Default 128.
    * @param intensity The intensity, or color blend, of the Point Light. Default 1.
    * @param attenuation The attenuation  of the Point Light. This is the reduction of light from the center point. Default 0.1.
    */
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: Double, y: Double, color: Double) = this()
  def this(scene: Scene, x: Double, y: Double, color: Double, radius: Double) = this()
  def this(scene: Scene, x: Double, y: Double, color: Unit, radius: Double) = this()
  def this(scene: Scene, x: Double, y: Double, color: Double, radius: Double, intensity: Double) = this()
  def this(scene: Scene, x: Double, y: Double, color: Double, radius: Unit, intensity: Double) = this()
  def this(scene: Scene, x: Double, y: Double, color: Unit, radius: Double, intensity: Double) = this()
  def this(scene: Scene, x: Double, y: Double, color: Unit, radius: Unit, intensity: Double) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    color: Double,
    radius: Double,
    intensity: Double,
    attenuation: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    color: Double,
    radius: Double,
    intensity: Unit,
    attenuation: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    color: Double,
    radius: Unit,
    intensity: Double,
    attenuation: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    color: Double,
    radius: Unit,
    intensity: Unit,
    attenuation: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    color: Unit,
    radius: Double,
    intensity: Double,
    attenuation: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    color: Unit,
    radius: Double,
    intensity: Unit,
    attenuation: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    color: Unit,
    radius: Unit,
    intensity: Double,
    attenuation: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    color: Unit,
    radius: Unit,
    intensity: Unit,
    attenuation: Double
  ) = this()
  
  /**
    * The depth of this Game Object within the Scene. Ensure this value is only ever set to a number data-type.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  var depth: Double = js.native
  
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object. Ensure this value is only ever a number data-type.
    */
  /* CompleteClass */
  override def setDepth(value: Double): this.type = js.native
  
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
