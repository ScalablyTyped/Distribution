package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SiteName extends StObject {
  
  var siteName: String
}
object SiteName {
  
  inline def apply(siteName: String): SiteName = {
    val __obj = js.Dynamic.literal(siteName = siteName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteName]
  }
  
  extension [Self <: SiteName](x: Self) {
    
    inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
  }
}
