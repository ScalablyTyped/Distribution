package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `130` extends StObject {
  
  var content: ApplicationjsonTruncated
}
object `130` {
  
  inline def apply(content: ApplicationjsonTruncated): `130` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`130`]
  }
  
  extension [Self <: `130`](x: Self) {
    
    inline def setContent(value: ApplicationjsonTruncated): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
