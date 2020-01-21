package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.geometryTypeMod.GeometryType
import typings.ol.projMod.ProjectionLike
import typings.ol.projMod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/Feature", JSImport.Namespace)
@js.native
object renderFeatureMod extends js.Object {
  @js.native
  trait RenderFeature extends js.Object {
    def get(key: String): js.Any = js.native
    def getEnds(): js.Array[js.Array[Double] | Double] = js.native
    def getExtent(): Extent = js.native
    def getFlatInteriorPoint(): js.Array[Double] = js.native
    def getFlatInteriorPoints(): js.Array[Double] = js.native
    def getFlatMidpoint(): js.Array[Double] = js.native
    def getFlatMidpoints(): js.Array[Double] = js.native
    def getGeometry(): RenderFeature = js.native
    def getId(): Double | String = js.native
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
    def getProperties(): StringDictionary[js.Any] = js.native
    def getSimplifiedGeometry(squaredTolerance: Double): RenderFeature = js.native
    def getStride(): Double = js.native
    def getStyleFunction(): js.Any = js.native
    def getType(): GeometryType = js.native
    def simplifyTransformed(squaredTolerance: Double): RenderFeature = js.native
    def simplifyTransformed(squaredTolerance: Double, opt_transform: TransformFunction): RenderFeature = js.native
    def transform(source: ProjectionLike, destination: ProjectionLike): Unit = js.native
  }
  
  @js.native
  class default protected () extends RenderFeature {
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
  }
  
}

