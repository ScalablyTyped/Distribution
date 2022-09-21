package typings.moxyNextRouterScroll

import org.scalablytyped.runtime.Shortcut
import typings.moxyNextRouterScroll.scrollBehaviorMod.NextScrollBehaviorContext
import typings.react.mod.Context
import typings.scrollBehavior.mod.ShouldUpdateScroll
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod extends Shortcut {
  
  @JSImport("@moxy/next-router-scroll/context", JSImport.Default)
  @js.native
  val default: Context[RouterScrollContext] = js.native
  
  @js.native
  trait RouterScrollContext extends StObject {
    
    def registerElement(key: String, element: HTMLElement): Unit = js.native
    def registerElement(key: String, element: HTMLElement, shouldUpdateScroll: Null, context: NextScrollBehaviorContext): Unit = js.native
    def registerElement(key: String, element: HTMLElement, shouldUpdateScroll: Unit, context: NextScrollBehaviorContext): Unit = js.native
    def registerElement(
      key: String,
      element: HTMLElement,
      shouldUpdateScroll: ShouldUpdateScroll[NextScrollBehaviorContext]
    ): Unit = js.native
    def registerElement(
      key: String,
      element: HTMLElement,
      shouldUpdateScroll: ShouldUpdateScroll[NextScrollBehaviorContext],
      context: NextScrollBehaviorContext
    ): Unit = js.native
    
    def unregisterElement(key: String): Unit = js.native
    
    def updateScroll(): Unit = js.native
    def updateScroll(prevContext: Null, context: NextScrollBehaviorContext): Unit = js.native
    def updateScroll(prevContext: Unit, context: NextScrollBehaviorContext): Unit = js.native
    def updateScroll(prevContext: NextScrollBehaviorContext): Unit = js.native
    def updateScroll(prevContext: NextScrollBehaviorContext, context: NextScrollBehaviorContext): Unit = js.native
  }
  
  type _To = Context[RouterScrollContext]
  
  /* This means you don't have to write `default`, but can instead just say `contextMod.foo` */
  override def _to: Context[RouterScrollContext] = default
}
