package typings
package openlayersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object openlayersMod {
  type AttributionLike = java.lang.String | js.Array[java.lang.String] | Attribution | js.Array[Attribution]
  type CanvasFunctionType = js.Function5[
    /* extent */ Extent, 
    /* resolution */ scala.Double, 
    /* pixelRatio */ scala.Double, 
    /* size */ Size, 
    /* proj */ openlayersLib.openlayersMod.projNs.Projection, 
    stdLib.HTMLCanvasElement
  ]
  type Color = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | stdLib.Uint8Array | stdLib.Uint8ClampedArray
  type ColorLike = java.lang.String | stdLib.CanvasPattern | stdLib.CanvasGradient
  type Coordinate = js.Tuple2[scala.Double, scala.Double]
  type CoordinateFormatType = js.Function1[/* coords */ js.UndefOr[Coordinate], java.lang.String]
  type DragBoxEndConditionType = js.Function3[/* event */ MapBrowserEvent, /* pixel1 */ Pixel, /* pixel2 */ Pixel, scala.Boolean]
  type DrawGeometryFunctionType = js.Function2[
    /* coords */ Coordinate | js.Array[Coordinate] | js.Array[js.Array[Coordinate]], 
    /* geo */ js.UndefOr[openlayersLib.openlayersMod.geomNs.SimpleGeometry], 
    openlayersLib.openlayersMod.geomNs.SimpleGeometry
  ]
  type EventsConditionType = js.Function1[/* event */ MapBrowserEvent, scala.Boolean]
  type EventsKey = GlobalObject
  type EventsListenerFunctionType = (js.Function1[/* evt */ openlayersLib.openlayersMod.eventsNs.Event, scala.Unit]) | (js.Function1[/* evt */ openlayersLib.openlayersMod.eventsNs.Event, scala.Boolean])
  type Extent = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type FeatureLoader = js.Function3[
    /* extent */ Extent, 
    /* resolution */ scala.Double, 
    /* proj */ openlayersLib.openlayersMod.projNs.Projection, 
    scala.Unit
  ]
  type FeatureStyleFunction = js.Function1[
    /* resolution */ scala.Double, 
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | scala.Null
  ]
  type FeatureUrlFunction = js.Function3[
    /* extent */ Extent, 
    /* resolution */ scala.Double, 
    /* proj */ openlayersLib.openlayersMod.projNs.Projection, 
    java.lang.String
  ]
  type ImageLoadFunctionType = js.Function2[/* image */ Image, /* url */ java.lang.String, scala.Unit]
  type ImageState = scala.Double
  type LoadingStrategy = js.Function2[/* extent */ Extent, /* resolution */ scala.Double, js.Array[Extent]]
  type ModifyEventType = java.lang.String
  type Pixel = js.Tuple2[scala.Double, scala.Double]
  type PreRenderFunction = js.Function2[
    /* map */ Map, 
    /* state */ js.UndefOr[openlayersLib.openlayersMod.olxNs.FrameState], 
    scala.Boolean
  ]
  type ProjectionLike = js.UndefOr[openlayersLib.openlayersMod.projNs.Projection | java.lang.String]
  type RasterOperation = js.Function2[
    /* data */ js.Array[js.Array[scala.Double]] | js.Array[stdLib.ImageData], 
    /* obj */ GlobalObject, 
    js.Array[scala.Double] | stdLib.ImageData
  ]
  type SelectFilterFunction = js.Function2[
    /* feature */ Feature | openlayersLib.openlayersMod.renderNs.Feature, 
    /* layer */ openlayersLib.openlayersMod.layerNs.Layer, 
    scala.Boolean
  ]
  type Size = js.Tuple2[scala.Double, scala.Double]
  type StyleFunction = js.Function2[
    /* feature */ Feature | openlayersLib.openlayersMod.renderNs.Feature, 
    /* resolution */ scala.Double, 
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | scala.Null
  ]
  type StyleGeometryFunction = js.Function1[
    /* feature */ Feature | openlayersLib.openlayersMod.renderNs.Feature, 
    openlayersLib.openlayersMod.geomNs.Geometry | openlayersLib.openlayersMod.renderNs.Feature
  ]
  type TileCoord = js.Tuple3[scala.Double, scala.Double, scala.Double]
  type TileLoadFunctionType = js.Function2[/* tile */ Tile, /* url */ java.lang.String, scala.Unit]
  type TileUrlFunctionType = js.Function3[
    /* coords */ TileCoord, 
    /* pixelRatio */ scala.Double, 
    /* proj */ openlayersLib.openlayersMod.projNs.Projection, 
    java.lang.String
  ]
  type TransformFunction = js.Function3[
    /* array */ js.Array[scala.Double], 
    /* out */ js.UndefOr[js.Array[scala.Double]], 
    /* dimension */ js.UndefOr[scala.Double], 
    js.Array[scala.Double]
  ]
  type WFSFeatureCollectionMetadata = GlobalObject
  type WFSTransactionResponse = GlobalObject
}
