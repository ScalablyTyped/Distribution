package typings.ol

import org.scalablytyped.runtime.NumberDictionary
import typings.ol.featureMod.FeatureLike
import typings.ol.renderCanvasExecutorMod.ReplayImageOrLabelArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderVectorContextMod {
  
  /**
    * @module ol/render/VectorContext
    */
  /**
    * @classdesc
    * Context for drawing geometries.  A vector context is available on render
    * events and does not need to be constructed directly.
    * @api
    */
  @JSImport("ol/render/VectorContext", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with VectorContext
  
  /**
    * @module ol/render/VectorContext
    */
  /**
    * @classdesc
    * Context for drawing geometries.  A vector context is available on render
    * events and does not need to be constructed directly.
    * @api
    */
  @js.native
  trait VectorContext extends StObject {
    
    /**
      * @param {import("../geom/Circle.js").default} circleGeometry Circle geometry.
      * @param {import("../Feature.js").default} feature Feature.
      */
    def drawCircle(circleGeometry: typings.ol.geomCircleMod.default, feature: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a geometry with a custom renderer.
      *
      * @param {import("../geom/SimpleGeometry.js").default} geometry Geometry.
      * @param {import("../Feature.js").FeatureLike} feature Feature.
      * @param {Function} renderer Renderer.
      * @param {Function} hitDetectionRenderer Renderer.
      */
    def drawCustom(
      geometry: typings.ol.geomSimpleGeometryMod.default,
      feature: FeatureLike,
      renderer: js.Function,
      hitDetectionRenderer: js.Function
    ): Unit = js.native
    
    /**
      * @param {import("../Feature.js").default} feature Feature.
      * @param {import("../style/Style.js").default} style Style.
      */
    def drawFeature(feature: typings.ol.renderFeatureMod.default, style: typings.ol.styleStyleMod.default): Unit = js.native
    
    /**
      * Render a geometry.
      *
      * @param {import("../geom/Geometry.js").default} geometry The geometry to render.
      */
    def drawGeometry(geometry: typings.ol.geomGeometryMod.default): Unit = js.native
    
    /**
      * @param {import("../geom/GeometryCollection.js").default} geometryCollectionGeometry Geometry collection.
      * @param {import("../Feature.js").default} feature Feature.
      */
    def drawGeometryCollection(
      geometryCollectionGeometry: typings.ol.geomGeometryCollectionMod.default,
      feature: typings.ol.renderFeatureMod.default
    ): Unit = js.native
    
    /**
      * @param {import("../geom/LineString.js").default|import("./Feature.js").default} lineStringGeometry Line string geometry.
      * @param {import("../Feature.js").FeatureLike} feature Feature.
      */
    def drawLineString(lineStringGeometry: typings.ol.geomLineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawLineString(lineStringGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    /**
      * @param {import("../geom/MultiLineString.js").default|import("./Feature.js").default} multiLineStringGeometry MultiLineString geometry.
      * @param {import("../Feature.js").FeatureLike} feature Feature.
      */
    def drawMultiLineString(multiLineStringGeometry: typings.ol.geomMultiLineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiLineString(multiLineStringGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    /**
      * @param {import("../geom/MultiPoint.js").default|import("./Feature.js").default} multiPointGeometry MultiPoint geometry.
      * @param {import("../Feature.js").FeatureLike} feature Feature.
      */
    def drawMultiPoint(multiPointGeometry: typings.ol.geomMultiPointMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiPoint(multiPointGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    /**
      * @param {import("../geom/MultiPolygon.js").default} multiPolygonGeometry MultiPolygon geometry.
      * @param {import("../Feature.js").FeatureLike} feature Feature.
      */
    def drawMultiPolygon(multiPolygonGeometry: typings.ol.geomMultiPolygonMod.default, feature: FeatureLike): Unit = js.native
    
    /**
      * @param {import("../geom/Point.js").default|import("./Feature.js").default} pointGeometry Point geometry.
      * @param {import("../Feature.js").FeatureLike} feature Feature.
      */
    def drawPoint(pointGeometry: typings.ol.geomPointMod.default, feature: FeatureLike): Unit = js.native
    def drawPoint(pointGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    /**
      * @param {import("../geom/Polygon.js").default|import("./Feature.js").default} polygonGeometry Polygon geometry.
      * @param {import("../Feature.js").FeatureLike} feature Feature.
      */
    def drawPolygon(polygonGeometry: typings.ol.geomPolygonMod.default, feature: FeatureLike): Unit = js.native
    def drawPolygon(polygonGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    /**
      * @param {import("../geom/SimpleGeometry.js").default|import("./Feature.js").default} geometry Geometry.
      * @param {import("../Feature.js").FeatureLike} feature Feature.
      */
    def drawText(geometry: typings.ol.geomSimpleGeometryMod.default, feature: FeatureLike): Unit = js.native
    def drawText(geometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    /**
      * @param {import("../style/Fill.js").default} fillStyle Fill style.
      * @param {import("../style/Stroke.js").default} strokeStyle Stroke style.
      */
    def setFillStrokeStyle(fillStyle: typings.ol.styleFillMod.default, strokeStyle: typings.ol.styleStrokeMod.default): Unit = js.native
    
    /**
      * @param {import("../style/Image.js").default} imageStyle Image style.
      * @param {import("../render/canvas.js").DeclutterImageWithText} [declutterImageWithText] Shared data for combined decluttering with a text style.
      */
    def setImageStyle(imageStyle: typings.ol.styleImageMod.default): Unit = js.native
    def setImageStyle(
      imageStyle: typings.ol.styleImageMod.default,
      declutterImageWithText: NumberDictionary[ReplayImageOrLabelArgs]
    ): Unit = js.native
    
    /**
      * Set the rendering style.
      *
      * @param {import("../style/Style.js").default} style The rendering style.
      */
    def setStyle(style: typings.ol.styleStyleMod.default): Unit = js.native
    
    /**
      * @param {import("../style/Text.js").default} textStyle Text style.
      * @param {import("../render/canvas.js").DeclutterImageWithText} [declutterImageWithText] Shared data for combined decluttering with an image style.
      */
    def setTextStyle(textStyle: typings.ol.styleTextMod.default): Unit = js.native
    def setTextStyle(
      textStyle: typings.ol.styleTextMod.default,
      declutterImageWithText: NumberDictionary[ReplayImageOrLabelArgs]
    ): Unit = js.native
  }
}
