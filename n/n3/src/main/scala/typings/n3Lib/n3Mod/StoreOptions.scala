package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var factory: js.UndefOr[rdfDashJsLib.rdfDashJsMod.DataFactory] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply(factory: rdfDashJsLib.rdfDashJsMod.DataFactory = null): StoreOptions = {
    val __obj = js.Dynamic.literal()
    if (factory != null) __obj.updateDynamic("factory")(factory)
    __obj.asInstanceOf[StoreOptions]
  }
}

