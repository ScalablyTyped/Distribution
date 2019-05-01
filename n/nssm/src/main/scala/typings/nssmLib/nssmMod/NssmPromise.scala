package typings
package nssmLib.nssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NssmPromise[T]
  extends stdLib.Promise[T] {
  @JSName("catch")
  var catch_Original: NssmCatch[T] = js.native
  @JSName("then")
  var then_Original: NssmThen[T] = js.native
  def `catch`[TResult](
    onrejected: js.Function2[
      /* reason */ stdLib.Error, 
      /* stderr */ java.lang.String, 
      TResult | js.Thenable[TResult]
    ]
  ): NssmPromise[T | TResult] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function2[
      /* reason */ stdLib.Error, 
      /* stderr */ java.lang.String, 
      TResult2 | js.Thenable[TResult2]
    ]
  ): NssmPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function2[
      /* reason */ stdLib.Error, 
      /* stderr */ java.lang.String, 
      TResult2 | js.Thenable[TResult2]
    ]
  ): NssmPromise[TResult1 | TResult2] = js.native
}

