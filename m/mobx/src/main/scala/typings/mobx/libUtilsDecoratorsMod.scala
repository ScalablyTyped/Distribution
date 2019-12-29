package typings.mobx

import typings.std.IArguments
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/utils/decorators", JSImport.Namespace)
@js.native
object libUtilsDecoratorsMod extends js.Object {
  val mobxDidRunLazyInitializersSymbol: js.Symbol = js.native
  val mobxPendingDecorators: js.Symbol = js.native
  def createPropDecorator(propertyInitiallyEnumerable: Boolean, propertyCreator: PropertyCreator): js.Function = js.native
  def initializeInstance(target: js.Any): js.Any = js.native
  def quacksLikeADecorator(args: IArguments): Boolean = js.native
  type BabelDescriptor = PropertyDescriptor with Anon_Initializer
  type PropertyCreator = js.Function5[
    /* instance */ js.Any, 
    /* propertyName */ PropertyKey, 
    /* descriptor */ js.UndefOr[BabelDescriptor], 
    /* decoratorTarget */ js.Any, 
    /* decoratorArgs */ js.Array[js.Any], 
    Unit
  ]
}

