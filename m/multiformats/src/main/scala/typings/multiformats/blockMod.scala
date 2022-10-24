package typings.multiformats

import typings.multiformats.anon.Bytes
import typings.multiformats.anon.BytesCid
import typings.multiformats.anon.Cid
import typings.multiformats.anon.CodecHasher
import typings.multiformats.anon.Hasher
import typings.multiformats.anon.Value
import typings.multiformats.distTypesSrcBlockInterfaceMod.BlockView
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.multiformatsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object blockMod {
  
  @JSImport("multiformats/block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/block", "Block")
  @js.native
  open class Block[T /* <: Any */, C /* <: Double */, A /* <: Double */, V /* <: Version */] protected ()
    extends typings.multiformats.distTypesSrcBlockMod.Block[T, C, A, V] {
    /**
      * @param {object} options
      * @param {CID<T, C, A, V>} options.cid
      * @param {API.ByteView<T>} options.bytes
      * @param {T} options.value
      */
    def this(param0: Bytes[T, C, A, V]) = this()
  }
  
  inline def create[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: Version */](param0: Cid[T, Code, Alg, V]): js.Promise[BlockView[T, Code, Alg, V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BlockView[T, Code, Alg, V]]]
  
  inline def createUnsafe[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: Version */](param0: BytesCid[T, Code, Alg, V]): BlockView[T, Code, Alg, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnsafe")(param0.asInstanceOf[js.Any]).asInstanceOf[BlockView[T, Code, Alg, V]]
  inline def createUnsafe[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: Version */](param0: Value[T, Code, Alg, V]): BlockView[T, Code, Alg, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnsafe")(param0.asInstanceOf[js.Any]).asInstanceOf[BlockView[T, Code, Alg, V]]
  
  inline def decode[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](param0: Hasher[T, Code, Alg]): js.Promise[BlockView[T, Code, Alg, `1`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BlockView[T, Code, Alg, `1`]]]
  
  inline def encode[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](param0: CodecHasher[T, Code, Alg]): js.Promise[BlockView[T, Code, Alg, `1`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BlockView[T, Code, Alg, `1`]]]
}
