package typings.pixiCore.mod

import typings.pixiCore.libTexturesResourcesVideoResourceMod.IVideoResourceOptions
import typings.pixiCore.libTexturesResourcesVideoResourceMod.IVideoResourceOptionsElement
import typings.pixiUtils.libTypesMod.Dict
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "VideoResource")
@js.native
/**
  * @param {HTMLVideoElement|object|string|Array<string|object>} source - Video element to use.
  * @param {object} [options] - Options to use
  * @param {boolean} [options.autoLoad=true] - Start loading the video immediately
  * @param {boolean} [options.autoPlay=true] - Start playing video immediately
  * @param {number} [options.updateFPS=0] - How many times a second to update the texture from the video.
  * Leave at 0 to update at every render.
  * @param {boolean} [options.crossorigin=true] - Load image using cross origin
  */
open class VideoResource ()
  extends typings.pixiCore.libTexturesResourcesMod.VideoResource {
  def this(source: String) = this()
  def this(source: js.Array[String | IVideoResourceOptionsElement]) = this()
  def this(source: HTMLVideoElement) = this()
  def this(source: String, options: IVideoResourceOptions) = this()
  def this(source: js.Array[String | IVideoResourceOptionsElement], options: IVideoResourceOptions) = this()
  def this(source: Unit, options: IVideoResourceOptions) = this()
  def this(source: HTMLVideoElement, options: IVideoResourceOptions) = this()
}
/* static members */
object VideoResource {
  
  @JSImport("@pixi/core", "VideoResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Map of video MIME types that can't be directly derived from file extensions.
    * @readonly
    */
  @JSImport("@pixi/core", "VideoResource.MIME_TYPES")
  @js.native
  def MIME_TYPES: Dict[String] = js.native
  inline def MIME_TYPES_=(x: Dict[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIME_TYPES")(x.asInstanceOf[js.Any])
  
  /**
    * List of common video file extensions supported by VideoResource.
    * @readonly
    */
  @JSImport("@pixi/core", "VideoResource.TYPES")
  @js.native
  def TYPES: js.Array[String] = js.native
  inline def TYPES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPES")(x.asInstanceOf[js.Any])
  
  /**
    * Used to auto-detect the type of resource.
    * @param {*} source - The source object
    * @param {string} extension - The extension of source, if set
    * @returns {boolean} `true` if video source
    */
  inline def test(source: Any): /* is std.HTMLVideoElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLVideoElement */ Boolean]
  inline def test(source: Any, `extension`: String): /* is std.HTMLVideoElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLVideoElement */ Boolean]
}
