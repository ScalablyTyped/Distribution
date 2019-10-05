package typings.phaser.Phaser.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A 2D point light.
  * 
  * These are typically created by a {@link Phaser.GameObjects.LightsManager}, available from within a scene via `this.lights`.
  * 
  * Any Game Objects using the Light2D pipeline will then be affected by these Lights.
  * 
  * They can also simply be used to represent a point light for your own purposes.
  */
@JSGlobal("Phaser.GameObjects.Light")
@js.native
class Light protected () extends js.Object {
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
    * The blue color of the light. A value between 0 and 1.
    */
  var b: Double = js.native
  /**
    * The green color of the light. A value between 0 and 1.
    */
  var g: Double = js.native
  /**
    * The intensity of the light.
    */
  var intensity: Double = js.native
  /**
    * The red color of the light. A value between 0 and 1.
    */
  var r: Double = js.native
  /**
    * The radius of the light.
    */
  var radius: Double = js.native
  /**
    * The horizontal scroll factor of the light.
    */
  var scrollFactorX: Double = js.native
  /**
    * The vertical scroll factor of the light.
    */
  var scrollFactorY: Double = js.native
  /**
    * The horizontal position of the light.
    */
  var x: Double = js.native
  /**
    * The vertical position of the light.
    */
  var y: Double = js.native
  /**
    * Set the properties of the light.
    * 
    * Sets both horizontal and vertical scroll factor to 1. Use {@link Phaser.GameObjects.Light#setScrollFactor} to set
    * the scroll factor.
    * @param x The horizontal position of the light.
    * @param y The vertical position of the light.
    * @param radius The radius of the light.
    * @param r The red color. A value between 0 and 1.
    * @param g The green color. A value between 0 and 1.
    * @param b The blue color. A value between 0 and 1.
    * @param intensity The intensity of the light.
    */
  def set(x: Double, y: Double, radius: Double, r: Double, g: Double, b: Double, intensity: Double): Light = js.native
  /**
    * Set the color of the light from a single integer RGB value.
    * @param rgb The integer RGB color of the light.
    */
  def setColor(rgb: Double): Light = js.native
  /**
    * Set the intensity of the light.
    * @param intensity The intensity of the light.
    */
  def setIntensity(intensity: Double): Light = js.native
  /**
    * Set the position of the light.
    * @param x The horizontal position of the light.
    * @param y The vertical position of the light.
    */
  def setPosition(x: Double, y: Double): Light = js.native
  /**
    * Set the radius of the light.
    * @param radius The radius of the light.
    */
  def setRadius(radius: Double): Light = js.native
  /**
    * Set the scroll factor of the light.
    * @param x The horizontal scroll factor of the light.
    * @param y The vertical scroll factor of the light.
    */
  def setScrollFactor(x: Double, y: Double): Light = js.native
}

