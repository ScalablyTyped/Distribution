package typings.parse5.distCjsCommonTokenMod

import typings.parse5.distCjsCommonTokenMod.TokenType.DOCTYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoctypeToken
  extends StObject
     with TokenBase
     with Token {
  
  var forceQuirks: Boolean
  
  var name: String | Null
  
  var publicId: String | Null
  
  var systemId: String | Null
  
  @JSName("type")
  val type_DoctypeToken: DOCTYPE
}
object DoctypeToken {
  
  inline def apply(forceQuirks: Boolean, `type`: DOCTYPE): DoctypeToken = {
    val __obj = js.Dynamic.literal(forceQuirks = forceQuirks.asInstanceOf[js.Any], location = null, name = null, publicId = null, systemId = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoctypeToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoctypeToken] (val x: Self) extends AnyVal {
    
    inline def setForceQuirks(value: Boolean): Self = StObject.set(x, "forceQuirks", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setPublicIdNull: Self = StObject.set(x, "publicId", null)
    
    inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    
    inline def setSystemIdNull: Self = StObject.set(x, "systemId", null)
    
    inline def setType(value: DOCTYPE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
