package typings.mongodbClientEncryption.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientEncryptionRewrapManyDataKeyResult extends StObject {
  
  /** The result of rewrapping data keys. If unset, no keys matched the filter. */
  var bulkWriteResult: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BulkWriteResult */ Any
  ] = js.undefined
}
object ClientEncryptionRewrapManyDataKeyResult {
  
  inline def apply(): ClientEncryptionRewrapManyDataKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientEncryptionRewrapManyDataKeyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientEncryptionRewrapManyDataKeyResult] (val x: Self) extends AnyVal {
    
    inline def setBulkWriteResult(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BulkWriteResult */ Any
    ): Self = StObject.set(x, "bulkWriteResult", value.asInstanceOf[js.Any])
    
    inline def setBulkWriteResultUndefined: Self = StObject.set(x, "bulkWriteResult", js.undefined)
  }
}
