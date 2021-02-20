package typings.nextReactDevOverlay

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leftRightDialogHeaderLeftRightDialogHeaderMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/LeftRightDialogHeader/LeftRightDialogHeader", "LeftRightDialogHeader")
  @js.native
  val LeftRightDialogHeader: FC[LeftRightDialogHeaderProps] = js.native
  
  @js.native
  trait LeftRightDialogHeaderProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var close: js.UndefOr[js.Function0[Unit]] = js.native
    
    var next: js.Function0[Unit] | Null = js.native
    
    var previous: js.Function0[Unit] | Null = js.native
  }
  object LeftRightDialogHeaderProps {
    
    @scala.inline
    def apply(): LeftRightDialogHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeftRightDialogHeaderProps]
    }
    
    @scala.inline
    implicit class LeftRightDialogHeaderPropsMutableBuilder[Self <: LeftRightDialogHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNextNull: Self = StObject.set(x, "next", null)
      
      @scala.inline
      def setPrevious(value: () => Unit): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreviousNull: Self = StObject.set(x, "previous", null)
    }
  }
}
