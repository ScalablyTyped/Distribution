package typings.mlLevenbergMarquardt

import typings.mlLevenbergMarquardt.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Implementation of the Levenberg-Marquardt curve fitting method. */
  inline def apply(d: Data, fn: FittedFunction): Result = (^.asInstanceOf[js.Dynamic].apply(d.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(d: Data, fn: FittedFunction, o: PartialOptions): Result = (^.asInstanceOf[js.Dynamic].apply(d.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  @JSImport("ml-levenberg-marquardt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Coordinates of points to fit.
    */
  trait Data extends StObject {
    
    var x: js.Array[Double]
    
    var y: js.Array[Double]
  }
  object Data {
    
    inline def apply(x: js.Array[Double], y: js.Array[Double]): Data = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
  
  /**
    * Function that receives an array of parameters and returns
    * a function with the independent variable as a parameter.
    */
  type FittedFunction = js.Function1[/* parameters */ js.Array[Double], js.Function1[/* x */ Double, Double]]
  
  trait Options extends StObject {
    
    /**
      * If true the jacobian matrix is approximated by central differences otherwise by forward differences.
      */
    var centralDifference: Boolean
    
    /**
      * The Levenberg-Marquardt lambda parameter.
      * Default value: 0
      */
    var damping: Double
    
    /**
      * factor to reduce the damping (Levenberg-Marquardt parameter) when there is not an improvement when updating parameters.
      */
    var dampingStepDown: Double
    
    /**
      * Factor to increase the damping (Levenberg-Marquardt parameter) when there is an improvement when updating parameters.
      */
    var dampingStepUp: Double
    
    /**
      * Minimum uncertainty allowed for each point.
      * Default value: 10e-3
      */
    var errorTolerance: Double
    
    /**
      * The step size to approximate the jacobian matrix.
      */
    var gradientDifference: Double | js.Array[Double]
    
    /**
      * The threshold to define an improvement through an update of parameters.
      */
    var improvementThreshold: Double
    
    /**
      * Initial guesses for the parameters.
      * Default value: Array(parameters.length).fill(1)
      */
    var initialValues: js.Array[Double]
    
    /**
      * The maximum number of iterations before halting.
      * Default value: 100
      */
    var maxIterations: Double
    
    /**
      * Maximum values for the parameters.
      * Default value: Array(parameters.length).fill(MAX_SAFE_INTEGER)
      */
    var maxValues: js.Array[Double]
    
    /**
      * Minimum values for the parameters.
      * Default value: Array(parameters.length).fill(MIN_SAFE_INTEGER)
      */
    var minValues: js.Array[Double]
    
    /**
      * Maximum time running before throw in seconds.
      */
    var timeout: Double
    
    /**
      * Weighting vector, if the length does not match with the number of data points, the vector is reconstructed with first value.
      */
    var weights: js.Array[Double]
  }
  object Options {
    
    inline def apply(
      centralDifference: Boolean,
      damping: Double,
      dampingStepDown: Double,
      dampingStepUp: Double,
      errorTolerance: Double,
      gradientDifference: Double | js.Array[Double],
      improvementThreshold: Double,
      initialValues: js.Array[Double],
      maxIterations: Double,
      maxValues: js.Array[Double],
      minValues: js.Array[Double],
      timeout: Double,
      weights: js.Array[Double]
    ): Options = {
      val __obj = js.Dynamic.literal(centralDifference = centralDifference.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], dampingStepDown = dampingStepDown.asInstanceOf[js.Any], dampingStepUp = dampingStepUp.asInstanceOf[js.Any], errorTolerance = errorTolerance.asInstanceOf[js.Any], gradientDifference = gradientDifference.asInstanceOf[js.Any], improvementThreshold = improvementThreshold.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], maxIterations = maxIterations.asInstanceOf[js.Any], maxValues = maxValues.asInstanceOf[js.Any], minValues = minValues.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCentralDifference(value: Boolean): Self = StObject.set(x, "centralDifference", value.asInstanceOf[js.Any])
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingStepDown(value: Double): Self = StObject.set(x, "dampingStepDown", value.asInstanceOf[js.Any])
      
      inline def setDampingStepUp(value: Double): Self = StObject.set(x, "dampingStepUp", value.asInstanceOf[js.Any])
      
      inline def setErrorTolerance(value: Double): Self = StObject.set(x, "errorTolerance", value.asInstanceOf[js.Any])
      
      inline def setGradientDifference(value: Double | js.Array[Double]): Self = StObject.set(x, "gradientDifference", value.asInstanceOf[js.Any])
      
      inline def setGradientDifferenceVarargs(value: Double*): Self = StObject.set(x, "gradientDifference", js.Array(value*))
      
      inline def setImprovementThreshold(value: Double): Self = StObject.set(x, "improvementThreshold", value.asInstanceOf[js.Any])
      
      inline def setInitialValues(value: js.Array[Double]): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      inline def setInitialValuesVarargs(value: Double*): Self = StObject.set(x, "initialValues", js.Array(value*))
      
      inline def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
      
      inline def setMaxValues(value: js.Array[Double]): Self = StObject.set(x, "maxValues", value.asInstanceOf[js.Any])
      
      inline def setMaxValuesVarargs(value: Double*): Self = StObject.set(x, "maxValues", js.Array(value*))
      
      inline def setMinValues(value: js.Array[Double]): Self = StObject.set(x, "minValues", value.asInstanceOf[js.Any])
      
      inline def setMinValuesVarargs(value: Double*): Self = StObject.set(x, "minValues", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setWeights(value: js.Array[Double]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsVarargs(value: Double*): Self = StObject.set(x, "weights", js.Array(value*))
    }
  }
  
  trait Result extends StObject {
    
    var iterations: Double
    
    var parameterError: Double
    
    var parameterValues: js.Array[Double]
  }
  object Result {
    
    inline def apply(iterations: Double, parameterError: Double, parameterValues: js.Array[Double]): Result = {
      val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], parameterError = parameterError.asInstanceOf[js.Any], parameterValues = parameterValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setParameterError(value: Double): Self = StObject.set(x, "parameterError", value.asInstanceOf[js.Any])
      
      inline def setParameterValues(value: js.Array[Double]): Self = StObject.set(x, "parameterValues", value.asInstanceOf[js.Any])
      
      inline def setParameterValuesVarargs(value: Double*): Self = StObject.set(x, "parameterValues", js.Array(value*))
    }
  }
}
