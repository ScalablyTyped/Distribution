package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `519` extends StObject {
  
  var content: ApplicationjsonTruncated
}
object `519` {
  
  inline def apply(content: ApplicationjsonTruncated): `519` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`519`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `519`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTruncated): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
