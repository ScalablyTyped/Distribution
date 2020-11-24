package typings.mobservable.mod

import typings.mobservable.transformMod.ITransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobservable", "createTransformer")
@js.native
object createTransformer extends js.Object {
  
  def apply[A, B](transformer: ITransformer[A, B]): ITransformer[A, B] = js.native
  def apply[A, B](
    transformer: ITransformer[A, B],
    onCleanup: js.Function2[/* resultObject */ B, /* sourceObject */ js.UndefOr[A], Unit]
  ): ITransformer[A, B] = js.native
}
