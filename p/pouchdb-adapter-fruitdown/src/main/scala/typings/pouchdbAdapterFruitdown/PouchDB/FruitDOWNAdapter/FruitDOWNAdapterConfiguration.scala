package typings.pouchdbAdapterFruitdown.PouchDB.FruitDOWNAdapter

import typings.pouchdbAdapterFruitdown.pouchdbAdapterFruitdownStrings.fruitdown
import typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FruitDOWNAdapterConfiguration extends LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_FruitDOWNAdapterConfiguration: fruitdown = js.native
}

object FruitDOWNAdapterConfiguration {
  @scala.inline
  def apply(adapter: fruitdown): FruitDOWNAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FruitDOWNAdapterConfiguration]
  }
  @scala.inline
  implicit class FruitDOWNAdapterConfigurationOps[Self <: FruitDOWNAdapterConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdapter(value: fruitdown): Self = this.set("adapter", value.asInstanceOf[js.Any])
  }
  
}

