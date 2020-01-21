package typings.multerGridfsStorage.mod

import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClient
import typings.mongoose.mod.Connection_
import typings.mongoose.mod.Mongoose
import typings.multerGridfsStorage.mod._Global_.Express.Multer.File
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbStorageOptions extends MulterGfsOptions {
  var client: js.UndefOr[MongoClient | js.Promise[MongoClient]] = js.undefined
  var db: Mongoose | Connection_ | Db | (js.Promise[Mongoose | Connection_ | Db])
}

object DbStorageOptions {
  @scala.inline
  def apply(
    db: Mongoose | Connection_ | Db | (js.Promise[Mongoose | Connection_ | Db]),
    client: MongoClient | js.Promise[MongoClient] = null,
    file: (/* req */ Request, /* file */ File) => _ = null
  ): DbStorageOptions = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction2(file))
    __obj.asInstanceOf[DbStorageOptions]
  }
}

