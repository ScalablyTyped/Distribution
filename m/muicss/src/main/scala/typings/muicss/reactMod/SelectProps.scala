package typings.muicss.reactMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectProps extends HTMLAttributes[HTMLDivElement] {
  
  var label: js.UndefOr[ReactNode] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var useDefault: js.UndefOr[Boolean] = js.native
}
object SelectProps {
  
  @scala.inline
  def apply(): SelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectProps]
  }
  
  @scala.inline
  implicit class SelectPropsMutableBuilder[Self <: SelectProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultUndefined: Self = StObject.set(x, "useDefault", js.undefined)
  }
}
