package typings
package olLib.renderFeatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/Feature", JSImport.Default)
@js.native
class default protected ()
  extends RenderFeature
     with olLib.featureMod.FeatureClass
     with olLib.featureMod.FeatureLike {
  def this(`type`: olLib.geomGeometryTypeMod.GeometryType, flatCoordinates: js.Array[scala.Double], ends: js.Array[js.Array[scala.Double] | scala.Double], properties: org.scalablytyped.runtime.StringDictionary[js.Any], id: java.lang.String) = this()
  def this(`type`: olLib.geomGeometryTypeMod.GeometryType, flatCoordinates: js.Array[scala.Double], ends: js.Array[js.Array[scala.Double] | scala.Double], properties: org.scalablytyped.runtime.StringDictionary[js.Any], id: scala.Double) = this()
  /* CompleteClass */
  override def get(key: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def getExtent(): olLib.extentMod.Extent = js.native
  /* CompleteClass */
  override def getFlatInteriorPoint(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def getFlatInteriorPoints(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def getFlatMidpoint(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def getFlatMidpoints(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def getGeometry(): RenderFeature = js.native
  /* CompleteClass */
  override def getId(): scala.Double | java.lang.String = js.native
  /* CompleteClass */
  override def getOrientedFlatCoordinates(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def getProperties(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override def getSimplifiedGeometry(squaredTolerance: scala.Double): RenderFeature = js.native
  /* CompleteClass */
  override def getStride(): scala.Double = js.native
  /* CompleteClass */
  override def getStyleFunction(): js.Any = js.native
  /* CompleteClass */
  override def getType(): olLib.geomGeometryTypeMod.GeometryType = js.native
  /* CompleteClass */
  override def transform(source: olLib.projMod.ProjectionLike, destination: olLib.projMod.ProjectionLike): scala.Unit = js.native
}

