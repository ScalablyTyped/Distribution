package typings.openlayers

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.openlayersMod.eventsNs.Event
import typings.openlayers.openlayersMod.geomNs.Geometry
import typings.openlayers.openlayersMod.geomNs.SimpleGeometry
import typings.openlayers.openlayersMod.layerNs.Layer
import typings.openlayers.openlayersMod.olxNs.FrameState
import typings.openlayers.openlayersMod.projNs.Projection
import typings.openlayers.openlayersMod.styleNs.Style
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.HTMLCanvasElement
import typings.std.ImageData
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object openlayersMod {
  type AttributionLike = String | (js.Array[Attribution | String]) | Attribution
  type CanvasFunctionType = js.Function5[
    /* extent */ Extent, 
    /* resolution */ Double, 
    /* pixelRatio */ Double, 
    /* size */ Size, 
    /* proj */ Projection, 
    HTMLCanvasElement
  ]
  type Color = (js.Tuple4[Double, Double, Double, Double]) | Uint8Array | Uint8ClampedArray
  type ColorLike = String | CanvasPattern | CanvasGradient
  type Coordinate = js.Tuple2[Double, Double]
  type CoordinateFormatType = js.Function1[/* coords */ js.UndefOr[Coordinate], String]
  type DragBoxEndConditionType = js.Function3[/* event */ MapBrowserEvent, /* pixel1 */ Pixel, /* pixel2 */ Pixel, Boolean]
  type DrawGeometryFunctionType = js.Function2[
    /* coords */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), 
    /* geo */ js.UndefOr[SimpleGeometry], 
    SimpleGeometry
  ]
  type EventsConditionType = js.Function1[/* event */ MapBrowserEvent, Boolean]
  type EventsKey = GlobalObject
  type EventsListenerFunctionType = js.Function1[/* evt */ Event, Boolean | Unit]
  type Extent = js.Tuple4[Double, Double, Double, Double]
  type FeatureLoader = js.Function3[/* extent */ Extent, /* resolution */ Double, /* proj */ Projection, Unit]
  type FeatureStyleFunction = js.Function1[/* resolution */ Double, Style | js.Array[Style] | Null]
  type FeatureUrlFunction = js.Function3[/* extent */ Extent, /* resolution */ Double, /* proj */ Projection, String]
  type GlobalObject = StringDictionary[js.Any]
  type ImageLoadFunctionType = js.Function2[/* image */ Image, /* url */ String, Unit]
  type ImageState = Double
  type LoadingStrategy = js.Function2[/* extent */ Extent, /* resolution */ Double, js.Array[Extent]]
  type ModifyEventType = String
  type Pixel = js.Tuple2[Double, Double]
  type PreRenderFunction = js.Function2[/* map */ Map, /* state */ js.UndefOr[FrameState], Boolean]
  type ProjectionLike = js.UndefOr[Projection | String]
  type RasterOperation = js.Function2[
    /* data */ js.Array[js.Array[Double] | ImageData], 
    /* obj */ GlobalObject, 
    js.Array[Double] | ImageData
  ]
  type SelectFilterFunction = js.Function2[
    /* feature */ Feature | typings.openlayers.openlayersMod.renderNs.Feature, 
    /* layer */ Layer, 
    Boolean
  ]
  type Size = js.Tuple2[Double, Double]
  type StyleFunction = js.Function2[
    /* feature */ Feature | typings.openlayers.openlayersMod.renderNs.Feature, 
    /* resolution */ Double, 
    Style | js.Array[Style] | Null
  ]
  type StyleGeometryFunction = js.Function1[
    /* feature */ Feature | typings.openlayers.openlayersMod.renderNs.Feature, 
    Geometry | typings.openlayers.openlayersMod.renderNs.Feature
  ]
  type TileCoord = js.Tuple3[Double, Double, Double]
  type TileLoadFunctionType = js.Function2[/* tile */ Tile, /* url */ String, Unit]
  type TileUrlFunctionType = js.Function3[/* coords */ TileCoord, /* pixelRatio */ Double, /* proj */ Projection, String]
  type TransformFunction = js.Function3[
    /* array */ js.Array[Double], 
    /* out */ js.UndefOr[js.Array[Double]], 
    /* dimension */ js.UndefOr[Double], 
    js.Array[Double]
  ]
  type WFSFeatureCollectionMetadata = GlobalObject
  type WFSTransactionResponse = GlobalObject
}
