package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `705` extends StObject {
  
  var content: ApplicationjsonTesturl
}
object `705` {
  
  inline def apply(content: ApplicationjsonTesturl): `705` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`705`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `705`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTesturl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
