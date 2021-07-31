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
  
  @scala.inline
  def apply(): FormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps]
  }
  
  @scala.inline
  implicit class FormPropsMutableBuilder[Self <: FormProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
  }
}
