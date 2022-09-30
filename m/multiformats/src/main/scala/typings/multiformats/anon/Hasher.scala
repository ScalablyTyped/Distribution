package typings.multiformats.anon

import typings.multiformats.blockMod.BlockEncoder
import typings.multiformats.hashesInterfaceMod.MultihashHasher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hasher[T, Code /* <: Double */] extends StObject {
  
  var codec: BlockEncoder[Code, T]
  
  var hasher: MultihashHasher[Double]
  
  var value: T
}
object Hasher {
  
  inline def apply[T, Code /* <: Double */](codec: BlockEncoder[Code, T], hasher: MultihashHasher[Double], value: T): Hasher[T, Code] = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], hasher = hasher.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hasher[T, Code]]
  }
  
  extension [Self <: Hasher[?, ?], T, Code /* <: Double */](x: Self & (Hasher[T, Code])) {
    
    inline def setCodec(value: BlockEncoder[Code, T]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setHasher(value: MultihashHasher[Double]): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
