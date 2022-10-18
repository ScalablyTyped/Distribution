package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bodyversion extends StObject {
  
  var author: Avatarurl | Null
  
  /**
    * @description The main text of the comment.
    * @example I agree with this suggestion.
    */
  var body: String
  
  /** @example <p>Do you like apples?</p> */
  var body_html: String
  
  /**
    * @description The current version of the body content. If provided, this update operation will be rejected if the given version does not match the latest version on the server.
    * @example 0307116bbf7ced493b8d8a346c650b71
    */
  var body_version: String
  
  /**
    * Format: date-time
    * @example 2018-01-15T23:53:58Z
    */
  var created_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/organizations/1/team/2403582/discussions/1
    */
  var discussion_url: String
  
  /**
    * Format: uri
    * @example https://github.com/orgs/github/teams/justice-league/discussions/1/comments/1
    */
  var html_url: String
  
  /** Format: date-time */
  var last_edited_at: String | Null
  
  /** @example MDIxOlRlYW1EaXNjdXNzaW9uQ29tbWVudDE= */
  var node_id: String
  
  /**
    * @description The unique sequence number of a team discussion comment.
    * @example 42
    */
  var number: Double
  
  var reactions: js.UndefOr[`1`] = js.undefined
  
  /**
    * Format: date-time
    * @example 2018-01-15T23:53:58Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/organizations/1/team/2403582/discussions/1/comments/1
    */
  var url: String
}
object Bodyversion {
  
  inline def apply(
    body: String,
    body_html: String,
    body_version: String,
    created_at: String,
    discussion_url: String,
    html_url: String,
    node_id: String,
    number: Double,
    updated_at: String,
    url: String
  ): Bodyversion = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], body_html = body_html.asInstanceOf[js.Any], body_version = body_version.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], discussion_url = discussion_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], author = null, last_edited_at = null)
    __obj.asInstanceOf[Bodyversion]
  }
  
  extension [Self <: Bodyversion](x: Self) {
    
    inline def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    inline def setBody_version(value: String): Self = StObject.set(x, "body_version", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDiscussion_url(value: String): Self = StObject.set(x, "discussion_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setLast_edited_at(value: String): Self = StObject.set(x, "last_edited_at", value.asInstanceOf[js.Any])
    
    inline def setLast_edited_atNull: Self = StObject.set(x, "last_edited_at", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setReactions(value: `1`): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
