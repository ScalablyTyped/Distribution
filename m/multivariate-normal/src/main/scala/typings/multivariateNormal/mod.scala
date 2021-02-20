package typings.multivariateNormal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multivariate-normal", JSImport.Default)
  @js.native
  def default(mean: js.Array[Double], cov: js.Array[js.Array[Double]]): Distribution = js.native
  
  @js.native
  trait Distribution extends StObject {
    
    def getCov(): js.Array[js.Array[Double]] = js.native
    
    def getMean(): js.Array[Double] = js.native
    
    def sample(): js.Array[Double] = js.native
    
    def setCov(newCov: js.Array[js.Array[Double]]): Distribution = js.native
    
    def setMean(newMean: js.Array[Double]): Distribution = js.native
  }
  object Distribution {
    
    @scala.inline
    def apply(
      getCov: () => js.Array[js.Array[Double]],
      getMean: () => js.Array[Double],
      sample: () => js.Array[Double],
      setCov: js.Array[js.Array[Double]] => Distribution,
      setMean: js.Array[Double] => Distribution
    ): Distribution = {
      val __obj = js.Dynamic.literal(getCov = js.Any.fromFunction0(getCov), getMean = js.Any.fromFunction0(getMean), sample = js.Any.fromFunction0(sample), setCov = js.Any.fromFunction1(setCov), setMean = js.Any.fromFunction1(setMean))
      __obj.asInstanceOf[Distribution]
    }
    
    @scala.inline
    implicit class DistributionMutableBuilder[Self <: Distribution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCov(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "getCov", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMean(value: () => js.Array[Double]): Self = StObject.set(x, "getMean", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSample(value: () => js.Array[Double]): Self = StObject.set(x, "sample", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetCov(value: js.Array[js.Array[Double]] => Distribution): Self = StObject.set(x, "setCov", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMean(value: js.Array[Double] => Distribution): Self = StObject.set(x, "setMean", js.Any.fromFunction1(value))
    }
  }
}
