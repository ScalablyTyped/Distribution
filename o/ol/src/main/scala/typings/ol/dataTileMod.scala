package typings.ol

import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTileMod {
  
  @JSImport("ol/DataTile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {Object} Options
    * @property {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
    * @property {function(): Promise<Data>} loader Data loader.  For loaders that generate images,
    * the promise should not resolve until the image is loaded.
    * @property {number} [transition=250] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    * @property {import('./size.js').Size} [size=[256, 256]] Tile size.
    * @api
    */
  @JSImport("ol/DataTile", JSImport.Default)
  @js.native
  open class default protected () extends DataTile {
    /**
      * @param {Options} options Tile options.
      */
    def this(options: Options) = this()
  }
  
  inline def asArrayLike(data: Data): ArrayLike | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asArrayLike")(data.asInstanceOf[js.Any]).asInstanceOf[ArrayLike | Null]
  
  inline def asImageLike(data: Data): ImageLike | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asImageLike")(data.asInstanceOf[js.Any]).asInstanceOf[ImageLike | Null]
  
  inline def toArray(image: ImageLike): js.typedarray.Uint8ClampedArray = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(image.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8ClampedArray]
  
  type ArrayLike = js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.DataView
  
  type Data = ArrayLike | ImageLike
  
  /**
    * @typedef {Object} Options
    * @property {import("./tilecoord.js").TileCoord} tileCoord Tile coordinate.
    * @property {function(): Promise<Data>} loader Data loader.  For loaders that generate images,
    * the promise should not resolve until the image is loaded.
    * @property {number} [transition=250] A duration for tile opacity
    * transitions in milliseconds. A duration of 0 disables the opacity transition.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    * @property {import('./size.js').Size} [size=[256, 256]] Tile size.
    * @api
    */
  @js.native
  trait DataTile
    extends typings.ol.tileMod.default {
    
    /**
      * @type {Data}
      * @private
      */
    /* private */ var data_ : Any = js.native
    
    /**
      * @type {Error}
      * @private
      */
    /* private */ var error_ : Any = js.native
    
    /**
      * Get the data for the tile.
      * @return {Data} Tile data.
      * @api
      */
    def getData(): Data = js.native
    
    /**
      * Get any loading error.
      * @return {Error} Loading error.
      * @api
      */
    def getError(): js.Error = js.native
    
    /**
      * Get the tile size.
      * @return {import('./size.js').Size} Tile size.
      */
    def getSize(): Size = js.native
    
    /**
      * @type {function(): Promise<Data>}
      * @private
      */
    /* private */ var loader_ : Any = js.native
    
    /**
      * @type {import('./size.js').Size|null}
      * @private
      */
    /* private */ var size_ : Any = js.native
  }
  
  type ImageLike = HTMLImageElement | HTMLCanvasElement | HTMLVideoElement
  
  trait Options extends StObject {
    
    /**
      * Use interpolated values when resampling.  By default,
      * the nearest neighbor is used when resampling.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Data loader.  For loaders that generate images,
      * the promise should not resolve until the image is loaded.
      */
    def loader(): js.Promise[Data]
    
    /**
      * Tile size.
      */
    var size: js.UndefOr[Size] = js.undefined
    
    /**
      * Tile coordinate.
      */
    var tileCoord: TileCoord
    
    /**
      * A duration for tile opacity
      * transitions in milliseconds. A duration of 0 disables the opacity transition.
      */
    var transition: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(loader: () => js.Promise[Data], tileCoord: TileCoord): Options = {
      val __obj = js.Dynamic.literal(loader = js.Any.fromFunction0(loader), tileCoord = tileCoord.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setLoader(value: () => js.Promise[Data]): Self = StObject.set(x, "loader", js.Any.fromFunction0(value))
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
      
      inline def setTileCoord(value: TileCoord): Self = StObject.set(x, "tileCoord", value.asInstanceOf[js.Any])
      
      inline def setTileCoordVarargs(value: Double*): Self = StObject.set(x, "tileCoord", js.Array(value*))
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
}
