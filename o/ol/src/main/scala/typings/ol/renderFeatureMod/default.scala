package typings.ol.renderFeatureMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureClass
import typings.ol.featureMod.FeatureLike
import typings.ol.geomGeometryTypeMod.GeometryType
import typings.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/Feature", JSImport.Default)
@js.native
class default protected ()
  extends RenderFeature
     with FeatureClass
     with FeatureLike {
  def this(
    `type`: GeometryType,
    flatCoordinates: js.Array[Double],
    ends: js.Array[js.Array[Double] | Double],
    properties: StringDictionary[js.Any]
  ) = this()
  def this(
    `type`: GeometryType,
    flatCoordinates: js.Array[Double],
    ends: js.Array[js.Array[Double] | Double],
    properties: StringDictionary[js.Any],
    id: String
  ) = this()
  def this(
    `type`: GeometryType,
    flatCoordinates: js.Array[Double],
    ends: js.Array[js.Array[Double] | Double],
    properties: StringDictionary[js.Any],
    id: Double
  ) = this()
  /* CompleteClass */
  override def get(key: String): js.Any = js.native
  /* CompleteClass */
  override def getExtent(): Extent = js.native
  /* CompleteClass */
  override def getFlatInteriorPoint(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getFlatInteriorPoints(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getFlatMidpoint(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getFlatMidpoints(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getGeometry(): RenderFeature = js.native
  /* CompleteClass */
  override def getId(): js.UndefOr[Double | String] = js.native
  /* CompleteClass */
  override def getOrientedFlatCoordinates(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getProperties(): StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override def getSimplifiedGeometry(squaredTolerance: Double): RenderFeature = js.native
  /* CompleteClass */
  override def getStride(): Double = js.native
  /* CompleteClass */
  override def getStyleFunction(): js.UndefOr[scala.Nothing] = js.native
  /* CompleteClass */
  override def getType(): GeometryType = js.native
  /* CompleteClass */
  override def transform(source: ProjectionLike, destination: ProjectionLike): Unit = js.native
}

