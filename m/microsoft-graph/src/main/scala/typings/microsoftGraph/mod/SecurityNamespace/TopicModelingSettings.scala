package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicModelingSettings extends StObject {
  
  /**
    * Indicates whether the themes model should dynamically optimize the number of generated topics. To learn more, see
    * Adjust maximum number of themes dynamically.
    */
  var dynamicallyAdjustTopicCount: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates whether the themes model should exclude numbers while parsing document texts. To learn more, see Include
    * numbers in themes.
    */
  var ignoreNumbers: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether themes model is enabled for the case.
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The total number of topics that the themes model will generate for a review set. To learn more, see Maximum number of
    * themes.
    */
  var topicCount: js.UndefOr[NullableOption[Double]] = js.undefined
}
object TopicModelingSettings {
  
  inline def apply(): TopicModelingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicModelingSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicModelingSettings] (val x: Self) extends AnyVal {
    
    inline def setDynamicallyAdjustTopicCount(value: NullableOption[Boolean]): Self = StObject.set(x, "dynamicallyAdjustTopicCount", value.asInstanceOf[js.Any])
    
    inline def setDynamicallyAdjustTopicCountNull: Self = StObject.set(x, "dynamicallyAdjustTopicCount", null)
    
    inline def setDynamicallyAdjustTopicCountUndefined: Self = StObject.set(x, "dynamicallyAdjustTopicCount", js.undefined)
    
    inline def setIgnoreNumbers(value: NullableOption[Boolean]): Self = StObject.set(x, "ignoreNumbers", value.asInstanceOf[js.Any])
    
    inline def setIgnoreNumbersNull: Self = StObject.set(x, "ignoreNumbers", null)
    
    inline def setIgnoreNumbersUndefined: Self = StObject.set(x, "ignoreNumbers", js.undefined)
    
    inline def setIsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledNull: Self = StObject.set(x, "isEnabled", null)
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setTopicCount(value: NullableOption[Double]): Self = StObject.set(x, "topicCount", value.asInstanceOf[js.Any])
    
    inline def setTopicCountNull: Self = StObject.set(x, "topicCount", null)
    
    inline def setTopicCountUndefined: Self = StObject.set(x, "topicCount", js.undefined)
  }
}
