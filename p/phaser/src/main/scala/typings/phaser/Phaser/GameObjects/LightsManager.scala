package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Display.RGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages Lights for a Scene.
  * 
  * Affects the rendering of Game Objects using the `Light2D` pipeline.
  */
@js.native
trait LightsManager extends StObject {
  
  /**
    * Whether the Lights Manager is enabled.
    */
  var active: Boolean = js.native
  
  /**
    * Add a Light.
    * @param x The horizontal position of the Light. Default 0.
    * @param y The vertical position of the Light. Default 0.
    * @param radius The radius of the Light. Default 128.
    * @param rgb The integer RGB color of the light. Default 0xffffff.
    * @param intensity The intensity of the Light. Default 1.
    */
  def addLight(): Light = js.native
  def addLight(x: Double): Light = js.native
  def addLight(x: Double, y: Double): Light = js.native
  def addLight(x: Double, y: Double, radius: Double): Light = js.native
  def addLight(x: Double, y: Double, radius: Double, rgb: Double): Light = js.native
  def addLight(x: Double, y: Double, radius: Double, rgb: Double, intensity: Double): Light = js.native
  def addLight(x: Double, y: Double, radius: Double, rgb: Unit, intensity: Double): Light = js.native
  def addLight(x: Double, y: Double, radius: Unit, rgb: Double): Light = js.native
  def addLight(x: Double, y: Double, radius: Unit, rgb: Double, intensity: Double): Light = js.native
  def addLight(x: Double, y: Double, radius: Unit, rgb: Unit, intensity: Double): Light = js.native
  def addLight(x: Double, y: Unit, radius: Double): Light = js.native
  def addLight(x: Double, y: Unit, radius: Double, rgb: Double): Light = js.native
  def addLight(x: Double, y: Unit, radius: Double, rgb: Double, intensity: Double): Light = js.native
  def addLight(x: Double, y: Unit, radius: Double, rgb: Unit, intensity: Double): Light = js.native
  def addLight(x: Double, y: Unit, radius: Unit, rgb: Double): Light = js.native
  def addLight(x: Double, y: Unit, radius: Unit, rgb: Double, intensity: Double): Light = js.native
  def addLight(x: Double, y: Unit, radius: Unit, rgb: Unit, intensity: Double): Light = js.native
  def addLight(x: Unit, y: Double): Light = js.native
  def addLight(x: Unit, y: Double, radius: Double): Light = js.native
  def addLight(x: Unit, y: Double, radius: Double, rgb: Double): Light = js.native
  def addLight(x: Unit, y: Double, radius: Double, rgb: Double, intensity: Double): Light = js.native
  def addLight(x: Unit, y: Double, radius: Double, rgb: Unit, intensity: Double): Light = js.native
  def addLight(x: Unit, y: Double, radius: Unit, rgb: Double): Light = js.native
  def addLight(x: Unit, y: Double, radius: Unit, rgb: Double, intensity: Double): Light = js.native
  def addLight(x: Unit, y: Double, radius: Unit, rgb: Unit, intensity: Double): Light = js.native
  def addLight(x: Unit, y: Unit, radius: Double): Light = js.native
  def addLight(x: Unit, y: Unit, radius: Double, rgb: Double): Light = js.native
  def addLight(x: Unit, y: Unit, radius: Double, rgb: Double, intensity: Double): Light = js.native
  def addLight(x: Unit, y: Unit, radius: Double, rgb: Unit, intensity: Double): Light = js.native
  def addLight(x: Unit, y: Unit, radius: Unit, rgb: Double): Light = js.native
  def addLight(x: Unit, y: Unit, radius: Unit, rgb: Double, intensity: Double): Light = js.native
  def addLight(x: Unit, y: Unit, radius: Unit, rgb: Unit, intensity: Double): Light = js.native
  
  /**
    * Creates a new Point Light Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Point Light Game Object has been built into Phaser.
    * 
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
    * @param x The horizontal position of this Point Light in the world.
    * @param y The vertical position of this Point Light in the world.
    * @param color The color of the Point Light, given as a hex value. Default 0xffffff.
    * @param radius The radius of the Point Light. Default 128.
    * @param intensity The intensity, or colr blend, of the Point Light. Default 1.
    * @param attenuation The attenuation  of the Point Light. This is the reduction of light from the center point. Default 0.1.
    */
  def addPointLight(x: Double, y: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Double, radius: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Double, radius: Double, intensity: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Double, radius: Double, intensity: Double, attenuation: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Double, radius: Double, intensity: Unit, attenuation: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Double, radius: Unit, intensity: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Double, radius: Unit, intensity: Double, attenuation: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Double, radius: Unit, intensity: Unit, attenuation: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Unit, radius: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Unit, radius: Double, intensity: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Unit, radius: Double, intensity: Double, attenuation: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Unit, radius: Double, intensity: Unit, attenuation: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Unit, radius: Unit, intensity: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Unit, radius: Unit, intensity: Double, attenuation: Double): PointLight = js.native
  def addPointLight(x: Double, y: Double, color: Unit, radius: Unit, intensity: Unit, attenuation: Double): PointLight = js.native
  
  /**
    * The ambient color.
    */
  var ambientColor: RGB = js.native
  
  /**
    * Destroy the Lights Manager.
    * 
    * Cleans up all references by calling {@link Phaser.GameObjects.LightsManager#shutdown}.
    */
  def destroy(): Unit = js.native
  
  /**
    * Disable the Lights Manager.
    */
  def disable(): this.type = js.native
  
  /**
    * Enable the Lights Manager.
    */
  def enable(): this.type = js.native
  
  /**
    * Get the number of Lights managed by this Lights Manager.
    */
  def getLightCount(): Double = js.native
  
  /**
    * Get all lights that can be seen by the given Camera.
    * 
    * It will automatically cull lights that are outside the world view of the Camera.
    * 
    * If more lights are returned than supported by the pipeline, the lights are then culled
    * based on the distance from the center of the camera. Only those closest are rendered.
    * @param camera The Camera to cull Lights for.
    */
  def getLights(camera: Camera): js.Array[Light] = js.native
  
  /**
    * Returns the maximum number of Lights allowed to appear at once.
    */
  def getMaxVisibleLights(): Double = js.native
  
  /**
    * The Lights in the Scene.
    */
  var lights: js.Array[Light] = js.native
  
  /**
    * The maximum number of lights that a single Camera and the lights shader can process.
    * Change this via the `maxLights` property in your game config, as it cannot be changed at runtime.
    */
  val maxLights: Double = js.native
  
  /**
    * Remove a Light.
    * @param light The Light to remove.
    */
  def removeLight(light: Light): this.type = js.native
  
  /**
    * Set the ambient light color.
    * @param rgb The integer RGB color of the ambient light.
    */
  def setAmbientColor(rgb: Double): this.type = js.native
  
  /**
    * Shut down the Lights Manager.
    * 
    * Recycles all active Lights into the Light pool, resets ambient light color and clears the lists of Lights and
    * culled Lights.
    */
  def shutdown(): Unit = js.native
  
  /**
    * The number of lights that the LightPipeline processed in the _previous_ frame.
    */
  val visibleLights: Double = js.native
}
