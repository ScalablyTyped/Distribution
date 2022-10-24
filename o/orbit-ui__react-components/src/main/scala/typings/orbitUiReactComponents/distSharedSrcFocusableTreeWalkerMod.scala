package typings.orbitUiReactComponents

import typings.std.Element
import typings.std.HTMLElement
import typings.std.TreeWalker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcFocusableTreeWalkerMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/focusableTreeWalker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/focusableTreeWalker", "FocusableElementSelector")
  @js.native
  val FocusableElementSelector: String = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/focusableTreeWalker", "TabbableElementSelector")
  @js.native
  val TabbableElementSelector: String = js.native
  
  inline def createFocusableTreeWalker(root: HTMLElement): TreeWalker = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusableTreeWalker")(root.asInstanceOf[js.Any]).asInstanceOf[TreeWalker]
  inline def createFocusableTreeWalker(root: HTMLElement, param1: FocusableTreeWalkerOptions): TreeWalker = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusableTreeWalker")(root.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[TreeWalker]
  
  inline def walkFocusableElements(
    root: HTMLElement,
    onElement: js.Function2[/* element */ Element, /* index */ js.UndefOr[Double], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkFocusableElements")(root.asInstanceOf[js.Any], onElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait FocusableTreeWalkerOptions extends StObject {
    
    var tabbable: js.UndefOr[Boolean] = js.undefined
  }
  object FocusableTreeWalkerOptions {
    
    inline def apply(): FocusableTreeWalkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusableTreeWalkerOptions]
    }
    
    extension [Self <: FocusableTreeWalkerOptions](x: Self) {
      
      inline def setTabbable(value: Boolean): Self = StObject.set(x, "tabbable", value.asInstanceOf[js.Any])
      
      inline def setTabbableUndefined: Self = StObject.set(x, "tabbable", js.undefined)
    }
  }
}
