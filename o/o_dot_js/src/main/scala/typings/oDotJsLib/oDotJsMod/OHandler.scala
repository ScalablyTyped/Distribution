package typings
package oDotJsLib.oDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OHandler[T] extends js.Object {
  var data: T = js.native
  var inlinecount: scala.Double = js.native
  def any[T](filter: java.lang.String, resource: java.lang.String): OHandler[T] = js.native
  def batch[T](resource: java.lang.String): OHandler[T] = js.native
  def beforeRouting(callback: js.Function1[/* routeParams */ js.Any, scala.Boolean]): OHandler[T] = js.native
  def config[T](): OHandler[T] = js.native
  def config[T](options: Options): OHandler[T] = js.native
  def count[T](): OHandler[T] = js.native
  def deleteRef[T](resource: java.lang.String, id: java.lang.String): OHandler[T] = js.native
  def deleteRef[T](resource: java.lang.String, id: scala.Double): OHandler[T] = js.native
  def exclude[T](column: java.lang.String, data: java.lang.String): OHandler[T] = js.native
  def expand[T](resource: java.lang.String): OHandler[T] = js.native
  def filter[T](filter: java.lang.String): OHandler[T] = js.native
  def filterByList[T](column: java.lang.String, data: java.lang.String): OHandler[T] = js.native
  def find[T](selector: java.lang.String): OHandler[T] = js.native
  def find[T](selector: scala.Double): OHandler[T] = js.native
  def first[T](): OHandler[T] = js.native
  def get[T](): qLib.qMod.Promise[OHandler[T]] = js.native
  def get[T](callback: js.Function1[/* data */ T, scala.Unit]): qLib.qMod.Promise[OHandler[T]] = js.native
  def include[T](column: java.lang.String, data: java.lang.String): OHandler[T] = js.native
  def inlineCount[T](): OHandler[T] = js.native
  def inlineCount[T](paramName: java.lang.String): OHandler[T] = js.native
  def isEndpoint(): scala.Boolean = js.native
  def loading[T](startFn: js.Function0[_ | scala.Boolean], endFn: js.Function0[_]): OHandler[T] = js.native
  def orderBy[T](column: java.lang.String): OHandler[T] = js.native
  def orderBy[T](column: java.lang.String, direction: scala.Boolean): OHandler[T] = js.native
  def orderByDesc[T](column: java.lang.String): OHandler[T] = js.native
  def patch[T](params: js.Any): OHandler[T] = js.native
  def post[T](params: js.Any): OHandler[T] = js.native
  def progress[T](callback: js.Function0[_]): OHandler[T] = js.native
  def put[T](params: js.Any): OHandler[T] = js.native
  def ref[T](resource: java.lang.String, id: java.lang.String): OHandler[T] = js.native
  def ref[T](resource: java.lang.String, id: scala.Double): OHandler[T] = js.native
  def remove[T](): OHandler[T] = js.native
  def remove[T](params: js.Any): OHandler[T] = js.native
  def removeRef[T](resource: java.lang.String, id: java.lang.String): OHandler[T] = js.native
  def removeRef[T](resource: java.lang.String, id: scala.Double): OHandler[T] = js.native
  def route[T](path: java.lang.String): OHandler[T] = js.native
  def route[T](path: java.lang.String, callback: js.Function1[/* data */ T, scala.Unit]): OHandler[T] = js.native
  def routes[T](path: java.lang.String): OHandler[T] = js.native
  def routes[T](path: java.lang.String, callback: js.Function1[/* data */ T, scala.Unit]): OHandler[T] = js.native
  def save[T](): qLib.qMod.Promise[OHandler[T]] = js.native
  def save[T](callback: js.Function1[/* data */ T, scala.Unit]): qLib.qMod.Promise[OHandler[T]] = js.native
  def search[T](columns: js.Array[java.lang.String], term: java.lang.String): OHandler[T] = js.native
  def select[T](selectStr: java.lang.String): OHandler[T] = js.native
  def skip[T](quantity: scala.Double): OHandler[T] = js.native
  def take[T](quantity: scala.Double): OHandler[T] = js.native
  def top[T](quantity: scala.Double): OHandler[T] = js.native
  def triggerRoute(hash: java.lang.String): OHandler[T] = js.native
  def where[T](filter: java.lang.String): OHandler[T] = js.native
}

