package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationCategory extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#applicationCategory`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The primary category. */
  var primary: js.UndefOr[String] = js.undefined
  
  /** The secondary category. */
  var secondary: js.UndefOr[String] = js.undefined
}
object ApplicationCategory {
  
  inline def apply(): ApplicationCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationCategory]
  }
  
  extension [Self <: ApplicationCategory](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
