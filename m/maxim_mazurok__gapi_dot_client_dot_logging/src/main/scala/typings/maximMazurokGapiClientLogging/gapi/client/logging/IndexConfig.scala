package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexConfig extends StObject {
  
  /** Output only. The timestamp when the index was last modified.This is used to return the timestamp, and will be ignored if supplied during update. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The LogEntry field path to index.Note that some paths are automatically indexed, and other paths are not eligible for indexing. See indexing documentation(
    * https://cloud.google.com/logging/docs/view/advanced-queries#indexed-fields) for details.For example: jsonPayload.request.status
    */
  var fieldPath: js.UndefOr[String] = js.undefined
  
  /** Required. The type of data in this index. */
  var `type`: js.UndefOr[String] = js.undefined
}
object IndexConfig {
  
  inline def apply(): IndexConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexConfig] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
