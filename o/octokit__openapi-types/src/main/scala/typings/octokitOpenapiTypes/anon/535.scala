package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `535` extends StObject {
  
  var body: js.UndefOr[FromString] = js.undefined
  
  var name: js.UndefOr[FromString] = js.undefined
}
object `535` {
  
  inline def apply(): `535` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`535`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `535`] (val x: Self) extends AnyVal {
    
    inline def setBody(value: FromString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setName(value: FromString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
