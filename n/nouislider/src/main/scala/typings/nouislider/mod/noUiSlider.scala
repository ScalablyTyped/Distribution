package typings.nouislider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait noUiSlider extends js.Object {
  
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
    * Exposes the options used to create the noUiSlider instance
    */
  var options: Options = js.native
  
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
    * `noUiSlider` has an update method that can change the `margin`,
    * `padding`, `limit`, `step`, `range`, `pips`, `tooltips`, `animate` and `snap` options.
    * All other options require changes to the slider's HTML or event bindings.
    * Options that can not be updated will be ignored without errors.
    * The value null can be used to unset a previously set value.
    * The `set` event fires when the slider values are restored.
    * If this is unwanted, you can pass false as the second parameter, `fireSetEvent`.
    * Note that if you initiate multiple sliders using the same options object
    * and update a subset of them later, this will move the options property out of sync
    * with the actual slider options.
    */
  def updateOptions(newOptions: UpdateOptions): Unit = js.native
  def updateOptions(newOptions: UpdateOptions, fireSetEvent: Boolean): Unit = js.native
}
