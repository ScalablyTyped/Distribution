package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyid extends StObject {
  
  var keyid: typings.openpgp.mod.`type`.keyid.Keyid
  
  var valid: Boolean
}
object Keyid {
  
  inline def apply(keyid: typings.openpgp.mod.`type`.keyid.Keyid, valid: Boolean): Keyid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyid]
  }
  
  extension [Self <: Keyid](x: Self) {
    
    inline def setKeyid(value: typings.openpgp.mod.`type`.keyid.Keyid): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
