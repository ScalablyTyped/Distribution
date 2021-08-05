package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockedResource extends StObject {
  
  /** URL of the blocked resource. */
  var url: js.UndefOr[String] = js.undefined
}
object BlockedResource {
  
  inline def apply(): BlockedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockedResource]
  }
  
  extension [Self <: BlockedResource](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
