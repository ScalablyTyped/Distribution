package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionInfo extends StObject {
  
  // The endpoint that is used by Entitlement Management to communicate with the access package resource.
  var url: js.UndefOr[NullableOption[String]] = js.undefined
}
object ConnectionInfo {
  
  inline def apply(): ConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
