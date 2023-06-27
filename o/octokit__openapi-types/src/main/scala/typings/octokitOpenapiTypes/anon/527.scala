package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `527` extends StObject {
  
  var body: js.UndefOr[FromString] = js.undefined
}
object `527` {
  
  inline def apply(): `527` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`527`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `527`] (val x: Self) extends AnyVal {
    
    inline def setBody(value: FromString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
