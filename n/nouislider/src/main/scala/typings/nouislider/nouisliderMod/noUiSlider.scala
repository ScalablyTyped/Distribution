package typings.nouislider.nouisliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait noUiSlider extends js.Object {
  /**
    * Exposes the options used to create the noUiSlider instance
    */
  var options: Options = js.native
  /**
    * Destroy's the slider.
    */
  def destroy(): Unit = js.native
  /**
    * To get the current slider value. For one-handle sliders, calling .get() will return the value.
    * For two-handle sliders, an array[value, value] will be returned.
    */
  def get(): String | js.Array[String] = js.native
  /**
    * Unbind event to the slider.
    */
  def off(eventName: String): Unit = js.native
  /**
    * Bind event to the slider.
    */
  def on(eventName: String, callback: Callback): Unit = js.native
  /**
    * To return to the initial slider values, you can use the .reset() method. This will only reset the slider values.
    */
  def reset(): Unit = js.native
  def set(value: js.Array[Double | Null]): Unit = js.native
  /**
    * noUiSlider will keep your values within the slider range, which saves you a bunch of validation.
    * If you have configured the slider to use one handle, you can change the current value by passing
    * a number to the .set() method. If you have two handles, pass an array. One-handled sliders
    * will also accept arrays. Within an array, you can set one position to null
    * if you want to leave a handle unchanged.
    */
  def set(value: Double): Unit = js.native
  /**
    * method that can change the 'margin',  'limit', 'step', 'range', 'animate' and  'snap' options.
    * All other options require changes to the slider's HTML or event bindings.
    */
  def updateOptions(newOptions: Options): Unit = js.native
  def updateOptions(newOptions: Options, fireSetEvent: Boolean): Unit = js.native
}

