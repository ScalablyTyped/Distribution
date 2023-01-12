package typings.poissonDiskSampling

import typings.poissonDiskSampling.anon.Bias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("poisson-disk-sampling", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PoissonDiskSampling {
    def this(options: Bias) = this()
    def this(options: Bias, rng: js.Function1[/* repeated */ Double, Double]) = this()
    
    /* CompleteClass */
    override def addPoint(point: js.Array[Double]): js.Array[Double] | Null = js.native
    
    /* CompleteClass */
    override def addRandomPoint(): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def fill(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def getAllPoints(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def getAllPointsWithDistance(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    var implementation: typings.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typings.poissonDiskSampling.srcImplementationsVariableDensityMod.^ = js.native
    
    /* CompleteClass */
    override def next(): js.Array[Double] | Null = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    var shape: js.Array[Double] = js.native
  }
  
  trait PoissonDiskSampling extends StObject {
    
    def addPoint(point: js.Array[Double]): js.Array[Double] | Null
    
    def addRandomPoint(): js.Array[Double]
    
    def fill(): js.Array[js.Array[Double]]
    
    def getAllPoints(): js.Array[js.Array[Double]]
    
    def getAllPointsWithDistance(): js.Array[js.Array[Double]]
    
    var implementation: typings.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typings.poissonDiskSampling.srcImplementationsVariableDensityMod.^
    
    def next(): js.Array[Double] | Null
    
    def reset(): Unit
    
    var shape: js.Array[Double]
  }
  object PoissonDiskSampling {
    
    inline def apply(
      addPoint: js.Array[Double] => js.Array[Double] | Null,
      addRandomPoint: () => js.Array[Double],
      fill: () => js.Array[js.Array[Double]],
      getAllPoints: () => js.Array[js.Array[Double]],
      getAllPointsWithDistance: () => js.Array[js.Array[Double]],
      implementation: typings.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typings.poissonDiskSampling.srcImplementationsVariableDensityMod.^,
      next: () => js.Array[Double] | Null,
      reset: () => Unit,
      shape: js.Array[Double]
    ): PoissonDiskSampling = {
      val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction1(addPoint), addRandomPoint = js.Any.fromFunction0(addRandomPoint), fill = js.Any.fromFunction0(fill), getAllPoints = js.Any.fromFunction0(getAllPoints), getAllPointsWithDistance = js.Any.fromFunction0(getAllPointsWithDistance), implementation = implementation.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), reset = js.Any.fromFunction0(reset), shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoissonDiskSampling]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PoissonDiskSampling] (val x: Self) extends AnyVal {
      
      inline def setAddPoint(value: js.Array[Double] => js.Array[Double] | Null): Self = StObject.set(x, "addPoint", js.Any.fromFunction1(value))
      
      inline def setAddRandomPoint(value: () => js.Array[Double]): Self = StObject.set(x, "addRandomPoint", js.Any.fromFunction0(value))
      
      inline def setFill(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "fill", js.Any.fromFunction0(value))
      
      inline def setGetAllPoints(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "getAllPoints", js.Any.fromFunction0(value))
      
      inline def setGetAllPointsWithDistance(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "getAllPointsWithDistance", js.Any.fromFunction0(value))
      
      inline def setImplementation(
        value: typings.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typings.poissonDiskSampling.srcImplementationsVariableDensityMod.^
      ): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setNext(value: () => js.Array[Double] | Null): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
    }
  }
}
