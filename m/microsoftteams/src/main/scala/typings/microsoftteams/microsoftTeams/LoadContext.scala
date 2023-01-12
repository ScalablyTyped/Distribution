package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs.
  */
trait LoadContext extends StObject {
  
  /**
    * The content URL that is requested to be loaded
    */
  var contentUrl: String
  
  /**
    * The enitity that is requested to be loaded
    */
  var entityId: String
}
object LoadContext {
  
  inline def apply(contentUrl: String, entityId: String): LoadContext = {
    val __obj = js.Dynamic.literal(contentUrl = contentUrl.asInstanceOf[js.Any], entityId = entityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadContext] (val x: Self) extends AnyVal {
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
  }
}
