package typings
package mobservableLib.libTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/transform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createTransformer[A, B](transformer: mobservableLib.libTransformMod.ITransformer[A, B]): mobservableLib.libTransformMod.ITransformer[A, B] = js.native
  def createTransformer[A, B](
    transformer: mobservableLib.libTransformMod.ITransformer[A, B],
    onCleanup: js.Function2[/* resultObject */ B, /* sourceObject */ js.UndefOr[A], scala.Unit]
  ): mobservableLib.libTransformMod.ITransformer[A, B] = js.native
}

