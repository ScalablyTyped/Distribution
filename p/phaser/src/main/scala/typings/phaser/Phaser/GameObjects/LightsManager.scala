package typings.phaser.Phaser.GameObjects

import typings.phaser.LightForEach
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.integer
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
    * @param radius The radius of the Light. Default 100.
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
    * The ambient color.
    */
  var ambientColor: js.Object = js.native
  
  /**
    * Cull any Lights that aren't visible to the given Camera.
    * 
    * Culling Lights improves performance by ensuring that only Lights within a Camera's viewport are rendered.
    * @param camera The Camera to cull Lights for.
    */
  def cull(camera: Camera): js.Array[Light] = js.native
  
  /**
    * Lights that have been culled from a Camera's viewport.
    * 
    * Lights in this list will not be rendered.
    */
  var culledLights: js.Array[Light] = js.native
  
  /**
    * Destroy the Lights Manager.
    * 
    * Cleans up all references by calling {@link Phaser.GameObjects.LightsManager#shutdown}.
    */
  def destroy(): Unit = js.native
  
  /**
    * Disable the Lights Manager.
    */
  def disable(): LightsManager = js.native
  
  /**
    * Enable the Lights Manager.
    */
  def enable(): LightsManager = js.native
  
  /**
    * Iterate over each Light with a callback.
    * @param callback The callback that is called with each Light.
    */
  def forEachLight(callback: LightForEach): LightsManager = js.native
  
  /**
    * Get the number of Lights managed by this Lights Manager.
    */
  def getLightCount(): integer = js.native
  
  /**
    * Returns the maximum number of Lights allowed to appear at once.
    */
  def getMaxVisibleLights(): integer = js.native
  
  /**
    * The pool of Lights.
    * 
    * Used to recycle removed Lights for a more efficient use of memory.
    */
  var lightPool: js.Array[Light] = js.native
  
  /**
    * The Lights in the Scene.
    */
  var lights: js.Array[Light] = js.native
  
  /**
    * The maximum number of lights that a single Camera and the lights shader can process.
    * Change this via the `maxLights` property in your game config, as it cannot be changed at runtime.
    */
  val maxLights: integer = js.native
  
  /**
    * Remove a Light.
    * @param light The Light to remove.
    */
  def removeLight(light: Light): LightsManager = js.native
  
  /**
    * Set the ambient light color.
    * @param rgb The integer RGB color of the ambient light.
    */
  def setAmbientColor(rgb: Double): LightsManager = js.native
  
  /**
    * Shut down the Lights Manager.
    * 
    * Recycles all active Lights into the Light pool, resets ambient light color and clears the lists of Lights and
    * culled Lights.
    */
  def shutdown(): Unit = js.native
}
