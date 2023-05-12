package typings.onfidoOpencv.mod

import org.scalablytyped.runtime.Instantiable3
import typings.mirada.anon.TypeofVideoReader
import typings.mirada.distSrcBrowserCanvasRenderMod.ABOptions
import typings.mirada.distSrcBrowserCanvasRenderMod.Result
import typings.mirada.distSrcBrowserVideoReaderMod.Options
import typings.std.HTMLCanvasElement
import typings.std.HTMLInputElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browser {
  
  @JSImport("@onfido/opencv", "browser")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@onfido/opencv", "browser.CameraHelper")
  @js.native
  open class CameraHelper protected ()
    extends typings.mirada.distSrcBrowserCameraHelperMod.CameraHelper {
    def this(videoInput: HTMLVideoElement, outputCanvas: HTMLCanvasElement, callback: js.Function0[Unit]) = this()
  }
  @JSImport("@onfido/opencv", "browser.CameraHelper")
  @js.native
  def CameraHelper: Instantiable3[
    /* videoInput */ HTMLVideoElement, 
    /* outputCanvas */ HTMLCanvasElement, 
    /* callback */ js.Function0[Unit], 
    typings.mirada.distSrcBrowserCameraHelperMod.CameraHelper
  ] = js.native
  inline def CameraHelper_=(
    x: Instantiable3[
      /* videoInput */ HTMLVideoElement, 
      /* outputCanvas */ HTMLCanvasElement, 
      /* callback */ js.Function0[Unit], 
      typings.mirada.distSrcBrowserCameraHelperMod.CameraHelper
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CameraHelper")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@onfido/opencv", "browser.VideoReader")
  @js.native
  open class VideoReader protected ()
    extends typings.mirada.distSrcBrowserVideoReaderMod.VideoReader {
    def this(video: HTMLVideoElement, canvas: HTMLCanvasElement) = this()
    def this(video: HTMLVideoElement, canvas: HTMLCanvasElement, o: Options) = this()
  }
  @JSImport("@onfido/opencv", "browser.VideoReader")
  @js.native
  def VideoReader: TypeofVideoReader = js.native
  inline def VideoReader_=(x: TypeofVideoReader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VideoReader")(x.asInstanceOf[js.Any])
  
  inline def asHtmlImageData(img: typings.mirada.mod.Mat): typings.std.ImageData = ^.asInstanceOf[js.Dynamic].applyDynamic("asHtmlImageData")(img.asInstanceOf[js.Any]).asInstanceOf[typings.std.ImageData]
  
  inline def fetchImageData(url: String): js.Promise[typings.std.ImageData] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchImageData")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.ImageData]]
  
  inline def fromInputFileElement(a: HTMLInputElement): js.Promise[js.Array[typings.mirada.mod.Mat]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInputFileElement")(a.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typings.mirada.mod.Mat]]]
  
  inline def renderArrayBufferInCanvas(a: js.typedarray.ArrayBuffer, mime: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderArrayBufferInCanvas")(a.asInstanceOf[js.Any], mime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def renderArrayBufferInCanvas(a: js.typedarray.ArrayBuffer, mime: String, options: ABOptions): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderArrayBufferInCanvas")(a.asInstanceOf[js.Any], mime.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  inline def renderInCanvas(mat: typings.mirada.mod.Mat): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("renderInCanvas")(mat.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  inline def renderInCanvas(mat: typings.mirada.mod.Mat, options: typings.mirada.distSrcBrowserCanvasRenderMod.Options): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("renderInCanvas")(mat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  inline def renderSvgInCanvas(svg: String): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSvgInCanvas")(svg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  inline def renderSvgInCanvas(svg: String, options: ABOptions): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSvgInCanvas")(svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
}
