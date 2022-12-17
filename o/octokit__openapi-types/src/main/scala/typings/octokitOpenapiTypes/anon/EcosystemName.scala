package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcosystemName extends StObject {
  
  var ecosystem: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object EcosystemName {
  
  inline def apply(): EcosystemName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcosystemName]
  }
  
  extension [Self <: EcosystemName](x: Self) {
    
    inline def setEcosystem(value: String): Self = StObject.set(x, "ecosystem", value.asInstanceOf[js.Any])
    
    inline def setEcosystemUndefined: Self = StObject.set(x, "ecosystem", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
