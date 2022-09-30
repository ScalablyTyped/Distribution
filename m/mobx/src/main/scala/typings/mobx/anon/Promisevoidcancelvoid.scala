package typings.mobx.anon

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Promise<void> & {cancel (): void} */
@js.native
trait Promisevoidcancelvoid extends StObject {
  
  def cancel(): Unit = js.native
  
  /**
    * Attaches a callback for only the rejection of the Promise.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  /* standard es5 */
  def `catch`[TResult](): js.Promise[Unit | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[Unit | TResult] = js.native
  
  /**
    * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
    * resolved value cannot be modified from the callback.
    * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
    * @returns A Promise for the completion of the callback.
    */
  /* standard es2018.promise */
  def `finally`(): js.Promise[Unit] = js.native
  def `finally`(onfinally: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  /* standard es5 */
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Unit, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ Unit, TResult1 | PromiseLike[TResult1]],
    onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: String = js.native
}
