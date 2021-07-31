package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.geometryTypeMod.GeometryType
import typings.ol.projMod.ProjectionLike
import typings.ol.projMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderFeatureMod {
  
  @JSImport("ol/render/Feature", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with RenderFeature {
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
  
  @js.native
  trait RenderFeature extends StObject {
    
    /**
      * Get a feature property by its key.
      */
    def get(key: String): js.Any = js.native
    
    def getEnds(): js.Array[js.Array[Double] | Double] = js.native
    
    /**
      * Get the extent of this feature's geometry.
      */
    def getExtent(): Extent = js.native
    
    def getFlatInteriorPoint(): js.Array[Double] = js.native
    
    def getFlatInteriorPoints(): js.Array[Double] = js.native
    
    def getFlatMidpoint(): js.Array[Double] = js.native
    
    def getFlatMidpoints(): js.Array[Double] = js.native
    
    /**
      * For API compatibility with {@link module:ol/Feature~Feature}, this method is useful when
      * determining the geometry type in style function (see {@link #getType}).
      */
    def getGeometry(): RenderFeature = js.native
    
    /**
      * Get the feature identifier.  This is a stable identifier for the feature and
      * is set when reading data from a remote source.
      */
    def getId(): js.UndefOr[Double | String] = js.native
    
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
    
    /**
      * Get the feature properties.
      */
    def getProperties(): StringDictionary[js.Any] = js.native
    
    def getSimplifiedGeometry(squaredTolerance: Double): RenderFeature = js.native
    
    def getStride(): Double = js.native
    
    def getStyleFunction(): Unit = js.native
    
    /**
      * Get the type of this feature's geometry.
      */
    def getType(): GeometryType = js.native
    
    /**
      * Get a transformed and simplified version of the geometry.
      */
    def simplifyTransformed(squaredTolerance: Double): RenderFeature = js.native
    def simplifyTransformed(squaredTolerance: Double, opt_transform: TransformFunction): RenderFeature = js.native
    
    /**
      * Transform geometry coordinates from tile pixel space to projected.
      * The SRS of the source and destination are expected to be the same.
      */
    def transform(source: ProjectionLike, destination: ProjectionLike): Unit = js.native
  }
}
