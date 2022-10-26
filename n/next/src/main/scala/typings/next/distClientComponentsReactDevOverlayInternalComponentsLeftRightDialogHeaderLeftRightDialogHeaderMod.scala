package typings.next

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalComponentsLeftRightDialogHeaderLeftRightDialogHeaderMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/components/LeftRightDialogHeader/LeftRightDialogHeader", "LeftRightDialogHeader")
  @js.native
  val LeftRightDialogHeader: FC[LeftRightDialogHeaderProps] = js.native
  
  trait LeftRightDialogHeaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var next: js.Function0[Unit] | Null
    
    var previous: js.Function0[Unit] | Null
  }
  object LeftRightDialogHeaderProps {
    
    inline def apply(): LeftRightDialogHeaderProps = {
      val __obj = js.Dynamic.literal(next = null, previous = null)
      __obj.asInstanceOf[LeftRightDialogHeaderProps]
    }
    
    extension [Self <: LeftRightDialogHeaderProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
      
      inline def setPreviousNull: Self = StObject.set(x, "previous", null)
    }
  }
}
