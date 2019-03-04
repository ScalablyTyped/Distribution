package typings
package multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.MulterGridfsStorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbStorageOptions
  extends multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.MulterGfsOptions {
  var db: mongooseLib.mongooseMod.Mongoose | mongooseLib.mongooseMod.Connection | mongodbLib.mongodbMod.Db | mongodbLib.mongodbMod.MongoClient | (js.Promise[
    mongooseLib.mongooseMod.Mongoose | mongooseLib.mongooseMod.Connection | mongodbLib.mongodbMod.Db | mongodbLib.mongodbMod.MongoClient
  ])
}

object DbStorageOptions {
  @scala.inline
  def apply(
    db: mongooseLib.mongooseMod.Mongoose | mongooseLib.mongooseMod.Connection | mongodbLib.mongodbMod.Db | mongodbLib.mongodbMod.MongoClient | (js.Promise[
      mongooseLib.mongooseMod.Mongoose | mongooseLib.mongooseMod.Connection | mongodbLib.mongodbMod.Db | mongodbLib.mongodbMod.MongoClient
    ]),
    file: js.Function2[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.Global.ExpressNs.MulterNs.File, 
      _
    ] = null
  ): DbStorageOptions = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[DbStorageOptions]
  }
}

