package typings.migrateMongo

import typings.mongodb.mod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient extends js.Object {
  var client: MongoClient
  var db: DbcloseMongoClientclose
}

object AnonClient {
  @scala.inline
  def apply(client: MongoClient, db: DbcloseMongoClientclose): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
}

