package typings.mobservable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("mobservable/lib/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createTransformer[A, B](transformer: ITransformer[A, B]): ITransformer[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(transformer.asInstanceOf[js.Any]).asInstanceOf[ITransformer[A, B]]
  @scala.inline
  def createTransformer[A, B](
    transformer: ITransformer[A, B],
    onCleanup: js.Function2[/* resultObject */ B, /* sourceObject */ js.UndefOr[A], Unit]
  ): ITransformer[A, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(transformer.asInstanceOf[js.Any], onCleanup.asInstanceOf[js.Any])).asInstanceOf[ITransformer[A, B]]
  
  type ITransformer[A, B] = js.Function1[/* object */ A, B]
}
