package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.OnKeyDownUndefined
import typings.orbitUiReactComponents.anon.`1`
import typings.orbitUiReactComponents.distSharedMod.DomScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcUseRestoreFocusMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/useRestoreFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRestoreFocus(scope: DomScope): OnKeyDownUndefined | `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("useRestoreFocus")(scope.asInstanceOf[js.Any]).asInstanceOf[OnKeyDownUndefined | `1`]
  inline def useRestoreFocus(scope: DomScope, param1: UseRestoreFocusOptions): OnKeyDownUndefined | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("useRestoreFocus")(scope.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[OnKeyDownUndefined | `1`]
  
  trait UseRestoreFocusOptions extends StObject {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object UseRestoreFocusOptions {
    
    inline def apply(): UseRestoreFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseRestoreFocusOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseRestoreFocusOptions] (val x: Self) extends AnyVal {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    }
  }
}
