package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.assertionErrorMod.default
import typings.ol.collectionMod.Options
import typings.ol.extentMod.Extent
import typings.ol.imageStateMod.ImageState
import typings.ol.olImageCanvasMod.Loader
import typings.ol.olImageMod.LoadFunction
import typings.ol.pluggableMapMod.FrameState
import typings.ol.pluggableMapMod.MapOptions
import typings.ol.tileQueueMod.PriorityFunction
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import typings.ol.viewMod.ViewOptions
import typings.std.HTMLCanvasElement
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol", "AssertionError")
  @js.native
  open class AssertionError protected () extends default {
    def this(code: Double) = this()
  }
  
  @JSImport("ol", "Collection")
  @js.native
  open class Collection[T] ()
    extends typings.ol.collectionMod.default[T] {
    def this(opt_array: js.Array[T]) = this()
    def this(opt_array: js.Array[T], opt_options: Options) = this()
    def this(opt_array: Unit, opt_options: Options) = this()
  }
  
  @JSImport("ol", "Disposable")
  @js.native
  open class Disposable ()
    extends typings.ol.disposableMod.default
  
  @JSImport("ol", "Feature")
  @js.native
  open class Feature[GeomType /* <: typings.ol.geometryMod.default */] ()
    extends typings.ol.olFeatureMod.default[GeomType] {
    def this(opt_geometryOrProperties: GeomType) = this()
    def this(opt_geometryOrProperties: StringDictionary[Any]) = this()
  }
  
  @JSImport("ol", "Geolocation")
  @js.native
  open class Geolocation ()
    extends typings.ol.geolocationMod.default {
    def this(opt_options: typings.ol.geolocationMod.Options) = this()
  }
  
  @JSImport("ol", "Graticule")
  @js.native
  open class Graticule ()
    extends typings.ol.graticuleMod.default {
    def this(opt_options: typings.ol.graticuleMod.Options) = this()
  }
  
  @JSImport("ol", "Image")
  @js.native
  open class Image protected ()
    extends typings.ol.olImageMod.default {
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Unit,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
  }
  
  @JSImport("ol", "ImageBase")
  @js.native
  abstract class ImageBase protected ()
    extends typings.ol.imageBaseMod.default {
    def this(extent: Extent, resolution: Double, pixelRatio: Double, state: ImageState) = this()
    def this(extent: Extent, resolution: Unit, pixelRatio: Double, state: ImageState) = this()
  }
  
  @JSImport("ol", "ImageCanvas")
  @js.native
  open class ImageCanvas protected ()
    extends typings.ol.olImageCanvasMod.default {
    def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      canvas: HTMLCanvasElement,
      opt_loader: Loader
    ) = this()
  }
  
  @JSImport("ol", "ImageTile")
  @js.native
  open class ImageTile protected ()
    extends typings.ol.imageTileMod.default {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: typings.ol.olTileMod.LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: typings.ol.olTileMod.LoadFunction,
      opt_options: typings.ol.olTileMod.Options
    ) = this()
  }
  
  @JSImport("ol", "Kinetic")
  @js.native
  open class Kinetic protected ()
    extends typings.ol.kineticMod.default {
    def this(decay: Double, minVelocity: Double, delay: Double) = this()
  }
  
  @JSImport("ol", "Map")
  @js.native
  open class Map protected ()
    extends typings.ol.olMapMod.default {
    def this(options: MapOptions) = this()
  }
  
  @JSImport("ol", "MapBrowserEvent")
  @js.native
  open class MapBrowserEvent[EVENT /* <: UIEvent */] protected ()
    extends typings.ol.mapBrowserEventMod.default[EVENT] {
    def this(`type`: String, map: typings.ol.pluggableMapMod.default, originalEvent: EVENT) = this()
    def this(
      `type`: String,
      map: typings.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Boolean
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Boolean,
      opt_frameState: FrameState
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Unit,
      opt_frameState: FrameState
    ) = this()
  }
  
  @JSImport("ol", "MapBrowserEventHandler")
  @js.native
  open class MapBrowserEventHandler protected ()
    extends typings.ol.mapBrowserEventHandlerMod.default {
    def this(map: typings.ol.pluggableMapMod.default) = this()
    def this(map: typings.ol.pluggableMapMod.default, moveTolerance: Double) = this()
  }
  
  @JSImport("ol", "MapEvent")
  @js.native
  open class MapEvent protected ()
    extends typings.ol.mapEventMod.default {
    def this(`type`: String, map: typings.ol.pluggableMapMod.default) = this()
    def this(`type`: String, map: typings.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
  }
  
  @JSImport("ol", "Object")
  @js.native
  open class Object ()
    extends typings.ol.objectMod.default {
    def this(opt_values: StringDictionary[Any]) = this()
  }
  
  @JSImport("ol", "Observable")
  @js.native
  open class Observable ()
    extends typings.ol.observableMod.default
  
  @JSImport("ol", "Overlay")
  @js.native
  open class Overlay protected ()
    extends typings.ol.overlayMod.default {
    def this(options: typings.ol.overlayMod.Options) = this()
  }
  
  @JSImport("ol", "PluggableMap")
  @js.native
  open class PluggableMap protected ()
    extends typings.ol.pluggableMapMod.default {
    def this(options: MapOptions) = this()
  }
  
  @JSImport("ol", "Tile")
  @js.native
  abstract class Tile protected ()
    extends typings.ol.olTileMod.default {
    def this(tileCoord: TileCoord, state: TileState) = this()
    def this(tileCoord: TileCoord, state: TileState, opt_options: typings.ol.olTileMod.Options) = this()
  }
  
  @JSImport("ol", "TileCache")
  @js.native
  open class TileCache ()
    extends typings.ol.tileCacheMod.default
  
  @JSImport("ol", "TileQueue")
  @js.native
  open class TileQueue protected ()
    extends typings.ol.tileQueueMod.default {
    def this(tilePriorityFunction: PriorityFunction, tileChangeCallback: js.Function0[Any]) = this()
  }
  
  @JSImport("ol", "TileRange")
  @js.native
  open class TileRange protected ()
    extends typings.ol.tileRangeMod.default {
    def this(minX: Double, maxX: Double, minY: Double, maxY: Double) = this()
  }
  
  @JSImport("ol", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("ol", "VectorRenderTile")
  @js.native
  open class VectorRenderTile protected ()
    extends typings.ol.vectorRenderTileMod.default {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      urlTileCoord: TileCoord,
      getSourceTiles: js.Function1[
            /* p0 */ typings.ol.vectorRenderTileMod.VectorRenderTile, 
            js.Array[typings.ol.olVectorTileMod.default]
          ]
    ) = this()
  }
  
  @JSImport("ol", "VectorTile")
  @js.native
  open class VectorTile protected ()
    extends typings.ol.olVectorTileMod.default {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typings.ol.featureMod.default,
      tileLoadFunction: typings.ol.olTileMod.LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typings.ol.featureMod.default,
      tileLoadFunction: typings.ol.olTileMod.LoadFunction,
      opt_options: typings.ol.olTileMod.Options
    ) = this()
  }
  
  @JSImport("ol", "View")
  @js.native
  open class View ()
    extends typings.ol.viewMod.default {
    def this(opt_options: ViewOptions) = this()
  }
  
  inline def getUid(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
