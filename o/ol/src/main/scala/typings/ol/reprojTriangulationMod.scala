package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojTriangulationMod {
  
  @JSImport("ol/reproj/Triangulation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Triangulation {
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetExtent: Extent,
      maxSourceExtent: Extent,
      errorThreshold: Double,
      opt_destinationResolution: Double
    ) = this()
    
    /**
      * Calculates extent of the 'source' coordinates from all the triangles.
      */
    /* CompleteClass */
    override def calculateSourceExtent(): Extent = js.native
    
    /* CompleteClass */
    override def getTriangles(): js.Array[Triangle] = js.native
  }
  
  trait Triangle extends StObject {
    
    var source: js.Array[Coordinate]
    
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
  
  trait Triangulation extends StObject {
    
    /**
      * Calculates extent of the 'source' coordinates from all the triangles.
      */
    def calculateSourceExtent(): Extent
    
    def getTriangles(): js.Array[Triangle]
  }
  object Triangulation {
    
    inline def apply(calculateSourceExtent: () => Extent, getTriangles: () => js.Array[Triangle]): Triangulation = {
      val __obj = js.Dynamic.literal(calculateSourceExtent = js.Any.fromFunction0(calculateSourceExtent), getTriangles = js.Any.fromFunction0(getTriangles))
      __obj.asInstanceOf[Triangulation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Triangulation] (val x: Self) extends AnyVal {
      
      inline def setCalculateSourceExtent(value: () => Extent): Self = StObject.set(x, "calculateSourceExtent", js.Any.fromFunction0(value))
      
      inline def setGetTriangles(value: () => js.Array[Triangle]): Self = StObject.set(x, "getTriangles", js.Any.fromFunction0(value))
    }
  }
}
