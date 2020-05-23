package typings.migrateMongo.anon

import typings.mongodb.mod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var client: MongoClient
  var db: DbcloseMongoClientclose
}

object Client {
  @scala.inline
  def apply(client: MongoClient, db: DbcloseMongoClientclose): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

