package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskInfo extends StObject {
  
  /**
    * JSON defining an adaptive card.
    */
  var card: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a bot ID to send the result of the user's interaction with the task module.
    * If specified, the bot will receive a task/complete invoke event with a JSON object
    * in the event payload.
    */
  var completionBotId: js.UndefOr[String] = js.undefined
  
  /**
    * If client doesnt support the URL, the URL that needs to be opened in the browser.
    */
  var fallbackUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The requested height of the webview/iframe.
    */
  var height: js.UndefOr[TaskModuleDimension | Double] = js.undefined
  
  /**
    * Title of the task module.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The url to be rendered in the webview/iframe.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The requested width of the webview/iframe.
    */
  var width: js.UndefOr[TaskModuleDimension | Double] = js.undefined
}
object TaskInfo {
  
  inline def apply(): TaskInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskInfo]
  }
  
  extension [Self <: TaskInfo](x: Self) {
    
    inline def setCard(value: String): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setCompletionBotId(value: String): Self = StObject.set(x, "completionBotId", value.asInstanceOf[js.Any])
    
    inline def setCompletionBotIdUndefined: Self = StObject.set(x, "completionBotId", js.undefined)
    
    inline def setFallbackUrl(value: String): Self = StObject.set(x, "fallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setFallbackUrlUndefined: Self = StObject.set(x, "fallbackUrl", js.undefined)
    
    inline def setHeight(value: TaskModuleDimension | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: TaskModuleDimension | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
