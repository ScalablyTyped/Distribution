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

/**
  * The tracked image interface that is created by the Image Tracking system and is provided as a
  * list from {@link XrImageTracking#images}. It contains information about the tracking state as
  * well as the position and rotation of the tracked image.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "XrTrackedImage")
@js.native
open class XrTrackedImage protected () extends EventHandler {
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
  
  /**
    * @type {ImageBitmap|null}
    * @private
    */
  /* private */ var _bitmap: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _emulated: Any = js.native
  
  /**
    * @type {HTMLCanvasElement|HTMLImageElement|SVGImageElement|HTMLVideoElement|Blob|ImageData|ImageBitmap}
    * @private
    */
  /* private */ var _image: Any = js.native
  
  /**
    * @type {number}
    * @ignore
    */
  var _measuredWidth: Double = js.native
  
  /**
    * @type {*}
    * @ignore
    */
  var _pose: Any = js.native
  
  /**
    * @type {Vec3}
    * @private
    */
  /* private */ var _position: Any = js.native
  
  /**
    * @type {Quat}
    * @private
    */
  /* private */ var _rotation: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _trackable: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _tracking: Any = js.native
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _width: Any = js.native
  
  /**
    * Destroys the tracked image.
    *
    * @ignore
    */
  def destroy(): Unit = js.native
  
  /**
    * True if image was recently tracked but currently is not actively tracked due to inability of
    * identifying the image by the underlying AR system. Position and rotation will be based on
    * the previously known transformation assuming the tracked image has not moved.
    *
    * @type {boolean}
    */
  def emulated: Boolean = js.native
  
  /**
    * Get the position of the tracked image. The position is the most recent one based on the
    * tracked image state.
    *
    * @returns {Vec3} Position in world space.
    * @example
    * // update entity position to match tracked image position
    * entity.setPosition(trackedImage.getPosition());
    */
  def getPosition(): Vec3 = js.native
  
  /**
    * Get the rotation of the tracked image. The rotation is the most recent based on the tracked
    * image state.
    *
    * @returns {Quat} Rotation in world space.
    * @example
    * // update entity rotation to match tracked image rotation
    * entity.setRotation(trackedImage.getRotation());
    */
  def getRotation(): Quat = js.native
  
  /**
    * Fired when image becomes actively tracked.
    *
    * @event XrTrackedImage#tracked
    */
  /**
    * Fired when image is no more actively tracked.
    *
    * @event XrTrackedImage#untracked
    */
  /**
    * Image that is used for tracking.
    *
    * @type {HTMLCanvasElement|HTMLImageElement|SVGImageElement|HTMLVideoElement|Blob|ImageData|ImageBitmap}
    */
  def image: Blob | ImageBitmap | HTMLCanvasElement | HTMLImageElement | SVGImageElement | HTMLVideoElement | ImageData = js.native
  
  /**
    * @returns {Promise<ImageBitmap>} Promise that resolves to an image bitmap.
    * @ignore
    */
  def prepare(): js.Promise[ImageBitmap] = js.native
  
  /**
    * True if image is trackable. A too small resolution or invalid images can be untrackable by
    * the underlying AR system.
    *
    * @type {boolean}
    */
  def trackable: Boolean = js.native
  
  /**
    * True if image is in tracking state and being tracked in real world by the underlying AR
    * system.
    *
    * @type {boolean}
    */
  def tracking: Boolean = js.native
  
  def width: Double = js.native
  /**
    * Width that is provided to assist tracking performance. This property can be updated only
    * when the AR session is not running.
    *
    * @type {number}
    */
  def width_=(arg: Double): Unit = js.native
}
