package typings.mobservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/transform", JSImport.Namespace)
@js.native
object transformMod extends js.Object {
  def createTransformer[A, B](transformer: ITransformer[A, B]): ITransformer[A, B] = js.native
  def createTransformer[A, B](
    transformer: ITransformer[A, B],
    onCleanup: js.Function2[/* resultObject */ B, /* sourceObject */ js.UndefOr[A], Unit]
  ): ITransformer[A, B] = js.native
  type ITransformer[A, B] = js.Function1[/* object */ A, B]
}

