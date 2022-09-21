package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriClickSecurityState extends StObject {
  
  var clickAction: js.UndefOr[NullableOption[String]] = js.undefined
  
  var clickDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  var sourceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var uriDomain: js.UndefOr[NullableOption[String]] = js.undefined
  
  var verdict: js.UndefOr[NullableOption[String]] = js.undefined
}
object UriClickSecurityState {
  
  inline def apply(): UriClickSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UriClickSecurityState]
  }
  
  extension [Self <: UriClickSecurityState](x: Self) {
    
    inline def setClickAction(value: NullableOption[String]): Self = StObject.set(x, "clickAction", value.asInstanceOf[js.Any])
    
    inline def setClickActionNull: Self = StObject.set(x, "clickAction", null)
    
    inline def setClickActionUndefined: Self = StObject.set(x, "clickAction", js.undefined)
    
    inline def setClickDateTime(value: NullableOption[String]): Self = StObject.set(x, "clickDateTime", value.asInstanceOf[js.Any])
    
    inline def setClickDateTimeNull: Self = StObject.set(x, "clickDateTime", null)
    
    inline def setClickDateTimeUndefined: Self = StObject.set(x, "clickDateTime", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSourceId(value: NullableOption[String]): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdNull: Self = StObject.set(x, "sourceId", null)
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setUriDomain(value: NullableOption[String]): Self = StObject.set(x, "uriDomain", value.asInstanceOf[js.Any])
    
    inline def setUriDomainNull: Self = StObject.set(x, "uriDomain", null)
    
    inline def setUriDomainUndefined: Self = StObject.set(x, "uriDomain", js.undefined)
    
    inline def setVerdict(value: NullableOption[String]): Self = StObject.set(x, "verdict", value.asInstanceOf[js.Any])
    
    inline def setVerdictNull: Self = StObject.set(x, "verdict", null)
    
    inline def setVerdictUndefined: Self = StObject.set(x, "verdict", js.undefined)
  }
}
