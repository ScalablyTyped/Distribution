package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.ComponentFramework.DeviceApi.CaptureImageOptions
import typings.powerappsComponentFramework.ComponentFramework.DeviceApi.PickFileOptions
import typings.powerappsComponentFramework.ComponentFramework.DeviceApi.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the context.device
  */
@js.native
trait Device extends js.Object {
  
  /**
    * Invokes the device microphone to record audio.
    */
  def captureAudio(): js.Promise[FileObject] = js.native
  
  /**
    * Invokes the device camera to capture an image.
    */
  def captureImage(): js.Promise[FileObject] = js.native
  def captureImage(options: CaptureImageOptions): js.Promise[FileObject] = js.native
  
  /**
    * Invokes the device camera to record video.
    */
  def captureVideo(): js.Promise[FileObject] = js.native
  
  /**
    * Invokes the device camera to scan the barcode information, such as a product number.
    */
  def getBarcodeValue(): js.Promise[String] = js.native
  
  /**
    * Returns the current location using the device geolocation capability.
    */
  def getCurrentPosition(): js.Promise[Position] = js.native
  
  /**
    * Opens a dialog box to select files from your computer (web client) or mobile device (mobile clients).
    */
  def pickFile(): js.Promise[js.Array[FileObject]] = js.native
  def pickFile(options: PickFileOptions): js.Promise[js.Array[FileObject]] = js.native
}
