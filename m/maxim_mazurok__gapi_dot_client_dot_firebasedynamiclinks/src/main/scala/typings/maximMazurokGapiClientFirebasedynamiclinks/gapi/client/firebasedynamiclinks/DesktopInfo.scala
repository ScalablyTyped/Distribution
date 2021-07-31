package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesktopInfo extends StObject {
  
  /** Link to open on desktop. */
  var desktopFallbackLink: js.UndefOr[String] = js.undefined
}
object DesktopInfo {
  
  @scala.inline
  def apply(): DesktopInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DesktopInfo]
  }
  
  @scala.inline
  implicit class DesktopInfoMutableBuilder[Self <: DesktopInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesktopFallbackLink(value: String): Self = StObject.set(x, "desktopFallbackLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopFallbackLinkUndefined: Self = StObject.set(x, "desktopFallbackLink", js.undefined)
  }
}
