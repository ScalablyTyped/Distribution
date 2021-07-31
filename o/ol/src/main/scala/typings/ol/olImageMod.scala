package typings.ol

import typings.ol.extentMod.Extent
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object olImageMod {
  
  @JSImport("ol/Image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/Image", JSImport.Default)
  @js.native
  class default protected () extends ImageWrapper {
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Unit,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
  }
  
  @scala.inline
  def listenImage(image: HTMLCanvasElement, loadHandler: js.Function0[js.Any], errorHandler: js.Function0[js.Any]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listenImage")(image.asInstanceOf[js.Any], loadHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def listenImage(image: HTMLImageElement, loadHandler: js.Function0[js.Any], errorHandler: js.Function0[js.Any]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listenImage")(image.asInstanceOf[js.Any], loadHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  @scala.inline
  def listenImage(image: HTMLVideoElement, loadHandler: js.Function0[js.Any], errorHandler: js.Function0[js.Any]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listenImage")(image.asInstanceOf[js.Any], loadHandler.asInstanceOf[js.Any], errorHandler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  @js.native
  trait ImageWrapper
    extends typings.ol.imageBaseMod.default {
    
    def setImage(image: HTMLCanvasElement): Unit = js.native
    def setImage(image: HTMLImageElement): Unit = js.native
    def setImage(image: HTMLVideoElement): Unit = js.native
  }
  
  type LoadFunction = js.Function2[/* p0 */ ImageWrapper, /* p1 */ String, Unit]
}
