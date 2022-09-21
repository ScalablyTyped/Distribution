package typings.pQueue

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @js.native
  trait Queue[Element, Options] extends StObject {
    
    def dequeue(): js.UndefOr[Element] = js.native
    
    def enqueue(run: Element): Unit = js.native
    def enqueue(run: Element, options: Partial[Options]): Unit = js.native
    
    def filter(options: Partial[Options]): js.Array[Element] = js.native
    
    var size: Double = js.native
  }
  
  type RunFunction = js.Function0[js.Promise[Any]]
}
