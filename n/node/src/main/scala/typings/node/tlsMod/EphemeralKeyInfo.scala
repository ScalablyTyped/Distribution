package typings.node.tlsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EphemeralKeyInfo extends StObject {
  
  /**
    * The name property is available only when type is 'ECDH'.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The size of parameter of an ephemeral key exchange.
    */
  var size: Double = js.native
  
  /**
    * The supported types are 'DH' and 'ECDH'.
    */
  var `type`: String = js.native
}
object EphemeralKeyInfo {
  
  @scala.inline
  def apply(size: Double, `type`: String): EphemeralKeyInfo = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralKeyInfo]
  }
  
  @scala.inline
  implicit class EphemeralKeyInfoMutableBuilder[Self <: EphemeralKeyInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
