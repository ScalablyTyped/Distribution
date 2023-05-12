package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `439` extends StObject {
  
  var sha: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object `439` {
  
  inline def apply(): `439` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`439`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `439`] (val x: Self) extends AnyVal {
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
