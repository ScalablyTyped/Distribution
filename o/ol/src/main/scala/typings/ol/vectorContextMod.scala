package typings.ol

import typings.ol.canvasMod.DeclutterGroup
import typings.ol.canvasMod.DeclutterGroups
import typings.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/VectorContext", JSImport.Namespace)
@js.native
object vectorContextMod extends js.Object {
  @js.native
  trait VectorContext extends js.Object {
    def drawCircle(
      circleGeometry: typings.ol.circleMod.default,
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]
    ): Unit = js.native
    def drawCustom(geometry: typings.ol.simpleGeometryMod.default, feature: FeatureLike, renderer: js.Function0[Unit]): Unit = js.native
    def drawFeature(
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      style: typings.ol.styleStyleMod.default
    ): Unit = js.native
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
    def drawText(geometry: typings.ol.geometryMod.default, feature: FeatureLike): Unit = js.native
    def drawText(geometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def setFillStrokeStyle(fillStyle: typings.ol.fillMod.default, strokeStyle: typings.ol.strokeMod.default): Unit = js.native
    def setImageStyle(imageStyle: typings.ol.styleImageMod.default): Unit = js.native
    def setImageStyle(imageStyle: typings.ol.styleImageMod.default, opt_declutterGroup: DeclutterGroup): Unit = js.native
    def setStyle(style: typings.ol.styleStyleMod.default): Unit = js.native
    def setTextStyle(textStyle: typings.ol.textMod.default): Unit = js.native
    def setTextStyle(textStyle: typings.ol.textMod.default, opt_declutterGroups: DeclutterGroups): Unit = js.native
  }
  
  @js.native
  class default () extends VectorContext
  
}

