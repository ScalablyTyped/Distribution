package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Camera extends js.Object {
  var DestinationType: CameraDestinationTypeObject = js.native
  var EncodingType: CameraEncodingTypeObject = js.native
  var MediaType: CameraMediaTypeObject = js.native
  var PictureSourceType: CameraPictureSourceTypeObject = js.native
  var PopoverArrowDirection: CameraPopoverArrowDirectionObject = js.native
  var sourceType: js.Any = js.native
  def cleanup(
    cameraSuccess: js.Function1[/* imageData */ java.lang.String, scala.Unit],
    cameraError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getPicture(
    cameraSuccess: js.Function1[/* imageData */ java.lang.String, scala.Unit],
    cameraError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getPicture(
    cameraSuccess: js.Function1[/* imageData */ java.lang.String, scala.Unit],
    cameraError: js.Function1[/* message */ java.lang.String, scala.Unit],
    cameraOptions: CameraOptions
  ): scala.Unit = js.native
}

