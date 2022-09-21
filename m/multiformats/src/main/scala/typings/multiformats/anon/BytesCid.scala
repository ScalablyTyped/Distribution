package typings.multiformats.anon

import typings.multiformats.blockMod.BlockDecoder
import typings.multiformats.blockMod.ByteView
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BytesCid[T, Code /* <: Double */] extends StObject {
  
  var bytes: ByteView[T]
  
  var cid: CID
  
  var codec: BlockDecoder[Code, T]
  
  var value: js.UndefOr[Unit] = js.undefined
}
object BytesCid {
  
  inline def apply[T, Code /* <: Double */](bytes: ByteView[T], cid: CID, codec: BlockDecoder[Code, T]): BytesCid[T, Code] = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesCid[T, Code]]
  }
  
  extension [Self <: BytesCid[?, ?], T, Code /* <: Double */](x: Self & (BytesCid[T, Code])) {
    
    inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setCid(value: CID): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCodec(value: BlockDecoder[Code, T]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
