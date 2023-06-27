package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `534` extends StObject {
  
  var name: js.UndefOr[FromString] = js.undefined
}
object `534` {
  
  inline def apply(): `534` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`534`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `534`] (val x: Self) extends AnyVal {
    
    inline def setName(value: FromString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
