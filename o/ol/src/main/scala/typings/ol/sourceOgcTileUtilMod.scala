package typings.ol

import typings.ol.projProjectionMod.default
import typings.ol.tileMod.UrlFunction
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceOgcTileUtilMod {
  
  @JSImport("ol/source/ogcTileUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMapTileUrlTemplate(links: js.Array[Link]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMapTileUrlTemplate")(links.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getMapTileUrlTemplate(links: js.Array[Link], mediaType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMapTileUrlTemplate")(links.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTileSetInfo(sourceInfo: SourceInfo): js.Promise[TileSetInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTileSetInfo")(sourceInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TileSetInfo]]
  
  inline def getVectorTileUrlTemplate(links: js.Array[Link]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVectorTileUrlTemplate")(links.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getVectorTileUrlTemplate(links: js.Array[Link], mediaType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getVectorTileUrlTemplate")(links.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getVectorTileUrlTemplate(links: js.Array[Link], mediaType: String, supportedMediaTypes: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getVectorTileUrlTemplate")(links.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any], supportedMediaTypes.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getVectorTileUrlTemplate(links: js.Array[Link], mediaType: Unit, supportedMediaTypes: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getVectorTileUrlTemplate")(links.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any], supportedMediaTypes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.topLeft
    - typings.ol.olStrings.bottomLeft
  */
  trait CornerOfOrigin extends StObject
  object CornerOfOrigin {
    
    inline def bottomLeft: typings.ol.olStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.ol.olStrings.bottomLeft]
    
    inline def topLeft: typings.ol.olStrings.topLeft = "topLeft".asInstanceOf[typings.ol.olStrings.topLeft]
  }
  
  trait Link extends StObject {
    
    /**
      * The link URL.
      */
    var href: String
    
    /**
      * The link rel attribute.
      */
    var rel: String
    
    /**
      * The link type.
      */
    var `type`: String
  }
  object Link {
    
    inline def apply(href: String, rel: String, `type`: String): Link = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceInfo extends StObject {
    
    /**
      * Optional context for constructing the URL.
      */
    var context: js.UndefOr[Any] = js.undefined
    
    /**
      * The preferred tile media type.
      */
    var mediaType: String
    
    /**
      * The source projection.
      */
    var projection: default
    
    /**
      * The supported media types.
      */
    var supportedMediaTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The tile set URL.
      */
    var url: String
  }
  object SourceInfo {
    
    inline def apply(mediaType: String, projection: default, url: String): SourceInfo = {
      val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceInfo] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setProjection(value: default): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setSupportedMediaTypes(value: js.Array[String]): Self = StObject.set(x, "supportedMediaTypes", value.asInstanceOf[js.Any])
      
      inline def setSupportedMediaTypesUndefined: Self = StObject.set(x, "supportedMediaTypes", js.undefined)
      
      inline def setSupportedMediaTypesVarargs(value: String*): Self = StObject.set(x, "supportedMediaTypes", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait TileMatrix extends StObject {
    
    /**
      * The pixel resolution (map units per pixel).
      */
    var cellSize: Double
    
    /**
      * The corner of the matrix that represents the origin ('topLeft' or 'bottomLeft').
      */
    var cornerOfOrigin: js.UndefOr[CornerOfOrigin] = js.undefined
    
    /**
      * The tile matrix identifier.
      */
    var id: String
    
    /**
      * The number of rows.
      */
    var matrixHeight: Double
    
    /**
      * The number of columns.
      */
    var matrixWidth: Double
    
    /**
      * The map location of the matrix origin.
      */
    var pointOfOrigin: js.Array[Double]
    
    /**
      * The pixel height of a tile.
      */
    var tileHeight: Double
    
    /**
      * The pixel width of a tile.
      */
    var tileWidth: Double
  }
  object TileMatrix {
    
    inline def apply(
      cellSize: Double,
      id: String,
      matrixHeight: Double,
      matrixWidth: Double,
      pointOfOrigin: js.Array[Double],
      tileHeight: Double,
      tileWidth: Double
    ): TileMatrix = {
      val __obj = js.Dynamic.literal(cellSize = cellSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], matrixHeight = matrixHeight.asInstanceOf[js.Any], matrixWidth = matrixWidth.asInstanceOf[js.Any], pointOfOrigin = pointOfOrigin.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileMatrix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileMatrix] (val x: Self) extends AnyVal {
      
      inline def setCellSize(value: Double): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
      
      inline def setCornerOfOrigin(value: CornerOfOrigin): Self = StObject.set(x, "cornerOfOrigin", value.asInstanceOf[js.Any])
      
      inline def setCornerOfOriginUndefined: Self = StObject.set(x, "cornerOfOrigin", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMatrixHeight(value: Double): Self = StObject.set(x, "matrixHeight", value.asInstanceOf[js.Any])
      
      inline def setMatrixWidth(value: Double): Self = StObject.set(x, "matrixWidth", value.asInstanceOf[js.Any])
      
      inline def setPointOfOrigin(value: js.Array[Double]): Self = StObject.set(x, "pointOfOrigin", value.asInstanceOf[js.Any])
      
      inline def setPointOfOriginVarargs(value: Double*): Self = StObject.set(x, "pointOfOrigin", js.Array(value*))
      
      inline def setTileHeight(value: Double): Self = StObject.set(x, "tileHeight", value.asInstanceOf[js.Any])
      
      inline def setTileWidth(value: Double): Self = StObject.set(x, "tileWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait TileMatrixSet extends StObject {
    
    /**
      * The coordinate reference system.
      */
    var crs: String
    
    /**
      * The tile matrix set identifier.
      */
    var id: String
    
    /**
      * Array of tile matrices.
      */
    var tileMatrices: js.Array[TileMatrix]
  }
  object TileMatrixSet {
    
    inline def apply(crs: String, id: String, tileMatrices: js.Array[TileMatrix]): TileMatrixSet = {
      val __obj = js.Dynamic.literal(crs = crs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tileMatrices = tileMatrices.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileMatrixSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileMatrixSet] (val x: Self) extends AnyVal {
      
      inline def setCrs(value: String): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTileMatrices(value: js.Array[TileMatrix]): Self = StObject.set(x, "tileMatrices", value.asInstanceOf[js.Any])
      
      inline def setTileMatricesVarargs(value: TileMatrix*): Self = StObject.set(x, "tileMatrices", js.Array(value*))
    }
  }
  
  trait TileMatrixSetLimit extends StObject {
    
    /**
      * The maximum tile column.
      */
    var maxTileCol: Double
    
    /**
      * The maximum tile row.
      */
    var maxTileRow: Double
    
    /**
      * The minimum tile column.
      */
    var minTileCol: Double
    
    /**
      * The minimum tile row.
      */
    var minTileRow: Double
    
    /**
      * The tile matrix id.
      */
    var tileMatrix: String
  }
  object TileMatrixSetLimit {
    
    inline def apply(maxTileCol: Double, maxTileRow: Double, minTileCol: Double, minTileRow: Double, tileMatrix: String): TileMatrixSetLimit = {
      val __obj = js.Dynamic.literal(maxTileCol = maxTileCol.asInstanceOf[js.Any], maxTileRow = maxTileRow.asInstanceOf[js.Any], minTileCol = minTileCol.asInstanceOf[js.Any], minTileRow = minTileRow.asInstanceOf[js.Any], tileMatrix = tileMatrix.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileMatrixSetLimit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileMatrixSetLimit] (val x: Self) extends AnyVal {
      
      inline def setMaxTileCol(value: Double): Self = StObject.set(x, "maxTileCol", value.asInstanceOf[js.Any])
      
      inline def setMaxTileRow(value: Double): Self = StObject.set(x, "maxTileRow", value.asInstanceOf[js.Any])
      
      inline def setMinTileCol(value: Double): Self = StObject.set(x, "minTileCol", value.asInstanceOf[js.Any])
      
      inline def setMinTileRow(value: Double): Self = StObject.set(x, "minTileRow", value.asInstanceOf[js.Any])
      
      inline def setTileMatrix(value: String): Self = StObject.set(x, "tileMatrix", value.asInstanceOf[js.Any])
    }
  }
  
  trait TileSet extends StObject {
    
    /**
      * Type of data represented in the tileset.
      */
    var dataType: TileType
    
    /**
      * Tileset links.
      */
    var links: js.Array[Link]
    
    /**
      * Tile matrix set definition.
      */
    var tileMatrixSet: js.UndefOr[TileMatrixSet] = js.undefined
    
    /**
      * Reference to a tile matrix set definition.
      */
    var tileMatrixSetDefinition: js.UndefOr[String] = js.undefined
    
    /**
      * Tile matrix set limits.
      */
    var tileMatrixSetLimits: js.UndefOr[js.Array[TileMatrixSetLimit]] = js.undefined
  }
  object TileSet {
    
    inline def apply(dataType: TileType, links: js.Array[Link]): TileSet = {
      val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileSet] (val x: Self) extends AnyVal {
      
      inline def setDataType(value: TileType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setTileMatrixSet(value: TileMatrixSet): Self = StObject.set(x, "tileMatrixSet", value.asInstanceOf[js.Any])
      
      inline def setTileMatrixSetDefinition(value: String): Self = StObject.set(x, "tileMatrixSetDefinition", value.asInstanceOf[js.Any])
      
      inline def setTileMatrixSetDefinitionUndefined: Self = StObject.set(x, "tileMatrixSetDefinition", js.undefined)
      
      inline def setTileMatrixSetLimits(value: js.Array[TileMatrixSetLimit]): Self = StObject.set(x, "tileMatrixSetLimits", value.asInstanceOf[js.Any])
      
      inline def setTileMatrixSetLimitsUndefined: Self = StObject.set(x, "tileMatrixSetLimits", js.undefined)
      
      inline def setTileMatrixSetLimitsVarargs(value: TileMatrixSetLimit*): Self = StObject.set(x, "tileMatrixSetLimits", js.Array(value*))
      
      inline def setTileMatrixSetUndefined: Self = StObject.set(x, "tileMatrixSet", js.undefined)
    }
  }
  
  trait TileSetInfo extends StObject {
    
    /**
      * The tile grid.
      */
    var grid: typings.ol.tilegridTileGridMod.default
    
    /**
      * The tile URL function.
      */
    def urlFunction(arg0: TileCoord, arg1: Double, arg2: default): js.UndefOr[String]
    /**
      * The tile URL function.
      */
    @JSName("urlFunction")
    var urlFunction_Original: UrlFunction
    
    /**
      * The tile URL template.
      */
    var urlTemplate: String
  }
  object TileSetInfo {
    
    inline def apply(
      grid: typings.ol.tilegridTileGridMod.default,
      urlFunction: (/* arg0 */ TileCoord, /* arg1 */ Double, /* arg2 */ default) => js.UndefOr[String],
      urlTemplate: String
    ): TileSetInfo = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], urlFunction = js.Any.fromFunction3(urlFunction), urlTemplate = urlTemplate.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileSetInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileSetInfo] (val x: Self) extends AnyVal {
      
      inline def setGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction(value: (/* arg0 */ TileCoord, /* arg1 */ Double, /* arg2 */ default) => js.UndefOr[String]): Self = StObject.set(x, "urlFunction", js.Any.fromFunction3(value))
      
      inline def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.map
    - typings.ol.olStrings.vector
  */
  trait TileType extends StObject
  object TileType {
    
    inline def map: typings.ol.olStrings.map = "map".asInstanceOf[typings.ol.olStrings.map]
    
    inline def vector: typings.ol.olStrings.vector = "vector".asInstanceOf[typings.ol.olStrings.vector]
  }
}
