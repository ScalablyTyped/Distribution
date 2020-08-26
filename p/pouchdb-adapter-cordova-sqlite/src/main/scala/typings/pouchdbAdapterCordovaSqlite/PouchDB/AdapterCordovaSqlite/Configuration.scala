package typings.pouchdbAdapterCordovaSqlite.PouchDB.AdapterCordovaSqlite

import typings.pouchdbAdapterCordovaSqlite.pouchdbAdapterCordovaSqliteStrings.`cordova-sqlite`
import typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_Configuration: `cordova-sqlite` = js.native
  /**
    * Version of android database to use.
    */
  var androidDatabaseImplementation: js.UndefOr[Double] = js.native
  /**
    * Location of database e.g. 'Default'. Only use 'location' or 'iosDatabaseLocation' not both.
    */
  var iosDatabaseLocation: js.UndefOr[String] = js.native
  /**
    * Location of database e.g. 'Default'.
    */
  var location: js.UndefOr[String] = js.native
}

object Configuration {
  @scala.inline
  def apply(adapter: `cordova-sqlite`): Configuration = {
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
    def setAdapter(value: `cordova-sqlite`): Self = this.set("adapter", value.asInstanceOf[js.Any])
    @scala.inline
    def setAndroidDatabaseImplementation(value: Double): Self = this.set("androidDatabaseImplementation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidDatabaseImplementation: Self = this.set("androidDatabaseImplementation", js.undefined)
    @scala.inline
    def setIosDatabaseLocation(value: String): Self = this.set("iosDatabaseLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosDatabaseLocation: Self = this.set("iosDatabaseLocation", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

