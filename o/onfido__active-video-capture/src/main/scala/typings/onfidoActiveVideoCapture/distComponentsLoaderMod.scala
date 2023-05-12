package typings.onfidoActiveVideoCapture

import typings.preact.mod.FunctionalComponent
import typings.preact.mod.h.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsLoaderMod {
  
  @JSImport("@onfido/active-video-capture/dist/components/Loader", "Loader")
  @js.native
  val Loader: FunctionalComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var content: js.UndefOr[Element] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
}
