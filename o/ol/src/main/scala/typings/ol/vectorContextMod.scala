package typings.ol

import typings.ol.canvasMod.DeclutterImageWithText
import typings.ol.olFeatureMod.FeatureLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorContextMod {
  
  @JSImport("ol/render/VectorContext", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with VectorContext
  
  @js.native
  trait VectorContext extends StObject {
    
    def drawCircle(
      circleGeometry: typings.ol.circleMod.default,
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]
    ): Unit = js.native
    
    /**
      * Render a geometry with a custom renderer.
      */
    def drawCustom(geometry: typings.ol.simpleGeometryMod.default, feature: FeatureLike, renderer: js.Function0[Unit]): Unit = js.native
    
    def drawFeature(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      style: typings.ol.styleStyleMod.default
    ): Unit = js.native
    
    /**
      * Render a geometry.
      */
    def drawGeometry(geometry: typings.ol.geometryMod.default): Unit = js.native
    
    def drawGeometryCollection(
      geometryCollectionGeometry: typings.ol.geometryCollectionMod.default,
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]
    ): Unit = js.native
    
    def drawLineString(lineStringGeometry: typings.ol.lineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawLineString(lineStringGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawMultiLineString(multiLineStringGeometry: typings.ol.multiLineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiLineString(multiLineStringGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawMultiPoint(multiPointGeometry: typings.ol.multiPointMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiPoint(multiPointGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawMultiPolygon(multiPolygonGeometry: typings.ol.multiPolygonMod.default, feature: FeatureLike): Unit = js.native
    
    def drawPoint(pointGeometry: typings.ol.pointMod.default, feature: FeatureLike): Unit = js.native
    def drawPoint(pointGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawPolygon(polygonGeometry: typings.ol.polygonMod.default, feature: FeatureLike): Unit = js.native
    def drawPolygon(polygonGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawText(geometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawText(geometry: typings.ol.simpleGeometryMod.default, feature: FeatureLike): Unit = js.native
    
    def setFillStrokeStyle(fillStyle: typings.ol.fillMod.default, strokeStyle: typings.ol.strokeMod.default): Unit = js.native
    
    def setImageStyle(imageStyle: typings.ol.styleImageMod.default): Unit = js.native
    def setImageStyle(imageStyle: typings.ol.styleImageMod.default, opt_declutterImageWithText: DeclutterImageWithText): Unit = js.native
    
    /**
      * Set the rendering style.
      */
    def setStyle(style: typings.ol.styleStyleMod.default): Unit = js.native
    
    def setTextStyle(textStyle: typings.ol.textMod.default): Unit = js.native
    def setTextStyle(textStyle: typings.ol.textMod.default, opt_declutterImageWithText: DeclutterImageWithText): Unit = js.native
  }
}
