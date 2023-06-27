package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `748` extends StObject {
  
  var content: ApplicationjsonMentionscount
}
object `748` {
  
  inline def apply(content: ApplicationjsonMentionscount): `748` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`748`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `748`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMentionscount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
