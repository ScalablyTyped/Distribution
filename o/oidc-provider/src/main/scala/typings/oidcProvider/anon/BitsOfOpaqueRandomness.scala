package typings.oidcProvider.anon

import typings.oidcProvider.mod.BaseModel
import typings.oidcProvider.mod.KoaContextWithOIDC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitsOfOpaqueRandomness extends StObject {
  
  var bitsOfOpaqueRandomness: js.UndefOr[
    Double | (js.Function2[/* ctx */ KoaContextWithOIDC, /* model */ BaseModel, Double])
  ] = js.undefined
  
  var customizers: js.UndefOr[Jwt] = js.undefined
}
object BitsOfOpaqueRandomness {
  
  inline def apply(): BitsOfOpaqueRandomness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitsOfOpaqueRandomness]
  }
  
  extension [Self <: BitsOfOpaqueRandomness](x: Self) {
    
    inline def setBitsOfOpaqueRandomness(value: Double | (js.Function2[/* ctx */ KoaContextWithOIDC, /* model */ BaseModel, Double])): Self = StObject.set(x, "bitsOfOpaqueRandomness", value.asInstanceOf[js.Any])
    
    inline def setBitsOfOpaqueRandomnessFunction2(value: (/* ctx */ KoaContextWithOIDC, /* model */ BaseModel) => Double): Self = StObject.set(x, "bitsOfOpaqueRandomness", js.Any.fromFunction2(value))
    
    inline def setBitsOfOpaqueRandomnessUndefined: Self = StObject.set(x, "bitsOfOpaqueRandomness", js.undefined)
    
    inline def setCustomizers(value: Jwt): Self = StObject.set(x, "customizers", value.asInstanceOf[js.Any])
    
    inline def setCustomizersUndefined: Self = StObject.set(x, "customizers", js.undefined)
  }
}
