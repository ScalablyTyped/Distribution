package typings.natsDashHemera.natsDashHemeraMod

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
  def act(pattern: String): js.Promise[_] = js.native
  def act(pattern: String, handler: ActHandler): js.Promise[_] = js.native
  def act(pattern: Pattern): js.Promise[_] = js.native
  def act(pattern: Pattern, handler: ActHandler): js.Promise[_] = js.native
  def add(pattern: String, handler: AddHandler): AddMeta = js.native
  def add(pattern: Pattern, handler: AddHandler): AddMeta = js.native
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def createError(name: String): js.Any = js.native
  def decorate(prop: String, value: js.Any): Unit = js.native
  def expose(key: String, `object`: js.Any): Unit = js.native
  def ext(`type`: ExtensionType, handler: ExtensionHandler): Unit = js.native
  def fatal(): Unit = js.native
  def list(Pattern: js.Any, options: js.Any): js.Any = js.native
  def on(event: HemeraEvents, handler: js.Function0[Unit]): js.Any = js.native
  def ready(callback: js.Function0[Unit]): Unit = js.native
  def remove(topic: String, maxMessages: Double): Boolean = js.native
  def removeAll(): js.Any = js.native
  def setConfig(key: String, value: js.Any): Unit = js.native
  def setOption(key: String, value: js.Any): Unit = js.native
  def use(params: PluginDefinition): Unit = js.native
  def use(params: PluginDefinition, options: js.Any): Unit = js.native
}

