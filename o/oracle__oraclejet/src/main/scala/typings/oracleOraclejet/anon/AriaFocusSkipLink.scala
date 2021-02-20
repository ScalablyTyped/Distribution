package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AriaFocusSkipLink extends StObject {
  
  var ariaFocusSkipLink: js.UndefOr[String] = js.native
  
  var labelCancel: js.UndefOr[String] = js.native
}
object AriaFocusSkipLink {
  
  @scala.inline
  def apply(): AriaFocusSkipLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaFocusSkipLink]
  }
  
  @scala.inline
  implicit class AriaFocusSkipLinkMutableBuilder[Self <: AriaFocusSkipLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaFocusSkipLink(value: String): Self = StObject.set(x, "ariaFocusSkipLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaFocusSkipLinkUndefined: Self = StObject.set(x, "ariaFocusSkipLink", js.undefined)
    
    @scala.inline
    def setLabelCancel(value: String): Self = StObject.set(x, "labelCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelCancelUndefined: Self = StObject.set(x, "labelCancel", js.undefined)
  }
}
