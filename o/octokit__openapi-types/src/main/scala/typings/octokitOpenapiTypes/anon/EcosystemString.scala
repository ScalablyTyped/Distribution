package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcosystemString extends StObject {
  
  var ecosystem: String
  
  var name: String
}
object EcosystemString {
  
  inline def apply(ecosystem: String, name: String): EcosystemString = {
    val __obj = js.Dynamic.literal(ecosystem = ecosystem.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcosystemString]
  }
  
  extension [Self <: EcosystemString](x: Self) {
    
    inline def setEcosystem(value: String): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
