package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Avatarurl
import typings.octokitTypes.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsUpdateDiscussionInOrgResponseData extends StObject {
  
  var author: Avatarurl
  
  var body: String
  
  var body_html: String
  
  var body_version: String
  
  var comments_count: Double
  
  var comments_url: String
  
  var created_at: String
  
  var html_url: String
  
  var last_edited_at: String
  
  var node_id: String
  
  var number: Double
  
  var pinned: Boolean
  
  var `private`: Boolean
  
  var reactions: `1`
  
  var team_url: String
  
  var title: String
  
  var updated_at: String
  
  var url: String
}
object TeamsUpdateDiscussionInOrgResponseData {
  
  @scala.inline
  def apply(
    author: Avatarurl,
    body: String,
    body_html: String,
    body_version: String,
    comments_count: Double,
    comments_url: String,
    created_at: String,
    html_url: String,
    last_edited_at: String,
    node_id: String,
    number: Double,
    pinned: Boolean,
    `private`: Boolean,
    reactions: `1`,
    team_url: String,
    title: String,
    updated_at: String,
    url: String
  ): TeamsUpdateDiscussionInOrgResponseData = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], body_html = body_html.asInstanceOf[js.Any], body_version = body_version.asInstanceOf[js.Any], comments_count = comments_count.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], last_edited_at = last_edited_at.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], team_url = team_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionInOrgResponseData]
  }
  
  @scala.inline
  implicit class TeamsUpdateDiscussionInOrgResponseDataMutableBuilder[Self <: TeamsUpdateDiscussionInOrgResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody_version(value: String): Self = StObject.set(x, "body_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_count(value: Double): Self = StObject.set(x, "comments_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_edited_at(value: String): Self = StObject.set(x, "last_edited_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactions(value: `1`): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_url(value: String): Self = StObject.set(x, "team_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
