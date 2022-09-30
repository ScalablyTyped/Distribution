package typings.pixiJs.mod

import typings.pixiCore.mod.ImageSource
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "BaseImageResource")
@js.native
open class BaseImageResource protected ()
  extends typings.pixiCore.mod.BaseImageResource {
  /**
    * @param {HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|SVGElement} source
    */
  def this(source: ImageSource) = this()
}
/* static members */
object BaseImageResource {
  
  @JSImport("pixi.js", "BaseImageResource")
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
