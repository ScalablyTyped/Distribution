package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceWebDetails extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#instanceWebDetails`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Launch URL for the game. */
  var launchUrl: js.UndefOr[String] = js.undefined
  
  /** Indicates that this instance is the default for new installations. */
  var preferred: js.UndefOr[Boolean] = js.undefined
}
object InstanceWebDetails {
  
  inline def apply(): InstanceWebDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceWebDetails]
  }
  
  extension [Self <: InstanceWebDetails](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLaunchUrl(value: String): Self = StObject.set(x, "launchUrl", value.asInstanceOf[js.Any])
    
    inline def setLaunchUrlUndefined: Self = StObject.set(x, "launchUrl", js.undefined)
    
    inline def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
  }
}
