package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Armoredpublickey extends StObject {
  
  /** @description A GPG key in ASCII-armored format. */
  var armored_public_key: String
  
  /** @description A descriptive name for the new key. */
  var name: js.UndefOr[String] = js.undefined
}
object Armoredpublickey {
  
  inline def apply(armored_public_key: String): Armoredpublickey = {
    val __obj = js.Dynamic.literal(armored_public_key = armored_public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Armoredpublickey]
  }
  
  extension [Self <: Armoredpublickey](x: Self) {
    
    inline def setArmored_public_key(value: String): Self = StObject.set(x, "armored_public_key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
