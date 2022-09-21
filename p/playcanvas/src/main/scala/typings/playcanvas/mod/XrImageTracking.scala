package typings.playcanvas.mod

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

/** @typedef {import('./xr-manager.js').XrManager} XrManager */
/**
  * Image Tracking provides the ability to track real world images by provided image samples and
  * their estimated sizes.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "XrImageTracking")
@js.native
open class XrImageTracking protected () extends EventHandler {
  /**
    * Image Tracking provides the ability to track real world images by provided image samples and
    * their estimate sizes.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: XrManager) = this()
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _available: Any = js.native
  
  /**
    * @type {XrTrackedImage[]}
    * @private
    */
  /* private */ var _images: Any = js.native
  
  /**
    * @type {XrManager}
    * @private
    */
  /* private */ var _manager: Any = js.native
  
  /** @private */
  /* private */ var _onSessionEnd: Any = js.native
  
  /** @private */
  /* private */ var _onSessionStart: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _supported: Any = js.native
  
  def add(image: Blob, width: Double): XrTrackedImage | Null = js.native
  /**
    * Fired when the XR session is started, but image tracking failed to process the provided
    * images.
    *
    * @event XrImageTracking#error
    * @param {Error} error - Error object related to a failure of image tracking.
    */
  /**
    * Add an image for image tracking. A width can also be provided to help the underlying system
    * estimate the appropriate transformation. Modifying the tracked images list is only possible
    * before an AR session is started.
    *
    * @param {HTMLCanvasElement|HTMLImageElement|SVGImageElement|HTMLVideoElement|Blob|ImageData|ImageBitmap} image - Image
    * that is matching real world image as close as possible. Resolution of images should be at
    * least 300x300. High resolution does NOT improve tracking performance. Color of image is
    * irrelevant, so grayscale images can be used. Images with too many geometric features or
    * repeating patterns will reduce tracking stability.
    * @param {number} width - Width (in meters) of image in the real world. Providing this value
    * as close to the real value will improve tracking quality.
    * @returns {XrTrackedImage|null} Tracked image object that will contain tracking information.
    * Returns null if image tracking is not supported or if the XR manager is not active.
    * @example
    * // image with width of 20cm (0.2m)
    * app.xr.imageTracking.add(bookCoverImg, 0.2);
    */
  def add(image: HTMLCanvasElement, width: Double): XrTrackedImage | Null = js.native
  def add(image: HTMLImageElement, width: Double): XrTrackedImage | Null = js.native
  def add(image: HTMLVideoElement, width: Double): XrTrackedImage | Null = js.native
  def add(image: ImageBitmap, width: Double): XrTrackedImage | Null = js.native
  def add(image: ImageData, width: Double): XrTrackedImage | Null = js.native
  def add(image: SVGImageElement, width: Double): XrTrackedImage | Null = js.native
  
  /**
    * True if Image Tracking is available. This property will be false if no images were provided
    * for the AR session or there was an error processing the provided images.
    *
    * @type {boolean}
    */
  def available: Boolean = js.native
  
  /**
    * List of {@link XrTrackedImage} that contain tracking information.
    *
    * @type {XrTrackedImage[]}
    */
  def images: js.Array[XrTrackedImage] = js.native
  
  /**
    * @param {Function} callback - Function to call when all images have been prepared as image
    * bitmaps.
    * @ignore
    */
  def prepareImages(callback: js.Function): Unit = js.native
  
  /**
    * Remove an image from image tracking.
    *
    * @param {XrTrackedImage} trackedImage - Tracked image to be removed. Modifying the tracked
    * images list is only possible before an AR session is started.
    */
  def remove(trackedImage: XrTrackedImage): Unit = js.native
  
  /**
    * True if Image Tracking is supported.
    *
    * @type {boolean}
    */
  def supported: Boolean = js.native
  
  /**
    * @param {*} frame - XRFrame from requestAnimationFrame callback.
    * @ignore
    */
  def update(frame: Any): Unit = js.native
}
