package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Twitter extends StObject {
  
  var cardType: js.UndefOr[String] = js.undefined
  
  var handle: js.UndefOr[String] = js.undefined
  
  var site: js.UndefOr[String] = js.undefined
}
object Twitter {
  
  inline def apply(): Twitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Twitter]
  }
  
  extension [Self <: Twitter](x: Self) {
    
    inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setCardTypeUndefined: Self = StObject.set(x, "cardType", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
  }
}
