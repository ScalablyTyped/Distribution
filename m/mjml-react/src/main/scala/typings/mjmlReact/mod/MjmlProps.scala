package typings.mjmlReact.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var owa: js.UndefOr[String] = js.undefined
}
object MjmlProps {
  
  inline def apply(): MjmlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MjmlProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setOwa(value: String): Self = StObject.set(x, "owa", value.asInstanceOf[js.Any])
    
    inline def setOwaUndefined: Self = StObject.set(x, "owa", js.undefined)
  }
}
