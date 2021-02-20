package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsolidationStrategy extends StObject {
  
  /** The individual activities are consolidated using the legacy strategy. */
  var legacy: js.UndefOr[js.Any] = js.native
  
  /** The individual activities are not consolidated. */
  var none: js.UndefOr[js.Any] = js.native
}
object ConsolidationStrategy {
  
  @scala.inline
  def apply(): ConsolidationStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsolidationStrategy]
  }
  
  @scala.inline
  implicit class ConsolidationStrategyMutableBuilder[Self <: ConsolidationStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegacy(value: js.Any): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
    
    @scala.inline
    def setNone(value: js.Any): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
  }
}
