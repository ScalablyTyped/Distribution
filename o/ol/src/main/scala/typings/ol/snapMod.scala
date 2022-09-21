package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.pixelMod.Pixel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapMod {
  
  @JSImport("ol/interaction/Snap", JSImport.Default)
  @js.native
  open class default () extends Snap {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var edge: js.UndefOr[Boolean] = js.undefined
    
    var features: js.UndefOr[
        typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
      ] = js.undefined
    
    var pixelTolerance: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]] = js.undefined
    
    var vertex: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setFeatures(
        value: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
      ): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setPixelTolerance(value: Double): Self = StObject.set(x, "pixelTolerance", value.asInstanceOf[js.Any])
      
      inline def setPixelToleranceUndefined: Self = StObject.set(x, "pixelTolerance", js.undefined)
      
      inline def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setVertex(value: Boolean): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
      
      inline def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var snapped: Boolean
    
    var vertex: Coordinate | Null
    
    var vertexPixel: Pixel | Null
  }
  object Result {
    
    inline def apply(snapped: Boolean): Result = {
      val __obj = js.Dynamic.literal(snapped = snapped.asInstanceOf[js.Any], vertex = null, vertexPixel = null)
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setSnapped(value: Boolean): Self = StObject.set(x, "snapped", value.asInstanceOf[js.Any])
      
      inline def setVertex(value: Coordinate): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
      
      inline def setVertexNull: Self = StObject.set(x, "vertex", null)
      
      inline def setVertexPixel(value: Pixel): Self = StObject.set(x, "vertexPixel", value.asInstanceOf[js.Any])
      
      inline def setVertexPixelNull: Self = StObject.set(x, "vertexPixel", null)
      
      inline def setVertexPixelVarargs(value: Double*): Self = StObject.set(x, "vertexPixel", js.Array(value*))
      
      inline def setVertexVarargs(value: Double*): Self = StObject.set(x, "vertex", js.Array(value*))
    }
  }
  
  trait SegmentData extends StObject {
    
    var feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]
    
    var segment: js.Array[Coordinate]
  }
  object SegmentData {
    
    inline def apply(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      segment: js.Array[Coordinate]
    ): SegmentData = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentData]
    }
    
    extension [Self <: SegmentData](x: Self) {
      
      inline def setFeature(value: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: js.Array[Coordinate]): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentVarargs(value: Coordinate*): Self = StObject.set(x, "segment", js.Array(value*))
    }
  }
  
  @js.native
  trait Snap
    extends typings.ol.pointerMod.default {
    
    /**
      * Add a feature to the collection of features that we may snap to.
      */
    def addFeature(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): Unit = js.native
    def addFeature(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], opt_listen: Boolean): Unit = js.native
    
    /**
      * Remove a feature from the collection of features that we may snap to.
      */
    def removeFeature(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): Unit = js.native
    def removeFeature(feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default], opt_unlisten: Boolean): Unit = js.native
    
    def snapTo(pixel: Pixel, pixelCoordinate: Coordinate, map: typings.ol.pluggableMapMod.default): Result = js.native
  }
}
