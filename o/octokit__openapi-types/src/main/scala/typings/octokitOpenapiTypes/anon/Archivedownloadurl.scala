package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Archivedownloadurl extends StObject {
  
  /** @example https://api.github.com/repos/github/hello-world/actions/artifacts/5/zip */
  var archive_download_url: String
  
  /** Format: date-time */
  var created_at: String | Null
  
  /** @description Whether or not the artifact has expired. */
  var expired: Boolean
  
  /** Format: date-time */
  var expires_at: String | Null
  
  /** @example 5 */
  var id: Double
  
  /**
    * @description The name of the artifact.
    * @example AdventureWorks.Framework
    */
  var name: String
  
  /** @example MDEwOkNoZWNrU3VpdGU1 */
  var node_id: String
  
  /**
    * @description The size in bytes of the artifact.
    * @example 12345
    */
  var size_in_bytes: Double
  
  /** Format: date-time */
  var updated_at: String | Null
  
  /** @example https://api.github.com/repos/github/hello-world/actions/artifacts/5 */
  var url: String
  
  var workflow_run: js.UndefOr[Headbranch | Null] = js.undefined
}
object Archivedownloadurl {
  
  inline def apply(
    archive_download_url: String,
    expired: Boolean,
    id: Double,
    name: String,
    node_id: String,
    size_in_bytes: Double,
    url: String
  ): Archivedownloadurl = {
    val __obj = js.Dynamic.literal(archive_download_url = archive_download_url.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], created_at = null, expires_at = null, updated_at = null)
    __obj.asInstanceOf[Archivedownloadurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Archivedownloadurl] (val x: Self) extends AnyVal {
    
    inline def setArchive_download_url(value: String): Self = StObject.set(x, "archive_download_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    inline def setExpires_atNull: Self = StObject.set(x, "expires_at", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setSize_in_bytes(value: Double): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_run(value: Headbranch): Self = StObject.set(x, "workflow_run", value.asInstanceOf[js.Any])
    
    inline def setWorkflow_runNull: Self = StObject.set(x, "workflow_run", null)
    
    inline def setWorkflow_runUndefined: Self = StObject.set(x, "workflow_run", js.undefined)
  }
}
