package typings.multerGridfsStorage.mod

import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClient
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  def clear(): Unit
  def connections(): Double
  def findUri(cacheName: String, url: String): String
  def get(cacheIndex: js.Object): js.Object
  def has(cacheIndex: js.Object): Boolean
  def initialize(opts: js.Object): js.Object
  def isOpening(cacheIndex: js.Object): Boolean
  def isPending(cacheIndex: js.Object): Boolean
  def reject(cacheIndex: js.Object, err: Error): Unit
  def remove(cacheIndex: js.Object): Unit
  def resolve(cacheIndex: js.Object, db: Db, client: MongoClient): Unit
  def set(cacheIndex: js.Object, value: js.Object): Unit
  def waitFor(cacheIndex: js.Object): js.Promise[js.Object]
}

object Cache {
  @scala.inline
  def apply(
    clear: () => Unit,
    connections: () => Double,
    findUri: (String, String) => String,
    get: js.Object => js.Object,
    has: js.Object => Boolean,
    initialize: js.Object => js.Object,
    isOpening: js.Object => Boolean,
    isPending: js.Object => Boolean,
    reject: (js.Object, Error) => Unit,
    remove: js.Object => Unit,
    resolve: (js.Object, Db, MongoClient) => Unit,
    set: (js.Object, js.Object) => Unit,
    waitFor: js.Object => js.Promise[js.Object]
  ): Cache = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), connections = js.Any.fromFunction0(connections), findUri = js.Any.fromFunction2(findUri), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), initialize = js.Any.fromFunction1(initialize), isOpening = js.Any.fromFunction1(isOpening), isPending = js.Any.fromFunction1(isPending), reject = js.Any.fromFunction2(reject), remove = js.Any.fromFunction1(remove), resolve = js.Any.fromFunction3(resolve), set = js.Any.fromFunction2(set), waitFor = js.Any.fromFunction1(waitFor))
    __obj.asInstanceOf[Cache]
  }
}

