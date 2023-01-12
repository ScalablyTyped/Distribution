package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncapsulatedContentInfoJson extends StObject {
  
  var eContent: js.UndefOr[OctetStringJson] = js.undefined
  
  var eContentType: String
}
object EncapsulatedContentInfoJson {
  
  inline def apply(eContentType: String): EncapsulatedContentInfoJson = {
    val __obj = js.Dynamic.literal(eContentType = eContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncapsulatedContentInfoJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncapsulatedContentInfoJson] (val x: Self) extends AnyVal {
    
    inline def setEContent(value: OctetStringJson): Self = StObject.set(x, "eContent", value.asInstanceOf[js.Any])
    
    inline def setEContentType(value: String): Self = StObject.set(x, "eContentType", value.asInstanceOf[js.Any])
    
    inline def setEContentUndefined: Self = StObject.set(x, "eContent", js.undefined)
  }
}
