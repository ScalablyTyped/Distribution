package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaFocusSkipLink extends StObject {
  
  var ariaFocusSkipLink: js.UndefOr[String] = js.undefined
  
  var labelCancel: js.UndefOr[String] = js.undefined
}
object AriaFocusSkipLink {
  
  inline def apply(): AriaFocusSkipLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaFocusSkipLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaFocusSkipLink] (val x: Self) extends AnyVal {
    
    inline def setAriaFocusSkipLink(value: String): Self = StObject.set(x, "ariaFocusSkipLink", value.asInstanceOf[js.Any])
    
    inline def setAriaFocusSkipLinkUndefined: Self = StObject.set(x, "ariaFocusSkipLink", js.undefined)
    
    inline def setLabelCancel(value: String): Self = StObject.set(x, "labelCancel", value.asInstanceOf[js.Any])
    
    inline def setLabelCancelUndefined: Self = StObject.set(x, "labelCancel", js.undefined)
  }
}
