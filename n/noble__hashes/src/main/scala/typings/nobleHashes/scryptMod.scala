package typings.nobleHashes

import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scryptMod {
  
  @JSImport("@noble/hashes/scrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scrypt(password: Input, salt: Input, opts: ScryptOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def scryptAsync(password: Input, salt: Input, opts: ScryptOpts): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("scryptAsync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  trait ScryptOpts extends StObject {
    
    var N: Double
    
    var asyncTick: js.UndefOr[Double] = js.undefined
    
    var dkLen: js.UndefOr[Double] = js.undefined
    
    var maxmem: js.UndefOr[Double] = js.undefined
    
    var onProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
    
    var p: Double
    
    var r: Double
  }
  object ScryptOpts {
    
    inline def apply(N: Double, p: Double, r: Double): ScryptOpts = {
      val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScryptOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScryptOpts] (val x: Self) extends AnyVal {
      
      inline def setAsyncTick(value: Double): Self = StObject.set(x, "asyncTick", value.asInstanceOf[js.Any])
      
      inline def setAsyncTickUndefined: Self = StObject.set(x, "asyncTick", js.undefined)
      
      inline def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
      
      inline def setDkLenUndefined: Self = StObject.set(x, "dkLen", js.undefined)
      
      inline def setMaxmem(value: Double): Self = StObject.set(x, "maxmem", value.asInstanceOf[js.Any])
      
      inline def setMaxmemUndefined: Self = StObject.set(x, "maxmem", js.undefined)
      
      inline def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setOnProgress(value: /* progress */ Double => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
