package typings.pouchdbAdapterWebsql.PouchDB.AdapterWebSql

import typings.pouchdbAdapterWebsql.pouchdbAdapterWebsqlStrings.websql
import typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_Configuration: websql = js.native
}

object Configuration {
  @scala.inline
  def apply(adapter: websql): Configuration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
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
    def setAdapter(value: websql): Self = this.set("adapter", value.asInstanceOf[js.Any])
  }
  
}

