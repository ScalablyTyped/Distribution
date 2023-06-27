package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `343` extends StObject {
  
  var content: `342`
}
object `343` {
  
  inline def apply(content: `342`): `343` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`343`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `343`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `342`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
