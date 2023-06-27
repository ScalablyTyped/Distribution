package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `203` extends StObject {
  
  var content: `199`
}
object `203` {
  
  inline def apply(content: `199`): `203` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`203`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `203`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `199`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
