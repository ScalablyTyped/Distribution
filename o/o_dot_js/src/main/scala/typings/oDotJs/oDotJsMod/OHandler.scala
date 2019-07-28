package typings.oDotJs.oDotJsMod

import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OHandler[T] extends js.Object {
  var data: T = js.native
  var inlinecount: Double = js.native
  def any[T](filter: String, resource: String): OHandler[T] = js.native
  def batch[T](resource: String): OHandler[T] = js.native
  def beforeRouting(callback: js.Function1[/* routeParams */ js.Any, Boolean]): OHandler[T] = js.native
  def config[T](): OHandler[T] = js.native
  def config[T](options: Options): OHandler[T] = js.native
  def count[T](): OHandler[T] = js.native
  def deleteRef[T](resource: String, id: String): OHandler[T] = js.native
  def deleteRef[T](resource: String, id: Double): OHandler[T] = js.native
  def exclude[T](column: String, data: String): OHandler[T] = js.native
  def expand[T](resource: String): OHandler[T] = js.native
  def filter[T](filter: String): OHandler[T] = js.native
  def filterByList[T](column: String, data: String): OHandler[T] = js.native
  def find[T](selector: String): OHandler[T] = js.native
  def find[T](selector: Double): OHandler[T] = js.native
  def first[T](): OHandler[T] = js.native
  def get[T](): Promise[OHandler[T]] = js.native
  def get[T](callback: js.Function1[/* data */ T, Unit]): Promise[OHandler[T]] = js.native
  def include[T](column: String, data: String): OHandler[T] = js.native
  def inlineCount[T](): OHandler[T] = js.native
  def inlineCount[T](paramName: String): OHandler[T] = js.native
  def isEndpoint(): Boolean = js.native
  def loading[T](startFn: js.Function0[_ | Boolean], endFn: js.Function0[_]): OHandler[T] = js.native
  def orderBy[T](column: String): OHandler[T] = js.native
  def orderBy[T](column: String, direction: Boolean): OHandler[T] = js.native
  def orderByDesc[T](column: String): OHandler[T] = js.native
  def patch[T](params: js.Any): OHandler[T] = js.native
  def post[T](params: js.Any): OHandler[T] = js.native
  def progress[T](callback: js.Function0[_]): OHandler[T] = js.native
  def put[T](params: js.Any): OHandler[T] = js.native
  def ref[T](resource: String, id: String): OHandler[T] = js.native
  def ref[T](resource: String, id: Double): OHandler[T] = js.native
  def remove[T](): OHandler[T] = js.native
  def remove[T](params: js.Any): OHandler[T] = js.native
  def removeRef[T](resource: String, id: String): OHandler[T] = js.native
  def removeRef[T](resource: String, id: Double): OHandler[T] = js.native
  def route[T](path: String): OHandler[T] = js.native
  def route[T](path: String, callback: js.Function1[/* data */ T, Unit]): OHandler[T] = js.native
  def routes[T](path: String): OHandler[T] = js.native
  def routes[T](path: String, callback: js.Function1[/* data */ T, Unit]): OHandler[T] = js.native
  def save[T](): Promise[OHandler[T]] = js.native
  def save[T](callback: js.Function1[/* data */ T, Unit]): Promise[OHandler[T]] = js.native
  def search[T](columns: js.Array[String], term: String): OHandler[T] = js.native
  def select[T](selectStr: String): OHandler[T] = js.native
  def skip[T](quantity: Double): OHandler[T] = js.native
  def take[T](quantity: Double): OHandler[T] = js.native
  def top[T](quantity: Double): OHandler[T] = js.native
  def triggerRoute(hash: String): OHandler[T] = js.native
  def where[T](filter: String): OHandler[T] = js.native
}

