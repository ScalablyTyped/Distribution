package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cweid extends StObject {
  
  var cwe_id: String
  
  var name: String
}
object Cweid {
  
  inline def apply(cwe_id: String, name: String): Cweid = {
    val __obj = js.Dynamic.literal(cwe_id = cwe_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cweid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cweid] (val x: Self) extends AnyVal {
    
    inline def setCwe_id(value: String): Self = StObject.set(x, "cwe_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
