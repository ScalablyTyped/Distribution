package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `456` extends StObject {
  
  var name: js.UndefOr[FromString] = js.undefined
}
object `456` {
  
  inline def apply(): `456` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`456`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `456`] (val x: Self) extends AnyVal {
    
    inline def setName(value: FromString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
