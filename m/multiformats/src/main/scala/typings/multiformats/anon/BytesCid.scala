package typings.multiformats.anon

import typings.multiformats.blockInterfaceMod.ByteView
import typings.multiformats.codecsInterfaceMod.BlockDecoder
import typings.multiformats.linkInterfaceMod.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesCid[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: typings.multiformats.linkInterfaceMod.Version */] extends StObject {
  
  var bytes: ByteView[T]
  
  var cid: Link[T, Code, Alg, V]
  
  var codec: BlockDecoder[Code, T]
  
  var value: js.UndefOr[Unit] = js.undefined
}
object BytesCid {
  
  inline def apply[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: typings.multiformats.linkInterfaceMod.Version */](bytes: ByteView[T], cid: Link[T, Code, Alg, V], codec: BlockDecoder[Code, T]): BytesCid[T, Code, Alg, V] = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesCid[T, Code, Alg, V]]
  }
  
  extension [Self <: BytesCid[?, ?, ?, ?], T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: typings.multiformats.linkInterfaceMod.Version */](x: Self & (BytesCid[T, Code, Alg, V])) {
    
    inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setCid(value: Link[T, Code, Alg, V]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCodec(value: BlockDecoder[Code, T]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
