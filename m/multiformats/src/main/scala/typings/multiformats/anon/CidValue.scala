package typings.multiformats.anon

import typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidValue[T /* <: Any */, C /* <: Double */, A /* <: Double */, V /* <: Version */] extends StObject {
  
  var bytes: ByteView[T]
  
  var cid: CID[T, C, A, V]
  
  var value: T
}
object CidValue {
  
  inline def apply[T /* <: Any */, C /* <: Double */, A /* <: Double */, V /* <: Version */](bytes: ByteView[T], cid: CID[T, C, A, V], value: T): CidValue[T, C, A, V] = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CidValue[T, C, A, V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CidValue[?, ?, ?, ?], T /* <: Any */, C /* <: Double */, A /* <: Double */, V /* <: Version */] (val x: Self & (CidValue[T, C, A, V])) extends AnyVal {
    
    inline def setBytes(value: ByteView[T]): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setCid(value: CID[T, C, A, V]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
