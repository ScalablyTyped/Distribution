package typings.playcanvas.global.pc

import typings.std.Blob
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.std.SVGImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The tracked image interface that is created by the Image Tracking system and is provided as a
  * list from {@link XrImageTracking#images}. It contains information about the tracking state as
  * well as the position and rotation of the tracked image.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.XrTrackedImage")
@js.native
open class XrTrackedImage protected ()
  extends typings.playcanvas.mod.XrTrackedImage {
  def this(image: Blob, width: Double) = this()
  /**
    * The tracked image interface that is created by the Image Tracking system and is provided as
    * a list from {@link XrImageTracking#images}. It contains information about the tracking state
    * as well as the position and rotation of the tracked image.
    *
    * @param {HTMLCanvasElement|HTMLImageElement|SVGImageElement|HTMLVideoElement|Blob|ImageData|ImageBitmap} image - Image
    * that is matching the real world image as closely as possible. Resolution of images should be
    * at least 300x300. High resolution does NOT improve tracking performance. Color of image is
    * irrelevant, so grayscale images can be used. Images with too many geometric features or
    * repeating patterns will reduce tracking stability.
    * @param {number} width - Width (in meters) of image in real world. Providing this value as
    * close to the real value will improve tracking quality.
    * @hideconstructor
    */
  def this(image: HTMLCanvasElement, width: Double) = this()
  def this(image: HTMLImageElement, width: Double) = this()
  def this(image: HTMLVideoElement, width: Double) = this()
  def this(image: ImageBitmap, width: Double) = this()
  def this(image: ImageData, width: Double) = this()
  def this(image: SVGImageElement, width: Double) = this()
}
