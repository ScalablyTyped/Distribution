package typings.n3.n3Mod

import typings.rdfDashJs.rdfDashJsMod.DataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var factory: js.UndefOr[DataFactory] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply(factory: DataFactory = null): StoreOptions = {
    val __obj = js.Dynamic.literal()
    if (factory != null) __obj.updateDynamic("factory")(factory)
    __obj.asInstanceOf[StoreOptions]
  }
}

