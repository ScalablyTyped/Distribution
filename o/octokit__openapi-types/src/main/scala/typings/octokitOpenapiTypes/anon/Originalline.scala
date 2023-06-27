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
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.file_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.line_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Originalline extends StObject {
  
  var _links: PullrequestSelf
  
  /**
    * AuthorAssociation
    * @description How the author is associated with the repository.
    * @enum {string}
    */
  var author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  /** @description The text of the comment. */
  var body: String
  
  /** @description The SHA of the commit to which the comment applies. */
  var commit_id: String
  
  /** Format: date-time */
  var created_at: String
  
  /** @description The diff of the line that the comment refers to. */
  var diff_hunk: String
  
  /**
    * Format: uri
    * @description HTML URL for the pull request review comment.
    */
  var html_url: String
  
  /** @description The ID of the pull request review comment. */
  var id: Double
  
  /** @description The comment ID to reply to. */
  var in_reply_to_id: js.UndefOr[Double] = js.undefined
  
  /** @description The line of the blob to which the comment applies. The last line of the range for a multi-line comment */
  var line: Double | Null
  
  /** @description The node ID of the pull request review comment. */
  var node_id: String
  
  /** @description The SHA of the original commit to which the comment applies. */
  var original_commit_id: String
  
  /** @description The line of the blob to which the comment applies. The last line of the range for a multi-line comment */
  var original_line: Double | Null
  
  /** @description The index of the original line in the diff to which the comment applies. */
  var original_position: Double
  
  /** @description The first line of the range for a multi-line comment. */
  var original_start_line: Double | Null
  
  /** @description The relative path of the file to which the comment applies. */
  var path: String
  
  /** @description The line index in the diff to which the comment applies. */
  var position: Double | Null
  
  /** @description The ID of the pull request review to which the comment belongs. */
  var pull_request_review_id: Double | Null
  
  /**
    * Format: uri
    * @description URL for the pull request that the review comment belongs to.
    */
  var pull_request_url: String
  
  /** Reactions */
  var reactions: Eyes
  
  /**
    * @description The side of the first line of the range for a multi-line comment.
    * @enum {string}
    */
  var side: LEFT | RIGHT
  
  /** @description The first line of the range for a multi-line comment. */
  var start_line: Double | Null
  
  /**
    * @description The side of the first line of the range for a multi-line comment.
    * @default RIGHT
    * @enum {string|null}
    */
  var start_side: LEFT | RIGHT | _empty | Null
  
  /**
    * @description The level at which the comment is targeted, can be a diff line or a file.
    * @enum {string}
    */
  var subject_type: js.UndefOr[line_ | file_] = js.undefined
  
  /** Format: date-time */
  var updated_at: String
  
  /**
    * Format: uri
    * @description URL for the pull request review comment
    */
  var url: String
  
  /** User */
  var user: Deleted | Null
}
object Originalline {
  
  inline def apply(
    _links: PullrequestSelf,
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
    reactions: Eyes,
    side: LEFT | RIGHT,
    updated_at: String,
    url: String
  ): Originalline = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_hunk = diff_hunk.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], original_commit_id = original_commit_id.asInstanceOf[js.Any], original_position = original_position.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], line = null, original_line = null, original_start_line = null, position = null, pull_request_review_id = null, start_line = null, start_side = null, user = null)
    __obj.asInstanceOf[Originalline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Originalline] (val x: Self) extends AnyVal {
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDiff_hunk(value: String): Self = StObject.set(x, "diff_hunk", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_id(value: Double): Self = StObject.set(x, "in_reply_to_id", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_idUndefined: Self = StObject.set(x, "in_reply_to_id", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOriginal_commit_id(value: String): Self = StObject.set(x, "original_commit_id", value.asInstanceOf[js.Any])
    
    inline def setOriginal_line(value: Double): Self = StObject.set(x, "original_line", value.asInstanceOf[js.Any])
    
    inline def setOriginal_lineNull: Self = StObject.set(x, "original_line", null)
    
    inline def setOriginal_position(value: Double): Self = StObject.set(x, "original_position", value.asInstanceOf[js.Any])
    
    inline def setOriginal_start_line(value: Double): Self = StObject.set(x, "original_start_line", value.asInstanceOf[js.Any])
    
    inline def setOriginal_start_lineNull: Self = StObject.set(x, "original_start_line", null)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPull_request_review_id(value: Double): Self = StObject.set(x, "pull_request_review_id", value.asInstanceOf[js.Any])
    
    inline def setPull_request_review_idNull: Self = StObject.set(x, "pull_request_review_id", null)
    
    inline def setPull_request_url(value: String): Self = StObject.set(x, "pull_request_url", value.asInstanceOf[js.Any])
    
    inline def setReactions(value: Eyes): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setSide(value: LEFT | RIGHT): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
    
    inline def setStart_lineNull: Self = StObject.set(x, "start_line", null)
    
    inline def setStart_side(value: LEFT | RIGHT | _empty): Self = StObject.set(x, "start_side", value.asInstanceOf[js.Any])
    
    inline def setStart_sideNull: Self = StObject.set(x, "start_side", null)
    
    inline def setSubject_type(value: line_ | file_): Self = StObject.set(x, "subject_type", value.asInstanceOf[js.Any])
    
    inline def setSubject_typeUndefined: Self = StObject.set(x, "subject_type", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Deleted): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def set_links(value: PullrequestSelf): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
