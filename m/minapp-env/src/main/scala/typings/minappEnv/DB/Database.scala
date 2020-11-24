package typings.minappEnv.DB

import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends js.Object {
  
  val Geo: typings.minappEnv.DB.Geo = js.native
  
  def collection(collectionName: String): CollectionReference = js.native
  
  val command: DatabaseCommand = js.native
  
  val config: ICloudConfig = js.native
  
  def serverDate(): ServerDate = js.native
}
object Database {
  
  @scala.inline
  def apply(
    Geo: Geo,
    collection: String => CollectionReference,
    command: DatabaseCommand,
    config: ICloudConfig,
    serverDate: () => ServerDate
  ): Database = {
    val __obj = js.Dynamic.literal(Geo = Geo.asInstanceOf[js.Any], collection = js.Any.fromFunction1(collection), command = command.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], serverDate = js.Any.fromFunction0(serverDate))
    __obj.asInstanceOf[Database]
  }
  
  @scala.inline
  implicit class DatabaseOps[Self <: Database] (val x: Self) extends AnyVal {
    
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
    def setGeo(value: Geo): Self = this.set("Geo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection(value: String => CollectionReference): Self = this.set("collection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommand(value: DatabaseCommand): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerDate(value: () => ServerDate): Self = this.set("serverDate", js.Any.fromFunction0(value))
  }
}
