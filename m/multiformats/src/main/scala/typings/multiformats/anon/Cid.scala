package typings.multiformats.anon

import typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockDecoder
import typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashHasher
import typings.multiformats.distTypesSrcLinkInterfaceMod.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cid[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: typings.multiformats.distTypesSrcLinkInterfaceMod.Version */] extends StObject {
  
  var bytes: ByteView[T]
  
  var cid: Link[T, Code, Alg, V]
  
  var codec: BlockDecoder[Code, T]
  
  var hasher: MultihashHasher[Alg]
}
object Cid {
  
  inline def apply[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: typings.multiformats.distTypesSrcLinkInterfaceMod.Version */](
    bytes: ByteView[T],
    cid: Link[T, Code, Alg, V],
    codec: BlockDecoder[Code, T],
    hasher: MultihashHasher[Alg]
  ): Cid[T, Code, Alg, V] = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], hasher = hasher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cid[T, Code, Alg, V]]
  }
  
  extension [Self <: Cid[?, ?, ?, ?], T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: typings.multiformats.distTypesSrcLinkInterfaceMod.Version */](x: Self & (Cid[T, Code, Alg, V])) {
    
    inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setCid(value: Link[T, Code, Alg, V]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCodec(value: BlockDecoder[Code, T]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setHasher(value: MultihashHasher[Alg]): Self = StObject.set(x, "hasher", value.asInstanceOf[js.Any])
  }
}
