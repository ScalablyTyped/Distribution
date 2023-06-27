package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `731` extends StObject {
  
  var content: ApplicationjsonClosedissues
}
object `731` {
  
  inline def apply(content: ApplicationjsonClosedissues): `731` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`731`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `731`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonClosedissues): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
