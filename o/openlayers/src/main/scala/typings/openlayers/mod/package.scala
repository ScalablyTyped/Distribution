package typings.openlayers.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.^
import typings.openlayers.mod.events.Event
import typings.openlayers.mod.geom.Geometry
import typings.openlayers.mod.geom.SimpleGeometry
import typings.openlayers.mod.layer.Layer
import typings.openlayers.mod.olx.FrameState
import typings.openlayers.mod.proj.Projection
import typings.openlayers.mod.style.Style
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.HTMLCanvasElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def inherits(childCtor: js.Function0[Any], parentCtor: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(childCtor.asInstanceOf[js.Any], parentCtor.asInstanceOf[js.Any])).asInstanceOf[Unit]

type AttributionLike = String | (js.Array[Attribution | String]) | Attribution

type CanvasFunctionType = js.Function5[
/* extent */ Extent_, 
/* resolution */ Double, 
/* pixelRatio */ Double, 
/* size */ Size, 
/* proj */ Projection, 
HTMLCanvasElement]

type ColorLike_ = String | CanvasPattern | CanvasGradient

type Color_ = (js.Tuple4[Double, Double, Double, Double]) | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray

type CoordinateFormatType = js.Function1[/* coords */ js.UndefOr[Coordinate_], String]

type Coordinate_ = js.Tuple2[Double, Double]

type DragBoxEndConditionType = js.Function3[/* event */ MapBrowserEvent, /* pixel1 */ Pixel, /* pixel2 */ Pixel, Boolean]

type DrawGeometryFunctionType = js.Function2[
/* coords */ Coordinate_ | (js.Array[js.Array[Coordinate_] | Coordinate_]), 
/* geo */ js.UndefOr[SimpleGeometry], 
SimpleGeometry]

type EventsConditionType = js.Function1[/* event */ MapBrowserEvent, Boolean]

type EventsKey = GlobalObject

type EventsListenerFunctionType = js.Function1[/* evt */ Event, Boolean | Unit]

type Extent_ = js.Tuple4[Double, Double, Double, Double]

type FeatureLoader_ = js.Function3[/* extent */ Extent_, /* resolution */ Double, /* proj */ Projection, Unit]

type FeatureStyleFunction = js.Function1[/* resolution */ Double, Style | js.Array[Style] | Null]

type FeatureUrlFunction = js.Function3[/* extent */ Extent_, /* resolution */ Double, /* proj */ Projection, String]

type GlobalObject = StringDictionary[Any]

type ImageLoadFunctionType = js.Function2[/* image */ Image, /* url */ String, Unit]

type ImageState = Double

type LoadingStrategy_ = js.Function2[/* extent */ Extent_, /* resolution */ Double, js.Array[Extent_]]

type ModifyEventType = String

type Pixel = js.Tuple2[Double, Double]

type PreRenderFunction = js.Function2[/* map */ Map, /* state */ js.UndefOr[FrameState], Boolean]

type ProjectionLike = js.UndefOr[Projection | String]

type RasterOperation = js.Function2[
/* data */ js.Array[js.Array[Double] | ImageData], 
/* obj */ GlobalObject, 
js.Array[Double] | ImageData]

type SelectFilterFunction = js.Function2[
/* feature */ Feature | typings.openlayers.mod.render.Feature, 
/* layer */ Layer, 
Boolean]

type Size = js.Tuple2[Double, Double]

type StyleFunction = js.Function2[
/* feature */ Feature | typings.openlayers.mod.render.Feature, 
/* resolution */ Double, 
Style | js.Array[Style] | Null]

type StyleGeometryFunction = js.Function1[
/* feature */ Feature | typings.openlayers.mod.render.Feature, 
Geometry | typings.openlayers.mod.render.Feature]

type TileCoord = js.Tuple3[Double, Double, Double]

type TileLoadFunctionType = js.Function2[/* tile */ Tile, /* url */ String, Unit]

type TileUrlFunctionType = js.Function3[/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection, String]

type TransformFunction = js.Function3[
/* array */ js.Array[Double], 
/* out */ js.UndefOr[js.Array[Double]], 
/* dimension */ js.UndefOr[Double], 
js.Array[Double]]

type WFSFeatureCollectionMetadata = GlobalObject

type WFSTransactionResponse = GlobalObject
