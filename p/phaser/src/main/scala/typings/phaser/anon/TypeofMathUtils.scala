package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMathUtils extends StObject {
  
  /* static member */
  var PI: Double
  
  /* static member */
  var PI2: Double
  
  /* static member */
  def cbrt(x: Double): Double
  
  /* static member */
  def clamp(value: Double, min: Double, max: Double): Double
  
  /* static member */
  def cosDeg(degrees: Double): Double
  
  /* static member */
  var degRad: Double
  
  /* static member */
  var degreesToRadians: Double
  
  /* static member */
  var radDeg: Double
  
  /* static member */
  var radiansToDegrees: Double
  
  /* static member */
  def randomTriangular(min: Double, max: Double): Double
  
  /* static member */
  def randomTriangularWith(min: Double, max: Double, mode: Double): Double
  
  /* static member */
  def signum(value: Double): Double
  
  /* static member */
  def sinDeg(degrees: Double): Double
  
  /* static member */
  def toInt(x: Double): Double
}
object TypeofMathUtils {
  
  @scala.inline
  def apply(
    PI: Double,
    PI2: Double,
    cbrt: Double => Double,
    clamp: (Double, Double, Double) => Double,
    cosDeg: Double => Double,
    degRad: Double,
    degreesToRadians: Double,
    radDeg: Double,
    radiansToDegrees: Double,
    randomTriangular: (Double, Double) => Double,
    randomTriangularWith: (Double, Double, Double) => Double,
    signum: Double => Double,
    sinDeg: Double => Double,
    toInt: Double => Double
  ): TypeofMathUtils = {
    val __obj = js.Dynamic.literal(PI = PI.asInstanceOf[js.Any], PI2 = PI2.asInstanceOf[js.Any], cbrt = js.Any.fromFunction1(cbrt), clamp = js.Any.fromFunction3(clamp), cosDeg = js.Any.fromFunction1(cosDeg), degRad = degRad.asInstanceOf[js.Any], degreesToRadians = degreesToRadians.asInstanceOf[js.Any], radDeg = radDeg.asInstanceOf[js.Any], radiansToDegrees = radiansToDegrees.asInstanceOf[js.Any], randomTriangular = js.Any.fromFunction2(randomTriangular), randomTriangularWith = js.Any.fromFunction3(randomTriangularWith), signum = js.Any.fromFunction1(signum), sinDeg = js.Any.fromFunction1(sinDeg), toInt = js.Any.fromFunction1(toInt))
    __obj.asInstanceOf[TypeofMathUtils]
  }
  
  @scala.inline
  implicit class TypeofMathUtilsMutableBuilder[Self <: TypeofMathUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCbrt(value: Double => Double): Self = StObject.set(x, "cbrt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClamp(value: (Double, Double, Double) => Double): Self = StObject.set(x, "clamp", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCosDeg(value: Double => Double): Self = StObject.set(x, "cosDeg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDegRad(value: Double): Self = StObject.set(x, "degRad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDegreesToRadians(value: Double): Self = StObject.set(x, "degreesToRadians", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPI(value: Double): Self = StObject.set(x, "PI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPI2(value: Double): Self = StObject.set(x, "PI2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadDeg(value: Double): Self = StObject.set(x, "radDeg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiansToDegrees(value: Double): Self = StObject.set(x, "radiansToDegrees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomTriangular(value: (Double, Double) => Double): Self = StObject.set(x, "randomTriangular", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRandomTriangularWith(value: (Double, Double, Double) => Double): Self = StObject.set(x, "randomTriangularWith", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSignum(value: Double => Double): Self = StObject.set(x, "signum", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSinDeg(value: Double => Double): Self = StObject.set(x, "sinDeg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToInt(value: Double => Double): Self = StObject.set(x, "toInt", js.Any.fromFunction1(value))
  }
}
