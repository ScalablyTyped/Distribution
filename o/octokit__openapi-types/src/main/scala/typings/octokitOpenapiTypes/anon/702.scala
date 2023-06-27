package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `702` extends StObject {
  
  var content: ApplicationjsonTruncated
}
object `702` {
  
  inline def apply(content: ApplicationjsonTruncated): `702` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`702`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `702`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTruncated): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
