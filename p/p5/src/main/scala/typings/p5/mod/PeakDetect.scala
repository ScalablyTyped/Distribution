package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeakDetect extends js.Object {
  /**
    *   onPeak accepts two arguments: a function to call
    *   when a peak is detected. The value of the peak,
    *   between 0.0 and 1.0, is passed to the callback.
    *   @param callback Name of a function that will be
    *   called when a peak is detected.
    *   @param [val] Optional value to pass into the
    *   function when a peak is detected.
    */
  def onPeak(callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def onPeak(callback: js.Function1[/* repeated */ js.Any, _], `val`: js.Object): Unit = js.native
  /**
    *   The update method is run in the draw loop. Accepts
    *   an FFT object. You must call .analyze() on the FFT
    *   object prior to updating the peakDetect because it
    *   relies on a completed FFT analysis.
    *   @param fftObject A p5.FFT object
    */
  def update(fftObject: FFT): Unit = js.native
}

