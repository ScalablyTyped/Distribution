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
@js.native
trait Light extends js.Object {
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
  def set(x: Double, y: Double, radius: Double, r: Double, g: Double, b: Double, intensity: Double): this.type = js.native
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
    * Set the position of the light.
    * @param x The horizontal position of the light.
    * @param y The vertical position of the light.
    */
  def setPosition(x: Double, y: Double): this.type = js.native
  /**
    * Set the radius of the light.
    * @param radius The radius of the light.
    */
  def setRadius(radius: Double): this.type = js.native
  /**
    * Set the scroll factor of the light.
    * @param x The horizontal scroll factor of the light.
    * @param y The vertical scroll factor of the light.
    */
  def setScrollFactor(x: Double, y: Double): this.type = js.native
}

object Light {
  @scala.inline
  def apply(
    b: Double,
    g: Double,
    intensity: Double,
    r: Double,
    radius: Double,
    scrollFactorX: Double,
    scrollFactorY: Double,
    set: (Double, Double, Double, Double, Double, Double, Double) => Light,
    setColor: Double => Light,
    setIntensity: Double => Light,
    setPosition: (Double, Double) => Light,
    setRadius: Double => Light,
    setScrollFactor: (Double, Double) => Light,
    x: Double,
    y: Double
  ): Light = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], intensity = intensity.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], scrollFactorX = scrollFactorX.asInstanceOf[js.Any], scrollFactorY = scrollFactorY.asInstanceOf[js.Any], set = js.Any.fromFunction7(set), setColor = js.Any.fromFunction1(setColor), setIntensity = js.Any.fromFunction1(setIntensity), setPosition = js.Any.fromFunction2(setPosition), setRadius = js.Any.fromFunction1(setRadius), setScrollFactor = js.Any.fromFunction2(setScrollFactor), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Light]
  }
  @scala.inline
  implicit class LightOps[Self <: Light] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setG(value: Double): Self = this.set("g", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntensity(value: Double): Self = this.set("intensity", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollFactorX(value: Double): Self = this.set("scrollFactorX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollFactorY(value: Double): Self = this.set("scrollFactorY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: (Double, Double, Double, Double, Double, Double, Double) => Light): Self = this.set("set", js.Any.fromFunction7(value))
    @scala.inline
    def setSetColor(value: Double => Light): Self = this.set("setColor", js.Any.fromFunction1(value))
    @scala.inline
    def setSetIntensity(value: Double => Light): Self = this.set("setIntensity", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPosition(value: (Double, Double) => Light): Self = this.set("setPosition", js.Any.fromFunction2(value))
    @scala.inline
    def setSetRadius(value: Double => Light): Self = this.set("setRadius", js.Any.fromFunction1(value))
    @scala.inline
    def setSetScrollFactor(value: (Double, Double) => Light): Self = this.set("setScrollFactor", js.Any.fromFunction2(value))
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

