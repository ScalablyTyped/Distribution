package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionOptions extends StObject {
  
  var governanceBypass: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[Mode] = js.undefined
  
  var retainUntilDate: js.UndefOr[IsoDate] = js.undefined
  
  var versionId: String
}
object RetentionOptions {
  
  inline def apply(versionId: String): RetentionOptions = {
    val __obj = js.Dynamic.literal(versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionOptions]
  }
  
  extension [Self <: RetentionOptions](x: Self) {
    
    inline def setGovernanceBypass(value: Boolean): Self = StObject.set(x, "governanceBypass", value.asInstanceOf[js.Any])
    
    inline def setGovernanceBypassUndefined: Self = StObject.set(x, "governanceBypass", js.undefined)
    
    inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRetainUntilDate(value: IsoDate): Self = StObject.set(x, "retainUntilDate", value.asInstanceOf[js.Any])
    
    inline def setRetainUntilDateUndefined: Self = StObject.set(x, "retainUntilDate", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
