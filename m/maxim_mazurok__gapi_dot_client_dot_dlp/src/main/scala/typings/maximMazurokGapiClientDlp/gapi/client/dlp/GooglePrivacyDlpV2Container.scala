package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Container extends js.Object {
  
  /** A string representation of the full container name. Examples: - BigQuery: 'Project:DataSetId.TableId' - Google Cloud Storage: 'gs://Bucket/folders/filename.txt' */
  var fullPath: js.UndefOr[String] = js.native
  
  /** Project where the finding was found. Can be different from the project that owns the finding. */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * The rest of the path after the root. Examples: - For BigQuery table `project_id:dataset_id.table_id`, the relative path is `table_id` - Google Cloud Storage file
    * `gs://bucket/folder/filename.txt`, the relative path is `folder/filename.txt`
    */
  var relativePath: js.UndefOr[String] = js.native
  
  /**
    * The root of the container. Examples: - For BigQuery table `project_id:dataset_id.table_id`, the root is `dataset_id` - For Google Cloud Storage file
    * `gs://bucket/folder/filename.txt`, the root is `gs://bucket`
    */
  var rootPath: js.UndefOr[String] = js.native
  
  /** Container type, for example BigQuery or Google Cloud Storage. */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Findings container modification timestamp, if applicable. For Google Cloud Storage contains last file modification timestamp. For BigQuery table contains last_modified_time
    * property. For Datastore - not populated.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /** Findings container version, if available ("generation" for Google Cloud Storage). */
  var version: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2Container {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Container]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ContainerOps[Self <: GooglePrivacyDlpV2Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFullPath(value: String): Self = this.set("fullPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullPath: Self = this.set("fullPath", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativePath: Self = this.set("relativePath", js.undefined)
    
    @scala.inline
    def setRootPath(value: String): Self = this.set("rootPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootPath: Self = this.set("rootPath", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
