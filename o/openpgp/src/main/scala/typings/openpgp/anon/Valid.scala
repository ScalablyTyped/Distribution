package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Valid extends StObject {
  
  var keyid: typings.openpgp.mod.`type`.keyid.Keyid
  
  var valid: Boolean
}
object Valid {
  
  inline def apply(keyid: typings.openpgp.mod.`type`.keyid.Keyid, valid: Boolean): Valid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Valid]
  }
  
  extension [Self <: Valid](x: Self) {
    
    inline def setKeyid(value: typings.openpgp.mod.`type`.keyid.Keyid): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
