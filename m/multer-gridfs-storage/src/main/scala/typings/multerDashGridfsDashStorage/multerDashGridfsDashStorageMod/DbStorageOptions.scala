package typings.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request
import typings.mongodb.mongodbMod.Db
import typings.mongodb.mongodbMod.MongoClient
import typings.mongoose.mongooseMod.Connection
import typings.mongoose.mongooseMod.Mongoose
import typings.multerDashGridfsDashStorage.multerDashGridfsDashStorageMod.Global.ExpressNs.MulterNs.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbStorageOptions extends MulterGfsOptions {
  var db: Mongoose | Connection | Db | MongoClient | (js.Promise[Mongoose | Connection | Db | MongoClient])
}

object DbStorageOptions {
  @scala.inline
  def apply(
    db: Mongoose | Connection | Db | MongoClient | (js.Promise[Mongoose | Connection | Db | MongoClient]),
    file: (/* req */ Request, /* file */ File) => _ = null
  ): DbStorageOptions = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction2(file))
    __obj.asInstanceOf[DbStorageOptions]
  }
}

