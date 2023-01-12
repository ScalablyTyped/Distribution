package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  var content: `76`
}
object `77` {
  
  inline def apply(content: `76`): `77` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`77`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `77`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `76`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
