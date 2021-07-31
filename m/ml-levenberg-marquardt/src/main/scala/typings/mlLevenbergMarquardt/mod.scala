package typings.mlLevenbergMarquardt

import typings.mlLevenbergMarquardt.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Implementation of the Levenberg-Marquardt curve fitting method. */
  @scala.inline
  def apply(d: Data, fn: FittedFunction): Result = (^.asInstanceOf[js.Dynamic].apply(d.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  @scala.inline
  def apply(d: Data, fn: FittedFunction, o: PartialOptions): Result = (^.asInstanceOf[js.Dynamic].apply(d.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Result]
  
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
    
    @scala.inline
    def apply(x: js.Array[Double], y: js.Array[Double]): Data = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value :_*))
      
      @scala.inline
      def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
    }
  }
  
  /**
    * Function that receives an array of parameters and returns
    * a function with the independent variable as a parameter.
    */
  type FittedFunction = js.Function1[/* parameters */ js.Array[Double], js.Function1[/* x */ Double, Double]]
  
  trait Options extends StObject {
    
    /**
      * The Levenberg-Marquardt lambda parameter.
      * Default value: 0
      */
    var damping: Double
    
    /**
      * Minimum uncertainty allowed for each point.
      * Default value: 10e-3
      */
    var errorTolerance: Double
    
    /**
      * Adjustment for decrease the damping parameter.
      * Default value: 10e-2
      */
    var gradientDifference: Double
    
    /**
      * Initial guesses for the parameters.
      * Default value: Array(parameters.lengh).fill(1)
      */
    var initialValues: js.Array[Double]
    
    /**
      * The maximum number of iterations before halting.
      * Default value: 100
      */
    var maxIterations: Double
    
    /**
      * Maximum values for the parameters.
      * Default value: Array(data.x.length).fill(MAX_SAFE_INTEGER)
      */
    var maxValue: js.Array[Double]
    
    /**
      * Minimum values for the parameters.
      * Default value: Array(data.x.length).fill(MIN_SAFE_INTEGER)
      */
    var minValue: js.Array[Double]
  }
  object Options {
    
    @scala.inline
    def apply(
      damping: Double,
      errorTolerance: Double,
      gradientDifference: Double,
      initialValues: js.Array[Double],
      maxIterations: Double,
      maxValue: js.Array[Double],
      minValue: js.Array[Double]
    ): Options = {
      val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], errorTolerance = errorTolerance.asInstanceOf[js.Any], gradientDifference = gradientDifference.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], maxIterations = maxIterations.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorTolerance(value: Double): Self = StObject.set(x, "errorTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientDifference(value: Double): Self = StObject.set(x, "gradientDifference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValues(value: js.Array[Double]): Self = StObject.set(x, "initialValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValuesVarargs(value: Double*): Self = StObject.set(x, "initialValues", js.Array(value :_*))
      
      @scala.inline
      def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValue(value: js.Array[Double]): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueVarargs(value: Double*): Self = StObject.set(x, "maxValue", js.Array(value :_*))
      
      @scala.inline
      def setMinValue(value: js.Array[Double]): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueVarargs(value: Double*): Self = StObject.set(x, "minValue", js.Array(value :_*))
    }
  }
  
  trait Result extends StObject {
    
    var iterations: Double
    
    var parameterError: Double
    
    var parameterValues: js.Array[Double]
  }
  object Result {
    
    @scala.inline
    def apply(iterations: Double, parameterError: Double, parameterValues: js.Array[Double]): Result = {
      val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], parameterError = parameterError.asInstanceOf[js.Any], parameterValues = parameterValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterError(value: Double): Self = StObject.set(x, "parameterError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterValues(value: js.Array[Double]): Self = StObject.set(x, "parameterValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterValuesVarargs(value: Double*): Self = StObject.set(x, "parameterValues", js.Array(value :_*))
    }
  }
}
