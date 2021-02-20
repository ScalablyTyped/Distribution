package typings.ol

import typings.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxMod {
  
  @JSImport("ol/render/Box", JSImport.Default)
  @js.native
  class default protected () extends RenderBox {
    def this(className: String) = this()
  }
  
  @js.native
  trait RenderBox
    extends typings.ol.disposableMod.default {
    
    /**
      * Creates or updates the cached geometry.
      */
    def createOrUpdateGeometry(): Unit = js.native
    
    def getGeometry(): typings.ol.polygonMod.default = js.native
    
    def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
    
    def setPixels(startPixel: Pixel, endPixel: Pixel): Unit = js.native
  }
}
