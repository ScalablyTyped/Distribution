package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaUrl extends StObject {
  
  var sha: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object ShaUrl {
  
  inline def apply(): ShaUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShaUrl]
  }
  
  extension [Self <: ShaUrl](x: Self) {
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
