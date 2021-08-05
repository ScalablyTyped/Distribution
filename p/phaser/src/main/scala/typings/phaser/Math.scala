package typings.phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Math extends StObject {
  
  def fround(n: Double): Double
}
object Math {
  
  inline def apply(fround: Double => Double): Math = {
    val __obj = js.Dynamic.literal(fround = js.Any.fromFunction1(fround))
    __obj.asInstanceOf[Math]
  }
  
  extension [Self <: Math](x: Self) {
    
    inline def setFround(value: Double => Double): Self = StObject.set(x, "fround", js.Any.fromFunction1(value))
  }
}
