package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `701` extends StObject {
  
  var content: ApplicationjsonMessageNodeid
}
object `701` {
  
  inline def apply(content: ApplicationjsonMessageNodeid): `701` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`701`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `701`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMessageNodeid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
