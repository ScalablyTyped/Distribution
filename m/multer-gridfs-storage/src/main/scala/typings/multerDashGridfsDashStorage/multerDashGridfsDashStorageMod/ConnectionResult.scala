package typings.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod

import typings.mongodb.mongodbMod.Db
import typings.mongodb.mongodbMod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionResult extends js.Object {
  var client: js.UndefOr[MongoClient] = js.undefined
  var db: Db
}

object ConnectionResult {
  @scala.inline
  def apply(db: Db, client: MongoClient = null): ConnectionResult = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionResult]
  }
}

