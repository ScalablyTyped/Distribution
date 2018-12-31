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

