package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnsOptions extends StObject {
  
  var parentScope: js.UndefOr[js.Object] = js.undefined
}
object OnsOptions {
  
  @scala.inline
  def apply(): OnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnsOptions]
  }
  
  @scala.inline
  implicit class OnsOptionsMutableBuilder[Self <: OnsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParentScope(value: js.Object): Self = StObject.set(x, "parentScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentScopeUndefined: Self = StObject.set(x, "parentScope", js.undefined)
  }
}
