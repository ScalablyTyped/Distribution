package typings.minappEnv.DB

import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database extends js.Object {
  val Geo: typings.minappEnv.DB.Geo
  val command: DatabaseCommand
  val config: ICloudConfig
  def collection(collectionName: String): CollectionReference
  def serverDate(): ServerDate
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
}

