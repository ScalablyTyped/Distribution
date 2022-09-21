package typings.multiformats.anon

import typings.multiformats.blockMod.ByteView
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidValue[T] extends StObject {
  
  var bytes: ByteView[T]
  
  var cid: CID
  
  var value: T
}
object CidValue {
  
  inline def apply[T](bytes: ByteView[T], cid: CID, value: T): CidValue[T] = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidValue[T]]
  }
  
  extension [Self <: CidValue[?], T](x: Self & CidValue[T]) {
    
    inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setCid(value: CID): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
