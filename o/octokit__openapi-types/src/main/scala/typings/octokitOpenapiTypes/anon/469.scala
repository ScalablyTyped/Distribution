package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `469` extends StObject {
  
  var sha: String | Null
  
  /** Format: uri */
  var url: String | Null
}
object `469` {
  
  inline def apply(): `469` = {
    val __obj = js.Dynamic.literal(sha = null, url = null)
    __obj.asInstanceOf[`469`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `469`] (val x: Self) extends AnyVal {
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaNull: Self = StObject.set(x, "sha", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
  }
}
