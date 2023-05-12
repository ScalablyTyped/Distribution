package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `399` extends StObject {
  
  var content: `398`
}
object `399` {
  
  inline def apply(content: `398`): `399` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`399`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `399`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `398`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
