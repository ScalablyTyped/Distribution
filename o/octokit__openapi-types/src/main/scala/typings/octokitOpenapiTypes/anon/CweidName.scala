package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CweidName extends StObject {
  
  /** @description The Common Weakness Enumeration (CWE) identifier. */
  var cwe_id: String
  
  /** @description The name of the CWE. */
  var name: String
}
object CweidName {
  
  inline def apply(cwe_id: String, name: String): CweidName = {
    val __obj = js.Dynamic.literal(cwe_id = cwe_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CweidName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CweidName] (val x: Self) extends AnyVal {
    
    inline def setCwe_id(value: String): Self = StObject.set(x, "cwe_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
