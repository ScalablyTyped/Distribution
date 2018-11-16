package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "Promise")
@js.native
class Promise[T, TProgress] protected () extends js.Object {
  def this(executor: js.Function3[
      /* resolve */ js.Function1[/* value */ T | stdLib.PromiseLike[T], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.Any, scala.Unit], 
      /* progress */ js.Function1[/* progress */ TProgress, scala.Unit], 
      scala.Unit
    ]) = this()
  def this(executor: js.Function3[
      /* resolve */ js.Function1[/* value */ T | stdLib.PromiseLike[T], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.Any, scala.Unit], 
      /* progress */ js.Function1[/* progress */ TProgress, scala.Unit], 
      scala.Unit
    ], oncancel: js.Function0[scala.Unit]) = this()
  def cancel(): scala.Unit = js.native
  def done(): scala.Unit = js.native
  def done(onfulfilled: js.Function1[/* value */ T, scala.Unit]): scala.Unit = js.native
  def done(
    onfulfilled: js.Function1[/* value */ T, scala.Unit],
    onrejected: js.Function1[/* reason */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def done(
    onfulfilled: js.Function1[/* value */ T, scala.Unit],
    onrejected: js.Function1[/* reason */ js.Any, scala.Unit],
    onprogress: js.Function1[/* progress */ TProgress, scala.Unit]
  ): scala.Unit = js.native
  def `then`[TResult1, TResult2](): Promise[TResult1 | TResult2, TProgress] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | stdLib.PromiseLike[TResult1]]): Promise[TResult1 | TResult2, TProgress] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | stdLib.PromiseLike[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | stdLib.PromiseLike[TResult2]]
  ): Promise[TResult1 | TResult2, TProgress] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | stdLib.PromiseLike[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | stdLib.PromiseLike[TResult2]],
    onprogress: js.Function1[/* progress */ TProgress, scala.Unit]
  ): Promise[TResult1 | TResult2, TProgress] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | stdLib.PromiseLike[TResult1]],
    onrejected: scala.Null,
    onprogress: js.Function1[/* progress */ TProgress, scala.Unit]
  ): Promise[TResult1 | TResult2, TProgress] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | stdLib.PromiseLike[TResult2]]
  ): Promise[TResult1 | TResult2, TProgress] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | stdLib.PromiseLike[TResult2]],
    onprogress: js.Function1[/* progress */ TProgress, scala.Unit]
  ): Promise[TResult1 | TResult2, TProgress] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: scala.Null,
    onprogress: js.Function1[/* progress */ TProgress, scala.Unit]
  ): Promise[TResult1 | TResult2, TProgress] = js.native
}

@JSImport("monaco-editor", "Promise")
@js.native
object Promise extends js.Object {
  def any[T](promises: js.Array[T | stdLib.PromiseLike[T]]): monacoDashEditorLib.monacoDashEditorMod.Promise[monacoDashEditorLib.Anon_KeyValue[T], _] = js.native
  def as(): monacoDashEditorLib.monacoDashEditorMod.Promise[scala.Null, _] = js.native
  def as[T](value: T): monacoDashEditorLib.monacoDashEditorMod.Promise[T, _] = js.native
  def as[T](value: stdLib.PromiseLike[T]): stdLib.PromiseLike[T] = js.native
  @JSName("as")
  def as_TSomePromisePromiseLikeSomePromise[T, SomePromise /* <: stdLib.PromiseLike[T] */](value: SomePromise): SomePromise = js.native
  def is(value: js.Any): /* is PromiseLike */scala.Boolean = js.native
  def join[T](promises: js.Array[T | stdLib.PromiseLike[T]]): monacoDashEditorLib.monacoDashEditorMod.Promise[js.Array[js.Array[T]], _] = js.native
  def join[T1, T2](promises: js.Tuple2[T1 | stdLib.PromiseLike[T1], T2 | stdLib.PromiseLike[T2]]): monacoDashEditorLib.monacoDashEditorMod.Promise[js.Tuple2[T1, T2], _] = js.native
  def timeout(delay: scala.Double): monacoDashEditorLib.monacoDashEditorMod.Promise[scala.Unit, _] = js.native
  def wrap[T](value: T): monacoDashEditorLib.monacoDashEditorMod.Promise[T, _] = js.native
  def wrap[T](value: stdLib.PromiseLike[T]): monacoDashEditorLib.monacoDashEditorMod.Promise[T, _] = js.native
  def wrapError[T](error: stdLib.Error): monacoDashEditorLib.monacoDashEditorMod.Promise[T, _] = js.native
}

