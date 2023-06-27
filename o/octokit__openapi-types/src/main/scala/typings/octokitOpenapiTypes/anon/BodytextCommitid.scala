package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodytextCommitid extends StObject {
  
  var _links: Pullrequest
  
  var author_association: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['author-association'] */ js.Any
  
  /**
    * @description The text of the review.
    * @example This looks great.
    */
  var body: String
  
  var body_html: js.UndefOr[String] = js.undefined
  
  var body_text: js.UndefOr[String] = js.undefined
  
  /**
    * @description A commit SHA for the review. If the commit object was garbage collected or forcibly deleted, then it no longer exists in Git and this value will be `null`.
    * @example 54bb654c9e6025347f57900a4a5c2313a96b8035
    */
  var commit_id: String | Null
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/pull/12#pullrequestreview-80
    */
  var html_url: String
  
  /**
    * @description Unique identifier of the review
    * @example 42
    */
  var id: Double
  
  /** @example MDE3OlB1bGxSZXF1ZXN0UmV2aWV3ODA= */
  var node_id: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/pulls/12
    */
  var pull_request_url: String
  
  /** @example CHANGES_REQUESTED */
  var state: String
  
  /** Format: date-time */
  var submitted_at: js.UndefOr[String] = js.undefined
  
  var user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
}
object BodytextCommitid {
  
  inline def apply(
    _links: Pullrequest,
    author_association: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['author-association'] */ js.Any,
    body: String,
    html_url: String,
    id: Double,
    node_id: String,
    pull_request_url: String,
    state: String,
    user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  ): BodytextCommitid = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], commit_id = null)
    __obj.asInstanceOf[BodytextCommitid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodytextCommitid] (val x: Self) extends AnyVal {
    
    inline def setAuthor_association(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['author-association'] */ js.Any
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    inline def setBody_htmlUndefined: Self = StObject.set(x, "body_html", js.undefined)
    
    inline def setBody_text(value: String): Self = StObject.set(x, "body_text", value.asInstanceOf[js.Any])
    
    inline def setBody_textUndefined: Self = StObject.set(x, "body_text", js.undefined)
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setCommit_idNull: Self = StObject.set(x, "commit_id", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPull_request_url(value: String): Self = StObject.set(x, "pull_request_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSubmitted_at(value: String): Self = StObject.set(x, "submitted_at", value.asInstanceOf[js.Any])
    
    inline def setSubmitted_atUndefined: Self = StObject.set(x, "submitted_at", js.undefined)
    
    inline def setUser(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Pullrequest): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
