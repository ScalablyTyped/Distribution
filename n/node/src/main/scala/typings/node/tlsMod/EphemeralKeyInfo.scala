package typings.node.tlsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EphemeralKeyInfo extends StObject {
  
  /**
    * The name property is available only when type is 'ECDH'.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The size of parameter of an ephemeral key exchange.
    */
  var size: Double
  
  /**
    * The supported types are 'DH' and 'ECDH'.
    */
  var `type`: String
}
object EphemeralKeyInfo {
  
  inline def apply(size: Double, `type`: String): EphemeralKeyInfo = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralKeyInfo]
  }
  
  extension [Self <: EphemeralKeyInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
