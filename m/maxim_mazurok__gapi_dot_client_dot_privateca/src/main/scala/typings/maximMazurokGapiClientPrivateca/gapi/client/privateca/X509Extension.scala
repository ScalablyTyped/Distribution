package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509Extension extends StObject {
  
  /** Optional. Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error). */
  var critical: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The OID for this X.509 extension. */
  var objectId: js.UndefOr[ObjectId] = js.undefined
  
  /** Required. The value of this X.509 extension. */
  var value: js.UndefOr[String] = js.undefined
}
object X509Extension {
  
  inline def apply(): X509Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X509Extension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X509Extension] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setObjectId(value: ObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
