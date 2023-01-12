package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlServerAuditConfig extends StObject {
  
  /** The name of the destination bucket (e.g., gs://mybucket). */
  var bucket: js.UndefOr[String] = js.undefined
  
  /** This is always sql#sqlServerAuditConfig */
  var kind: js.UndefOr[String] = js.undefined
  
  /** How long to keep generated audit files. */
  var retentionInterval: js.UndefOr[String] = js.undefined
  
  /** How often to upload generated audit files. */
  var uploadInterval: js.UndefOr[String] = js.undefined
}
object SqlServerAuditConfig {
  
  inline def apply(): SqlServerAuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlServerAuditConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlServerAuditConfig] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRetentionInterval(value: String): Self = StObject.set(x, "retentionInterval", value.asInstanceOf[js.Any])
    
    inline def setRetentionIntervalUndefined: Self = StObject.set(x, "retentionInterval", js.undefined)
    
    inline def setUploadInterval(value: String): Self = StObject.set(x, "uploadInterval", value.asInstanceOf[js.Any])
    
    inline def setUploadIntervalUndefined: Self = StObject.set(x, "uploadInterval", js.undefined)
  }
}
