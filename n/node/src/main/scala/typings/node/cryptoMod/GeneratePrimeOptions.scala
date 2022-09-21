package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratePrimeOptions extends StObject {
  
  var add: js.UndefOr[LargeNumberLike] = js.undefined
  
  var bigint: js.UndefOr[Boolean] = js.undefined
  
  var rem: js.UndefOr[LargeNumberLike] = js.undefined
  
  /**
    * @default false
    */
  var safe: js.UndefOr[Boolean] = js.undefined
}
object GeneratePrimeOptions {
  
  inline def apply(): GeneratePrimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratePrimeOptions]
  }
  
  extension [Self <: GeneratePrimeOptions](x: Self) {
    
    inline def setAdd(value: LargeNumberLike): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
    
    inline def setRem(value: LargeNumberLike): Self = StObject.set(x, "rem", value.asInstanceOf[js.Any])
    
    inline def setRemUndefined: Self = StObject.set(x, "rem", js.undefined)
    
    inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
    
    inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
  }
}
