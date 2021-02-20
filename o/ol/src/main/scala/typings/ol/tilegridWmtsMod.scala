package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilegridWmtsMod {
  
  @JSImport("ol/tilegrid/WMTS", JSImport.Default)
  @js.native
  class default protected () extends WMTSTileGrid {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/tilegrid/WMTS", "createFromCapabilitiesMatrixSet")
  @js.native
  def createFromCapabilitiesMatrixSet(matrixSet: js.Any): WMTSTileGrid = js.native
  @JSImport("ol/tilegrid/WMTS", "createFromCapabilitiesMatrixSet")
  @js.native
  def createFromCapabilitiesMatrixSet(matrixSet: js.Any, opt_extent: js.UndefOr[scala.Nothing], opt_matrixLimits: js.Array[js.Object]): WMTSTileGrid = js.native
  @JSImport("ol/tilegrid/WMTS", "createFromCapabilitiesMatrixSet")
  @js.native
  def createFromCapabilitiesMatrixSet(matrixSet: js.Any, opt_extent: Extent): WMTSTileGrid = js.native
  @JSImport("ol/tilegrid/WMTS", "createFromCapabilitiesMatrixSet")
  @js.native
  def createFromCapabilitiesMatrixSet(matrixSet: js.Any, opt_extent: Extent, opt_matrixLimits: js.Array[js.Object]): WMTSTileGrid = js.native
  
  @js.native
  trait Options extends StObject {
    
    var extent: js.UndefOr[Extent] = js.native
    
    var matrixIds: js.Array[String] = js.native
    
    var origin: js.UndefOr[Coordinate] = js.native
    
    var origins: js.UndefOr[js.Array[Coordinate]] = js.native
    
    var resolutions: js.Array[Double] = js.native
    
    var sizes: js.UndefOr[js.Array[Size]] = js.native
    
    var tileSize: js.UndefOr[Double | Size] = js.native
    
    var tileSizes: js.UndefOr[js.Array[Size]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(matrixIds: js.Array[String], resolutions: js.Array[Double]): Options = {
      val __obj = js.Dynamic.literal(matrixIds = matrixIds.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setMatrixIds(value: js.Array[String]): Self = StObject.set(x, "matrixIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixIdsVarargs(value: String*): Self = StObject.set(x, "matrixIds", js.Array(value :_*))
      
      @scala.inline
      def setOrigin(value: Coordinate): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOriginVarargs(value: Double*): Self = StObject.set(x, "origin", js.Array(value :_*))
      
      @scala.inline
      def setOrigins(value: js.Array[Coordinate]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      @scala.inline
      def setOriginsVarargs(value: Coordinate*): Self = StObject.set(x, "origins", js.Array(value :_*))
      
      @scala.inline
      def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
      
      @scala.inline
      def setSizes(value: js.Array[Size]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSizesVarargs(value: Size*): Self = StObject.set(x, "sizes", js.Array(value :_*))
      
      @scala.inline
      def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      @scala.inline
      def setTileSizes(value: js.Array[Size]): Self = StObject.set(x, "tileSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileSizesUndefined: Self = StObject.set(x, "tileSizes", js.undefined)
      
      @scala.inline
      def setTileSizesVarargs(value: Size*): Self = StObject.set(x, "tileSizes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WMTSTileGrid
    extends typings.ol.tilegridTileGridMod.default {
    
    def getMatrixId(z: Double): String = js.native
    
    /**
      * Get the list of matrix identifiers.
      */
    def getMatrixIds(): js.Array[String] = js.native
  }
}
