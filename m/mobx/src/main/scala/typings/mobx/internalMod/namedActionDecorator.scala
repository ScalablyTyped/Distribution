package typings.mobx.internalMod

import typings.mobx.anon.Configurable
import typings.mobx.anon.Enumerable
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
    Unit | Configurable | Enumerable
  ] = js.native
}

