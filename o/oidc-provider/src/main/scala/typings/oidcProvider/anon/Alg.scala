package typings.oidcProvider.anon

import typings.oidcProvider.mod.AsymmetricSigningAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alg extends StObject {
  
  var alg: js.UndefOr[AsymmetricSigningAlgorithm] = js.undefined
  
  var kid: js.UndefOr[String] = js.undefined
}
object Alg {
  
  inline def apply(): Alg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alg]
  }
  
  extension [Self <: Alg](x: Self) {
    
    inline def setAlg(value: AsymmetricSigningAlgorithm): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
  }
}
