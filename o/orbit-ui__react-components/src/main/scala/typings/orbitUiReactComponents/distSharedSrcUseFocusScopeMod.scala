package typings.orbitUiReactComponents

import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseFocusScopeMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusScope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusScope", "DomScope")
  @js.native
  open class DomScope protected () extends StObject {
    def this(scopeRef: RefObject[js.Array[HTMLElement]], handlersRef: RefObject[js.Array[ChangeEventHandler]]) = this()
    
    def elements: js.Array[HTMLElement] = js.native
    
    /* private */ var handlersRef: Any = js.native
    
    def isInScope(element: HTMLElement): Boolean = js.native
    
    def registerChangeHandler(handler: ChangeEventHandler): Unit = js.native
    
    def removeChangeHandler(handler: ChangeEventHandler): Unit = js.native
    
    /* private */ var scopeRef: Any = js.native
  }
  
  inline def useFocusScope(): js.Tuple2[DomScope, js.Function1[/* rootElement */ HTMLElement, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusScope")().asInstanceOf[js.Tuple2[DomScope, js.Function1[/* rootElement */ HTMLElement, Unit]]]
  
  type ChangeEventHandler = js.Function2[/* elements */ js.Array[HTMLElement], /* scope */ js.Array[HTMLElement], Unit]
}
