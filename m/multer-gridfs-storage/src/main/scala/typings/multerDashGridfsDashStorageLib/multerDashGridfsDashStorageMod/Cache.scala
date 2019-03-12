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
  def reject(cacheIndex: js.Object, err: stdLib.Error): scala.Unit
  def remove(cacheIndex: js.Object): scala.Unit
  def resolve(cacheIndex: js.Object, db: mongodbLib.mongodbMod.Db, client: mongodbLib.mongodbMod.MongoClient): scala.Unit
  def set(cacheIndex: js.Object, value: js.Object): scala.Unit
  def waitFor(cacheIndex: js.Object): js.Promise[js.Object]
}

object Cache {
  @scala.inline
  def apply(
    clear: () => scala.Unit,
    connections: () => scala.Double,
    findUri: (java.lang.String, java.lang.String) => java.lang.String,
    get: js.Object => js.Object,
    has: js.Object => scala.Boolean,
    initialize: js.Object => js.Object,
    isOpening: js.Object => scala.Boolean,
    isPending: js.Object => scala.Boolean,
    reject: (js.Object, stdLib.Error) => scala.Unit,
    remove: js.Object => scala.Unit,
    resolve: (js.Object, mongodbLib.mongodbMod.Db, mongodbLib.mongodbMod.MongoClient) => scala.Unit,
    set: (js.Object, js.Object) => scala.Unit,
    waitFor: js.Object => js.Promise[js.Object]
  ): Cache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), connections = js.Any.fromFunction0(connections), findUri = js.Any.fromFunction2(findUri), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), initialize = js.Any.fromFunction1(initialize), isOpening = js.Any.fromFunction1(isOpening), isPending = js.Any.fromFunction1(isPending), reject = js.Any.fromFunction2(reject), remove = js.Any.fromFunction1(remove), resolve = js.Any.fromFunction3(resolve), set = js.Any.fromFunction2(set), waitFor = js.Any.fromFunction1(waitFor))
  
    __obj.asInstanceOf[Cache]
  }
}

