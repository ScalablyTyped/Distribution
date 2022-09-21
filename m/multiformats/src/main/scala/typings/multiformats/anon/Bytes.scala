package typings.multiformats.anon

import typings.multiformats.blockInterfaceMod.ByteView
import typings.multiformats.codecsInterfaceMod.BlockDecoder
import typings.multiformats.hashesInterfaceMod.MultihashHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bytes[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */] extends StObject {
  
  var bytes: ByteView[T]
  
  var codec: BlockDecoder[Code, T]
  
  var hasher: MultihashHasher[Alg]
}
object Bytes {
  
  inline def apply[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](bytes: ByteView[T], codec: BlockDecoder[Code, T], hasher: MultihashHasher[Alg]): Bytes[T, Code, Alg] = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], hasher = hasher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bytes[T, Code, Alg]]
  }
  
  extension [Self <: Bytes[?, ?, ?], T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](x: Self & (Bytes[T, Code, Alg])) {
    
    inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setCodec(value: BlockDecoder[Code, T]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setHasher(value: MultihashHasher[Alg]): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
  }
}
