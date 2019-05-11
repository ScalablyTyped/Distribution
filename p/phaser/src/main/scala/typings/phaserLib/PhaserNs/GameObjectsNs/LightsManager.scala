package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manages Lights for a Scene.
  * 
  * Affects the rendering of Game Objects using the `Light2D` pipeline.
  */
@JSGlobal("Phaser.GameObjects.LightsManager")
@js.native
class LightsManager () extends js.Object {
  /**
    * Whether the Lights Manager is enabled.
    */
  var active: scala.Boolean = js.native
  /**
    * The ambient color.
    */
  var ambientColor: js.Object = js.native
  /**
    * Lights that have been culled from a Camera's viewport.
    * 
    * Lights in this list will not be rendered.
    */
  var culledLights: js.Array[Light] = js.native
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
  val maxLights: phaserLib.integer = js.native
  /**
    * Add a Light.
    * @param x The horizontal position of the Light. Default 0.
    * @param y The vertical position of the Light. Default 0.
    * @param radius The radius of the Light. Default 100.
    * @param rgb The integer RGB color of the light. Default 0xffffff.
    * @param intensity The intensity of the Light. Default 1.
    */
  def addLight(): Light = js.native
  def addLight(x: scala.Double): Light = js.native
  def addLight(x: scala.Double, y: scala.Double): Light = js.native
  def addLight(x: scala.Double, y: scala.Double, radius: scala.Double): Light = js.native
  def addLight(x: scala.Double, y: scala.Double, radius: scala.Double, rgb: scala.Double): Light = js.native
  def addLight(x: scala.Double, y: scala.Double, radius: scala.Double, rgb: scala.Double, intensity: scala.Double): Light = js.native
  /**
    * Cull any Lights that aren't visible to the given Camera.
    * 
    * Culling Lights improves performance by ensuring that only Lights within a Camera's viewport are rendered.
    * @param camera The Camera to cull Lights for.
    */
  def cull(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): js.Array[Light] = js.native
  /**
    * Destroy the Lights Manager.
    * 
    * Cleans up all references by calling {@link Phaser.GameObjects.LightsManager#shutdown}.
    */
  def destroy(): scala.Unit = js.native
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
  def forEachLight(callback: phaserLib.LightForEach): LightsManager = js.native
  /**
    * Get the number of Lights managed by this Lights Manager.
    */
  def getLightCount(): phaserLib.integer = js.native
  /**
    * Returns the maximum number of Lights allowed to appear at once.
    */
  def getMaxVisibleLights(): phaserLib.integer = js.native
  /**
    * Remove a Light.
    * @param light The Light to remove.
    */
  def removeLight(light: Light): LightsManager = js.native
  /**
    * Set the ambient light color.
    * @param rgb The integer RGB color of the ambient light.
    */
  def setAmbientColor(rgb: scala.Double): LightsManager = js.native
  /**
    * Shut down the Lights Manager.
    * 
    * Recycles all active Lights into the Light pool, resets ambient light color and clears the lists of Lights and
    * culled Lights.
    */
  def shutdown(): scala.Unit = js.native
}

