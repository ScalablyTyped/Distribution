package typings.pixiCore.mod

import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "BaseImageResource")
@js.native
open class BaseImageResource protected () extends Resource {
  /**
    * @param {HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|SVGElement} source
    */
  def this(source: ImageSource) = this()
  
  /**
    * If set to `true`, will force `texImage2D` over `texSubImage2D` for uploading.
    * Certain types of media (e.g. video) using `texImage2D` is more performant.
    * @default false
    * @private
    */
  var noSubImage: Boolean = js.native
  
  /**
    * The source element.
    * @member {HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|SVGElement}
    * @readonly
    */
  var source: ImageSource = js.native
  
  def upload(
    renderer: Renderer,
    baseTexture: BaseTexture[Resource, IAutoDetectOptions],
    glTexture: GLTexture,
    source: ImageSource
  ): Boolean = js.native
}
/* static members */
object BaseImageResource {
  
  @JSImport("@pixi/core", "BaseImageResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Set cross origin based detecting the url and the crossorigin
    * @param element - Element to apply crossOrigin
    * @param url - URL to check
    * @param crossorigin - Cross origin value to use
    */
  inline def crossOrigin(element: HTMLImageElement, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def crossOrigin(element: HTMLImageElement, url: String, crossorigin: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any], crossorigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def crossOrigin(element: HTMLImageElement, url: String, crossorigin: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any], crossorigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def crossOrigin(element: HTMLVideoElement, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def crossOrigin(element: HTMLVideoElement, url: String, crossorigin: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any], crossorigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def crossOrigin(element: HTMLVideoElement, url: String, crossorigin: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any], crossorigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
