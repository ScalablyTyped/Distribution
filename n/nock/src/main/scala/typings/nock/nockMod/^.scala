package typings.nock.nockMod

import typings.node.NodeJSNs.EventEmitter
import typings.node.urlMod.Url
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var back: Back = js.native
  var emitter: EventEmitter = js.native
  var recorder: Recorder = js.native
  def apply(basePath: String | RegExp | Url): Scope = js.native
  def apply(basePath: String | RegExp | Url, options: Options): Scope = js.native
  def activate(): Unit = js.native
  def activeMocks(): js.Array[String] = js.native
  def cleanAll(): Unit = js.native
  def define(defs: js.Array[Definition]): js.Array[Scope] = js.native
  def disableNetConnect(): Unit = js.native
  def enableNetConnect(): Unit = js.native
  def enableNetConnect(matcher: String): Unit = js.native
  def enableNetConnect(matcher: RegExp): Unit = js.native
  def isActive(): Boolean = js.native
  def isDone(): Boolean = js.native
  def load(path: String): js.Array[Scope] = js.native
  def loadDefs(path: String): js.Array[Definition] = js.native
  def pendingMocks(): js.Array[String] = js.native
  def removeInterceptor(interceptor: Interceptor): Boolean = js.native
  def removeInterceptor(interceptor: ReqOptions): Boolean = js.native
  def restore(): Unit = js.native
}

