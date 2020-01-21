package typings.mobx.internalMod

import typings.mobx.AnonConfigurable
import typings.mobx.AnonConfigurableEnumerable
import typings.mobx.decoratorsMod.BabelDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "namedActionDecorator")
@js.native
object namedActionDecorator extends js.Object {
  def apply(name: String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | AnonConfigurable | AnonConfigurableEnumerable
  ] = js.native
}

