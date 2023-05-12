package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Self extends StObject {
  
  var self: js.UndefOr[`437`] = js.undefined
}
object Self {
  
  inline def apply(): Self = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Self]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self_ <: Self] (val x: Self_) extends AnyVal {
    
    inline def setSelf(value: `437`): Self_ = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self_ = StObject.set(x, "self", js.undefined)
  }
}
