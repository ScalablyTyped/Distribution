package typings
package nockLib.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var back: nockLib.nockMod.nockNs.NockBack = js.native
  var emitter: nodeLib.NodeJSNs.EventEmitter = js.native
  var recorder: nockLib.nockMod.nockNs.Recorder = js.native
  def apply(basePath: java.lang.String | stdLib.RegExp | nodeLib.urlMod.Url): nockLib.nockMod.nockNs.Scope = js.native
  def apply(
    basePath: java.lang.String | stdLib.RegExp | nodeLib.urlMod.Url,
    options: nockLib.nockMod.nockNs.Options
  ): nockLib.nockMod.nockNs.Scope = js.native
  def activate(): scala.Unit = js.native
  def cleanAll(): scala.Unit = js.native
  def define(defs: js.Array[nockLib.nockMod.nockNs.NockDefinition]): js.Array[nockLib.nockMod.nockNs.Scope] = js.native
  def disableNetConnect(): scala.Unit = js.native
  def enableNetConnect(): scala.Unit = js.native
  def enableNetConnect(matcher: java.lang.String): scala.Unit = js.native
  def enableNetConnect(matcher: stdLib.RegExp): scala.Unit = js.native
  def isActive(): scala.Boolean = js.native
  def isDone(): scala.Boolean = js.native
  def load(path: java.lang.String): js.Array[nockLib.nockMod.nockNs.Scope] = js.native
  def loadDefs(path: java.lang.String): js.Array[nockLib.nockMod.nockNs.NockDefinition] = js.native
  def pendingMocks(): js.Array[java.lang.String] = js.native
  def removeInterceptor(interceptor: nockLib.nockMod.nockNs.Interceptor): scala.Boolean = js.native
  def removeInterceptor(interceptor: nockLib.nockMod.nockNs.RequestOptions): scala.Boolean = js.native
  def restore(): scala.Unit = js.native
}

