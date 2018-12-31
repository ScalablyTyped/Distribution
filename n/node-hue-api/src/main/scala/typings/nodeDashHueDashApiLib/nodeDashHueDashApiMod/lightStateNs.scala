package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-hue-api", "lightState")
@js.native
object lightStateNs extends js.Object {
  @js.native
  class State () extends js.Object {
    /**
      * Adds the alert state
      * @param value A String value representing the alert state, "none", "select", "lselect".
      * @return {State}
      */
    def alert(value: nodeDashHueDashApiLib.nodeDashHueDashApiMod.LightAlert): State = js.native
    def alertLong(): State = js.native
    def alertShort(): State = js.native
    /**
      * Creates a copy of the State if there is an RGB value set.
      *
      * @param modelid The model ID of the light(s) to convert the rgb value for.
      *
      * @returns {State} If there is an RGB value set, then a copy of the state, with the rgb value applied based on the
      * lamp model provided. If there is no RGB value set, then {null} will be returned.
      */
    def applyRGB(modelid: java.lang.String): State = js.native
    /**
      * Adds the bri state
      * @param value The hue bri value, 0 to 254.
      * @return {State}
      */
    def bri(value: scala.Double): State = js.native
    /**
      * Increments/Decrements the brightness value for the lights.
      * @param value An amount to change the current brightness by, -254 to 254.
      * @returns {State}
      */
    def bri_inc(value: scala.Double): State = js.native
    /**
      * Set the brightness as a percent value
      * @param percentage The brightness percentage value between 0 and 100.
      * @returns {State}
      */
    def brightness(percentage: scala.Double): State = js.native
    def clear(): State = js.native
    def colorLoop(): State = js.native
    def colorTemp(value: scala.Double): State = js.native
    def colorTemperature(value: scala.Double): State = js.native
    def colourLoop(): State = js.native
    def colourTemp(value: scala.Double): State = js.native
    def colourTemperature(value: scala.Double): State = js.native
    /**
      * Creates a copy of the state object
      * @returns {State}
      */
    def copy(): State = js.native
    /**
      * Adds the Mired Color Temperature
      * @param colorTemp The Color Temperature between 153 to 500 inclusive.
      * @returns {State}
      */
    def ct(colorTemp: scala.Double): State = js.native
    /**
      * Increments/Decrements the color temperature value for the lights.
      * @param value An amount to change the current color temperature by, -65534 to 65534.
      * @returns {State}
      */
    def ct_inc(value: scala.Double): State = js.native
    /**
      * Adds an effect for the bulb.
      * @param value The type of effect, currently supports "none" and "colorloop".
      * @returns {State}
      */
    def effect(value: nodeDashHueDashApiLib.nodeDashHueDashApiMod.LightEffect): State = js.native
    def effectColorLoop(): State = js.native
    def effectColourLoop(): State = js.native
    def hasRGB(): scala.Boolean = js.native
    /**
      * Adds the HSB values
      * @param hue The hue value in degrees 0-360
      * @param saturation The saturation percentage 0-100
      * @param brightness The brightness percentage 0-100
      * @return {State}
      */
    def hsb(hue: scala.Double, saturation: scala.Double, brightness: scala.Double): State = js.native
    /**
      * Adds the HSL values
      * @param hue The hue value in degrees 0-360
      * @param saturation The saturation percentage 0-100
      * @param luminosity The luminosity percentage 0-100
      * @return {State}
      */
    def hsl(hue: scala.Double, saturation: scala.Double, luminosity: scala.Double): State = js.native
    /**
      * Adds the hue for the color desired.
      * @param hue The hue value is a wrapping value between 0 and 65535. Both 0 and 65535 are red, 25500 is green and 46920 is blue.
      * @returns {State}
      */
    def hue(hue: scala.Double): State = js.native
    /**
      * Increments/Decrements the Hue value for the lights.
      * @param value An amount to change the current hue by, -65534 to 65534.
      * @returns {State}
      */
    def hue_inc(value: scala.Double): State = js.native
    def incrementBrightness(value: scala.Double): State = js.native
    def incrementColorTemp(value: scala.Double): State = js.native
    def incrementColorTemperature(value: scala.Double): State = js.native
    def incrementColourTemp(value: scala.Double): State = js.native
    def incrementColourTemperature(value: scala.Double): State = js.native
    def incrementHue(value: scala.Double): State = js.native
    def incrementSaturation(value: scala.Double): State = js.native
    def incrementXY(value: scala.Double): State = js.native
    def isStrict(): scala.Boolean = js.native
    def longAlert(): State = js.native
    def off(): State = js.native
    /**
      * Sets the on state
      * @param on The state (true for on, false for off). If this parameter is not specified, it is assumed to be true.
      * @returns {State}
      */
    def on(): State = js.native
    def on(on: scala.Boolean): State = js.native
    def payload(): js.Object = js.native
    /**
      * Resets/Clears the properties that have been set in the light state object.
      * @returns {State}
      */
    def reset(): State = js.native
    /**
      * Adds the rgb color to the state. This requires knowledge of the light type to be able to convert it into
      * an actual color that the map can display.
      *
      * @param r The amount of Red 0-255, or an {Array} or r, g, b values.
      * @param g The amount of Green 0-255
      * @param b The amount of Blue 0-255
      * @return {State}
      */
    def rgb(r: scala.Double, g: scala.Double, b: scala.Double): State = js.native
    /**
      * The saturation of the color for the bulb, 0 being the least saturated i.e. white.
      * @param saturation The saturation value 0 to 255
      * @returns {State}
      */
    def sat(saturation: scala.Double): State = js.native
    /**
      * Increments/Decrements the saturation value for the lights.
      * @param value An amount to change the current saturation by, -254 to 254.
      * @returns {State}
      */
    def sat_inc(value: scala.Double): State = js.native
    def saturation(percentage: scala.Double): State = js.native
    def scene(value: java.lang.String): State = js.native
    def shortAlert(): State = js.native
    /**
      * Sets the strict state for setting parameters for the light state.
      * @param strict
      * @returns {State}
      */
    def strict(): State = js.native
    /**
      * Sets the transition time in milliseconds.
      * @param milliseconds The number of milliseconds for the transition
      * @returns {State}
      */
    def transition(milliseconds: scala.Double): State = js.native
    def transitionDefault(): State = js.native
    def transitionFast(): State = js.native
    def transitionInstant(): State = js.native
    def transitionSlow(): State = js.native
    def transitionTime(value: scala.Double): State = js.native
    /**
      * Adds a transition to the desired state.
      * @param value This is given as a multiple of 100ms and defaults to 4 (400ms).
      * @return {State}
      */
    def transitiontime(value: scala.Double): State = js.native
    def turnOff(): State = js.native
    ///////////////////////////////////////////////////////////////////////
    // Convenience functions
    def turnOn(): State = js.native
    /**
      * Builds the White state for a lamp
      * @param colorTemp The temperature, a value of 153-500
      * @param brightPercentage The percentage of brightness 0-100
      * @return {State}
      */
    def white(colorTemp: scala.Double, brightPercentage: scala.Double): State = js.native
    /**
      * Adds the xy values
      * @param x The x value ranged from 0 to 1, or an Array of [x, y] values
      * @param y The y value ranged from 0 to 1
      * @return {State}
      */
    def xy(x: scala.Double, y: scala.Double): State = js.native
    /**
      * Increments/Decrements the XY value for the lights.
      * @param value An amount to change the current XY by, -0.5 to 0.5.
      * @returns {State}
      */
    def xy_inc(value: scala.Double): State = js.native
  }
  
  def create(): State = js.native
  def create(values: js.Object): State = js.native
  def isLightState(obj: js.Object): /* is node-hue-api.node-hue-api.lightState.State */ scala.Boolean = js.native
}

