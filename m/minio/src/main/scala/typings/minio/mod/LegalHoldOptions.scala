package typings.minio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegalHoldOptions extends StObject {
  
  var status: LegalHoldStatus
  
  var versionId: String
}
object LegalHoldOptions {
  
  inline def apply(status: LegalHoldStatus, versionId: String): LegalHoldOptions = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegalHoldOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegalHoldOptions] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: LegalHoldStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
