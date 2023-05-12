package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `602` extends StObject {
  
  var content: ApplicationjsonAddedby
}
object `602` {
  
  inline def apply(content: ApplicationjsonAddedby): `602` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`602`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `602`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAddedby): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
