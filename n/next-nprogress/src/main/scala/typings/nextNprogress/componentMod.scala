package typings.nextNprogress

import typings.nextNprogress.anon.PartialNProgressOptions
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("next-nprogress/component", JSImport.Default)
  @js.native
  class default ()
    extends Component[NProgressProps, js.Object, js.Any]
  
  type NProgress = Component[NProgressProps, js.Object, js.Any]
  
  trait NProgressProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[PartialNProgressOptions] = js.undefined
    
    var showAfterMs: js.UndefOr[Double] = js.undefined
    
    var spinner: js.UndefOr[Boolean] = js.undefined
  }
  object NProgressProps {
    
    inline def apply(): NProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NProgressProps]
    }
    
    extension [Self <: NProgressProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOptions(value: PartialNProgressOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setShowAfterMs(value: Double): Self = StObject.set(x, "showAfterMs", value.asInstanceOf[js.Any])
      
      inline def setShowAfterMsUndefined: Self = StObject.set(x, "showAfterMs", js.undefined)
      
      inline def setSpinner(value: Boolean): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
    }
  }
}
