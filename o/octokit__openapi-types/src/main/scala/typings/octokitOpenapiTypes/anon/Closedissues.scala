package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closedissues extends StObject {
  
  /**
    * Format: date-time
    * @example 2013-02-12T13:22:01Z
    */
  var closed_at: String | Null
  
  /** @example 8 */
  var closed_issues: Double
  
  /**
    * Format: date-time
    * @example 2011-04-10T20:09:31Z
    */
  var created_at: String
  
  var creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  /** @example Tracking milestone for version 1.0 */
  var description: String | Null
  
  /**
    * Format: date-time
    * @example 2012-10-09T23:39:01Z
    */
  var due_on: String | Null
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/milestones/v1.0
    */
  var html_url: String
  
  /** @example 1002604 */
  var id: Double
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/milestones/1/labels
    */
  var labels_url: String
  
  /** @example MDk6TWlsZXN0b25lMTAwMjYwNA== */
  var node_id: String
  
  /**
    * @description The number of the milestone.
    * @example 42
    */
  var number: Double
  
  /** @example 4 */
  var open_issues: Double
  
  /**
    * @description The state of the milestone.
    * @default open
    * @example open
    * @enum {string}
    */
  var state: open | closed
  
  /**
    * @description The title of the milestone.
    * @example v1.0
    */
  var title: String
  
  /**
    * Format: date-time
    * @example 2014-03-03T18:58:10Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/milestones/1
    */
  var url: String
}
object Closedissues {
  
  inline def apply(
    closed_issues: Double,
    created_at: String,
    creator: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    html_url: String,
    id: Double,
    labels_url: String,
    node_id: String,
    number: Double,
    open_issues: Double,
    state: open | closed,
    title: String,
    updated_at: String,
    url: String
  ): Closedissues = {
    val __obj = js.Dynamic.literal(closed_issues = closed_issues.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], open_issues = open_issues.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], closed_at = null, description = null, due_on = null)
    __obj.asInstanceOf[Closedissues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Closedissues] (val x: Self) extends AnyVal {
    
    inline def setClosed_at(value: String): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
    
    inline def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
    
    inline def setClosed_issues(value: Double): Self = StObject.set(x, "closed_issues", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDue_on(value: String): Self = StObject.set(x, "due_on", value.asInstanceOf[js.Any])
    
    inline def setDue_onNull: Self = StObject.set(x, "due_on", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabels_url(value: String): Self = StObject.set(x, "labels_url", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOpen_issues(value: Double): Self = StObject.set(x, "open_issues", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
