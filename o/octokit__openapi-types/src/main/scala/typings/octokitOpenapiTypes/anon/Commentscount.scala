package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commentscount extends StObject {
  
  var author: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  /**
    * @description The main text of the discussion.
    * @example Please suggest improvements to our workflow in comments.
    */
  var body: String
  
  /** @example <p>Hi! This is an area for us to collaborate as a team</p> */
  var body_html: String
  
  /**
    * @description The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server.
    * @example 0307116bbf7ced493b8d8a346c650b71
    */
  var body_version: String
  
  /** @example 0 */
  var comments_count: Double
  
  /**
    * Format: uri
    * @example https://api.github.com/organizations/1/team/2343027/discussions/1/comments
    */
  var comments_url: String
  
  /**
    * Format: date-time
    * @example 2018-01-25T18:56:31Z
    */
  var created_at: String
  
  /**
    * Format: uri
    * @example https://github.com/orgs/github/teams/justice-league/discussions/1
    */
  var html_url: String
  
  /** Format: date-time */
  var last_edited_at: String | Null
  
  /** @example MDE0OlRlYW1EaXNjdXNzaW9uMQ== */
  var node_id: String
  
  /**
    * @description The unique sequence number of a team discussion.
    * @example 42
    */
  var number: Double
  
  /**
    * @description Whether or not this discussion should be pinned for easy retrieval.
    * @example true
    */
  var pinned: Boolean
  
  /**
    * @description Whether or not this discussion should be restricted to team members and organization administrators.
    * @example true
    */
  var `private`: Boolean
  
  var reactions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['reaction-rollup'] */ js.Any
  ] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/organizations/1/team/2343027
    */
  var team_url: String
  
  /**
    * @description The title of the discussion.
    * @example How can we improve our workflow?
    */
  var title: String
  
  /**
    * Format: date-time
    * @example 2018-01-25T18:56:31Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/organizations/1/team/2343027/discussions/1
    */
  var url: String
}
object Commentscount {
  
  inline def apply(
    author: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    body: String,
    body_html: String,
    body_version: String,
    comments_count: Double,
    comments_url: String,
    created_at: String,
    html_url: String,
    node_id: String,
    number: Double,
    pinned: Boolean,
    `private`: Boolean,
    team_url: String,
    title: String,
    updated_at: String,
    url: String
  ): Commentscount = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], body_html = body_html.asInstanceOf[js.Any], body_version = body_version.asInstanceOf[js.Any], comments_count = comments_count.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], team_url = team_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], last_edited_at = null)
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commentscount]
  }
  
  extension [Self <: Commentscount](x: Self) {
    
    inline def setAuthor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    inline def setBody_version(value: String): Self = StObject.set(x, "body_version", value.asInstanceOf[js.Any])
    
    inline def setComments_count(value: Double): Self = StObject.set(x, "comments_count", value.asInstanceOf[js.Any])
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setLast_edited_at(value: String): Self = StObject.set(x, "last_edited_at", value.asInstanceOf[js.Any])
    
    inline def setLast_edited_atNull: Self = StObject.set(x, "last_edited_at", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setReactions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['reaction-rollup'] */ js.Any
    ): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setTeam_url(value: String): Self = StObject.set(x, "team_url", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
