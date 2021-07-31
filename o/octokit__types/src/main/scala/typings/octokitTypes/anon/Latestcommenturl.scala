package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Latestcommenturl extends StObject {
  
  var latest_comment_url: String
  
  var title: String
  
  var `type`: String
  
  var url: String
}
object Latestcommenturl {
  
  @scala.inline
  def apply(latest_comment_url: String, title: String, `type`: String, url: String): Latestcommenturl = {
    val __obj = js.Dynamic.literal(latest_comment_url = latest_comment_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latestcommenturl]
  }
  
  @scala.inline
  implicit class LatestcommenturlMutableBuilder[Self <: Latestcommenturl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatest_comment_url(value: String): Self = StObject.set(x, "latest_comment_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
