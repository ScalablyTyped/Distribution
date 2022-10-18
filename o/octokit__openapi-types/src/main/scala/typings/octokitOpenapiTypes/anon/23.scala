package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var content: ApplicationjsonBodyCreatedat
}
object `23` {
  
  inline def apply(content: ApplicationjsonBodyCreatedat): `23` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setContent(value: ApplicationjsonBodyCreatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
