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
    def this(options: Bias, /**
      * RNG function
      * @default Math.random
      */
    rng: js.Function0[Double]) = this()
    
    /**
      * Add a given point to the grid
      * @param point Point
      * @returns The point added to the grid, `null` if the point is out of the bound or not of the correct dimension
      */
    /* CompleteClass */
    override def addPoint(point: Point): Point | Null = js.native
    
    /**
      * Add a totally random point in the grid
      * @returns The point added to the grid
      */
    /* CompleteClass */
    override def addRandomPoint(): Point = js.native
    
    /**
      * Automatically fill the grid, adding a random point to start the process if needed.
      * Will block the thread, probably best to use it in a web worker or child process.
      * @returns Sample points
      */
    /* CompleteClass */
    override def fill(): js.Array[Point] = js.native
    
    /**
      * Get all the points in the grid.
      * @returns Sample points
      */
    /* CompleteClass */
    override def getAllPoints(): js.Array[Point] = js.native
    
    /**
      * Get all the points in the grid along with the result of the distance function.
      * @throws Will throw an error if a distance function was not provided to the constructor.
      * @returns Sample points with their distance function result
      */
    /* CompleteClass */
    override def getAllPointsWithDistance(): js.Array[Point] = js.native
    
    /* CompleteClass */
    var implementation: typings.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typings.poissonDiskSampling.srcImplementationsVariableDensityMod.^ = js.native
    
    /**
      * Try to generate a new point in the grid, returns `null` if it wasn't possible
      * @returns The added point or null
      */
    /* CompleteClass */
    override def next(): Point | Null = js.native
    
    /**
      * Reinitialize the grid as well as the internal state
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    var shape: js.Array[Double] = js.native
  }
  
  type Point = js.Array[Double]
  
  trait PoissonDiskSampling extends StObject {
    
    /**
      * Add a given point to the grid
      * @param point Point
      * @returns The point added to the grid, `null` if the point is out of the bound or not of the correct dimension
      */
    def addPoint(point: Point): Point | Null
    
    /**
      * Add a totally random point in the grid
      * @returns The point added to the grid
      */
    def addRandomPoint(): Point
    
    /**
      * Automatically fill the grid, adding a random point to start the process if needed.
      * Will block the thread, probably best to use it in a web worker or child process.
      * @returns Sample points
      */
    def fill(): js.Array[Point]
    
    /**
      * Get all the points in the grid.
      * @returns Sample points
      */
    def getAllPoints(): js.Array[Point]
    
    /**
      * Get all the points in the grid along with the result of the distance function.
      * @throws Will throw an error if a distance function was not provided to the constructor.
      * @returns Sample points with their distance function result
      */
    def getAllPointsWithDistance(): js.Array[Point]
    
    var implementation: typings.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typings.poissonDiskSampling.srcImplementationsVariableDensityMod.^
    
    /**
      * Try to generate a new point in the grid, returns `null` if it wasn't possible
      * @returns The added point or null
      */
    def next(): Point | Null
    
    /**
      * Reinitialize the grid as well as the internal state
      */
    def reset(): Unit
    
    var shape: js.Array[Double]
  }
  object PoissonDiskSampling {
    
    inline def apply(
      addPoint: Point => Point | Null,
      addRandomPoint: () => Point,
      fill: () => js.Array[Point],
      getAllPoints: () => js.Array[Point],
      getAllPointsWithDistance: () => js.Array[Point],
      implementation: typings.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typings.poissonDiskSampling.srcImplementationsVariableDensityMod.^,
      next: () => Point | Null,
      reset: () => Unit,
      shape: js.Array[Double]
    ): PoissonDiskSampling = {
      val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction1(addPoint), addRandomPoint = js.Any.fromFunction0(addRandomPoint), fill = js.Any.fromFunction0(fill), getAllPoints = js.Any.fromFunction0(getAllPoints), getAllPointsWithDistance = js.Any.fromFunction0(getAllPointsWithDistance), implementation = implementation.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), reset = js.Any.fromFunction0(reset), shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[PoissonDiskSampling]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PoissonDiskSampling] (val x: Self) extends AnyVal {
      
      inline def setAddPoint(value: Point => Point | Null): Self = StObject.set(x, "addPoint", js.Any.fromFunction1(value))
      
      inline def setAddRandomPoint(value: () => Point): Self = StObject.set(x, "addRandomPoint", js.Any.fromFunction0(value))
      
      inline def setFill(value: () => js.Array[Point]): Self = StObject.set(x, "fill", js.Any.fromFunction0(value))
      
      inline def setGetAllPoints(value: () => js.Array[Point]): Self = StObject.set(x, "getAllPoints", js.Any.fromFunction0(value))
      
      inline def setGetAllPointsWithDistance(value: () => js.Array[Point]): Self = StObject.set(x, "getAllPointsWithDistance", js.Any.fromFunction0(value))
      
      inline def setImplementation(
        value: typings.poissonDiskSampling.srcImplementationsFixedDensityMod.^ | typings.poissonDiskSampling.srcImplementationsVariableDensityMod.^
      ): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setNext(value: () => Point | Null): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
    }
  }
}
