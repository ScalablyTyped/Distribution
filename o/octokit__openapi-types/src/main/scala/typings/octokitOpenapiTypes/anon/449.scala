package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `449` extends StObject {
  
  var body: js.UndefOr[FromString] = js.undefined
}
object `449` {
  
  inline def apply(): `449` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`449`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `449`] (val x: Self) extends AnyVal {
    
    inline def setBody(value: FromString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
