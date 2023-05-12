package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `252` extends StObject {
  
  var content: `251`
}
object `252` {
  
  inline def apply(content: `251`): `252` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`252`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `252`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `251`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
