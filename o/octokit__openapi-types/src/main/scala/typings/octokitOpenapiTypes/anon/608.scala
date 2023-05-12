package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `608` extends StObject {
  
  var content: ApplicationjsonClosedissues
}
object `608` {
  
  inline def apply(content: ApplicationjsonClosedissues): `608` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`608`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `608`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonClosedissues): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
