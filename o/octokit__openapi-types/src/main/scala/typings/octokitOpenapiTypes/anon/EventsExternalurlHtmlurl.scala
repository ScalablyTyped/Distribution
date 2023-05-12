package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.branch_protection_rule
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_run
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.check_suite
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.code_scanning_alert
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.commit_comment
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.content_reference
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.create
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.delete
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deploy_key
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deployment
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deployment_review
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deployment_status
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.discussion
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.discussion_comment
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.fork
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.gollum
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.issue_comment
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.issues
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.label
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.membership
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.milestone
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.org_block
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.organization_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.page_build
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.project
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.project_card
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.project_column
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull_request
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull_request_review
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull_request_review_comment
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.push
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.registry_package
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.release
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.reminder
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.repository_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.repository_dispatch
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret_scanning_alert
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.star
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.status
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.team_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.team_add
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.watch
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.workflow_dispatch
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.workflow_run
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsExternalurlHtmlurl extends StObject {
  
  /** Format: date-time */
  var created_at: String | Null
  
  var description: String | Null
  
  /** @description The list of events for the GitHub app */
  var events: js.UndefOr[
    js.Array[
      branch_protection_rule | check_run | check_suite | code_scanning_alert | commit_comment | content_reference | create | delete | deployment | deployment_review | deployment_status | deploy_key | discussion | discussion_comment | fork | gollum | issues | issue_comment | label | member_ | membership | milestone | organization_ | org_block | page_build | project | project_card | project_column | public | pull_request | pull_request_review | pull_request_review_comment | push | registry_package | release | repository_ | repository_dispatch | secret_scanning_alert | star | status | team_ | team_add | watch | workflow_dispatch | workflow_run | reminder
    ]
  ] = js.undefined
  
  /** Format: uri */
  var external_url: String | Null
  
  /** Format: uri */
  var html_url: String
  
  /** @description Unique identifier of the GitHub app */
  var id: Double | Null
  
  /** @description The name of the GitHub app */
  var name: String
  
  var node_id: String
  
  /** User */
  var owner: Deleted | Null
  
  /** @description The set of permissions for the GitHub app */
  var permissions: js.UndefOr[Deployments] = js.undefined
  
  /** @description The slug name of the GitHub app */
  var slug: js.UndefOr[String] = js.undefined
  
  /** Format: date-time */
  var updated_at: String | Null
}
object EventsExternalurlHtmlurl {
  
  inline def apply(html_url: String, name: String, node_id: String): EventsExternalurlHtmlurl = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], created_at = null, description = null, external_url = null, id = null, owner = null, updated_at = null)
    __obj.asInstanceOf[EventsExternalurlHtmlurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventsExternalurlHtmlurl] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEvents(
      value: js.Array[
          branch_protection_rule | check_run | check_suite | code_scanning_alert | commit_comment | content_reference | create | delete | deployment | deployment_review | deployment_status | deploy_key | discussion | discussion_comment | fork | gollum | issues | issue_comment | label | member_ | membership | milestone | organization_ | org_block | page_build | project | project_card | project_column | public | pull_request | pull_request_review | pull_request_review_comment | push | registry_package | release | repository_ | repository_dispatch | secret_scanning_alert | star | status | team_ | team_add | watch | workflow_dispatch | workflow_run | reminder
        ]
    ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (branch_protection_rule | check_run | check_suite | code_scanning_alert | commit_comment | content_reference | create | delete | deployment | deployment_review | deployment_status | deploy_key | discussion | discussion_comment | fork | gollum | issues | issue_comment | label | member_ | membership | milestone | organization_ | org_block | page_build | project | project_card | project_column | public | pull_request | pull_request_review | pull_request_review_comment | push | registry_package | release | repository_ | repository_dispatch | secret_scanning_alert | star | status | team_ | team_add | watch | workflow_dispatch | workflow_run | reminder)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
    
    inline def setExternal_urlNull: Self = StObject.set(x, "external_url", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Deleted): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setPermissions(value: Deployments): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
  }
}
