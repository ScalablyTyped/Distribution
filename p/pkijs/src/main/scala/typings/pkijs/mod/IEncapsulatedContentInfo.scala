package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEncapsulatedContentInfo extends StObject {
  
  var eContent: js.UndefOr[OctetString] = js.undefined
  
  var eContentType: String
}
object IEncapsulatedContentInfo {
  
  inline def apply(eContentType: String): IEncapsulatedContentInfo = {
    val __obj = js.Dynamic.literal(eContentType = eContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncapsulatedContentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEncapsulatedContentInfo] (val x: Self) extends AnyVal {
    
    inline def setEContent(value: OctetString): Self = StObject.set(x, "eContent", value.asInstanceOf[js.Any])
    
    inline def setEContentType(value: String): Self = StObject.set(x, "eContentType", value.asInstanceOf[js.Any])
    
    inline def setEContentUndefined: Self = StObject.set(x, "eContent", js.undefined)
  }
}
