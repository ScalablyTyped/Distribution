package typings
package phaserLib.PhaserNs.GameObjectsNs

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
  def this(x: scala.Double, y: scala.Double, radius: scala.Double, r: scala.Double, g: scala.Double, b: scala.Double, intensity: scala.Double) = this()
  /**
    * The blue color of the light. A value between 0 and 1.
    */
  var b: scala.Double = js.native
  /**
    * The green color of the light. A value between 0 and 1.
    */
  var g: scala.Double = js.native
  /**
    * The intensity of the light.
    */
  var intensity: scala.Double = js.native
  /**
    * The red color of the light. A value between 0 and 1.
    */
  var r: scala.Double = js.native
  /**
    * The radius of the light.
    */
  var radius: scala.Double = js.native
  /**
    * The horizontal scroll factor of the light.
    */
  var scrollFactorX: scala.Double = js.native
  /**
    * The vertical scroll factor of the light.
    */
  var scrollFactorY: scala.Double = js.native
  /**
    * The horizontal position of the light.
    */
  var x: scala.Double = js.native
  /**
    * The vertical position of the light.
    */
  var y: scala.Double = js.native
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
  def set(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    r: scala.Double,
    g: scala.Double,
    b: scala.Double,
    intensity: scala.Double
  ): Light = js.native
  /**
    * Set the color of the light from a single integer RGB value.
    * @param rgb The integer RGB color of the light.
    */
  def setColor(rgb: scala.Double): Light = js.native
  /**
    * Set the intensity of the light.
    * @param intensity The intensity of the light.
    */
  def setIntensity(intensity: scala.Double): Light = js.native
  /**
    * Set the position of the light.
    * @param x The horizontal position of the light.
    * @param y The vertical position of the light.
    */
  def setPosition(x: scala.Double, y: scala.Double): Light = js.native
  /**
    * Set the radius of the light.
    * @param radius The radius of the light.
    */
  def setRadius(radius: scala.Double): Light = js.native
  /**
    * Set the scroll factor of the light.
    * @param x The horizontal scroll factor of the light.
    * @param y The vertical scroll factor of the light.
    */
  def setScrollFactor(x: scala.Double, y: scala.Double): Light = js.native
}

