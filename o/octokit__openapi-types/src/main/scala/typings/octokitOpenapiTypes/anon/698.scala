package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `698` extends StObject {
  
  var content: ApplicationjsonAuthorCommitter
}
object `698` {
  
  inline def apply(content: ApplicationjsonAuthorCommitter): `698` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`698`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `698`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAuthorCommitter): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
