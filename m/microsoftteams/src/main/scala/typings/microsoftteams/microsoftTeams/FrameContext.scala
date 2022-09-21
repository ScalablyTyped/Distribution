package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameContext extends StObject {
  
  /**
    * The current URL that needs to be used in the iframe if the tab is reloaded
    */
  var contentUrl: String
  
  /**
    * The current URL that needs to be used for opening the website when the user clicks on 'Go to website'
    */
  var websiteUrl: String
}
object FrameContext {
  
  inline def apply(contentUrl: String, websiteUrl: String): FrameContext = {
    val __obj = js.Dynamic.literal(contentUrl = contentUrl.asInstanceOf[js.Any], websiteUrl = websiteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameContext]
  }
  
  extension [Self <: FrameContext](x: Self) {
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
  }
}
