package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamworkActivityTopic extends StObject {
  
  /**
    * Type of source. Possible values are: entityUrl, text. For supported Microsoft Graph URLs, use entityUrl. For custom
    * text, use text.
    */
  var source: js.UndefOr[NullableOption[TeamworkActivityTopicSource]] = js.undefined
  
  /**
    * The topic value. If the value of the source property is entityUrl, this must be a Microsoft Graph URL. If the vaule is
    * text, this must be a plain text value.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * The link the user clicks when they select the notification. Optional when source is entityUrl; required when source is
    * text.
    */
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object TeamworkActivityTopic {
  
  inline def apply(): TeamworkActivityTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamworkActivityTopic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamworkActivityTopic] (val x: Self) extends AnyVal {
    
    inline def setSource(value: NullableOption[TeamworkActivityTopicSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
