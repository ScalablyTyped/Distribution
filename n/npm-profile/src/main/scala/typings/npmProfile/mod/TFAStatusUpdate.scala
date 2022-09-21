package typings.npmProfile.mod

import typings.npmProfile.npmProfileStrings.`auth-and-writes`
import typings.npmProfile.npmProfileStrings.`auth-only`
import typings.npmProfile.npmProfileStrings.disable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TFAStatusUpdate extends StObject {
  
  var mode: disable | `auth-only` | `auth-and-writes`
  
  var password: String
}
object TFAStatusUpdate {
  
  inline def apply(mode: disable | `auth-only` | `auth-and-writes`, password: String): TFAStatusUpdate = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[TFAStatusUpdate]
  }
  
  extension [Self <: TFAStatusUpdate](x: Self) {
    
    inline def setMode(value: disable | `auth-only` | `auth-and-writes`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
