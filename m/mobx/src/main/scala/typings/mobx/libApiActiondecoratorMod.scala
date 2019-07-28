package typings.mobx

import typings.mobx.libUtilsDecoratorsMod.BabelDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/actiondecorator", JSImport.Namespace)
@js.native
object libApiActiondecoratorMod extends js.Object {
  def actionFieldDecorator(name: String): js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, Unit] = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any): Anon_ConfigurableEnumerableGet | Anon_ConfigurableEnumerableGetSet | Null = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any, applyToInstance: Boolean): Anon_ConfigurableEnumerableGet | Anon_ConfigurableEnumerableGetSet | Null = js.native
  def namedActionDecorator(name: String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | Anon_Configurable | Anon_ConfigurableEnumerable
  ] = js.native
}

