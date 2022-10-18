package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emotion extends StObject {
  
  var emotion: js.UndefOr[Boolean | AutoLabel] = js.undefined
  
  var reactRemoveProperties: js.UndefOr[Boolean | Properties] = js.undefined
  
  var relay: js.UndefOr[ArtifactDirectory] = js.undefined
  
  var removeConsole: js.UndefOr[Boolean | Exclude] = js.undefined
  
  var styledComponents: js.UndefOr[Boolean | CssProp] = js.undefined
}
object Emotion {
  
  inline def apply(): Emotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Emotion]
  }
  
  extension [Self <: Emotion](x: Self) {
    
    inline def setEmotion(value: Boolean | AutoLabel): Self = StObject.set(x, "emotion", value.asInstanceOf[js.Any])
    
    inline def setEmotionUndefined: Self = StObject.set(x, "emotion", js.undefined)
    
    inline def setReactRemoveProperties(value: Boolean | Properties): Self = StObject.set(x, "reactRemoveProperties", value.asInstanceOf[js.Any])
    
    inline def setReactRemovePropertiesUndefined: Self = StObject.set(x, "reactRemoveProperties", js.undefined)
    
    inline def setRelay(value: ArtifactDirectory): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
    
    inline def setRelayUndefined: Self = StObject.set(x, "relay", js.undefined)
    
    inline def setRemoveConsole(value: Boolean | Exclude): Self = StObject.set(x, "removeConsole", value.asInstanceOf[js.Any])
    
    inline def setRemoveConsoleUndefined: Self = StObject.set(x, "removeConsole", js.undefined)
    
    inline def setStyledComponents(value: Boolean | CssProp): Self = StObject.set(x, "styledComponents", value.asInstanceOf[js.Any])
    
    inline def setStyledComponentsUndefined: Self = StObject.set(x, "styledComponents", js.undefined)
  }
}
