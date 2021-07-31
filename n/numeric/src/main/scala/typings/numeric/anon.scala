package typings.numeric

import typings.numeric.mod.Matrix
import typings.numeric.mod.Scalar
import typings.numeric.mod.Tensor
import typings.numeric.mod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait A extends StObject {
    
    var A: Matrix
    
    var I: Matrix
    
    var P: Vector
  }
  object A {
    
    @scala.inline
    def apply(A: Matrix, I: Matrix, P: Vector): A = {
      val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], I = I.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    @scala.inline
    implicit class AMutableBuilder[Self <: A] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Matrix): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAVarargs(value: js.Array[Double]*): Self = StObject.set(x, "A", js.Array(value :_*))
      
      @scala.inline
      def setI(value: Matrix): Self = StObject.set(x, "I", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIVarargs(value: js.Array[Double]*): Self = StObject.set(x, "I", js.Array(value :_*))
      
      @scala.inline
      def setP(value: Vector): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPVarargs(value: Double*): Self = StObject.set(x, "P", js.Array(value :_*))
    }
  }
  
  trait B extends StObject {
    
    var B: Matrix
    
    var Q: Matrix
  }
  object B {
    
    @scala.inline
    def apply(B: Matrix, Q: Matrix): B = {
      val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
      __obj.asInstanceOf[B]
    }
    
    @scala.inline
    implicit class BMutableBuilder[Self <: B] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Matrix): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBVarargs(value: js.Array[Double]*): Self = StObject.set(x, "B", js.Array(value :_*))
      
      @scala.inline
      def setQ(value: Matrix): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQVarargs(value: js.Array[Double]*): Self = StObject.set(x, "Q", js.Array(value :_*))
    }
  }
  
  trait E extends StObject {
    
    var E: Tensor
    
    var lambda: Tensor
  }
  object E {
    
    @scala.inline
    def apply(E: Tensor, lambda: Tensor): E = {
      val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any])
      __obj.asInstanceOf[E]
    }
    
    @scala.inline
    implicit class EMutableBuilder[Self <: E] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setE(value: Tensor): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambda(value: Tensor): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    }
  }
  
  trait F extends StObject {
    
    var f: Scalar
    
    var gradient: Vector
    
    var invHessian: Matrix
    
    var iterations: Double
    
    var message: String
    
    var solution: Vector
  }
  object F {
    
    @scala.inline
    def apply(
      f: Scalar,
      gradient: Vector,
      invHessian: Matrix,
      iterations: Double,
      message: String,
      solution: Vector
    ): F = {
      val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], invHessian = invHessian.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any])
      __obj.asInstanceOf[F]
    }
    
    @scala.inline
    implicit class FMutableBuilder[Self <: F] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setF(value: Scalar): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradient(value: Vector): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientVarargs(value: Double*): Self = StObject.set(x, "gradient", js.Array(value :_*))
      
      @scala.inline
      def setInvHessian(value: Matrix): Self = StObject.set(x, "invHessian", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvHessianVarargs(value: js.Array[Double]*): Self = StObject.set(x, "invHessian", js.Array(value :_*))
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolution(value: Vector): Self = StObject.set(x, "solution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionVarargs(value: Double*): Self = StObject.set(x, "solution", js.Array(value :_*))
    }
  }
  
  trait H extends StObject {
    
    var H: Matrix
    
    var Q: Matrix
  }
  object H {
    
    @scala.inline
    def apply(H: Matrix, Q: Matrix): H = {
      val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    @scala.inline
    implicit class HMutableBuilder[Self <: H] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Matrix): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHVarargs(value: js.Array[Double]*): Self = StObject.set(x, "H", js.Array(value :_*))
      
      @scala.inline
      def setQ(value: Matrix): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQVarargs(value: js.Array[Double]*): Self = StObject.set(x, "Q", js.Array(value :_*))
    }
  }
  
  trait Hinv extends StObject {
    
    var Hinv: Matrix
  }
  object Hinv {
    
    @scala.inline
    def apply(Hinv: Matrix): Hinv = {
      val __obj = js.Dynamic.literal(Hinv = Hinv.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hinv]
    }
    
    @scala.inline
    implicit class HinvMutableBuilder[Self <: Hinv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHinv(value: Matrix): Self = StObject.set(x, "Hinv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHinvVarargs(value: js.Array[Double]*): Self = StObject.set(x, "Hinv", js.Array(value :_*))
    }
  }
  
  trait Iact extends StObject {
    
    var iact: Vector
    
    var iterations: Vector
    
    var message: String
    
    var solution: Vector
    
    var unconstrained_solution: Vector
    
    var value: Vector
  }
  object Iact {
    
    @scala.inline
    def apply(
      iact: Vector,
      iterations: Vector,
      message: String,
      solution: Vector,
      unconstrained_solution: Vector,
      value: Vector
    ): Iact = {
      val __obj = js.Dynamic.literal(iact = iact.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any], unconstrained_solution = unconstrained_solution.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iact]
    }
    
    @scala.inline
    implicit class IactMutableBuilder[Self <: Iact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIact(value: Vector): Self = StObject.set(x, "iact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIactVarargs(value: Double*): Self = StObject.set(x, "iact", js.Array(value :_*))
      
      @scala.inline
      def setIterations(value: Vector): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationsVarargs(value: Double*): Self = StObject.set(x, "iterations", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolution(value: Vector): Self = StObject.set(x, "solution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionVarargs(value: Double*): Self = StObject.set(x, "solution", js.Array(value :_*))
      
      @scala.inline
      def setUnconstrained_solution(value: Vector): Self = StObject.set(x, "unconstrained_solution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnconstrained_solutionVarargs(value: Double*): Self = StObject.set(x, "unconstrained_solution", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Vector): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait Iterations extends StObject {
    
    var iterations: Double
    
    var message: String
    
    var solution: Scalar | Vector
  }
  object Iterations {
    
    @scala.inline
    def apply(iterations: Double, message: String, solution: Scalar | Vector): Iterations = {
      val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iterations]
    }
    
    @scala.inline
    implicit class IterationsMutableBuilder[Self <: Iterations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolution(value: Scalar | Vector): Self = StObject.set(x, "solution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionVarargs(value: Double*): Self = StObject.set(x, "solution", js.Array(value :_*))
    }
  }
  
  trait LU extends StObject {
    
    var LU: Matrix
    
    var P: Vector
  }
  object LU {
    
    @scala.inline
    def apply(LU: Matrix, P: Vector): LU = {
      val __obj = js.Dynamic.literal(LU = LU.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
      __obj.asInstanceOf[LU]
    }
    
    @scala.inline
    implicit class LUMutableBuilder[Self <: LU] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLU(value: Matrix): Self = StObject.set(x, "LU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLUVarargs(value: js.Array[Double]*): Self = StObject.set(x, "LU", js.Array(value :_*))
      
      @scala.inline
      def setP(value: Vector): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPVarargs(value: Double*): Self = StObject.set(x, "P", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Random extends StObject {
    
    def random(): Double = js.native
    
    def seedrandom(seed: String): String = js.native
    def seedrandom(seed: String, useEntropy: Boolean): String = js.native
    def seedrandom(seed: Double): String = js.native
    def seedrandom(seed: Double, useEntropy: Boolean): String = js.native
  }
  
  trait S extends StObject {
    
    var S: Vector
    
    var U: Matrix
    
    var V: Matrix
  }
  object S {
    
    @scala.inline
    def apply(S: Vector, U: Matrix, V: Matrix): S = {
      val __obj = js.Dynamic.literal(S = S.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
      __obj.asInstanceOf[S]
    }
    
    @scala.inline
    implicit class SMutableBuilder[Self <: S] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setS(value: Vector): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVarargs(value: Double*): Self = StObject.set(x, "S", js.Array(value :_*))
      
      @scala.inline
      def setU(value: Matrix): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUVarargs(value: js.Array[Double]*): Self = StObject.set(x, "U", js.Array(value :_*))
      
      @scala.inline
      def setV(value: Matrix): Self = StObject.set(x, "V", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVVarargs(value: js.Array[Double]*): Self = StObject.set(x, "V", js.Array(value :_*))
    }
  }
}
