package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.auth
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.auth_failed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.choose
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.complete
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.detecting
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.detection_found_multiple
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.detection_found_nothing
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.detection_needs_auth
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.error
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.importing
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.mapping
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pushing
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.setup
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unknown_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.waiting_to_push
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorscount extends StObject {
  
  var authors_count: js.UndefOr[Double | Null] = js.undefined
  
  /** Format: uri */
  var authors_url: String
  
  var commit_count: js.UndefOr[Double | Null] = js.undefined
  
  var error_message: js.UndefOr[String | Null] = js.undefined
  
  var failed_step: js.UndefOr[String | Null] = js.undefined
  
  var has_large_files: js.UndefOr[Boolean] = js.undefined
  
  /** Format: uri */
  var html_url: String
  
  var import_percent: js.UndefOr[Double | Null] = js.undefined
  
  var large_files_count: js.UndefOr[Double] = js.undefined
  
  var large_files_size: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var project_choices: js.UndefOr[js.Array[Humanname]] = js.undefined
  
  var push_percent: js.UndefOr[Double | Null] = js.undefined
  
  /** Format: uri */
  var repository_url: String
  
  /** @enum {string} */
  var status: auth | error | none_ | detecting | choose | auth_failed | importing | mapping | waiting_to_push | pushing | complete | setup | unknown_ | detection_found_multiple | detection_found_nothing | detection_needs_auth
  
  var status_text: js.UndefOr[String | Null] = js.undefined
  
  var svc_root: js.UndefOr[String] = js.undefined
  
  var svn_root: js.UndefOr[String] = js.undefined
  
  var tfvc_project: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var url: String
  
  var use_lfs: js.UndefOr[Boolean] = js.undefined
  
  var vcs: String | Null
  
  /** @description The URL of the originating repository. */
  var vcs_url: String
}
object Authorscount {
  
  inline def apply(
    authors_url: String,
    html_url: String,
    repository_url: String,
    status: auth | error | none_ | detecting | choose | auth_failed | importing | mapping | waiting_to_push | pushing | complete | setup | unknown_ | detection_found_multiple | detection_found_nothing | detection_needs_auth,
    url: String,
    vcs_url: String
  ): Authorscount = {
    val __obj = js.Dynamic.literal(authors_url = authors_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any], vcs = null)
    __obj.asInstanceOf[Authorscount]
  }
  
  extension [Self <: Authorscount](x: Self) {
    
    inline def setAuthors_count(value: Double): Self = StObject.set(x, "authors_count", value.asInstanceOf[js.Any])
    
    inline def setAuthors_countNull: Self = StObject.set(x, "authors_count", null)
    
    inline def setAuthors_countUndefined: Self = StObject.set(x, "authors_count", js.undefined)
    
    inline def setAuthors_url(value: String): Self = StObject.set(x, "authors_url", value.asInstanceOf[js.Any])
    
    inline def setCommit_count(value: Double): Self = StObject.set(x, "commit_count", value.asInstanceOf[js.Any])
    
    inline def setCommit_countNull: Self = StObject.set(x, "commit_count", null)
    
    inline def setCommit_countUndefined: Self = StObject.set(x, "commit_count", js.undefined)
    
    inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    inline def setError_messageNull: Self = StObject.set(x, "error_message", null)
    
    inline def setError_messageUndefined: Self = StObject.set(x, "error_message", js.undefined)
    
    inline def setFailed_step(value: String): Self = StObject.set(x, "failed_step", value.asInstanceOf[js.Any])
    
    inline def setFailed_stepNull: Self = StObject.set(x, "failed_step", null)
    
    inline def setFailed_stepUndefined: Self = StObject.set(x, "failed_step", js.undefined)
    
    inline def setHas_large_files(value: Boolean): Self = StObject.set(x, "has_large_files", value.asInstanceOf[js.Any])
    
    inline def setHas_large_filesUndefined: Self = StObject.set(x, "has_large_files", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setImport_percent(value: Double): Self = StObject.set(x, "import_percent", value.asInstanceOf[js.Any])
    
    inline def setImport_percentNull: Self = StObject.set(x, "import_percent", null)
    
    inline def setImport_percentUndefined: Self = StObject.set(x, "import_percent", js.undefined)
    
    inline def setLarge_files_count(value: Double): Self = StObject.set(x, "large_files_count", value.asInstanceOf[js.Any])
    
    inline def setLarge_files_countUndefined: Self = StObject.set(x, "large_files_count", js.undefined)
    
    inline def setLarge_files_size(value: Double): Self = StObject.set(x, "large_files_size", value.asInstanceOf[js.Any])
    
    inline def setLarge_files_sizeUndefined: Self = StObject.set(x, "large_files_size", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setProject_choices(value: js.Array[Humanname]): Self = StObject.set(x, "project_choices", value.asInstanceOf[js.Any])
    
    inline def setProject_choicesUndefined: Self = StObject.set(x, "project_choices", js.undefined)
    
    inline def setProject_choicesVarargs(value: Humanname*): Self = StObject.set(x, "project_choices", js.Array(value*))
    
    inline def setPush_percent(value: Double): Self = StObject.set(x, "push_percent", value.asInstanceOf[js.Any])
    
    inline def setPush_percentNull: Self = StObject.set(x, "push_percent", null)
    
    inline def setPush_percentUndefined: Self = StObject.set(x, "push_percent", js.undefined)
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: auth | error | none_ | detecting | choose | auth_failed | importing | mapping | waiting_to_push | pushing | complete | setup | unknown_ | detection_found_multiple | detection_found_nothing | detection_needs_auth
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatus_text(value: String): Self = StObject.set(x, "status_text", value.asInstanceOf[js.Any])
    
    inline def setStatus_textNull: Self = StObject.set(x, "status_text", null)
    
    inline def setStatus_textUndefined: Self = StObject.set(x, "status_text", js.undefined)
    
    inline def setSvc_root(value: String): Self = StObject.set(x, "svc_root", value.asInstanceOf[js.Any])
    
    inline def setSvc_rootUndefined: Self = StObject.set(x, "svc_root", js.undefined)
    
    inline def setSvn_root(value: String): Self = StObject.set(x, "svn_root", value.asInstanceOf[js.Any])
    
    inline def setSvn_rootUndefined: Self = StObject.set(x, "svn_root", js.undefined)
    
    inline def setTfvc_project(value: String): Self = StObject.set(x, "tfvc_project", value.asInstanceOf[js.Any])
    
    inline def setTfvc_projectUndefined: Self = StObject.set(x, "tfvc_project", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUse_lfs(value: Boolean): Self = StObject.set(x, "use_lfs", value.asInstanceOf[js.Any])
    
    inline def setUse_lfsUndefined: Self = StObject.set(x, "use_lfs", js.undefined)
    
    inline def setVcs(value: String): Self = StObject.set(x, "vcs", value.asInstanceOf[js.Any])
    
    inline def setVcsNull: Self = StObject.set(x, "vcs", null)
    
    inline def setVcs_url(value: String): Self = StObject.set(x, "vcs_url", value.asInstanceOf[js.Any])
  }
}
