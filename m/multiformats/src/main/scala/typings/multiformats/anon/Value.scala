package typings.multiformats.anon

import typings.multiformats.blockInterfaceMod.ByteView
import typings.multiformats.codecsInterfaceMod.BlockDecoder
import typings.multiformats.linkInterfaceMod.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: typings.multiformats.linkInterfaceMod.Version */] extends StObject {
  
  var bytes: ByteView[T]
  
  var cid: Link[T, Code, Alg, V]
  
  var codec: js.UndefOr[BlockDecoder[Code, T]] = js.undefined
  
  var value: T
}
object Value {
  
  inline def apply[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: typings.multiformats.linkInterfaceMod.Version */](bytes: ByteView[T], cid: Link[T, Code, Alg, V], value: T): Value[T, Code, Alg, V] = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[T, Code, Alg, V]]
  }
  
  extension [Self <: Value[?, ?, ?, ?], T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: typings.multiformats.linkInterfaceMod.Version */](x: Self & (Value[T, Code, Alg, V])) {
    
    inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setCid(value: Link[T, Code, Alg, V]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCodec(value: BlockDecoder[Code, T]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
