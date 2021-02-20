package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triangulationMod {
  
  @JSImport("ol/reproj/Triangulation", JSImport.Default)
  @js.native
  class default protected () extends Triangulation {
    def this(
      sourceProj: typings.ol.projectionMod.default,
      targetProj: typings.ol.projectionMod.default,
      targetExtent: Extent,
      maxSourceExtent: Extent,
      errorThreshold: Double,
      opt_destinationResolution: Double
    ) = this()
  }
  
  @js.native
  trait Triangle extends StObject {
    
    var source: js.Array[Coordinate] = js.native
    
    var target: js.Array[Coordinate] = js.native
  }
  object Triangle {
    
    @scala.inline
    def apply(source: js.Array[Coordinate], target: js.Array[Coordinate]): Triangle = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Triangle]
    }
    
    @scala.inline
    implicit class TriangleMutableBuilder[Self <: Triangle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: js.Array[Coordinate]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceVarargs(value: Coordinate*): Self = StObject.set(x, "source", js.Array(value :_*))
      
      @scala.inline
      def setTarget(value: js.Array[Coordinate]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetVarargs(value: Coordinate*): Self = StObject.set(x, "target", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Triangulation extends StObject {
    
    /**
      * Calculates extent of the 'source' coordinates from all the triangles.
      */
    def calculateSourceExtent(): Extent = js.native
    
    def getTriangles(): js.Array[Triangle] = js.native
  }
  object Triangulation {
    
    @scala.inline
    def apply(calculateSourceExtent: () => Extent, getTriangles: () => js.Array[Triangle]): Triangulation = {
      val __obj = js.Dynamic.literal(calculateSourceExtent = js.Any.fromFunction0(calculateSourceExtent), getTriangles = js.Any.fromFunction0(getTriangles))
      __obj.asInstanceOf[Triangulation]
    }
    
    @scala.inline
    implicit class TriangulationMutableBuilder[Self <: Triangulation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculateSourceExtent(value: () => Extent): Self = StObject.set(x, "calculateSourceExtent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTriangles(value: () => js.Array[Triangle]): Self = StObject.set(x, "getTriangles", js.Any.fromFunction0(value))
    }
  }
}
