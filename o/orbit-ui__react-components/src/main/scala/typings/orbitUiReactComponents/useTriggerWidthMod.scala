package typings.orbitUiReactComponents

import typings.react.mod.RefCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTriggerWidthMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/useTriggerWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTriggerWidth(): js.Tuple2[RefCallback[HTMLElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTriggerWidth")().asInstanceOf[js.Tuple2[RefCallback[HTMLElement], String]]
  inline def useTriggerWidth(hasIsDisabled: UseTriggerWidthOptions): js.Tuple2[RefCallback[HTMLElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTriggerWidth")(hasIsDisabled.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RefCallback[HTMLElement], String]]
  
  trait UseTriggerWidthOptions extends StObject {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object UseTriggerWidthOptions {
    
    inline def apply(): UseTriggerWidthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseTriggerWidthOptions]
    }
    
    extension [Self <: UseTriggerWidthOptions](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    }
  }
}
