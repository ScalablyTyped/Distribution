package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoPreventDefault extends StObject {
  
  var autoPreventDefault: js.UndefOr[Boolean] = js.undefined
  
  var interactionFrequency: js.UndefOr[Double] = js.undefined
  
  var useSystemTicker: js.UndefOr[Double] = js.undefined
}
object AutoPreventDefault {
  
  @scala.inline
  def apply(): AutoPreventDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoPreventDefault]
  }
  
  @scala.inline
  implicit class AutoPreventDefaultMutableBuilder[Self <: AutoPreventDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoPreventDefault(value: Boolean): Self = StObject.set(x, "autoPreventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPreventDefaultUndefined: Self = StObject.set(x, "autoPreventDefault", js.undefined)
    
    @scala.inline
    def setInteractionFrequency(value: Double): Self = StObject.set(x, "interactionFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionFrequencyUndefined: Self = StObject.set(x, "interactionFrequency", js.undefined)
    
    @scala.inline
    def setUseSystemTicker(value: Double): Self = StObject.set(x, "useSystemTicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSystemTickerUndefined: Self = StObject.set(x, "useSystemTicker", js.undefined)
  }
}
