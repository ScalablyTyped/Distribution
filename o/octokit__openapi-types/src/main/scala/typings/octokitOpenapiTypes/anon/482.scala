package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `482` extends StObject {
  
  var content: ApplicationjsonHistory
}
object `482` {
  
  inline def apply(content: ApplicationjsonHistory): `482` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`482`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `482`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonHistory): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
