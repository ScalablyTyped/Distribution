package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X509Extension extends StObject {
  
  /** Required. Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error). */
  var critical: js.UndefOr[Boolean] = js.native
  
  /** Required. The OID for this X.509 extension. */
  var objectId: js.UndefOr[ObjectId] = js.native
  
  /** Required. The value of this X.509 extension. */
  var value: js.UndefOr[String] = js.native
}
object X509Extension {
  
  @scala.inline
  def apply(): X509Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X509Extension]
  }
  
  @scala.inline
  implicit class X509ExtensionMutableBuilder[Self <: X509Extension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    @scala.inline
    def setObjectId(value: ObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
