package typings.multiformats.anon

import typings.multiformats.blockMod.BlockDecoder
import typings.multiformats.blockMod.ByteView
import typings.multiformats.hashesInterfaceMod.MultihashHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bytes[T, Code /* <: Double */] extends StObject {
  
  var bytes: ByteView[T]
  
  var codec: BlockDecoder[Code, T]
  
  var hasher: MultihashHasher[Double]
}
object Bytes {
  
  inline def apply[T, Code /* <: Double */](bytes: ByteView[T], codec: BlockDecoder[Code, T], hasher: MultihashHasher[Double]): Bytes[T, Code] = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], hasher = hasher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bytes[T, Code]]
  }
  
  extension [Self <: Bytes[?, ?], T, Code /* <: Double */](x: Self & (Bytes[T, Code])) {
    
    inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setCodec(value: BlockDecoder[Code, T]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setHasher(value: MultihashHasher[Double]): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
  }
}
