package typings
package olLib.renderFeatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderFeature extends js.Object {
  def get(key: java.lang.String): js.Any
  def getExtent(): olLib.extentMod.Extent
  def getFlatInteriorPoint(): js.Array[scala.Double]
  def getFlatInteriorPoints(): js.Array[scala.Double]
  def getFlatMidpoint(): js.Array[scala.Double]
  def getFlatMidpoints(): js.Array[scala.Double]
  def getGeometry(): RenderFeature
  def getId(): scala.Double | java.lang.String
  def getOrientedFlatCoordinates(): js.Array[scala.Double]
  def getProperties(): org.scalablytyped.runtime.StringDictionary[js.Any]
  def getSimplifiedGeometry(squaredTolerance: scala.Double): RenderFeature
  def getStride(): scala.Double
  def getStyleFunction(): js.Any
  def getType(): olLib.geomGeometryTypeMod.GeometryType
  def transform(source: olLib.projMod.ProjectionLike, destination: olLib.projMod.ProjectionLike): scala.Unit
}

object RenderFeature {
  @scala.inline
  def apply(
    get: java.lang.String => js.Any,
    getExtent: () => olLib.extentMod.Extent,
    getFlatInteriorPoint: () => js.Array[scala.Double],
    getFlatInteriorPoints: () => js.Array[scala.Double],
    getFlatMidpoint: () => js.Array[scala.Double],
    getFlatMidpoints: () => js.Array[scala.Double],
    getGeometry: () => RenderFeature,
    getId: () => scala.Double | java.lang.String,
    getOrientedFlatCoordinates: () => js.Array[scala.Double],
    getProperties: () => org.scalablytyped.runtime.StringDictionary[js.Any],
    getSimplifiedGeometry: scala.Double => RenderFeature,
    getStride: () => scala.Double,
    getStyleFunction: () => js.Any,
    getType: () => olLib.geomGeometryTypeMod.GeometryType,
    transform: (olLib.projMod.ProjectionLike, olLib.projMod.ProjectionLike) => scala.Unit
  ): RenderFeature = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getExtent = js.Any.fromFunction0(getExtent), getFlatInteriorPoint = js.Any.fromFunction0(getFlatInteriorPoint), getFlatInteriorPoints = js.Any.fromFunction0(getFlatInteriorPoints), getFlatMidpoint = js.Any.fromFunction0(getFlatMidpoint), getFlatMidpoints = js.Any.fromFunction0(getFlatMidpoints), getGeometry = js.Any.fromFunction0(getGeometry), getId = js.Any.fromFunction0(getId), getOrientedFlatCoordinates = js.Any.fromFunction0(getOrientedFlatCoordinates), getProperties = js.Any.fromFunction0(getProperties), getSimplifiedGeometry = js.Any.fromFunction1(getSimplifiedGeometry), getStride = js.Any.fromFunction0(getStride), getStyleFunction = js.Any.fromFunction0(getStyleFunction), getType = js.Any.fromFunction0(getType), transform = js.Any.fromFunction2(transform))
  
    __obj.asInstanceOf[RenderFeature]
  }
}

