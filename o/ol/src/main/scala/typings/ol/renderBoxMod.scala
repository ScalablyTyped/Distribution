package typings.ol

import typings.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderBoxMod {
  
  @JSImport("ol/render/Box", JSImport.Default)
  @js.native
  open class default protected () extends RenderBox {
    /**
      * @param {string} className CSS class name.
      */
    def this(className: String) = this()
  }
  
  @js.native
  trait RenderBox
    extends typings.ol.disposableMod.default {
    
    /**
      * Creates or updates the cached geometry.
      */
    def createOrUpdateGeometry(): Unit = js.native
    
    /**
      * @type {HTMLDivElement}
      * @private
      */
    /* private */ var element_ : Any = js.native
    
    /**
      * @private
      * @type {import("../pixel.js").Pixel}
      */
    /* private */ var endPixel_ : Any = js.native
    
    /**
      * @type {import("../geom/Polygon.js").default}
      * @private
      */
    /* private */ var geometry_ : Any = js.native
    
    /**
      * @return {import("../geom/Polygon.js").default} Geometry.
      */
    def getGeometry(): typings.ol.geomPolygonMod.default = js.native
    
    /**
      * @private
      * @type {import("../Map.js").default|null}
      */
    /* private */ var map_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var render_ : Any = js.native
    
    /**
      * @param {import("../Map.js").default|null} map Map.
      */
    def setMap(): Unit = js.native
    def setMap(map: typings.ol.rendererMapMod.default): Unit = js.native
    
    /**
      * @param {import("../pixel.js").Pixel} startPixel Start pixel.
      * @param {import("../pixel.js").Pixel} endPixel End pixel.
      */
    def setPixels(startPixel: Pixel, endPixel: Pixel): Unit = js.native
    
    /**
      * @private
      * @type {import("../pixel.js").Pixel}
      */
    /* private */ var startPixel_ : Any = js.native
  }
}
