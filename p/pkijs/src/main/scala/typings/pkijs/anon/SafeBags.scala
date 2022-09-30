package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeBags extends StObject {
  
  var safeBags: js.UndefOr[String] = js.undefined
}
object SafeBags {
  
  inline def apply(): SafeBags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeBags]
  }
  
  extension [Self <: SafeBags](x: Self) {
    
    inline def setSafeBags(value: String): Self = StObject.set(x, "safeBags", value.asInstanceOf[js.Any])
    
    inline def setSafeBagsUndefined: Self = StObject.set(x, "safeBags", js.undefined)
  }
}
