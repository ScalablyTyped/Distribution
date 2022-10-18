package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBillableownerDefaults extends StObject {
  
  var content: ApplicationjsonBillableownerDefaults
}
object ContentApplicationjsonBillableownerDefaults {
  
  inline def apply(content: ApplicationjsonBillableownerDefaults): ContentApplicationjsonBillableownerDefaults = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBillableownerDefaults]
  }
  
  extension [Self <: ContentApplicationjsonBillableownerDefaults](x: Self) {
    
    inline def setContent(value: ApplicationjsonBillableownerDefaults): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
