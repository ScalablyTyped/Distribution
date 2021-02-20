package typings.nodeFibers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object futureMod {
  
  @JSImport("fibers/future", JSImport.Namespace)
  @js.native
  class ^ () extends Future
  
  /* static member */
  @JSImport("fibers/future", "wait")
  @js.native
  def wait_(future_list: js.Array[Future]): js.Any = js.native
  /* static member */
  @JSImport("fibers/future", "wait")
  @js.native
  def wait_(future: Future): js.Any = js.native
  
  /* static member */
  @JSImport("fibers/future", "wrap")
  @js.native
  def wrap(fn: js.Function): Future = js.native
  
  @js.native
  trait Future extends StObject {
    
    def detach(): Unit = js.native
    
    def get(): js.Any = js.native
    
    def isResolved(): Boolean = js.native
    
    def proxy(future: Future): Unit = js.native
    
    def proxyErrors(futureOrList: js.Any): Future = js.native
    
    def resolve(fn: js.Function): Unit = js.native
    
    def resolveSuccess(fn: js.Function): Unit = js.native
    
    def resolver(): js.Function = js.native
    
    def `return`(): Unit = js.native
    def `return`(result: js.Any): Unit = js.native
    
    def `throw`(error: js.Any): Unit = js.native
  }
}
