package typings
package olLib.renderVectorContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorContext extends js.Object {
  def drawCircle(circleGeometry: olLib.geomCircleMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawCustom(
    geometry: olLib.geomSimpleGeometryMod.default,
    feature: olLib.featureMod.default,
    renderer: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def drawCustom(
    geometry: olLib.geomSimpleGeometryMod.default,
    feature: olLib.renderFeatureMod.default,
    renderer: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def drawFeature(feature: olLib.featureMod.default, style: olLib.styleStyleMod.default): scala.Unit = js.native
  def drawGeometry(geometry: olLib.geomGeometryMod.default): scala.Unit = js.native
  def drawGeometryCollection(
    geometryCollectionGeometry: olLib.geomGeometryCollectionMod.default,
    feature: olLib.featureMod.default
  ): scala.Unit = js.native
  def drawLineString(lineStringGeometry: olLib.geomLineStringMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawLineString(lineStringGeometry: olLib.geomLineStringMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def drawLineString(lineStringGeometry: olLib.renderFeatureMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawLineString(lineStringGeometry: olLib.renderFeatureMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def drawMultiLineString(multiLineStringGeometry: olLib.geomMultiLineStringMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawMultiLineString(
    multiLineStringGeometry: olLib.geomMultiLineStringMod.default,
    feature: olLib.renderFeatureMod.default
  ): scala.Unit = js.native
  def drawMultiLineString(multiLineStringGeometry: olLib.renderFeatureMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawMultiLineString(multiLineStringGeometry: olLib.renderFeatureMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def drawMultiPoint(multiPointGeometry: olLib.geomMultiPointMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawMultiPoint(multiPointGeometry: olLib.geomMultiPointMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def drawMultiPoint(multiPointGeometry: olLib.renderFeatureMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawMultiPoint(multiPointGeometry: olLib.renderFeatureMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def drawMultiPolygon(multiPolygonGeometry: olLib.geomMultiPolygonMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawMultiPolygon(multiPolygonGeometry: olLib.geomMultiPolygonMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def drawPoint(pointGeometry: olLib.geomPointMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawPoint(pointGeometry: olLib.geomPointMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def drawPoint(pointGeometry: olLib.renderFeatureMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawPoint(pointGeometry: olLib.renderFeatureMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def drawPolygon(polygonGeometry: olLib.geomPolygonMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawPolygon(polygonGeometry: olLib.geomPolygonMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def drawPolygon(polygonGeometry: olLib.renderFeatureMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawPolygon(polygonGeometry: olLib.renderFeatureMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def drawText(geometry: olLib.geomGeometryMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawText(geometry: olLib.geomGeometryMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def drawText(geometry: olLib.renderFeatureMod.default, feature: olLib.featureMod.default): scala.Unit = js.native
  def drawText(geometry: olLib.renderFeatureMod.default, feature: olLib.renderFeatureMod.default): scala.Unit = js.native
  def setFillStrokeStyle(fillStyle: olLib.styleFillMod.default, strokeStyle: olLib.styleStrokeMod.default): scala.Unit = js.native
  def setImageStyle(imageStyle: olLib.styleImageMod.default): scala.Unit = js.native
  def setImageStyle(imageStyle: olLib.styleImageMod.default, opt_declutterGroup: olLib.renderCanvasMod.DeclutterGroup): scala.Unit = js.native
  def setStyle(style: olLib.styleStyleMod.default): scala.Unit = js.native
  def setTextStyle(textStyle: olLib.styleTextMod.default): scala.Unit = js.native
  def setTextStyle(textStyle: olLib.styleTextMod.default, opt_declutterGroup: olLib.renderCanvasMod.DeclutterGroup): scala.Unit = js.native
}

