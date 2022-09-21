package typings.nobleHashes

import typings.nobleHashes.utilsMod.CHash
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbkdf2Mod {
  
  @JSImport("@noble/hashes/pbkdf2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pbkdf2(hash: CHash, password: Input, salt: Input, opts: Pbkdf2Opt): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(hash.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def pbkdf2Async(hash: CHash, password: Input, salt: Input, opts: Pbkdf2Opt): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Async")(hash.asInstanceOf[js.Any], password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  trait Pbkdf2Opt extends StObject {
    
    var asyncTick: js.UndefOr[Double] = js.undefined
    
    var c: Double
    
    var dkLen: js.UndefOr[Double] = js.undefined
  }
  object Pbkdf2Opt {
    
    inline def apply(c: Double): Pbkdf2Opt = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pbkdf2Opt]
    }
    
    extension [Self <: Pbkdf2Opt](x: Self) {
      
      inline def setAsyncTick(value: Double): Self = StObject.set(x, "asyncTick", value.asInstanceOf[js.Any])
      
      inline def setAsyncTickUndefined: Self = StObject.set(x, "asyncTick", js.undefined)
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
      
      inline def setDkLenUndefined: Self = StObject.set(x, "dkLen", js.undefined)
    }
  }
}
