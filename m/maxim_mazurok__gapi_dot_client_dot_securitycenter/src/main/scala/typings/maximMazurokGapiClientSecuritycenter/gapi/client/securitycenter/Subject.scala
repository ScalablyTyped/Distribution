package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subject extends StObject {
  
  /** Authentication type for subject. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name for subject. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Namespace for subject. */
  var ns: js.UndefOr[String] = js.undefined
}
object Subject {
  
  inline def apply(): Subject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subject] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
  }
}
