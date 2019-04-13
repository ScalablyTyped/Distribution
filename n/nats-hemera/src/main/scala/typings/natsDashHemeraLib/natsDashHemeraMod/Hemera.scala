package typings
package natsDashHemeraLib.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hemera extends js.Object {
  @JSName("auth$")
  var auth$: js.Any = js.native
  var config: js.Any = js.native
  @JSName("context$")
  var context$: js.Any = js.native
  var decoder: CodecPipeline = js.native
  @JSName("delegate$")
  var delegate$: js.Any = js.native
  var encoder: CodecPipeline = js.native
  var errors: js.Any = js.native
  var exposition: js.Any = js.native
  var joi: JOI = js.native
  var load: js.Any = js.native
  @JSName("meta$")
  var meta$: js.Any = js.native
  var mongodb: js.Any = js.native
  @JSName("plugin$")
  var plugin$: PluginDefinition = js.native
  var plugins: Plugins = js.native
  @JSName("request$")
  var request$: Request = js.native
  var router: js.Any = js.native
  var topics: js.Any = js.native
  @JSName("trace$")
  var trace$: Trace = js.native
  var transport: js.Any = js.native
  def act(pattern: java.lang.String): js.Promise[_] = js.native
  def act(pattern: java.lang.String, handler: ActHandler): js.Promise[_] = js.native
  def act(pattern: Pattern): js.Promise[_] = js.native
  def act(pattern: Pattern, handler: ActHandler): js.Promise[_] = js.native
  def add(pattern: java.lang.String, handler: AddHandler): AddMeta = js.native
  def add(pattern: Pattern, handler: AddHandler): AddMeta = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def createError(name: java.lang.String): js.Any = js.native
  def decorate(prop: java.lang.String, value: js.Any): scala.Unit = js.native
  def expose(key: java.lang.String, `object`: js.Any): scala.Unit = js.native
  def ext(`type`: ExtensionType, handler: ExtensionHandler): scala.Unit = js.native
  def fatal(): scala.Unit = js.native
  def list(Pattern: js.Any, options: js.Any): js.Any = js.native
  def on(event: HemeraEvents, handler: js.Function0[scala.Unit]): js.Any = js.native
  def ready(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def remove(topic: java.lang.String, maxMessages: scala.Double): scala.Boolean = js.native
  def removeAll(): js.Any = js.native
  def setConfig(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOption(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def use(params: PluginDefinition): scala.Unit = js.native
  def use(params: PluginDefinition, options: js.Any): scala.Unit = js.native
}

