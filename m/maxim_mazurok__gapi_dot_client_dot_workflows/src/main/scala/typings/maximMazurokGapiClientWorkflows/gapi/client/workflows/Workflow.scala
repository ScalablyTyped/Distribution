package typings.maximMazurokGapiClientWorkflows.gapi.client.workflows

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workflow extends js.Object {
  
  /** Output only. The timestamp of when the workflow was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Description of the workflow provided by the user. Must be at most 1000 unicode characters long. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values can be no longer than 63 characters and can only contain lowercase letters, numeric
    * characters, underscores and dashes. Label keys must start with a letter. International characters are allowed.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientWorkflows.maximMazurokGapiClientWorkflowsStrings.Workflow with TopLevel[js.Any]
  ] = js.native
  
  /** The resource name of the workflow. Format: projects/{project}/locations/{location}/workflows/{workflow} */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The timestamp that the latest revision of the workflow was created. */
  var revisionCreateTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The revision of the workflow. A new revision of a workflow is created as a result of updating the following fields of a workflow: - `source_code` - `service_account`
    * The format is "000001-a4d", where the first 6 characters define the zero-padded revision ordinal number. They are followed by a hyphen and 3 hexadecimal random characters.
    */
  var revisionId: js.UndefOr[String] = js.native
  
  /**
    * Name of the service account associated with the latest workflow version. This service account represents the identity of the workflow and determines what permissions the workflow
    * has. Format: projects/{project}/serviceAccounts/{account} Using `-` as a wildcard for the `{project}` will infer the project from the account. The `{account}` value can be the
    * `email` address or the `unique_id` of the service account. If not provided, workflow will use the project's default service account. Modifying this field for an existing workflow
    * results in a new workflow revision.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /** Workflow code to be executed. The size limit is 32KB. */
  var sourceContents: js.UndefOr[String] = js.native
  
  /** Output only. State of the workflow deployment. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The last update timestamp of the workflow. */
  var updateTime: js.UndefOr[String] = js.native
}
object Workflow {
  
  @scala.inline
  def apply(): Workflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workflow]
  }
  
  @scala.inline
  implicit class WorkflowOps[Self <: Workflow] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientWorkflows.maximMazurokGapiClientWorkflowsStrings.Workflow with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRevisionCreateTime(value: String): Self = this.set("revisionCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionCreateTime: Self = this.set("revisionCreateTime", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    
    @scala.inline
    def setSourceContents(value: String): Self = this.set("sourceContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceContents: Self = this.set("sourceContents", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
