package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `411` extends StObject {
  
  var sha: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object `411` {
  
  inline def apply(): `411` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`411`]
  }
  
  extension [Self <: `411`](x: Self) {
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
