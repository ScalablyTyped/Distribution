package typings
package nockLib.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var back: NockBack = js.native
  var emitter: nodeLib.NodeJSNs.EventEmitter = js.native
  var recorder: Recorder = js.native
  def apply(basePath: java.lang.String | stdLib.RegExp | nodeLib.urlMod.Url): Scope = js.native
  def apply(basePath: java.lang.String | stdLib.RegExp | nodeLib.urlMod.Url, options: Options): Scope = js.native
  def activate(): scala.Unit = js.native
  def activeMocks(): js.Array[java.lang.String] = js.native
  def cleanAll(): scala.Unit = js.native
  def define(defs: js.Array[NockDefinition]): js.Array[Scope] = js.native
  def disableNetConnect(): scala.Unit = js.native
  def enableNetConnect(): scala.Unit = js.native
  def enableNetConnect(matcher: java.lang.String): scala.Unit = js.native
  def enableNetConnect(matcher: stdLib.RegExp): scala.Unit = js.native
  def isActive(): scala.Boolean = js.native
  def isDone(): scala.Boolean = js.native
  def load(path: java.lang.String): js.Array[Scope] = js.native
  def loadDefs(path: java.lang.String): js.Array[NockDefinition] = js.native
  def pendingMocks(): js.Array[java.lang.String] = js.native
  def removeInterceptor(interceptor: Interceptor): scala.Boolean = js.native
  def removeInterceptor(interceptor: RequestOptions): scala.Boolean = js.native
  def restore(): scala.Unit = js.native
}

