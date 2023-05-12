package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojTriangulationMod {
  
  /**
    * @classdesc
    * Class containing triangulation of the given target extent.
    * Used for determining source data and the reprojection itself.
    */
  @JSImport("ol/reproj/Triangulation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Triangulation {
    /**
      * @param {import("../proj/Projection.js").default} sourceProj Source projection.
      * @param {import("../proj/Projection.js").default} targetProj Target projection.
      * @param {import("../extent.js").Extent} targetExtent Target extent to triangulate.
      * @param {import("../extent.js").Extent} maxSourceExtent Maximal source extent that can be used.
      * @param {number} errorThreshold Acceptable error (in source units).
      * @param {?number} destinationResolution The (optional) resolution of the destination.
      */
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetExtent: Extent,
      maxSourceExtent: Extent,
      errorThreshold: Double
    ) = this()
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetExtent: Extent,
      maxSourceExtent: Extent,
      errorThreshold: Double,
      destinationResolution: Double
    ) = this()
    
    /**
      * Adds quad (points in clock-wise order) to the triangulation
      * (and reprojects the vertices) if valid.
      * Performs quad subdivision if needed to increase precision.
      *
      * @param {import("../coordinate.js").Coordinate} a The target a coordinate.
      * @param {import("../coordinate.js").Coordinate} b The target b coordinate.
      * @param {import("../coordinate.js").Coordinate} c The target c coordinate.
      * @param {import("../coordinate.js").Coordinate} d The target d coordinate.
      * @param {import("../coordinate.js").Coordinate} aSrc The source a coordinate.
      * @param {import("../coordinate.js").Coordinate} bSrc The source b coordinate.
      * @param {import("../coordinate.js").Coordinate} cSrc The source c coordinate.
      * @param {import("../coordinate.js").Coordinate} dSrc The source d coordinate.
      * @param {number} maxSubdivision Maximal allowed subdivision of the quad.
      * @private
      */
    /* private */ /* CompleteClass */
    var addQuad_ : Any = js.native
    
    /**
      * Adds triangle to the triangulation.
      * @param {import("../coordinate.js").Coordinate} a The target a coordinate.
      * @param {import("../coordinate.js").Coordinate} b The target b coordinate.
      * @param {import("../coordinate.js").Coordinate} c The target c coordinate.
      * @param {import("../coordinate.js").Coordinate} aSrc The source a coordinate.
      * @param {import("../coordinate.js").Coordinate} bSrc The source b coordinate.
      * @param {import("../coordinate.js").Coordinate} cSrc The source c coordinate.
      * @private
      */
    /* private */ /* CompleteClass */
    var addTriangle_ : Any = js.native
    
    /**
      * Calculates extent of the `source` coordinates from all the triangles.
      *
      * @return {import("../extent.js").Extent} Calculated extent.
      */
    /* CompleteClass */
    override def calculateSourceExtent(): Extent = js.native
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ /* CompleteClass */
    var canWrapXInSource_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ /* CompleteClass */
    var errorThresholdSquared_ : Any = js.native
    
    /**
      * @return {Array<Triangle>} Array of the calculated triangles.
      */
    /* CompleteClass */
    override def getTriangles(): js.Array[Triangle] = js.native
    
    /**
      * @type {import("../extent.js").Extent}
      * @private
      */
    /* private */ /* CompleteClass */
    var maxSourceExtent_ : Any = js.native
    
    /**
      * @type {import("../proj/Projection.js").default}
      * @private
      */
    /* private */ /* CompleteClass */
    var sourceProj_ : Any = js.native
    
    /**
      * @type {?number}
      * @private
      */
    /* private */ /* CompleteClass */
    var sourceWorldWidth_ : Any = js.native
    
    /**
      * @type {import("../proj/Projection.js").default}
      * @private
      */
    /* private */ /* CompleteClass */
    var targetProj_ : Any = js.native
    
    /**
      * @type {?number}
      * @private
      */
    /* private */ /* CompleteClass */
    var targetWorldWidth_ : Any = js.native
    
    /**
      * @param {import("../coordinate.js").Coordinate} c A coordinate.
      * @return {import("../coordinate.js").Coordinate} Transformed coordinate.
      * @private
      */
    /* private */ /* CompleteClass */
    var transformInv_ : Any = js.native
    
    /**
      * @type {Array<Triangle>}
      * @private
      */
    /* private */ /* CompleteClass */
    var triangles_ : Any = js.native
    
    /**
      * Indicates that the triangulation crosses edge of the source projection.
      * @type {boolean}
      * @private
      */
    /* private */ /* CompleteClass */
    var wrapsXInSource_ : Any = js.native
  }
  
  trait Triangle extends StObject {
    
    /**
      * Source.
      */
    var source: js.Array[Coordinate]
    
    /**
      * Target.
      */
    var target: js.Array[Coordinate]
  }
  object Triangle {
    
    inline def apply(source: js.Array[Coordinate], target: js.Array[Coordinate]): Triangle = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Triangle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Triangle] (val x: Self) extends AnyVal {
      
      inline def setSource(value: js.Array[Coordinate]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceVarargs(value: Coordinate*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setTarget(value: js.Array[Coordinate]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetVarargs(value: Coordinate*): Self = StObject.set(x, "target", js.Array(value*))
    }
  }
  
  /**
    * @classdesc
    * Class containing triangulation of the given target extent.
    * Used for determining source data and the reprojection itself.
    */
  trait Triangulation extends StObject {
    
    /**
      * Adds quad (points in clock-wise order) to the triangulation
      * (and reprojects the vertices) if valid.
      * Performs quad subdivision if needed to increase precision.
      *
      * @param {import("../coordinate.js").Coordinate} a The target a coordinate.
      * @param {import("../coordinate.js").Coordinate} b The target b coordinate.
      * @param {import("../coordinate.js").Coordinate} c The target c coordinate.
      * @param {import("../coordinate.js").Coordinate} d The target d coordinate.
      * @param {import("../coordinate.js").Coordinate} aSrc The source a coordinate.
      * @param {import("../coordinate.js").Coordinate} bSrc The source b coordinate.
      * @param {import("../coordinate.js").Coordinate} cSrc The source c coordinate.
      * @param {import("../coordinate.js").Coordinate} dSrc The source d coordinate.
      * @param {number} maxSubdivision Maximal allowed subdivision of the quad.
      * @private
      */
    /* private */ var addQuad_ : Any
    
    /**
      * Adds triangle to the triangulation.
      * @param {import("../coordinate.js").Coordinate} a The target a coordinate.
      * @param {import("../coordinate.js").Coordinate} b The target b coordinate.
      * @param {import("../coordinate.js").Coordinate} c The target c coordinate.
      * @param {import("../coordinate.js").Coordinate} aSrc The source a coordinate.
      * @param {import("../coordinate.js").Coordinate} bSrc The source b coordinate.
      * @param {import("../coordinate.js").Coordinate} cSrc The source c coordinate.
      * @private
      */
    /* private */ var addTriangle_ : Any
    
    /**
      * Calculates extent of the `source` coordinates from all the triangles.
      *
      * @return {import("../extent.js").Extent} Calculated extent.
      */
    def calculateSourceExtent(): Extent
    
    /**
      * @type {boolean}
      * @private
      */
    /* private */ var canWrapXInSource_ : Any
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var errorThresholdSquared_ : Any
    
    /**
      * @return {Array<Triangle>} Array of the calculated triangles.
      */
    def getTriangles(): js.Array[Triangle]
    
    /**
      * @type {import("../extent.js").Extent}
      * @private
      */
    /* private */ var maxSourceExtent_ : Any
    
    /**
      * @type {import("../proj/Projection.js").default}
      * @private
      */
    /* private */ var sourceProj_ : Any
    
    /**
      * @type {?number}
      * @private
      */
    /* private */ var sourceWorldWidth_ : Any
    
    /**
      * @type {import("../proj/Projection.js").default}
      * @private
      */
    /* private */ var targetProj_ : Any
    
    /**
      * @type {?number}
      * @private
      */
    /* private */ var targetWorldWidth_ : Any
    
    /**
      * @param {import("../coordinate.js").Coordinate} c A coordinate.
      * @return {import("../coordinate.js").Coordinate} Transformed coordinate.
      * @private
      */
    /* private */ var transformInv_ : Any
    
    /**
      * @type {Array<Triangle>}
      * @private
      */
    /* private */ var triangles_ : Any
    
    /**
      * Indicates that the triangulation crosses edge of the source projection.
      * @type {boolean}
      * @private
      */
    /* private */ var wrapsXInSource_ : Any
  }
  object Triangulation {
    
    inline def apply(
      addQuad_ : Any,
      addTriangle_ : Any,
      calculateSourceExtent: () => Extent,
      canWrapXInSource_ : Any,
      errorThresholdSquared_ : Any,
      getTriangles: () => js.Array[Triangle],
      maxSourceExtent_ : Any,
      sourceProj_ : Any,
      sourceWorldWidth_ : Any,
      targetProj_ : Any,
      targetWorldWidth_ : Any,
      transformInv_ : Any,
      triangles_ : Any,
      wrapsXInSource_ : Any
    ): Triangulation = {
      val __obj = js.Dynamic.literal(addQuad_ = addQuad_.asInstanceOf[js.Any], addTriangle_ = addTriangle_.asInstanceOf[js.Any], calculateSourceExtent = js.Any.fromFunction0(calculateSourceExtent), canWrapXInSource_ = canWrapXInSource_.asInstanceOf[js.Any], errorThresholdSquared_ = errorThresholdSquared_.asInstanceOf[js.Any], getTriangles = js.Any.fromFunction0(getTriangles), maxSourceExtent_ = maxSourceExtent_.asInstanceOf[js.Any], sourceProj_ = sourceProj_.asInstanceOf[js.Any], sourceWorldWidth_ = sourceWorldWidth_.asInstanceOf[js.Any], targetProj_ = targetProj_.asInstanceOf[js.Any], targetWorldWidth_ = targetWorldWidth_.asInstanceOf[js.Any], transformInv_ = transformInv_.asInstanceOf[js.Any], triangles_ = triangles_.asInstanceOf[js.Any], wrapsXInSource_ = wrapsXInSource_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Triangulation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Triangulation] (val x: Self) extends AnyVal {
      
      inline def setAddQuad_(value: Any): Self = StObject.set(x, "addQuad_", value.asInstanceOf[js.Any])
      
      inline def setAddTriangle_(value: Any): Self = StObject.set(x, "addTriangle_", value.asInstanceOf[js.Any])
      
      inline def setCalculateSourceExtent(value: () => Extent): Self = StObject.set(x, "calculateSourceExtent", js.Any.fromFunction0(value))
      
      inline def setCanWrapXInSource_(value: Any): Self = StObject.set(x, "canWrapXInSource_", value.asInstanceOf[js.Any])
      
      inline def setErrorThresholdSquared_(value: Any): Self = StObject.set(x, "errorThresholdSquared_", value.asInstanceOf[js.Any])
      
      inline def setGetTriangles(value: () => js.Array[Triangle]): Self = StObject.set(x, "getTriangles", js.Any.fromFunction0(value))
      
      inline def setMaxSourceExtent_(value: Any): Self = StObject.set(x, "maxSourceExtent_", value.asInstanceOf[js.Any])
      
      inline def setSourceProj_(value: Any): Self = StObject.set(x, "sourceProj_", value.asInstanceOf[js.Any])
      
      inline def setSourceWorldWidth_(value: Any): Self = StObject.set(x, "sourceWorldWidth_", value.asInstanceOf[js.Any])
      
      inline def setTargetProj_(value: Any): Self = StObject.set(x, "targetProj_", value.asInstanceOf[js.Any])
      
      inline def setTargetWorldWidth_(value: Any): Self = StObject.set(x, "targetWorldWidth_", value.asInstanceOf[js.Any])
      
      inline def setTransformInv_(value: Any): Self = StObject.set(x, "transformInv_", value.asInstanceOf[js.Any])
      
      inline def setTriangles_(value: Any): Self = StObject.set(x, "triangles_", value.asInstanceOf[js.Any])
      
      inline def setWrapsXInSource_(value: Any): Self = StObject.set(x, "wrapsXInSource_", value.asInstanceOf[js.Any])
    }
  }
}
