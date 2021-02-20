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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ol", "AssertionError")
  @js.native
  class AssertionError protected () extends default {
    def this(code: Double) = this()
  }
  
  @JSImport("ol", "Collection")
  @js.native
  class Collection[T] ()
    extends typings.ol.collectionMod.default[T] {
    def this(opt_array: js.Array[T]) = this()
    def this(opt_array: js.UndefOr[scala.Nothing], opt_options: Options) = this()
    def this(opt_array: js.Array[T], opt_options: Options) = this()
  }
  
  @JSImport("ol", "Disposable")
  @js.native
  class Disposable ()
    extends typings.ol.disposableMod.default
  
  @JSImport("ol", "Feature")
  @js.native
  class Feature[GeomType /* <: typings.ol.geometryMod.default */] ()
    extends typings.ol.olFeatureMod.default[GeomType] {
    def this(opt_geometryOrProperties: GeomType) = this()
    def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("ol", "Geolocation")
  @js.native
  class Geolocation ()
    extends typings.ol.geolocationMod.default {
    def this(opt_options: typings.ol.geolocationMod.Options) = this()
  }
  
  @JSImport("ol", "Graticule")
  @js.native
  class Graticule ()
    extends typings.ol.graticuleMod.default {
    def this(opt_options: typings.ol.graticuleMod.Options) = this()
  }
  
  @JSImport("ol", "Image")
  @js.native
  class Image protected ()
    extends typings.ol.olImageMod.default {
    def this(
      extent: Extent,
      resolution: js.UndefOr[scala.Nothing],
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Double,
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
    def this(extent: Extent, resolution: js.UndefOr[scala.Nothing], pixelRatio: Double, state: ImageState) = this()
    def this(extent: Extent, resolution: Double, pixelRatio: Double, state: ImageState) = this()
  }
  
  @JSImport("ol", "ImageCanvas")
  @js.native
  class ImageCanvas protected ()
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
  class ImageTile protected ()
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
  class Kinetic protected ()
    extends typings.ol.kineticMod.default {
    def this(decay: Double, minVelocity: Double, delay: Double) = this()
  }
  
  @JSImport("ol", "Map")
  @js.native
  class Map protected ()
    extends typings.ol.olMapMod.default {
    def this(options: MapOptions) = this()
  }
  
  @JSImport("ol", "MapBrowserEvent")
  @js.native
  class MapBrowserEvent[EVENT /* <: UIEvent */] protected ()
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
      opt_dragging: js.UndefOr[scala.Nothing],
      opt_frameState: FrameState
    ) = this()
    def this(
      `type`: String,
      map: typings.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Boolean,
      opt_frameState: FrameState
    ) = this()
  }
  
  @JSImport("ol", "MapBrowserEventHandler")
  @js.native
  class MapBrowserEventHandler protected ()
    extends typings.ol.mapBrowserEventHandlerMod.default {
    def this(map: typings.ol.pluggableMapMod.default) = this()
    def this(map: typings.ol.pluggableMapMod.default, moveTolerance: Double) = this()
  }
  
  @JSImport("ol", "MapEvent")
  @js.native
  class MapEvent protected ()
    extends typings.ol.mapEventMod.default {
    def this(`type`: String, map: typings.ol.pluggableMapMod.default) = this()
    def this(`type`: String, map: typings.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
  }
  
  @JSImport("ol", "Object")
  @js.native
  class Object ()
    extends typings.ol.objectMod.default {
    def this(opt_values: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("ol", "Observable")
  @js.native
  class Observable ()
    extends typings.ol.observableMod.default
  
  @JSImport("ol", "Overlay")
  @js.native
  class Overlay protected ()
    extends typings.ol.overlayMod.default {
    def this(options: typings.ol.overlayMod.Options) = this()
  }
  
  @JSImport("ol", "PluggableMap")
  @js.native
  class PluggableMap protected ()
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
  class TileCache ()
    extends typings.ol.tileCacheMod.default
  
  @JSImport("ol", "TileQueue")
  @js.native
  class TileQueue protected ()
    extends typings.ol.tileQueueMod.default {
    def this(tilePriorityFunction: PriorityFunction, tileChangeCallback: js.Function0[_]) = this()
  }
  
  @JSImport("ol", "TileRange")
  @js.native
  class TileRange protected ()
    extends typings.ol.tileRangeMod.default {
    def this(minX: Double, maxX: Double, minY: Double, maxY: Double) = this()
  }
  
  @JSImport("ol", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("ol", "VectorRenderTile")
  @js.native
  class VectorRenderTile protected ()
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
  class VectorTile protected ()
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
  class View ()
    extends typings.ol.viewMod.default {
    def this(opt_options: ViewOptions) = this()
  }
  
  @JSImport("ol", "getUid")
  @js.native
  def getUid(obj: js.Any): String = js.native
}
