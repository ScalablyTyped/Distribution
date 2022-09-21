package typings.poissonDiskSampling

import typings.poissonDiskSampling.anon.Data
import typings.poissonDiskSampling.anon.MinDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedDensityMod {
  
  @JSImport("poisson-disk-sampling/src/implementations/fixed-density", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FixedDensityPDS {
    def this(options: MinDistance) = this()
    def this(options: MinDistance, rng: js.Function1[/* repeated */ Double, Double]) = this()
    
    /* CompleteClass */
    override def addPoint(point: js.Array[Double]): js.Array[Double] | Null = js.native
    
    /* CompleteClass */
    override def addRandomPoint(): js.Array[Double] = js.native
    
    /* CompleteClass */
    var cellSize: Double = js.native
    
    /* CompleteClass */
    var currentPoint: js.Array[Double] | Null = js.native
    
    /* CompleteClass */
    var deltaDistance: Double = js.native
    
    /* CompleteClass */
    var dimension: Double = js.native
    
    /* protected */ /* CompleteClass */
    override def directAddPoint(point: js.Array[Double]): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def fill(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def getAllPoints(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def getAllPointsWithDistance(): Unit = js.native
    
    /* CompleteClass */
    var grid: Data = js.native
    
    /* CompleteClass */
    var gridShape: js.Array[Double] = js.native
    
    /* protected */ /* CompleteClass */
    override def inNeighbourhood(point: js.Array[Double]): Boolean = js.native
    
    /* CompleteClass */
    var maxDistance: Double = js.native
    
    /* CompleteClass */
    var maxTries: Double = js.native
    
    /* CompleteClass */
    var minDistance: Double = js.native
    
    /* CompleteClass */
    var minDistancePlusEpsilon: Double = js.native
    
    /* CompleteClass */
    var neighbourhood: js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def next(): js.Array[Double] | Null = js.native
    
    /* CompleteClass */
    var processList: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    var rng: (js.Function1[/* repeated */ Double, Double]) | Null = js.native
    
    /* CompleteClass */
    var samplePoints: js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    var shape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var squaredMinDistance: Double = js.native
  }
  
  trait FixedDensityPDS extends StObject {
    
    def addPoint(point: js.Array[Double]): js.Array[Double] | Null
    
    def addRandomPoint(): js.Array[Double]
    
    var cellSize: Double
    
    var currentPoint: js.Array[Double] | Null
    
    var deltaDistance: Double
    
    var dimension: Double
    
    /* protected */ def directAddPoint(point: js.Array[Double]): js.Array[Double]
    
    def fill(): js.Array[js.Array[Double]]
    
    def getAllPoints(): js.Array[js.Array[Double]]
    
    def getAllPointsWithDistance(): Unit
    
    var grid: Data
    
    var gridShape: js.Array[Double]
    
    /* protected */ def inNeighbourhood(point: js.Array[Double]): Boolean
    
    var maxDistance: Double
    
    var maxTries: Double
    
    var minDistance: Double
    
    var minDistancePlusEpsilon: Double
    
    var neighbourhood: js.Array[js.Array[Double]]
    
    def next(): js.Array[Double] | Null
    
    var processList: js.Array[Any]
    
    def reset(): Unit
    
    var rng: (js.Function1[/* repeated */ Double, Double]) | Null
    
    var samplePoints: js.Array[js.Array[Double]]
    
    var shape: js.Array[Double]
    
    var squaredMinDistance: Double
  }
  object FixedDensityPDS {
    
    inline def apply(
      addPoint: js.Array[Double] => js.Array[Double] | Null,
      addRandomPoint: () => js.Array[Double],
      cellSize: Double,
      deltaDistance: Double,
      dimension: Double,
      directAddPoint: js.Array[Double] => js.Array[Double],
      fill: () => js.Array[js.Array[Double]],
      getAllPoints: () => js.Array[js.Array[Double]],
      getAllPointsWithDistance: () => Unit,
      grid: Data,
      gridShape: js.Array[Double],
      inNeighbourhood: js.Array[Double] => Boolean,
      maxDistance: Double,
      maxTries: Double,
      minDistance: Double,
      minDistancePlusEpsilon: Double,
      neighbourhood: js.Array[js.Array[Double]],
      next: () => js.Array[Double] | Null,
      processList: js.Array[Any],
      reset: () => Unit,
      samplePoints: js.Array[js.Array[Double]],
      shape: js.Array[Double],
      squaredMinDistance: Double
    ): FixedDensityPDS = {
      val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction1(addPoint), addRandomPoint = js.Any.fromFunction0(addRandomPoint), cellSize = cellSize.asInstanceOf[js.Any], deltaDistance = deltaDistance.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], directAddPoint = js.Any.fromFunction1(directAddPoint), fill = js.Any.fromFunction0(fill), getAllPoints = js.Any.fromFunction0(getAllPoints), getAllPointsWithDistance = js.Any.fromFunction0(getAllPointsWithDistance), grid = grid.asInstanceOf[js.Any], gridShape = gridShape.asInstanceOf[js.Any], inNeighbourhood = js.Any.fromFunction1(inNeighbourhood), maxDistance = maxDistance.asInstanceOf[js.Any], maxTries = maxTries.asInstanceOf[js.Any], minDistance = minDistance.asInstanceOf[js.Any], minDistancePlusEpsilon = minDistancePlusEpsilon.asInstanceOf[js.Any], neighbourhood = neighbourhood.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), processList = processList.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), samplePoints = samplePoints.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], squaredMinDistance = squaredMinDistance.asInstanceOf[js.Any], currentPoint = null, rng = null)
      __obj.asInstanceOf[FixedDensityPDS]
    }
    
    extension [Self <: FixedDensityPDS](x: Self) {
      
      inline def setAddPoint(value: js.Array[Double] => js.Array[Double] | Null): Self = StObject.set(x, "addPoint", js.Any.fromFunction1(value))
      
      inline def setAddRandomPoint(value: () => js.Array[Double]): Self = StObject.set(x, "addRandomPoint", js.Any.fromFunction0(value))
      
      inline def setCellSize(value: Double): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
      
      inline def setCurrentPoint(value: js.Array[Double]): Self = StObject.set(x, "currentPoint", value.asInstanceOf[js.Any])
      
      inline def setCurrentPointNull: Self = StObject.set(x, "currentPoint", null)
      
      inline def setCurrentPointVarargs(value: Double*): Self = StObject.set(x, "currentPoint", js.Array(value*))
      
      inline def setDeltaDistance(value: Double): Self = StObject.set(x, "deltaDistance", value.asInstanceOf[js.Any])
      
      inline def setDimension(value: Double): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setDirectAddPoint(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "directAddPoint", js.Any.fromFunction1(value))
      
      inline def setFill(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "fill", js.Any.fromFunction0(value))
      
      inline def setGetAllPoints(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "getAllPoints", js.Any.fromFunction0(value))
      
      inline def setGetAllPointsWithDistance(value: () => Unit): Self = StObject.set(x, "getAllPointsWithDistance", js.Any.fromFunction0(value))
      
      inline def setGrid(value: Data): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridShape(value: js.Array[Double]): Self = StObject.set(x, "gridShape", value.asInstanceOf[js.Any])
      
      inline def setGridShapeVarargs(value: Double*): Self = StObject.set(x, "gridShape", js.Array(value*))
      
      inline def setInNeighbourhood(value: js.Array[Double] => Boolean): Self = StObject.set(x, "inNeighbourhood", js.Any.fromFunction1(value))
      
      inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
      
      inline def setMaxTries(value: Double): Self = StObject.set(x, "maxTries", value.asInstanceOf[js.Any])
      
      inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      inline def setMinDistancePlusEpsilon(value: Double): Self = StObject.set(x, "minDistancePlusEpsilon", value.asInstanceOf[js.Any])
      
      inline def setNeighbourhood(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "neighbourhood", value.asInstanceOf[js.Any])
      
      inline def setNeighbourhoodVarargs(value: js.Array[Double]*): Self = StObject.set(x, "neighbourhood", js.Array(value*))
      
      inline def setNext(value: () => js.Array[Double] | Null): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setProcessList(value: js.Array[Any]): Self = StObject.set(x, "processList", value.asInstanceOf[js.Any])
      
      inline def setProcessListVarargs(value: Any*): Self = StObject.set(x, "processList", js.Array(value*))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setRng(value: /* repeated */ Double => Double): Self = StObject.set(x, "rng", js.Any.fromFunction1(value))
      
      inline def setRngNull: Self = StObject.set(x, "rng", null)
      
      inline def setSamplePoints(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "samplePoints", value.asInstanceOf[js.Any])
      
      inline def setSamplePointsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "samplePoints", js.Array(value*))
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setSquaredMinDistance(value: Double): Self = StObject.set(x, "squaredMinDistance", value.asInstanceOf[js.Any])
    }
  }
}
