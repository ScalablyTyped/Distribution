package typings.multerGridfsStorage.mod

import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClient
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache extends js.Object {
  
  def clear(): Unit = js.native
  
  def connections(): Double = js.native
  
  def findUri(cacheName: String, url: String): String = js.native
  
  def get(cacheIndex: js.Object): js.Object = js.native
  
  def has(cacheIndex: js.Object): Boolean = js.native
  
  def initialize(opts: js.Object): js.Object = js.native
  
  def isOpening(cacheIndex: js.Object): Boolean = js.native
  
  def isPending(cacheIndex: js.Object): Boolean = js.native
  
  def reject(cacheIndex: js.Object, err: Error): Unit = js.native
  
  def remove(cacheIndex: js.Object): Unit = js.native
  
  def resolve(cacheIndex: js.Object, db: Db, client: MongoClient): Unit = js.native
  
  def set(cacheIndex: js.Object, value: js.Object): Unit = js.native
  
  def waitFor(cacheIndex: js.Object): js.Promise[js.Object] = js.native
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
  
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnections(value: () => Double): Self = this.set("connections", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindUri(value: (String, String) => String): Self = this.set("findUri", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: js.Object => js.Object): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: js.Object => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: js.Object => js.Object): Self = this.set("initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsOpening(value: js.Object => Boolean): Self = this.set("isOpening", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsPending(value: js.Object => Boolean): Self = this.set("isPending", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReject(value: (js.Object, Error) => Unit): Self = this.set("reject", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: js.Object => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolve(value: (js.Object, Db, MongoClient) => Unit): Self = this.set("resolve", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSet(value: (js.Object, js.Object) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWaitFor(value: js.Object => js.Promise[js.Object]): Self = this.set("waitFor", js.Any.fromFunction1(value))
  }
}
