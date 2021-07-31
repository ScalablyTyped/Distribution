package typings.mpromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mpromise", JSImport.Namespace)
  @js.native
  class ^[F, R] ()
    extends StObject
       with Promise[F, R] {
    def this(fn: IResolveFunction[F, R]) = this()
  }
  @JSImport("mpromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mpromise", "FAILURE")
  @js.native
  def FAILURE: String = js.native
  @scala.inline
  def FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mpromise", "SUCCESS")
  @js.native
  def SUCCESS: String = js.native
  @scala.inline
  def SUCCESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
  
  @js.native
  trait IResolveFunction[F, R] extends StObject {
    
    def apply(err: R, arg: F): Unit = js.native
    def apply(err: R, args: F*): Unit = js.native
  }
  
  @js.native
  trait Promise[F, R] extends StObject {
    
    def chain(promise: Promise[F, R]): Promise[F, R] = js.native
    
    def end(): Unit = js.native
    
    def fulfill(args: F*): Promise[F, R] = js.native
    
    def onFulfill(callback: js.Function1[/* repeated */ F, Unit]): Promise[F, R] = js.native
    
    def onReject(callback: js.Function1[/* err */ R, Unit]): Promise[F, R] = js.native
    
    def onResolve(callback: IResolveFunction[F, R]): Promise[F, R] = js.native
    
    def reject(reason: R): Promise[F, R] = js.native
    
    def resolve(reason: R, arg: F): Promise[F, R] = js.native
    def resolve(reason: R, args: F*): Promise[F, R] = js.native
    
    def `then`[TRes](onFulfilled: js.Function1[/* repeated */ F, TRes | js.Thenable[TRes]]): Promise[TRes, R] = js.native
    def `then`[TRes](
      onFulfilled: js.Function1[/* repeated */ F, TRes | js.Thenable[TRes]],
      onRejected: js.Function1[/* err */ R, TRes | js.Thenable[TRes]]
    ): Promise[TRes, R] = js.native
  }
}
