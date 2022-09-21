package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera extends StObject {
  
  var DestinationType: CameraDestinationTypeObject = js.native
  
  var EncodingType: CameraEncodingTypeObject = js.native
  
  var MediaType: CameraMediaTypeObject = js.native
  
  var PictureSourceType: CameraPictureSourceTypeObject = js.native
  
  var PopoverArrowDirection: CameraPopoverArrowDirectionObject = js.native
  
  def cleanup(
    cameraSuccess: js.Function1[/* imageData */ String, Unit],
    cameraError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
  
  def getPicture(
    cameraSuccess: js.Function1[/* imageData */ String, Unit],
    cameraError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
  def getPicture(
    cameraSuccess: js.Function1[/* imageData */ String, Unit],
    cameraError: js.Function1[/* message */ String, Unit],
    cameraOptions: CameraOptions
  ): Unit = js.native
  
  var sourceType: Any = js.native
}
