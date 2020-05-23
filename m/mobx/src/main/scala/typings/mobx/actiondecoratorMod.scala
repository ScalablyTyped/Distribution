package typings.mobx

import typings.mobx.anon.Configurable
import typings.mobx.anon.Enumerable
import typings.mobx.anon.Get
import typings.mobx.anon.Set
import typings.mobx.decoratorsMod.BabelDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/actiondecorator", JSImport.Namespace)
@js.native
object actiondecoratorMod extends js.Object {
  def actionFieldDecorator(name: String): js.Function3[/* target */ js.Any, /* prop */ js.Any, /* descriptor */ js.Any, Unit] = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any): Get | Set | Null = js.native
  def boundActionDecorator(target: js.Any, propertyName: js.Any, descriptor: js.Any, applyToInstance: Boolean): Get | Set | Null = js.native
  def namedActionDecorator(name: String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | Configurable | Enumerable
  ] = js.native
}

