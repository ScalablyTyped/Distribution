package typings.preact.mod.createElement.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrinsicAttributes extends StObject {
  
  var key: js.UndefOr[js.Any] = js.undefined
}
object IntrinsicAttributes {
  
  @scala.inline
  def apply(): IntrinsicAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrinsicAttributes]
  }
  
  @scala.inline
  implicit class IntrinsicAttributesMutableBuilder[Self <: IntrinsicAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
