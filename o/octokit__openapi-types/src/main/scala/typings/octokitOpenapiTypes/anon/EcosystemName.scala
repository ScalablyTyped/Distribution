package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcosystemName extends StObject {
  
  var ecosystem: String
  
  var name: String
}
object EcosystemName {
  
  inline def apply(ecosystem: String, name: String): EcosystemName = {
    val __obj = js.Dynamic.literal(ecosystem = ecosystem.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcosystemName]
  }
  
  extension [Self <: EcosystemName](x: Self) {
    
    inline def setEcosystem(value: String): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
