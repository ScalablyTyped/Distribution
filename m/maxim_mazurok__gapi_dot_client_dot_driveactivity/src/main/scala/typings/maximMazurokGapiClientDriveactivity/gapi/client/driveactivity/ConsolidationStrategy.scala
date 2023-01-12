package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolidationStrategy extends StObject {
  
  /** The individual activities are consolidated using the legacy strategy. */
  var legacy: js.UndefOr[Any] = js.undefined
  
  /** The individual activities are not consolidated. */
  var none: js.UndefOr[Any] = js.undefined
}
object ConsolidationStrategy {
  
  inline def apply(): ConsolidationStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsolidationStrategy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsolidationStrategy] (val x: Self) extends AnyVal {
    
    inline def setLegacy(value: Any): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
    
    inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
    
    inline def setNone(value: Any): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
  }
}
