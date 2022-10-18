package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Created extends StObject {
  
  /** Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run. */
  var actor: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['actor'] */ js.Any
  ] = js.undefined
  
  /** Returns workflow runs associated with a branch. Use the name of the branch of the `push`. */
  var branch: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['workflow-run-branch'] */ js.Any
  ] = js.undefined
  
  /** Returns workflow runs with the `check_suite_id` that you specify. */
  var check_suite_id: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['workflow-run-check-suite-id'] */ js.Any
  ] = js.undefined
  
  /** Returns workflow runs created within the given date-time range. For more information on the syntax, see "[Understanding the search syntax](https://docs.github.com/search-github/getting-started-with-searching-on-github/understanding-the-search-syntax#query-for-dates)." */
  var created: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['created'] */ js.Any
  ] = js.undefined
  
  /** Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see "[Events that trigger workflows](https://docs.github.com/en/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows)." */
  var event: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['event'] */ js.Any
  ] = js.undefined
  
  /** If `true` pull requests are omitted from the response (empty array). */
  var exclude_pull_requests: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['exclude-pull-requests'] */ js.Any
  ] = js.undefined
  
  /** Only returns workflow runs that are associated with the specified `head_sha`. */
  var head_sha: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['workflow-run-head-sha'] */ js.Any
  ] = js.undefined
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['page'] */ js.Any
  ] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
  ] = js.undefined
  
  /** Returns workflow runs with the check run `status` or `conclusion` that you specify. For example, a conclusion can be `success` or a status can be `in_progress`. Only GitHub can set a status of `waiting` or `requested`. */
  var status: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['workflow-run-status'] */ js.Any
  ] = js.undefined
}
object Created {
  
  inline def apply(): Created = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Created]
  }
  
  extension [Self <: Created](x: Self) {
    
    inline def setActor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['actor'] */ js.Any
    ): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setBranch(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['workflow-run-branch'] */ js.Any
    ): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCheck_suite_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['workflow-run-check-suite-id'] */ js.Any
    ): Self = StObject.set(x, "check_suite_id", value.asInstanceOf[js.Any])
    
    inline def setCheck_suite_idUndefined: Self = StObject.set(x, "check_suite_id", js.undefined)
    
    inline def setCreated(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['created'] */ js.Any
    ): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setEvent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['event'] */ js.Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setExclude_pull_requests(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['exclude-pull-requests'] */ js.Any
    ): Self = StObject.set(x, "exclude_pull_requests", value.asInstanceOf[js.Any])
    
    inline def setExclude_pull_requestsUndefined: Self = StObject.set(x, "exclude_pull_requests", js.undefined)
    
    inline def setHead_sha(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['workflow-run-head-sha'] */ js.Any
    ): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHead_shaUndefined: Self = StObject.set(x, "head_sha", js.undefined)
    
    inline def setPage(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['page'] */ js.Any
    ): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per-page'] */ js.Any
    ): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setStatus(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['workflow-run-status'] */ js.Any
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
