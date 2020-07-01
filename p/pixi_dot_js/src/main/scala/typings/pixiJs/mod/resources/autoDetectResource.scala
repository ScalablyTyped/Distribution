package typings.pixiJs.mod.resources

import typings.pixiJs.anon.Crossorigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "resources.autoDetectResource")
@js.native
object autoDetectResource extends js.Object {
  /**
    * Create a resource element from a single source element. This
    * auto-detects which type of resource to create. All resources that
    * are auto-detectable must have a static `test` method and a constructor
    * with the arguments `(source, options?)`. Currently, the supported
    * resources for auto-detection include:
    *  - {@link PIXI.resources.ImageResource}
    *  - {@link PIXI.resources.CanvasResource}
    *  - {@link PIXI.resources.VideoResource}
    *  - {@link PIXI.resources.SVGResource}
    *  - {@link PIXI.resources.BufferResource}
    * @static
    * @function PIXI.resources.autoDetectResource
    * @param {string|*} source - Resource source, this can be the URL to the resource,
    *        a typed-array (for BufferResource), HTMLVideoElement, SVG data-uri
    *        or any other resource that can be auto-detected. If not resource is
    *        detected, it's assumed to be an ImageResource.
    * @param {object} [options] - Pass-through options to use for Resource
    * @param {number} [options.width] - Width of BufferResource or SVG rasterization
    * @param {number} [options.height] - Height of BufferResource or SVG rasterization
    * @param {boolean} [options.autoLoad=true] - Image, SVG and Video flag to start loading
    * @param {number} [options.scale=1] - SVG source scale. Overridden by width, height
    * @param {boolean} [options.createBitmap=PIXI.settings.CREATE_IMAGE_BITMAP] - Image option to create Bitmap object
    * @param {boolean} [options.crossorigin=true] - Image and Video option to set crossOrigin
    * @param {boolean} [options.autoPlay=true] - Video option to start playing video immediately
    * @param {number} [options.updateFPS=0] - Video option to update how many times a second the
    *        texture should be updated from the video. Leave at 0 to update at every render
    * @return {PIXI.resources.Resource} The created resource.
    */
  def apply(source: String): typings.pixiJs.PIXI.resources.Resource = js.native
  def apply(source: String, options: Crossorigin): typings.pixiJs.PIXI.resources.Resource = js.native
  def apply(source: js.Any): typings.pixiJs.PIXI.resources.Resource = js.native
  def apply(source: js.Any, options: Crossorigin): typings.pixiJs.PIXI.resources.Resource = js.native
}

