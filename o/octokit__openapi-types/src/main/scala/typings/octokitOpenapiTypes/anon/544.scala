package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `544` extends StObject {
  
  /** Format: uri */
  var url: String
}
object `544` {
  
  inline def apply(url: String): `544` = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[`544`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `544`] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
