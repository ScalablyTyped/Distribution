package typings.migrateMongo.anon

import typings.mongodb.mod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var client: MongoClient = js.native
  var db: DbcloseMongoClientclose = js.native
}

object Client {
  @scala.inline
  def apply(client: MongoClient, db: DbcloseMongoClientclose): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
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
    def setClient(value: MongoClient): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setDb(value: DbcloseMongoClientclose): Self = this.set("db", value.asInstanceOf[js.Any])
  }
  
}

