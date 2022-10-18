package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var content: ApplicationjsonActive
}
object `45` {
  
  inline def apply(content: ApplicationjsonActive): `45` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`45`]
  }
  
  extension [Self <: `45`](x: Self) {
    
    inline def setContent(value: ApplicationjsonActive): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
