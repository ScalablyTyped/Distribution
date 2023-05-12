package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `555` extends StObject {
  
  var content: ApplicationjsonKeyprefix
}
object `555` {
  
  inline def apply(content: ApplicationjsonKeyprefix): `555` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`555`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `555`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonKeyprefix): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
