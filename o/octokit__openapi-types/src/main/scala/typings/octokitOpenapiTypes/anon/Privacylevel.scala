package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Privacylevel extends StObject {
  
  var privacy_level: js.UndefOr[FromString] = js.undefined
}
object Privacylevel {
  
  inline def apply(): Privacylevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privacylevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Privacylevel] (val x: Self) extends AnyVal {
    
    inline def setPrivacy_level(value: FromString): Self = StObject.set(x, "privacy_level", value.asInstanceOf[js.Any])
    
    inline def setPrivacy_levelUndefined: Self = StObject.set(x, "privacy_level", js.undefined)
  }
}
