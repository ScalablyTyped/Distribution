package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `658` extends StObject {
  
  var content: ApplicationjsonKeyprefix
}
object `658` {
  
  inline def apply(content: ApplicationjsonKeyprefix): `658` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`658`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `658`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonKeyprefix): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
