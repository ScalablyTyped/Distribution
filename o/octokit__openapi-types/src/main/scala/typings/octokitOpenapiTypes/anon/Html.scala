package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Html extends StObject {
  
  var html: js.UndefOr[`515`] = js.undefined
  
  var self: js.UndefOr[`515`] = js.undefined
}
object Html {
  
  inline def apply(): Html = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Html]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
    
    inline def setHtml(value: `515`): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setSelf(value: `515`): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
  }
}
