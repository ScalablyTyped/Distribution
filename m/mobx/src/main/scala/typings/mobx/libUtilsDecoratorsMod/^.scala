package typings.mobx.libUtilsDecoratorsMod

import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/utils/decorators", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val mobxDidRunLazyInitializersSymbol: js.Symbol = js.native
  val mobxPendingDecorators: js.Symbol = js.native
  def createPropDecorator(propertyInitiallyEnumerable: Boolean, propertyCreator: PropertyCreator): js.Function = js.native
  def initializeInstance(target: js.Any): js.Any = js.native
  def quacksLikeADecorator(args: IArguments): Boolean = js.native
}

