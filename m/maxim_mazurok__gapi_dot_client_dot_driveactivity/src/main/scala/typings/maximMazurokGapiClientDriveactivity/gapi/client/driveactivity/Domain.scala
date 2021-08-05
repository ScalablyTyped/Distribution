package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  /** An opaque string used to identify this domain. */
  var legacyId: js.UndefOr[String] = js.undefined
  
  /** The name of the domain, e.g. "google.com". */
  var name: js.UndefOr[String] = js.undefined
}
object Domain {
  
  inline def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  extension [Self <: Domain](x: Self) {
    
    inline def setLegacyId(value: String): Self = StObject.set(x, "legacyId", value.asInstanceOf[js.Any])
    
    inline def setLegacyIdUndefined: Self = StObject.set(x, "legacyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
