package typings.mirada

import typings.mirada.miradaStrings.canvas
import typings.mirada.miradaStrings.video
import typings.mirada.miradaStrings.videoSize
import typings.mirada.mod.Mat
import typings.mirada.mod.Size
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBrowserVideoReaderMod {
  
  @JSImport("mirada/dist/src/browser/videoReader", "VideoReader")
  @js.native
  open class VideoReader protected () extends StObject {
    def this(video: HTMLVideoElement, canvas: HTMLCanvasElement) = this()
    def this(video: HTMLVideoElement, canvas: HTMLCanvasElement, o: Options) = this()
    
    def canPlay(): js.Promise[Any] = js.native
    
    /* protected */ var canvas: HTMLCanvasElement = js.native
    
    var ctx: CanvasRenderingContext2D = js.native
    
    /* protected */ def getSize(): Size = js.native
    
    var mat: Mat = js.native
    
    /* private */ var matCheck: Any = js.native
    
    /* protected */ var o: Options = js.native
    
    /**
      * reads current video frame into [mat]
      */
    def read(): Unit = js.native
    
    /* protected */ var size: Size = js.native
    
    def stop(): Unit = js.native
    
    /* protected */ var stream: js.UndefOr[MediaStream] = js.native
    
    /**
      * Indicates if the video is currently being processed
      */
    var streaming: Boolean = js.native
    
    /* protected */ var video: HTMLVideoElement = js.native
  }
  /* static members */
  object VideoReader {
    
    @JSImport("mirada/dist/src/browser/videoReader", "VideoReader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mirada/dist/src/browser/videoReader", "VideoReader.defaultOptions")
    @js.native
    def defaultOptions: Options = js.native
    inline def defaultOptions_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
  
  trait Options extends StObject {
    
    var constraints: js.UndefOr[MediaStreamConstraints] = js.undefined
    
    var noMatCheck: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[videoSize | video | canvas] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConstraints(value: MediaStreamConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setNoMatCheck(value: Boolean): Self = StObject.set(x, "noMatCheck", value.asInstanceOf[js.Any])
      
      inline def setNoMatCheckUndefined: Self = StObject.set(x, "noMatCheck", js.undefined)
      
      inline def setSize(value: videoSize | video | canvas): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
