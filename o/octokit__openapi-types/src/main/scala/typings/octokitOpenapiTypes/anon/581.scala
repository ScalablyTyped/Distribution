package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `581` extends StObject {
  
  var content: ApplicationjsonAuthorCommitter
}
object `581` {
  
  inline def apply(content: ApplicationjsonAuthorCommitter): `581` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`581`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `581`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAuthorCommitter): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
