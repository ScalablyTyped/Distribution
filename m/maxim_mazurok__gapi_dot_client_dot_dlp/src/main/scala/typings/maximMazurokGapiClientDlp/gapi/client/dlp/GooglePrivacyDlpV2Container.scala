package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Container extends StObject {
  
  /** A string representation of the full container name. Examples: - BigQuery: 'Project:DataSetId.TableId' - Cloud Storage: 'gs://Bucket/folders/filename.txt' */
  var fullPath: js.UndefOr[String] = js.undefined
  
  /** Project where the finding was found. Can be different from the project that owns the finding. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * The rest of the path after the root. Examples: - For BigQuery table `project_id:dataset_id.table_id`, the relative path is `table_id` - For Cloud Storage file
    * `gs://bucket/folder/filename.txt`, the relative path is `folder/filename.txt`
    */
  var relativePath: js.UndefOr[String] = js.undefined
  
  /**
    * The root of the container. Examples: - For BigQuery table `project_id:dataset_id.table_id`, the root is `dataset_id` - For Cloud Storage file `gs://bucket/folder/filename.txt`, the
    * root is `gs://bucket`
    */
  var rootPath: js.UndefOr[String] = js.undefined
  
  /** Container type, for example BigQuery or Cloud Storage. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Findings container modification timestamp, if applicable. For Cloud Storage, this field contains the last file modification timestamp. For a BigQuery table, this field contains the
    * last_modified_time property. For Datastore, this field isn't populated.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Findings container version, if available ("generation" for Cloud Storage). */
  var version: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2Container {
  
  inline def apply(): GooglePrivacyDlpV2Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Container]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2Container] (val x: Self) extends AnyVal {
    
    inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
    
    inline def setFullPathUndefined: Self = StObject.set(x, "fullPath", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
    
    inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
    
    inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
    
    inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
