package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.imageStateMod.ImageState
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageBaseMod {
  
  @JSImport("ol/ImageBase", JSImport.Default)
  @js.native
  abstract class default protected () extends ImageBase {
    def this(extent: Extent, resolution: Double, pixelRatio: Double, state: ImageState) = this()
    def this(extent: Extent, resolution: Unit, pixelRatio: Double, state: ImageState) = this()
  }
  
  @js.native
  trait ImageBase
    extends typings.ol.targetMod.default {
    
    /* protected */ def changed(): Unit = js.native
    
    var extent: Extent = js.native
    
    def getExtent(): Extent = js.native
    
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    def getPixelRatio(): Double = js.native
    
    def getResolution(): Double = js.native
    
    def getState(): ImageState = js.native
    
    /**
      * Load not yet loaded URI.
      */
    def load(): Unit = js.native
    
    var resolution: Double = js.native
    
    var state: ImageState = js.native
  }
}
