package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.CVE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.GHSA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueString extends StObject {
  
  /**
    * @description The type of identifier.
    * @enum {string}
    */
  var `type`: CVE | GHSA
  
  /** @description The identifier value. */
  var value: String
}
object ValueString {
  
  inline def apply(`type`: CVE | GHSA, value: String): ValueString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueString] (val x: Self) extends AnyVal {
    
    inline def setType(value: CVE | GHSA): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
