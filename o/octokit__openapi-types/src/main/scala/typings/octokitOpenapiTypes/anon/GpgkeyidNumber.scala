package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GpgkeyidNumber extends StObject {
  
  /** The unique identifier of the GPG key. */
  var gpg_key_id: Double
}
object GpgkeyidNumber {
  
  inline def apply(gpg_key_id: Double): GpgkeyidNumber = {
    val __obj = js.Dynamic.literal(gpg_key_id = gpg_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpgkeyidNumber]
  }
  
  extension [Self <: GpgkeyidNumber](x: Self) {
    
    inline def setGpg_key_id(value: Double): Self = StObject.set(x, "gpg_key_id", value.asInstanceOf[js.Any])
  }
}
