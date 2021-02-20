package typings.mobservable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("mobservable/lib/transform", "createTransformer")
  @js.native
  def createTransformer[A, B](transformer: ITransformer[A, B]): ITransformer[A, B] = js.native
  @JSImport("mobservable/lib/transform", "createTransformer")
  @js.native
  def createTransformer[A, B](
    transformer: ITransformer[A, B],
    onCleanup: js.Function2[/* resultObject */ B, /* sourceObject */ js.UndefOr[A], Unit]
  ): ITransformer[A, B] = js.native
  
  type ITransformer[A, B] = js.Function1[/* object */ A, B]
}
