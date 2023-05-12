package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `457` extends StObject {
  
  var body: js.UndefOr[FromString] = js.undefined
  
  var name: js.UndefOr[FromString] = js.undefined
}
object `457` {
  
  inline def apply(): `457` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`457`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `457`] (val x: Self) extends AnyVal {
    
    inline def setBody(value: FromString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setName(value: FromString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
