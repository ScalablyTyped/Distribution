package typings.nobleHashes

import typings.nobleHashes.anon.BlockLen
import typings.nobleHashes.anon.Call
import typings.nobleHashes.anon.Create
import typings.nobleHashes.anon.FnCall
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@noble/hashes/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@noble/hashes/utils", "Hash")
  @js.native
  open class Hash[T /* <: Hash[T] */] () extends StObject {
    
    /**
      * Clones hash instance. Unsafe: doesn't check whether `to` is valid. Can be used as `clone()`
      * when no options are passed.
      * Reasons to use `_cloneInto` instead of clone: 1) performance 2) reuse instance => all internal
      * buffers are overwritten => causes buffer overwrite which is used for digest in some cases.
      * There are no guarantees for clean-up because it's impossible in JS.
      */
    def _cloneInto(): T = js.native
    def _cloneInto(to: T): T = js.native
    
    var blockLen: Double = js.native
    
    /**
      * Resets internal state. Makes Hash instance unusable.
      * Reset is impossible for keyed hashes if key is consumed into state. If digest is not consumed
      * by user, they will need to manually call `destroy()` when zeroing is necessary.
      */
    def destroy(): Unit = js.native
    
    def digest(): js.typedarray.Uint8Array = js.native
    
    def digestInto(buf: js.typedarray.Uint8Array): Unit = js.native
    
    var outputLen: Double = js.native
    
    def update(buf: Input): this.type = js.native
  }
  
  inline def asyncLoop(iters: Double, tick: Double, cb: js.Function1[/* i */ Double, Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncLoop")(iters.asInstanceOf[js.Any], tick.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def bytesToHex(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def checkOpts[T1 /* <: EmptyObj */, T2 /* <: EmptyObj */](defaults: T1): T1 & T2 = ^.asInstanceOf[js.Dynamic].applyDynamic("checkOpts")(defaults.asInstanceOf[js.Any]).asInstanceOf[T1 & T2]
  inline def checkOpts[T1 /* <: EmptyObj */, T2 /* <: EmptyObj */](defaults: T1, opts: T2): T1 & T2 = (^.asInstanceOf[js.Dynamic].applyDynamic("checkOpts")(defaults.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
  
  inline def concatBytes(arrays: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concatBytes")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def createView(arr: TypedArray): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("createView")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  
  inline def hexToBytes(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("@noble/hashes/utils", "isLE")
  @js.native
  val isLE: Boolean = js.native
  
  inline def nextTick(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")().asInstanceOf[js.Promise[Unit]]
  
  inline def randomBytes(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")().asInstanceOf[js.typedarray.Uint8Array]
  inline def randomBytes(bytesLength: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(bytesLength.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def rotr(word: Double, shift: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotr")(word.asInstanceOf[js.Any], shift.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toBytes(data: Input): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toBytes")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def u32(arr: TypedArray): js.typedarray.Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("u32")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint32Array]
  
  inline def u8(arr: TypedArray): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("u8")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def utf8ToBytes(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8ToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def wrapConstructor[T /* <: Hash[T] */](hashCons: js.Function0[Hash[T]]): Call[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapConstructor")(hashCons.asInstanceOf[js.Any]).asInstanceOf[Call[T]]
  
  inline def wrapConstructorWithOpts[H /* <: Hash[H] */, T /* <: js.Object */](hashCons: js.Function1[/* opts */ js.UndefOr[T], Hash[H]]): BlockLen[T, H] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapConstructorWithOpts")(hashCons.asInstanceOf[js.Any]).asInstanceOf[BlockLen[T, H]]
  
  inline def wrapXOFConstructorWithOpts[H /* <: HashXOF[H] */, T /* <: js.Object */](hashCons: js.Function1[/* opts */ js.UndefOr[T], HashXOF[H]]): Create[T, H] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapXOFConstructorWithOpts")(hashCons.asInstanceOf[js.Any]).asInstanceOf[Create[T, H]]
  
  type CHash = ReturnType[FnCall]
  
  type EmptyObj = js.Object
  
  @js.native
  trait HashXOF[T /* <: Hash[T] */] extends Hash[T] {
    
    def xof(bytes: Double): js.typedarray.Uint8Array = js.native
    
    def xofInto(buf: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  }
  
  type Input = js.typedarray.Uint8Array | String
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Int16Array | js.typedarray.Uint32Array | js.typedarray.Int32Array
}
