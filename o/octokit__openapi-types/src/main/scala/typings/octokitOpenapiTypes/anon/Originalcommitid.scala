package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.COLLABORATOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIMER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIME_CONTRIBUTOR
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.LEFT
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MANNEQUIN
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.MEMBER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.NONE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.OWNER
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.RIGHT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Originalcommitid extends StObject {
  
  var _links: HtmlPullrequest
  
  var author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  /** @example Great stuff */
  var body: String
  
  var body_html: js.UndefOr[String] = js.undefined
  
  var body_text: js.UndefOr[String] = js.undefined
  
  /** @example 6dcb09b5b57875f334f61aebed695e2e4193db5e */
  var commit_id: String
  
  /**
    * Format: date-time
    * @example 2011-04-14T16:00:49Z
    */
  var created_at: String
  
  /** @example @@ -16,33 +16,40 @@ public class Connection : IConnection... */
  var diff_hunk: String
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/pull/1#discussion-diff-1
    */
  var html_url: String
  
  /** @example 10 */
  var id: Double
  
  /** @example 8 */
  var in_reply_to_id: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The line of the blob to which the comment applies. The last line of the range for a multi-line comment
    * @example 2
    */
  var line: js.UndefOr[Double] = js.undefined
  
  /** @example MDI0OlB1bGxSZXF1ZXN0UmV2aWV3Q29tbWVudDEw */
  var node_id: String
  
  /** @example 9c48853fa3dc5c1c3d6f1f1cd1f2743e72652840 */
  var original_commit_id: String
  
  /**
    * @description The original line of the blob to which the comment applies. The last line of the range for a multi-line comment
    * @example 2
    */
  var original_line: js.UndefOr[Double] = js.undefined
  
  /** @example 4 */
  var original_position: Double
  
  /**
    * @description The original first line of the range for a multi-line comment.
    * @example 2
    */
  var original_start_line: js.UndefOr[Double | Null] = js.undefined
  
  /** @example file1.txt */
  var path: String
  
  /** @example 1 */
  var position: Double | Null
  
  /** @example 42 */
  var pull_request_review_id: Double | Null
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/pulls/1
    */
  var pull_request_url: String
  
  var reactions: js.UndefOr[Confused] = js.undefined
  
  /**
    * @description The side of the first line of the range for a multi-line comment.
    * @default RIGHT
    * @enum {string}
    */
  var side: js.UndefOr[LEFT | RIGHT] = js.undefined
  
  /**
    * @description The first line of the range for a multi-line comment.
    * @example 2
    */
  var start_line: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * @description The side of the first line of the range for a multi-line comment.
    * @default RIGHT
    * @enum {string|null}
    */
  var start_side: js.UndefOr[LEFT | RIGHT | Null] = js.undefined
  
  /**
    * Format: date-time
    * @example 2011-04-14T16:00:49Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/pulls/comments/1
    */
  var url: String
  
  var user: Avatarurl | Null
}
object Originalcommitid {
  
  inline def apply(
    _links: HtmlPullrequest,
    author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER,
    body: String,
    commit_id: String,
    created_at: String,
    diff_hunk: String,
    html_url: String,
    id: Double,
    node_id: String,
    original_commit_id: String,
    original_position: Double,
    path: String,
    pull_request_url: String,
    updated_at: String,
    url: String
  ): Originalcommitid = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_hunk = diff_hunk.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], original_commit_id = original_commit_id.asInstanceOf[js.Any], original_position = original_position.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], position = null, pull_request_review_id = null, user = null)
    __obj.asInstanceOf[Originalcommitid]
  }
  
  extension [Self <: Originalcommitid](x: Self) {
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    inline def setBody_htmlUndefined: Self = StObject.set(x, "body_html", js.undefined)
    
    inline def setBody_text(value: String): Self = StObject.set(x, "body_text", value.asInstanceOf[js.Any])
    
    inline def setBody_textUndefined: Self = StObject.set(x, "body_text", js.undefined)
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDiff_hunk(value: String): Self = StObject.set(x, "diff_hunk", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_id(value: Double): Self = StObject.set(x, "in_reply_to_id", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_idUndefined: Self = StObject.set(x, "in_reply_to_id", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOriginal_commit_id(value: String): Self = StObject.set(x, "original_commit_id", value.asInstanceOf[js.Any])
    
    inline def setOriginal_line(value: Double): Self = StObject.set(x, "original_line", value.asInstanceOf[js.Any])
    
    inline def setOriginal_lineUndefined: Self = StObject.set(x, "original_line", js.undefined)
    
    inline def setOriginal_position(value: Double): Self = StObject.set(x, "original_position", value.asInstanceOf[js.Any])
    
    inline def setOriginal_start_line(value: Double): Self = StObject.set(x, "original_start_line", value.asInstanceOf[js.Any])
    
    inline def setOriginal_start_lineNull: Self = StObject.set(x, "original_start_line", null)
    
    inline def setOriginal_start_lineUndefined: Self = StObject.set(x, "original_start_line", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPull_request_review_id(value: Double): Self = StObject.set(x, "pull_request_review_id", value.asInstanceOf[js.Any])
    
    inline def setPull_request_review_idNull: Self = StObject.set(x, "pull_request_review_id", null)
    
    inline def setPull_request_url(value: String): Self = StObject.set(x, "pull_request_url", value.asInstanceOf[js.Any])
    
    inline def setReactions(value: Confused): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setSide(value: LEFT | RIGHT): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
    
    inline def setStart_lineNull: Self = StObject.set(x, "start_line", null)
    
    inline def setStart_lineUndefined: Self = StObject.set(x, "start_line", js.undefined)
    
    inline def setStart_side(value: LEFT | RIGHT): Self = StObject.set(x, "start_side", value.asInstanceOf[js.Any])
    
    inline def setStart_sideNull: Self = StObject.set(x, "start_side", null)
    
    inline def setStart_sideUndefined: Self = StObject.set(x, "start_side", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def set_links(value: HtmlPullrequest): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
