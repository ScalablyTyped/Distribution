package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectUriSettings extends StObject {
  
  var index: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var uri: js.UndefOr[NullableOption[String]] = js.undefined
}
object RedirectUriSettings {
  
  inline def apply(): RedirectUriSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectUriSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedirectUriSettings] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: NullableOption[Double]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setUri(value: NullableOption[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
