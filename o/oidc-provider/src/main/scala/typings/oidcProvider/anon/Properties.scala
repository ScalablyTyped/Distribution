package typings.oidcProvider.anon

import typings.oidcProvider.mod.ClientMetadata
import typings.oidcProvider.mod.KoaContextWithOIDC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Properties extends StObject {
  
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  
  var validator: js.UndefOr[
    js.Function4[
      /* ctx */ KoaContextWithOIDC, 
      /* key */ String, 
      /* value */ Any, 
      /* metadata */ ClientMetadata, 
      js.UndefOr[Unit]
    ]
  ] = js.undefined
}
object Properties {
  
  inline def apply(): Properties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Properties]
  }
  
  extension [Self <: Properties](x: Self) {
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setValidator(
      value: (/* ctx */ KoaContextWithOIDC, /* key */ String, /* value */ Any, /* metadata */ ClientMetadata) => js.UndefOr[Unit]
    ): Self = StObject.set(x, "validator", js.Any.fromFunction4(value))
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
