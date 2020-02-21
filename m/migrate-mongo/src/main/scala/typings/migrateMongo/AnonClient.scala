package typings.migrateMongo

import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient extends js.Object {
  var client: MongoClient
  var db: Db with AnonClose
}

object AnonClient {
  @scala.inline
  def apply(client: MongoClient, db: Db with AnonClose): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClient]
  }
}

