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

object Cache {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    connections: js.Function0[scala.Double],
    findUri: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    get: js.Function1[js.Object, js.Object],
    has: js.Function1[js.Object, scala.Boolean],
    initialize: js.Function1[js.Object, js.Object],
    isOpening: js.Function1[js.Object, scala.Boolean],
    isPending: js.Function1[js.Object, scala.Boolean],
    reject: js.Function2[js.Object, nodeLib.Error, scala.Unit],
    remove: js.Function1[js.Object, scala.Unit],
    resolve: js.Function3[js.Object, mongodbLib.mongodbMod.Db, mongodbLib.mongodbMod.MongoClient, scala.Unit],
    set: js.Function2[js.Object, js.Object, scala.Unit],
    waitFor: js.Function1[js.Object, js.Promise[js.Object]]
  ): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("connections")(connections)
    __obj.updateDynamic("findUri")(findUri)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isOpening")(isOpening)
    __obj.updateDynamic("isPending")(isPending)
    __obj.updateDynamic("reject")(reject)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("resolve")(resolve)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("waitFor")(waitFor)
    __obj.asInstanceOf[Cache]
  }
}

