package typings.pixiJs.mod.resources

import typings.pixiJs.anon.AutoPlay
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource type for HTMLVideoElement.
  * @class
  * @extends PIXI.resources.BaseImageResource
  * @memberof PIXI.resources
  * @param {HTMLVideoElement|object|string|Array<string|object>} source - Video element to use.
  * @param {object} [options] - Options to use
  * @param {boolean} [options.autoLoad=true] - Start loading the video immediately
  * @param {boolean} [options.autoPlay=true] - Start playing video immediately
  * @param {number} [options.updateFPS=0] - How many times a second to update the texture from the video.
  * Leave at 0 to update at every render.
  * @param {boolean} [options.crossorigin=true] - Load image using cross origin
  */
@JSImport("pixi.js", "resources.VideoResource")
@js.native
class VideoResource protected ()
  extends typings.pixiJs.PIXI.resources.VideoResource {
  def this(source: String) = this()
  def this(source: js.Any) = this()
  def this(source: js.Array[String | _]) = this()
  def this(source: HTMLVideoElement) = this()
  def this(source: String, options: AutoPlay) = this()
  def this(source: js.Any, options: AutoPlay) = this()
  def this(source: js.Array[String | _], options: AutoPlay) = this()
  def this(source: HTMLVideoElement, options: AutoPlay) = this()
}

/* static members */
@JSImport("pixi.js", "resources.VideoResource")
@js.native
object VideoResource extends js.Object {
  /**
    * Map of video MIME types that can't be directly derived from file extensions.
    * @constant
    * @member {object}
    * @static
    * @readonly
    */
  val MIME_TYPES: js.Any = js.native
  /**
    * List of common video file extensions supported by VideoResource.
    * @constant
    * @member {Array<string>}
    * @static
    * @readonly
    */
  val TYPES: js.Array[String] = js.native
  /**
    * Used to auto-detect the type of resource.
    *
    * @static
    * @param {*} source - The source object
    * @param {string} extension - The extension of source, if set
    * @return {boolean} `true` if video source
    */
  def test(source: js.Any, extension: String): Boolean = js.native
}

