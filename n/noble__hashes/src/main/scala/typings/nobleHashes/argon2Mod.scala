package typings.nobleHashes

import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argon2Mod {
  
  @JSImport("@noble/hashes/argon2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def argon2d(password: Input, salt: Input, opts: ArgonOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("argon2d")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def argon2i(password: Input, salt: Input, opts: ArgonOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("argon2i")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def argon2id(password: Input, salt: Input, opts: ArgonOpts): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("argon2id")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  trait ArgonOpts extends StObject {
    
    var asyncTick: js.UndefOr[Double] = js.undefined
    
    var dkLen: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[Input] = js.undefined
    
    var m: Double
    
    var maxmem: js.UndefOr[Double] = js.undefined
    
    var onProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
    
    var p: Double
    
    var personalization: js.UndefOr[Input] = js.undefined
    
    var t: Double
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object ArgonOpts {
    
    inline def apply(m: Double, p: Double, t: Double): ArgonOpts = {
      val __obj = js.Dynamic.literal(m = m.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgonOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArgonOpts] (val x: Self) extends AnyVal {
      
      inline def setAsyncTick(value: Double): Self = StObject.set(x, "asyncTick", value.asInstanceOf[js.Any])
      
      inline def setAsyncTickUndefined: Self = StObject.set(x, "asyncTick", js.undefined)
      
      inline def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
      
      inline def setDkLenUndefined: Self = StObject.set(x, "dkLen", js.undefined)
      
      inline def setKey(value: Input): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMaxmem(value: Double): Self = StObject.set(x, "maxmem", value.asInstanceOf[js.Any])
      
      inline def setMaxmemUndefined: Self = StObject.set(x, "maxmem", js.undefined)
      
      inline def setOnProgress(value: /* progress */ Double => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPersonalization(value: Input): Self = StObject.set(x, "personalization", value.asInstanceOf[js.Any])
      
      inline def setPersonalizationUndefined: Self = StObject.set(x, "personalization", js.undefined)
      
      inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
