package typings.nodeFibers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object futureMod {
  
  @JSImport("fibers/future", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Future
  @JSImport("fibers/future", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def wait_(future_list: js.Array[Future]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(future_list.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  /* static member */
  @scala.inline
  def wait_(future: Future): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(future.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def wrap(fn: js.Function): Future = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any]).asInstanceOf[Future]
  
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
