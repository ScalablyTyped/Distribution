package typings.muicss.reactMod

import typings.react.mod.FormHTMLAttributes
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormProps
  extends StObject
     with FormHTMLAttributes[HTMLFormElement] {
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
}
object FormProps {
  
  inline def apply(): FormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormProps] (val x: Self) extends AnyVal {
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
  }
}
