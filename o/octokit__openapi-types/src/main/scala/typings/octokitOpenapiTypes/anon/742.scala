package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `742` extends StObject {
  
  var content: ApplicationjsonLocked
}
object `742` {
  
  inline def apply(content: ApplicationjsonLocked): `742` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`742`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `742`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonLocked): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
