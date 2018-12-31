package typings
package multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  def clear(): scala.Unit
  def connections(): scala.Double
  def findUri(cacheName: java.lang.String, url: java.lang.String): java.lang.String
  def get(cacheIndex: js.Object): js.Object
  def has(cacheIndex: js.Object): scala.Boolean
  def initialize(opts: js.Object): js.Object
  def isOpening(cacheIndex: js.Object): scala.Boolean
  def isPending(cacheIndex: js.Object): scala.Boolean
  def reject(cacheIndex: js.Object, err: nodeLib.Error): scala.Unit
  def remove(cacheIndex: js.Object): scala.Unit
  def resolve(cacheIndex: js.Object, db: mongodbLib.mongodbMod.Db, client: mongodbLib.mongodbMod.MongoClient): scala.Unit
  def set(cacheIndex: js.Object, value: js.Object): scala.Unit
  def waitFor(cacheIndex: js.Object): js.Promise[js.Object]
}

