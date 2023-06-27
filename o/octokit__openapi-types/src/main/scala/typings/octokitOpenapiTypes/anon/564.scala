package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `564` extends StObject {
  
  var content: ApplicationjsonHistory
}
object `564` {
  
  inline def apply(content: ApplicationjsonHistory): `564` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`564`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `564`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonHistory): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
