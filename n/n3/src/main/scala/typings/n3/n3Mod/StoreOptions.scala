package typings.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var factory: js.UndefOr[typings.rdfDashJs.rdfDashJsMod.DataFactory] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply(factory: typings.rdfDashJs.rdfDashJsMod.DataFactory = null): StoreOptions = {
    val __obj = js.Dynamic.literal()
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
}

