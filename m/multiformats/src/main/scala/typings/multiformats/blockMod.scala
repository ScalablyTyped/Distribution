package typings.multiformats

import typings.multiformats.anon.Bytes
import typings.multiformats.anon.BytesCid
import typings.multiformats.anon.Cid
import typings.multiformats.anon.CidValue
import typings.multiformats.anon.Remaining
import typings.multiformats.anon.RemainingValue
import typings.multiformats.anon.Value
import typings.multiformats.hashesInterfaceMod.MultihashHasher
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockMod {
  
  @JSImport("multiformats/types/src/block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/types/src/block", "Block")
  @js.native
  open class Block[T] protected () extends StObject {
    /**
      * @param {Object} options
      * @param {CID} options.cid
      * @param {ByteView<T>} options.bytes
      * @param {T} options.value
      */
    def this(hasCidBytesValue: CidValue[T]) = this()
    
    var asBlock: Block[T] = js.native
    
    var bytes: ByteView[T] = js.native
    
    var cid: CID = js.native
    
    /**
      * @param {string} [path]
      */
    def get(): Remaining | RemainingValue = js.native
    def get(path: String): Remaining | RemainingValue = js.native
    
    def links(): js.Iterable[js.Tuple2[String, CID]] = js.native
    
    def tree(): js.Iterable[String] = js.native
    
    var value: T = js.native
  }
  
  inline def create[T, Code /* <: Double */, Algorithm_1 /* <: Double */](hasBytesCidHasherCodec: Cid[T, Code]): js.Promise[Block[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(hasBytesCidHasherCodec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Block[T]]]
  
  inline def createUnsafe[T, Code /* <: Double */](hasBytesCidValueCodec: BytesCid[T, Code]): Block[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnsafe")(hasBytesCidValueCodec.asInstanceOf[js.Any]).asInstanceOf[Block[T]]
  inline def createUnsafe[T, Code /* <: Double */](hasBytesCidValueCodec: Value[T, Code]): Block[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnsafe")(hasBytesCidValueCodec.asInstanceOf[js.Any]).asInstanceOf[Block[T]]
  
  inline def decode[T, Code /* <: Double */, Algorithm_1 /* <: Double */](hasBytesCodecHasher: Bytes[T, Code]): js.Promise[Block[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(hasBytesCodecHasher.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Block[T]]]
  
  inline def encode[T, Code /* <: Double */, Algorithm_1 /* <: Double */](hasValueCodecHasher: typings.multiformats.anon.Hasher[T, Code]): js.Promise[Block[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(hasValueCodecHasher.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Block[T]]]
  
  type BlockDecoder[Code /* <: Double */, T] = typings.multiformats.codecsInterfaceMod.BlockDecoder[Code, T]
  
  type BlockEncoder[Code /* <: Double */, T] = typings.multiformats.codecsInterfaceMod.BlockEncoder[Code, T]
  
  type ByteView[T] = typings.multiformats.codecsInterfaceMod.ByteView[T]
  
  type Hasher[Algorithm_1] = MultihashHasher[Double]
  
  trait RequiredCreateOptions extends StObject {
    
    var cid: CID
  }
  object RequiredCreateOptions {
    
    inline def apply(cid: CID): RequiredCreateOptions = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredCreateOptions]
    }
    
    extension [Self <: RequiredCreateOptions](x: Self) {
      
      inline def setCid(value: CID): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    }
  }
}
