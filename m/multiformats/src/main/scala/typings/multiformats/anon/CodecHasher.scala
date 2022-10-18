package typings.multiformats.anon

import typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockEncoder
import typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodecHasher[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */] extends StObject {
  
  var codec: BlockEncoder[Code, T]
  
  var hasher: MultihashHasher[Alg]
  
  var value: T
}
object CodecHasher {
  
  inline def apply[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](codec: BlockEncoder[Code, T], hasher: MultihashHasher[Alg], value: T): CodecHasher[T, Code, Alg] = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], hasher = hasher.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodecHasher[T, Code, Alg]]
  }
  
  extension [Self <: CodecHasher[?, ?, ?], T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](x: Self & (CodecHasher[T, Code, Alg])) {
    
    inline def setCodec(value: BlockEncoder[Code, T]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setHasher(value: MultihashHasher[Alg]): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
