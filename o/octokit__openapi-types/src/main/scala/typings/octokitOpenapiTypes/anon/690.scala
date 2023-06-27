package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `690` extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object `690` {
  
  inline def apply(): `690` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`690`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `690`] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
