package typings.openlayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AttributionLike = java.lang.String | (js.Array[typings.openlayers.mod.Attribution | java.lang.String]) | typings.openlayers.mod.Attribution
  
  type CanvasFunctionType = js.Function5[
    /* extent */ typings.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    /* pixelRatio */ scala.Double, 
    /* size */ typings.openlayers.mod.Size, 
    /* proj */ typings.openlayers.mod.proj.Projection, 
    typings.std.HTMLCanvasElement
  ]
  
  type ColorLike_ = java.lang.String | typings.std.CanvasPattern | typings.std.CanvasGradient
  
  type Color_ = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | typings.std.Uint8Array | typings.std.Uint8ClampedArray
  
  type CoordinateFormatType = js.Function1[/* coords */ js.UndefOr[typings.openlayers.mod.Coordinate_], java.lang.String]
  
  type Coordinate_ = js.Tuple2[scala.Double, scala.Double]
  
  type DragBoxEndConditionType = js.Function3[
    /* event */ typings.openlayers.mod.MapBrowserEvent, 
    /* pixel1 */ typings.openlayers.mod.Pixel, 
    /* pixel2 */ typings.openlayers.mod.Pixel, 
    scala.Boolean
  ]
  
  type DrawGeometryFunctionType = js.Function2[
    /* coords */ typings.openlayers.mod.Coordinate_ | (js.Array[
      js.Array[typings.openlayers.mod.Coordinate_] | typings.openlayers.mod.Coordinate_
    ]), 
    /* geo */ js.UndefOr[typings.openlayers.mod.geom.SimpleGeometry], 
    typings.openlayers.mod.geom.SimpleGeometry
  ]
  
  type EventsConditionType = js.Function1[/* event */ typings.openlayers.mod.MapBrowserEvent, scala.Boolean]
  
  type EventsKey = typings.openlayers.mod.GlobalObject
  
  type EventsListenerFunctionType = js.Function1[/* evt */ typings.openlayers.mod.events.Event, scala.Boolean | scala.Unit]
  
  type Extent_ = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  
  type FeatureLoader_ = js.Function3[
    /* extent */ typings.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    /* proj */ typings.openlayers.mod.proj.Projection, 
    scala.Unit
  ]
  
  type FeatureStyleFunction = js.Function1[
    /* resolution */ scala.Double, 
    typings.openlayers.mod.style.Style | js.Array[typings.openlayers.mod.style.Style] | scala.Null
  ]
  
  type FeatureUrlFunction = js.Function3[
    /* extent */ typings.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    /* proj */ typings.openlayers.mod.proj.Projection, 
    java.lang.String
  ]
  
  type GlobalObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ImageLoadFunctionType = js.Function2[/* image */ typings.openlayers.mod.Image, /* url */ java.lang.String, scala.Unit]
  
  type ImageState = scala.Double
  
  type LoadingStrategy_ = js.Function2[
    /* extent */ typings.openlayers.mod.Extent_, 
    /* resolution */ scala.Double, 
    js.Array[typings.openlayers.mod.Extent_]
  ]
  
  type ModifyEventType = java.lang.String
  
  type Pixel = js.Tuple2[scala.Double, scala.Double]
  
  type PreRenderFunction = js.Function2[
    /* map */ typings.openlayers.mod.Map, 
    /* state */ js.UndefOr[typings.openlayers.mod.olx.FrameState], 
    scala.Boolean
  ]
  
  type ProjectionLike = js.UndefOr[typings.openlayers.mod.proj.Projection | java.lang.String]
  
  type RasterOperation = js.Function2[
    /* data */ js.Array[js.Array[scala.Double] | typings.std.ImageData], 
    /* obj */ typings.openlayers.mod.GlobalObject, 
    js.Array[scala.Double] | typings.std.ImageData
  ]
  
  type SelectFilterFunction = js.Function2[
    /* feature */ typings.openlayers.mod.Feature | typings.openlayers.mod.render.Feature, 
    /* layer */ typings.openlayers.mod.layer.Layer, 
    scala.Boolean
  ]
  
  type Size = js.Tuple2[scala.Double, scala.Double]
  
  type StyleFunction = js.Function2[
    /* feature */ typings.openlayers.mod.Feature | typings.openlayers.mod.render.Feature, 
    /* resolution */ scala.Double, 
    typings.openlayers.mod.style.Style | js.Array[typings.openlayers.mod.style.Style] | scala.Null
  ]
  
  type StyleGeometryFunction = js.Function1[
    /* feature */ typings.openlayers.mod.Feature | typings.openlayers.mod.render.Feature, 
    typings.openlayers.mod.geom.Geometry | typings.openlayers.mod.render.Feature
  ]
  
  type TileCoord = js.Tuple3[scala.Double, scala.Double, scala.Double]
  
  type TileLoadFunctionType = js.Function2[/* tile */ typings.openlayers.mod.Tile, /* url */ java.lang.String, scala.Unit]
  
  type TileUrlFunctionType = js.Function3[
    /* coords */ typings.openlayers.mod.TileCoord, 
    /* pixelRatio */ scala.Double, 
    /* proj */ typings.openlayers.mod.proj.Projection, 
    java.lang.String
  ]
  
  type TransformFunction = js.Function3[
    /* array */ js.Array[scala.Double], 
    /* out */ js.UndefOr[js.Array[scala.Double]], 
    /* dimension */ js.UndefOr[scala.Double], 
    js.Array[scala.Double]
  ]
  
  type WFSFeatureCollectionMetadata = typings.openlayers.mod.GlobalObject
  
  type WFSTransactionResponse = typings.openlayers.mod.GlobalObject
}
