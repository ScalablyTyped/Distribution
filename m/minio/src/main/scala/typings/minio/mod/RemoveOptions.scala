package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveOptions extends StObject {
  
  var governanceBypass: js.UndefOr[Boolean] = js.undefined
  
  var versionId: js.UndefOr[String] = js.undefined
}
object RemoveOptions {
  
  inline def apply(): RemoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveOptions] (val x: Self) extends AnyVal {
    
    inline def setGovernanceBypass(value: Boolean): Self = StObject.set(x, "governanceBypass", value.asInstanceOf[js.Any])
    
    inline def setGovernanceBypassUndefined: Self = StObject.set(x, "governanceBypass", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
