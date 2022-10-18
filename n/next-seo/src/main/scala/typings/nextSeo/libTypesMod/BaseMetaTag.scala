package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMetaTag extends StObject {
  
  var content: String
  
  var keyOverride: js.UndefOr[String] = js.undefined
}
object BaseMetaTag {
  
  inline def apply(content: String): BaseMetaTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMetaTag]
  }
  
  extension [Self <: BaseMetaTag](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setKeyOverride(value: String): Self = StObject.set(x, "keyOverride", value.asInstanceOf[js.Any])
    
    inline def setKeyOverrideUndefined: Self = StObject.set(x, "keyOverride", js.undefined)
  }
}
