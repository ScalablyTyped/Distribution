package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "Promise")
@js.native
class Promise[T] protected () extends js.Object {
  def this(executor: js.Function2[
      /* resolve */ js.Function1[/* value */ T | stdLib.PromiseLike[T], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.Any, scala.Unit], 
      scala.Unit
    ]) = this()
  def `then`[TResult1, TResult2](): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | stdLib.PromiseLike[TResult1]]): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | stdLib.PromiseLike[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | stdLib.PromiseLike[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | stdLib.PromiseLike[TResult2]]
  ): Promise[TResult1 | TResult2] = js.native
}

@JSImport("monaco-editor", "Promise")
@js.native
object Promise extends js.Object {
  def as(): monacoDashEditorLib.monacoDashEditorMod.Promise[scala.Null] = js.native
  def as[T](value: T): monacoDashEditorLib.monacoDashEditorMod.Promise[T] = js.native
  def as[T](value: stdLib.PromiseLike[T]): stdLib.PromiseLike[T] = js.native
  @JSName("as")
  def as_TSomePromisePromiseLikeSomePromise[T, SomePromise /* <: stdLib.PromiseLike[T] */](value: SomePromise): SomePromise = js.native
  def join[T](promises: js.Array[T | stdLib.PromiseLike[T]]): monacoDashEditorLib.monacoDashEditorMod.Promise[js.Array[T]] = js.native
  def join[T1, T2](promises: js.Tuple2[T1 | stdLib.PromiseLike[T1], T2 | stdLib.PromiseLike[T2]]): monacoDashEditorLib.monacoDashEditorMod.Promise[js.Tuple2[T1, T2]] = js.native
  def wrap[T](value: T): monacoDashEditorLib.monacoDashEditorMod.Promise[T] = js.native
  def wrap[T](value: stdLib.PromiseLike[T]): monacoDashEditorLib.monacoDashEditorMod.Promise[T] = js.native
  def wrapError[T](error: stdLib.Error): monacoDashEditorLib.monacoDashEditorMod.Promise[T] = js.native
}

