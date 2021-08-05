package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLeakPreventionChange extends StObject {
  
  /** The type of Data Leak Prevention (DLP) change. */
  var `type`: js.UndefOr[String] = js.undefined
}
object DataLeakPreventionChange {
  
  inline def apply(): DataLeakPreventionChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLeakPreventionChange]
  }
  
  extension [Self <: DataLeakPreventionChange](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
