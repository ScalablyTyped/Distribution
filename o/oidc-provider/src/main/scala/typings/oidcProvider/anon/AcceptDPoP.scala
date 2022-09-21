package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptDPoP extends StObject {
  
  var acceptDPoP: js.UndefOr[Boolean] = js.undefined
  
  var acceptQueryParam: js.UndefOr[Boolean] = js.undefined
}
object AcceptDPoP {
  
  inline def apply(): AcceptDPoP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptDPoP]
  }
  
  extension [Self <: AcceptDPoP](x: Self) {
    
    inline def setAcceptDPoP(value: Boolean): Self = StObject.set(x, "acceptDPoP", value.asInstanceOf[js.Any])
    
    inline def setAcceptDPoPUndefined: Self = StObject.set(x, "acceptDPoP", js.undefined)
    
    inline def setAcceptQueryParam(value: Boolean): Self = StObject.set(x, "acceptQueryParam", value.asInstanceOf[js.Any])
    
    inline def setAcceptQueryParamUndefined: Self = StObject.set(x, "acceptQueryParam", js.undefined)
  }
}
