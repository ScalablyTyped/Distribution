package typings.multiformats.anon

import typings.multiformats.blockMod.BlockDecoder
import typings.multiformats.blockMod.ByteView
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[T, Code /* <: Double */] extends StObject {
  
  var bytes: ByteView[T]
  
  var cid: CID
  
  var codec: js.UndefOr[BlockDecoder[Code, T]] = js.undefined
  
  var value: T
}
object Value {
  
  inline def apply[T, Code /* <: Double */](bytes: ByteView[T], cid: CID, value: T): Value[T, Code] = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[T, Code]]
  }
  
  extension [Self <: Value[?, ?], T, Code /* <: Double */](x: Self & (Value[T, Code])) {
    
    inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setCid(value: CID): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCodec(value: BlockDecoder[Code, T]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
