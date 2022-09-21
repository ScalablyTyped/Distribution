package typings.npmProfile.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordUpdate extends StObject {
  
  var `new`: String
  
  var old: String
}
object PasswordUpdate {
  
  inline def apply(`new`: String, old: String): PasswordUpdate = {
    val __obj = js.Dynamic.literal(old = old.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordUpdate]
  }
  
  extension [Self <: PasswordUpdate](x: Self) {
    
    inline def setNew(value: String): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setOld(value: String): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
  }
}
