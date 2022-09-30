package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeneralName extends StObject {
  
  /**
    * value type - from a tagged value (0 for "otherName", 1 for "rfc822Name" etc.)
    */
  var `type`: Double
  
  /**
    * ASN.1 object having GeneralName value (type depends on TYPE value)
    */
  var value: Any
}
object IGeneralName {
  
  inline def apply(`type`: Double, value: Any): IGeneralName = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeneralName]
  }
  
  extension [Self <: IGeneralName](x: Self) {
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
