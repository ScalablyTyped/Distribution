package typings.mjmlReact.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlFontProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object MjmlFontProps {
  
  inline def apply(): MjmlFontProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlFontProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MjmlFontProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
