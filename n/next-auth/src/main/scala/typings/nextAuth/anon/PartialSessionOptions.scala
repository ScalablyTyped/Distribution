package typings.nextAuth.anon

import typings.nextAuth.coreTypesMod.SessionStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<next-auth.next-auth/core/types.SessionOptions> */
trait PartialSessionOptions extends StObject {
  
  var generateSessionToken: js.UndefOr[js.Function0[String]] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
  
  var strategy: js.UndefOr[SessionStrategy] = js.undefined
  
  var updateAge: js.UndefOr[Double] = js.undefined
}
object PartialSessionOptions {
  
  inline def apply(): PartialSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSessionOptions]
  }
  
  extension [Self <: PartialSessionOptions](x: Self) {
    
    inline def setGenerateSessionToken(value: () => String): Self = StObject.set(x, "generateSessionToken", js.Any.fromFunction0(value))
    
    inline def setGenerateSessionTokenUndefined: Self = StObject.set(x, "generateSessionToken", js.undefined)
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setStrategy(value: SessionStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setUpdateAge(value: Double): Self = StObject.set(x, "updateAge", value.asInstanceOf[js.Any])
    
    inline def setUpdateAgeUndefined: Self = StObject.set(x, "updateAge", js.undefined)
  }
}
