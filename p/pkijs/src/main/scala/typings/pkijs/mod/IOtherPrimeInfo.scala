package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOtherPrimeInfo extends StObject {
  
  var coefficient: Integer
  
  var exponent: Integer
  
  var prime: Integer
}
object IOtherPrimeInfo {
  
  inline def apply(coefficient: Integer, exponent: Integer, prime: Integer): IOtherPrimeInfo = {
    val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent = exponent.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOtherPrimeInfo]
  }
  
  extension [Self <: IOtherPrimeInfo](x: Self) {
    
    inline def setCoefficient(value: Integer): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
    
    inline def setExponent(value: Integer): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def setPrime(value: Integer): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
  }
}
