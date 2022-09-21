package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMembers extends StObject {
  
  var content: ApplicationjsonMembers
}
object ContentApplicationjsonMembers {
  
  inline def apply(content: ApplicationjsonMembers): ContentApplicationjsonMembers = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMembers]
  }
  
  extension [Self <: ContentApplicationjsonMembers](x: Self) {
    
    inline def setContent(value: ApplicationjsonMembers): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
