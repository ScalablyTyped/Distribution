package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capture extends js.Object {
  def captureAudio(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    captureError: js.Function1[/* error */ CaptureError, scala.Unit]
  ): scala.Unit = js.native
  def captureAudio(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    captureError: js.Function1[/* error */ CaptureError, scala.Unit],
    options: CaptureAudioOptions
  ): scala.Unit = js.native
  def captureImage(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    captureError: js.Function1[/* error */ CaptureError, scala.Unit]
  ): scala.Unit = js.native
  def captureImage(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    captureError: js.Function1[/* error */ CaptureError, scala.Unit],
    options: CaptureImageOptions
  ): scala.Unit = js.native
  def captureVideo(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    captureError: js.Function1[/* error */ CaptureError, scala.Unit]
  ): scala.Unit = js.native
  def captureVideo(
    captureSuccess: js.Function1[/* mediaFiles */ js.Array[MediaFile], scala.Unit],
    captureError: js.Function1[/* error */ CaptureError, scala.Unit],
    options: CaptureImageOptions
  ): scala.Unit = js.native
}

