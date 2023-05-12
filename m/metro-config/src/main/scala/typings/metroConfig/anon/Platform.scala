package typings.metroConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Platform extends StObject {
  
  var platform: String | Null
}
object Platform {
  
  inline def apply(): Platform = {
    val __obj = js.Dynamic.literal(platform = null)
    __obj.asInstanceOf[Platform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Platform] (val x: Self) extends AnyVal {
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
  }
}
