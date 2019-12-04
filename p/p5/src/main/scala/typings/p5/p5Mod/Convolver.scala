package typings.p5.p5Mod

import typings.std.ConvolverNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Convolver extends Effect {
  /**
    *   Internally, the p5.Convolver uses the a  Web Audio
    *   Convolver Node.
    */
  var convolverNode: ConvolverNode = js.native
  /**
    *   If you load multiple impulse files using the
    *   .addImpulse method, they will be stored as Objects
    *   in this Array. Toggle between them with the
    *   toggleImpulse(id) method.
    */
  var impulses: js.Array[_] = js.native
  /**
    *   Load and assign a new Impulse Response to the
    *   p5.Convolver. The impulse is added to the
    *   .impulses array. Previous impulses can be accessed
    *   with the .toggleImpulse(id) method.
    *   @param path path to a sound file
    *   @param callback function (optional)
    *   @param errorCallback function (optional)
    */
  def addImpulse(
    path: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    errorCallback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  /**
    *   Create a p5.Convolver. Accepts a path to a
    *   soundfile that will be used to generate an impulse
    *   response.
    *   @param path path to a sound file
    *   @param [callback] function to call if loading is
    *   successful. The object will be passed in as the
    *   argument to the callback function.
    *   @param [errorCallback] function to call if loading
    *   is not successful. A custom error will be passed
    *   in as the argument to the callback function.
    */
  def createConvolver(path: String): Convolver = js.native
  def createConvolver(path: String, callback: js.Function1[/* repeated */ js.Any, _]): Convolver = js.native
  def createConvolver(
    path: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    errorCallback: js.Function1[/* repeated */ js.Any, _]
  ): Convolver = js.native
  /**
    *   Connect a source to the reverb, and assign reverb
    *   parameters.
    *   @param src p5.sound / Web Audio object with a
    *   sound output.
    */
  def process(src: js.Object): Unit = js.native
  /**
    *   Similar to .addImpulse, except that the .impulses
    *   Array is reset to save memory. A new .impulses
    *   array is created with this impulse as the only
    *   item.
    *   @param path path to a sound file
    *   @param callback function (optional)
    *   @param errorCallback function (optional)
    */
  def resetImpulse(
    path: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    errorCallback: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  /**
    *   Set the global tempo, in beats per minute, for all
    *   p5.Parts. This method will impact all active
    *   p5.Parts.
    *   @param BPM Beats Per Minute
    *   @param rampTime Seconds from now
    */
  def setBPM(BPM: Double, rampTime: Double): Unit = js.native
  /**
    *   If you have used .addImpulse() to add multiple
    *   impulses to a p5.Convolver, then you can use this
    *   method to toggle between the items in the
    *   .impulses Array. Accepts a parameter to identify
    *   which impulse you wish to use, identified either
    *   by its original filename (String) or by its
    *   position in the .impulses  Array (Number). You can
    *   access the objects in the .impulses Array
    *   directly. Each Object has two attributes: an
    *   .audioBuffer (type: Web Audio  AudioBuffer) and a
    *   .name, a String that corresponds with the original
    *   filename.
    *   @param id Identify the impulse by its original
    *   filename (String), or by its position in the
    *   .impulses Array (Number).
    */
  def toggleImpulse(id: String): Unit = js.native
  def toggleImpulse(id: Double): Unit = js.native
}

