package typings.onfidoOpencv.mod

import typings.mirada.distSrcBrowserVideoReaderMod.Options
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@onfido/opencv", "VideoReader")
@js.native
open class VideoReader protected ()
  extends typings.mirada.mod.VideoReader {
  def this(video: HTMLVideoElement, canvas: HTMLCanvasElement) = this()
  def this(video: HTMLVideoElement, canvas: HTMLCanvasElement, o: Options) = this()
}
/* static members */
object VideoReader {
  
  @JSImport("@onfido/opencv", "VideoReader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@onfido/opencv", "VideoReader.defaultOptions")
  @js.native
  def defaultOptions: Options = js.native
  inline def defaultOptions_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
}
