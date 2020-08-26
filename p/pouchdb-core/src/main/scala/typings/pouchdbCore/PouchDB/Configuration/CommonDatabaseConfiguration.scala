package typings.pouchdbCore.PouchDB.Configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonDatabaseConfiguration extends js.Object {
  /**
    * Database adapter to use.
    *
    * If unspecified, PouchDB will infer this automatically, preferring
    * IndexedDB to WebSQL in browsers that support both (i.e. Chrome,
    * Opera and Android 4.4+).
    */
  var adapter: js.UndefOr[String] = js.native
  /**
    * Database name.
    */
  var name: js.UndefOr[String] = js.native
}

object CommonDatabaseConfiguration {
  @scala.inline
  def apply(): CommonDatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonDatabaseConfiguration]
  }
  @scala.inline
  implicit class CommonDatabaseConfigurationOps[Self <: CommonDatabaseConfiguration] (val x: Self) extends AnyVal {
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
    def setAdapter(value: String): Self = this.set("adapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

