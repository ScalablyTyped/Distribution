package typings.multiformats.anon

import typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockDecoder
import typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hasher[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */] extends StObject {
  
  var bytes: ByteView[T]
  
  var codec: BlockDecoder[Code, T]
  
  var hasher: MultihashHasher[Alg]
}
object Hasher {
  
  inline def apply[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](bytes: ByteView[T], codec: BlockDecoder[Code, T], hasher: MultihashHasher[Alg]): Hasher[T, Code, Alg] = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], hasher = hasher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hasher[T, Code, Alg]]
  }
  
  extension [Self <: Hasher[?, ?, ?], T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](x: Self & (Hasher[T, Code, Alg])) {
    
    inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setCodec(value: BlockDecoder[Code, T]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setHasher(value: MultihashHasher[Alg]): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
  }
}
