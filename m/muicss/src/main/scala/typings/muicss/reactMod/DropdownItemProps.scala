package typings.muicss.reactMod

import typings.react.mod.LiHTMLAttributes
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownItemProps
  extends StObject
     with LiHTMLAttributes[HTMLLIElement] {
  
  var link: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object DropdownItemProps {
  
  inline def apply(): DropdownItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownItemProps]
  }
  
  extension [Self <: DropdownItemProps](x: Self) {
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
