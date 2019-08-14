package typings.ol.renderFeatureMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.geomGeometryTypeMod.GeometryType
import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderFeature extends js.Object {
  def get(key: String): js.Any
  def getExtent(): Extent
  def getFlatInteriorPoint(): js.Array[Double]
  def getFlatInteriorPoints(): js.Array[Double]
  def getFlatMidpoint(): js.Array[Double]
  def getFlatMidpoints(): js.Array[Double]
  def getGeometry(): RenderFeature
  def getId(): js.UndefOr[Double | String]
  def getOrientedFlatCoordinates(): js.Array[Double]
  def getProperties(): StringDictionary[js.Any]
  def getSimplifiedGeometry(squaredTolerance: Double): RenderFeature
  def getStride(): Double
  def getStyleFunction(): js.UndefOr[scala.Nothing]
  def getType(): GeometryType
  def transform(source: ProjectionLike, destination: ProjectionLike): Unit
}

object RenderFeature {
  @scala.inline
  def apply(
    get: String => js.Any,
    getExtent: () => Extent,
    getFlatInteriorPoint: () => js.Array[Double],
    getFlatInteriorPoints: () => js.Array[Double],
    getFlatMidpoint: () => js.Array[Double],
    getFlatMidpoints: () => js.Array[Double],
    getGeometry: () => RenderFeature,
    getId: () => js.UndefOr[Double | String],
    getOrientedFlatCoordinates: () => js.Array[Double],
    getProperties: () => StringDictionary[js.Any],
    getSimplifiedGeometry: Double => RenderFeature,
    getStride: () => Double,
    getStyleFunction: () => js.UndefOr[scala.Nothing],
    getType: () => GeometryType,
    transform: (ProjectionLike, ProjectionLike) => Unit
  ): RenderFeature = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getExtent = js.Any.fromFunction0(getExtent), getFlatInteriorPoint = js.Any.fromFunction0(getFlatInteriorPoint), getFlatInteriorPoints = js.Any.fromFunction0(getFlatInteriorPoints), getFlatMidpoint = js.Any.fromFunction0(getFlatMidpoint), getFlatMidpoints = js.Any.fromFunction0(getFlatMidpoints), getGeometry = js.Any.fromFunction0(getGeometry), getId = js.Any.fromFunction0(getId), getOrientedFlatCoordinates = js.Any.fromFunction0(getOrientedFlatCoordinates), getProperties = js.Any.fromFunction0(getProperties), getSimplifiedGeometry = js.Any.fromFunction1(getSimplifiedGeometry), getStride = js.Any.fromFunction0(getStride), getStyleFunction = js.Any.fromFunction0(getStyleFunction), getType = js.Any.fromFunction0(getType), transform = js.Any.fromFunction2(transform))
  
    __obj.asInstanceOf[RenderFeature]
  }
}

