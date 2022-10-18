package typings.next.anon

import typings.next.nextStrings.`redirect-internal`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewAs extends StObject {
  
  var newAs: String
  
  var newUrl: String
  
  var `type`: `redirect-internal`
}
object NewAs {
  
  inline def apply(newAs: String, newUrl: String): NewAs = {
    val __obj = js.Dynamic.literal(newAs = newAs.asInstanceOf[js.Any], newUrl = newUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("redirect-internal")
    __obj.asInstanceOf[NewAs]
  }
  
  extension [Self <: NewAs](x: Self) {
    
    inline def setNewAs(value: String): Self = StObject.set(x, "newAs", value.asInstanceOf[js.Any])
    
    inline def setNewUrl(value: String): Self = StObject.set(x, "newUrl", value.asInstanceOf[js.Any])
    
    inline def setType(value: `redirect-internal`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
