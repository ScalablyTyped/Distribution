package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `451` extends StObject {
  
  var from: js.UndefOr[String] = js.undefined
}
object `451` {
  
  inline def apply(): `451` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`451`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `451`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
  }
}
