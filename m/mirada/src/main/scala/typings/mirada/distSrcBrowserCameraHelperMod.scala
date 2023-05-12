package typings.mirada

import typings.mirada.miradaStrings.qvga
import typings.mirada.miradaStrings.vga
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBrowserCameraHelperMod {
  
  @JSImport("mirada/dist/src/browser/cameraHelper", "CameraHelper")
  @js.native
  open class CameraHelper protected () extends StObject {
    def this(videoInput: HTMLVideoElement, outputCanvas: HTMLCanvasElement, callback: js.Function0[Unit]) = this()
    
    def callback(): Unit = js.native
    
    /* protected */ var onCameraStartedCallback: js.UndefOr[
        js.Function2[
          /* stream */ js.UndefOr[MediaStream], 
          /* videoInput */ js.UndefOr[HTMLVideoElement], 
          Any
        ]
      ] = js.native
    
    /* protected */ def onVideoCanPlay(): Unit = js.native
    
    /* protected */ def onVideoStarted(): Unit = js.native
    
    /* protected */ def onVideoStopped(): Unit = js.native
    
    var outputCanvas: HTMLCanvasElement = js.native
    
    def start(): Unit = js.native
    
    def startCamera(resolution: qvga | vga, callback: js.Function1[/* repeated */ Any, Any], video: HTMLVideoElement): Unit = js.native
    
    def stop(): Unit = js.native
    
    def stopCamera(): Unit = js.native
    
    /* protected */ var stream: js.UndefOr[MediaStream] = js.native
    
    var streaming: Boolean = js.native
    
    var videoInput: HTMLVideoElement = js.native
  }
}
