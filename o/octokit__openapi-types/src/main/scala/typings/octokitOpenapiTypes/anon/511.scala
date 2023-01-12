package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `511` extends StObject {
  
  var content: ApplicationjsonEnvironmenturl
}
object `511` {
  
  inline def apply(content: ApplicationjsonEnvironmenturl): `511` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`511`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `511`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonEnvironmenturl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
