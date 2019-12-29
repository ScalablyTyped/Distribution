package typings.ol

import typings.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/Box", JSImport.Namespace)
@js.native
object renderBoxMod extends js.Object {
  @js.native
  trait RenderBox
    extends typings.ol.disposableMod.default {
    def createOrUpdateGeometry(): Unit = js.native
    def getGeometry(): typings.ol.geomPolygonMod.default = js.native
    def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
    def setPixels(startPixel: Pixel, endPixel: Pixel): Unit = js.native
  }
  
  @js.native
  class default protected () extends RenderBox {
    def this(className: String) = this()
  }
  
}

