package typings.nobleHashes

import typings.nobleHashes.eskdfMod.AccountID
import typings.nobleHashes.eskdfMod.KeyOpts
import typings.nobleHashes.utilsMod.Hash
import typings.nobleHashes.utilsMod.HashXOF
import typings.nobleHashes.utilsMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BlockLen[T /* <: js.Object */, H /* <: Hash[H] */] extends StObject {
    
    def apply(msg: Input): js.typedarray.Uint8Array = js.native
    def apply(msg: Input, opts: T): js.typedarray.Uint8Array = js.native
    
    var blockLen: Double = js.native
    
    def create(opts: T): Hash[H] = js.native
    
    var outputLen: Double = js.native
  }
  
  @js.native
  trait Call[T /* <: Hash[T] */] extends StObject {
    
    def apply(msg: Input): js.typedarray.Uint8Array = js.native
    
    var blockLen: Double = js.native
    
    def create(): Hash[T] = js.native
    
    var outputLen: Double = js.native
  }
  
  @js.native
  trait Create[T /* <: js.Object */, H /* <: HashXOF[H] */] extends StObject {
    
    def apply(msg: Input): js.typedarray.Uint8Array = js.native
    def apply(msg: Input, opts: T): js.typedarray.Uint8Array = js.native
    
    var blockLen: Double = js.native
    
    def create(opts: T): HashXOF[H] = js.native
    
    var outputLen: Double = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T /* <: Hash[T] */](hashCons: js.Function0[Hash[T]]): Call[T] = js.native
  }
  
  trait H extends StObject {
    
    var h: Double
    
    var l: Double
  }
  object H {
    
    inline def apply(h: Double, l: Double): H = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: H] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{deriveChildKey (protocol : string, accountId : @noble/hashes.@noble/hashes/eskdf.AccountID, options : @noble/hashes.@noble/hashes/eskdf.KeyOpts | undefined): std.Uint8Array, expire (): void,   fingerprint :string}> */
  @js.native
  trait ReadonlyderiveChildKeypro extends StObject {
    
    def deriveChildKey(protocol: String, accountId: AccountID): js.typedarray.Uint8Array = js.native
    def deriveChildKey(protocol: String, accountId: AccountID, options: KeyOpts): js.typedarray.Uint8Array = js.native
    
    def expire(): Unit = js.native
    
    val fingerprint: String = js.native
  }
  
  trait V0 extends StObject {
    
    var v0: Double
    
    var v1: Double
    
    var v10: Double
    
    var v11: Double
    
    var v12: Double
    
    var v13: Double
    
    var v14: Double
    
    var v15: Double
    
    var v2: Double
    
    var v3: Double
    
    var v4: Double
    
    var v5: Double
    
    var v6: Double
    
    var v7: Double
    
    var v8: Double
    
    var v9: Double
  }
  object V0 {
    
    inline def apply(
      v0: Double,
      v1: Double,
      v10: Double,
      v11: Double,
      v12: Double,
      v13: Double,
      v14: Double,
      v15: Double,
      v2: Double,
      v3: Double,
      v4: Double,
      v5: Double,
      v6: Double,
      v7: Double,
      v8: Double,
      v9: Double
    ): V0 = {
      val __obj = js.Dynamic.literal(v0 = v0.asInstanceOf[js.Any], v1 = v1.asInstanceOf[js.Any], v10 = v10.asInstanceOf[js.Any], v11 = v11.asInstanceOf[js.Any], v12 = v12.asInstanceOf[js.Any], v13 = v13.asInstanceOf[js.Any], v14 = v14.asInstanceOf[js.Any], v15 = v15.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any], v3 = v3.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any], v6 = v6.asInstanceOf[js.Any], v7 = v7.asInstanceOf[js.Any], v8 = v8.asInstanceOf[js.Any], v9 = v9.asInstanceOf[js.Any])
      __obj.asInstanceOf[V0]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: V0] (val x: Self) extends AnyVal {
      
      inline def setV0(value: Double): Self = StObject.set(x, "v0", value.asInstanceOf[js.Any])
      
      inline def setV1(value: Double): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
      
      inline def setV10(value: Double): Self = StObject.set(x, "v10", value.asInstanceOf[js.Any])
      
      inline def setV11(value: Double): Self = StObject.set(x, "v11", value.asInstanceOf[js.Any])
      
      inline def setV12(value: Double): Self = StObject.set(x, "v12", value.asInstanceOf[js.Any])
      
      inline def setV13(value: Double): Self = StObject.set(x, "v13", value.asInstanceOf[js.Any])
      
      inline def setV14(value: Double): Self = StObject.set(x, "v14", value.asInstanceOf[js.Any])
      
      inline def setV15(value: Double): Self = StObject.set(x, "v15", value.asInstanceOf[js.Any])
      
      inline def setV2(value: Double): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
      
      inline def setV3(value: Double): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
      
      inline def setV4(value: Double): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
      
      inline def setV5(value: Double): Self = StObject.set(x, "v5", value.asInstanceOf[js.Any])
      
      inline def setV6(value: Double): Self = StObject.set(x, "v6", value.asInstanceOf[js.Any])
      
      inline def setV7(value: Double): Self = StObject.set(x, "v7", value.asInstanceOf[js.Any])
      
      inline def setV8(value: Double): Self = StObject.set(x, "v8", value.asInstanceOf[js.Any])
      
      inline def setV9(value: Double): Self = StObject.set(x, "v9", value.asInstanceOf[js.Any])
    }
  }
}
