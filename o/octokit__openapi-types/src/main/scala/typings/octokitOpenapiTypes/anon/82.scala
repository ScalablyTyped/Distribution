package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  var content: `81`
}
object `82` {
  
  inline def apply(content: `81`): `82` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`82`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `82`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `81`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
