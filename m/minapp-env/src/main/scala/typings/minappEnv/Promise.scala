package typings.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the completion of an asynchronous operation
  */
@js.native
trait Promise[T] extends StObject {
  
  /**
    * Attaches a callback for only the rejection of the Promise.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  def `catch`[TResult](): Promise[T | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | PromiseLike[TResult]]): Promise[T | TResult] = js.native
  
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`[TResult1, TResult2](): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | PromiseLike[TResult1]]): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | PromiseLike[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | PromiseLike[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | PromiseLike[TResult2]]): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ js.Any, TResult2 | PromiseLike[TResult2]]): Promise[TResult1 | TResult2] = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typings.minappEnv.minappEnvStrings.Promise = js.native
}
