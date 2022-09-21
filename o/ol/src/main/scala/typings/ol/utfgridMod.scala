package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.tileJSONMod.Config
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utfgridMod {
  
  @JSImport("ol/source/UTFGrid", JSImport.Default)
  @js.native
  open class default protected () extends UTFGrid {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/UTFGrid", "CustomTile")
  @js.native
  open class CustomTile protected ()
    extends typings.ol.olTileMod.default {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      extent: Extent,
      preemptive: Boolean,
      jsonp: Boolean
    ) = this()
    
    /**
      * Calls the callback (synchronously by default) with the available data
      * for given coordinate (or null if not yet loaded).
      */
    def forDataAtCoordinate(coordinate: Coordinate, callback: js.Function1[/* p0 */ Any, Unit]): Unit = js.native
    def forDataAtCoordinate(coordinate: Coordinate, callback: js.Function1[/* p0 */ Any, Unit], opt_request: Boolean): Unit = js.native
    
    /**
      * Synchronously returns data at given coordinate (if available).
      */
    def getData(coordinate: Coordinate): Any = js.native
    
    /**
      * Get the image element for this tile.
      */
    def getImage(): HTMLImageElement = js.native
  }
  
  trait Options extends StObject {
    
    var jsonp: js.UndefOr[Boolean] = js.undefined
    
    var preemptive: js.UndefOr[Boolean] = js.undefined
    
    var tileJSON: js.UndefOr[Config] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
      
      inline def setPreemptive(value: Boolean): Self = StObject.set(x, "preemptive", value.asInstanceOf[js.Any])
      
      inline def setPreemptiveUndefined: Self = StObject.set(x, "preemptive", js.undefined)
      
      inline def setTileJSON(value: Config): Self = StObject.set(x, "tileJSON", value.asInstanceOf[js.Any])
      
      inline def setTileJSONUndefined: Self = StObject.set(x, "tileJSON", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait UTFGrid
    extends typings.ol.sourceTileMod.default {
    
    /**
      * Calls the callback (synchronously by default) with the available data
      * for given coordinate and resolution (or null if not yet loaded or
      * in case of an error).
      */
    def forDataAtCoordinateAndResolution(coordinate: Coordinate, resolution: Double, callback: js.Function1[/* p0 */ Any, Unit]): Unit = js.native
    def forDataAtCoordinateAndResolution(
      coordinate: Coordinate,
      resolution: Double,
      callback: js.Function1[/* p0 */ Any, Unit],
      opt_request: Boolean
    ): Unit = js.native
    
    /**
      * Return the template from TileJSON.
      */
    def getTemplate(): js.UndefOr[String] = js.native
    
    /* protected */ def handleTileJSONError(): Unit = js.native
    
    /**
      * TODO: very similar to ol/source/TileJSON#handleTileJSONResponse
      */
    /* protected */ def handleTileJSONResponse(tileJSON: Config): Unit = js.native
    
    /**
      * Marks a tile coord as being used, without triggering a load.
      */
    def useTile(z: Double, x: Double, y: Double): Unit = js.native
  }
  
  trait UTFGridJSON extends StObject {
    
    var data: js.UndefOr[StringDictionary[js.Object]] = js.undefined
    
    var grid: js.Array[String]
    
    var keys: js.Array[String]
  }
  object UTFGridJSON {
    
    inline def apply(grid: js.Array[String], keys: js.Array[String]): UTFGridJSON = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[UTFGridJSON]
    }
    
    extension [Self <: UTFGridJSON](x: Self) {
      
      inline def setData(value: StringDictionary[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setGrid(value: js.Array[String]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridVarargs(value: String*): Self = StObject.set(x, "grid", js.Array(value*))
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    }
  }
}
