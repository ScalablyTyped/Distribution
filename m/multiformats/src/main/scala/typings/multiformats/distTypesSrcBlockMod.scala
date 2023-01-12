package typings.multiformats

import typings.multiformats.anon.Bytes
import typings.multiformats.anon.BytesCid
import typings.multiformats.anon.Cid
import typings.multiformats.anon.CidValue
import typings.multiformats.anon.Hasher
import typings.multiformats.anon.Value
import typings.multiformats.distTypesSrcBlockInterfaceMod.BlockCursorView
import typings.multiformats.distTypesSrcBlockInterfaceMod.BlockView
import typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import typings.multiformats.distTypesSrcLinkInterfaceMod.Link
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import typings.multiformats.multiformatsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcBlockMod {
  
  @JSImport("multiformats/dist/types/src/block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/dist/types/src/block", "Block")
  @js.native
  open class Block[T /* <: Any */, C /* <: Double */, A /* <: Double */, V /* <: Version */] protected ()
    extends StObject
       with BlockView[T, C, A, V] {
    /**
      * @param {object} options
      * @param {CID<T, C, A, V>} options.cid
      * @param {API.ByteView<T>} options.bytes
      * @param {T} options.value
      */
    def this(param0: CidValue[T, C, A, V]) = this()
    
    var asBlock: Block[T, C, A, V] = js.native
    
    /* CompleteClass */
    var bytes: ByteView[T] = js.native
    
    /* CompleteClass */
    var cid: Link[T, C, A, V] = js.native
    @JSName("cid")
    var cid_Block: CID[T, C, A, V] = js.native
    /* CompleteClass */
    @JSName("cid")
    var cid_BlockView: typings.multiformats.distTypesSrcCidMod.CID[T, C, A, V] = js.native
    
    /**
      *
      * @param {string} [path]
      * @returns {API.BlockCursorView<unknown>}
      */
    def get(): BlockCursorView[Any] = js.native
    /* CompleteClass */
    override def get(path: String): BlockCursorView[Any] = js.native
    
    /* CompleteClass */
    override def links(): js.Iterable[
        js.Tuple2[String, typings.multiformats.distTypesSrcCidMod.CID[Any, Double, Double, Version]]
      ] = js.native
    
    /* CompleteClass */
    override def tree(): js.Iterable[String] = js.native
    
    /* CompleteClass */
    var value: T = js.native
  }
  
  inline def create[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: Version */](param0: Cid[T, Code, Alg, V]): js.Promise[BlockView[T, Code, Alg, V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BlockView[T, Code, Alg, V]]]
  
  inline def createUnsafe[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: Version */](param0: BytesCid[T, Code, Alg, V]): BlockView[T, Code, Alg, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnsafe")(param0.asInstanceOf[js.Any]).asInstanceOf[BlockView[T, Code, Alg, V]]
  inline def createUnsafe[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: Version */](param0: Value[T, Code, Alg, V]): BlockView[T, Code, Alg, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnsafe")(param0.asInstanceOf[js.Any]).asInstanceOf[BlockView[T, Code, Alg, V]]
  
  inline def decode[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](param0: Bytes[T, Code, Alg]): js.Promise[BlockView[T, Code, Alg, `1`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BlockView[T, Code, Alg, `1`]]]
  
  inline def encode[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](param0: Hasher[T, Code, Alg]): js.Promise[BlockView[T, Code, Alg, `1`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BlockView[T, Code, Alg, `1`]]]
  
  trait RequiredCreateOptions extends StObject {
    
    var cid: CID[Any, Double, Double, Version]
  }
  object RequiredCreateOptions {
    
    inline def apply(cid: CID[Any, Double, Double, Version]): RequiredCreateOptions = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setCid(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    }
  }
}
