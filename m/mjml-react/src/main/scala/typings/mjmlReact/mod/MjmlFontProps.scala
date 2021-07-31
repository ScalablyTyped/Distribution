package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MjmlFontProps extends StObject {
  
  var href: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object MjmlFontProps {
  
  @scala.inline
  def apply(): MjmlFontProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlFontProps]
  }
  
  @scala.inline
  implicit class MjmlFontPropsMutableBuilder[Self <: MjmlFontProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
