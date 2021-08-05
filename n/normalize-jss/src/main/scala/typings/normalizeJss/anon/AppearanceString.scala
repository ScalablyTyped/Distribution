package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppearanceString extends StObject {
  
  var appearance: String
}
object AppearanceString {
  
  inline def apply(appearance: String): AppearanceString = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearanceString]
  }
  
  extension [Self <: AppearanceString](x: Self) {
    
    inline def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
  }
}
