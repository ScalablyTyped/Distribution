package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwallowErrors extends StObject {
  
  var swallowErrors: js.UndefOr[Boolean] = js.undefined
}
object SwallowErrors {
  
  @scala.inline
  def apply(): SwallowErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwallowErrors]
  }
  
  @scala.inline
  implicit class SwallowErrorsMutableBuilder[Self <: SwallowErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSwallowErrors(value: Boolean): Self = StObject.set(x, "swallowErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwallowErrorsUndefined: Self = StObject.set(x, "swallowErrors", js.undefined)
  }
}
