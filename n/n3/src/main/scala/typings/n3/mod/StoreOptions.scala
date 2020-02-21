package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var factory: js.UndefOr[typings.rdfJs.mod.DataFactory[typings.rdfJs.mod.Quad]] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply(factory: typings.rdfJs.mod.DataFactory[typings.rdfJs.mod.Quad] = null): StoreOptions = {
    val __obj = js.Dynamic.literal()
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
}

