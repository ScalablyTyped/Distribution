package typings.mobservable.libTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/transform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createTransformer[A, B](transformer: ITransformer[A, B]): ITransformer[A, B] = js.native
  def createTransformer[A, B](
    transformer: ITransformer[A, B],
    onCleanup: js.Function2[/* resultObject */ B, /* sourceObject */ js.UndefOr[A], Unit]
  ): ITransformer[A, B] = js.native
}

