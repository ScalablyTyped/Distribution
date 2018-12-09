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
  var decoder: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.CodecPipeline = js.native
  @JSName("delegate$")
  var delegate$: js.Any = js.native
  var encoder: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.CodecPipeline = js.native
  var errors: js.Any = js.native
  var exposition: js.Any = js.native
  var joi: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.JOI = js.native
  var load: js.Any = js.native
  @JSName("meta$")
  var meta$: js.Any = js.native
  var mongodb: js.Any = js.native
  @JSName("plugin$")
  var plugin$: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.PluginDefinition = js.native
  var plugins: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.Plugins = js.native
  @JSName("request$")
  var request$: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.Request = js.native
  var router: js.Any = js.native
  var topics: js.Any = js.native
  @JSName("trace$")
  var trace$: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.Trace = js.native
  var transport: js.Any = js.native
  def act(pattern: java.lang.String): js.Promise[_] = js.native
  def act(pattern: java.lang.String, handler: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.ActHandler): js.Promise[_] = js.native
  def act(pattern: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.Pattern): js.Promise[_] = js.native
  def act(
    pattern: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.Pattern,
    handler: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.ActHandler
  ): js.Promise[_] = js.native
  def add(pattern: java.lang.String, handler: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.AddHandler): natsDashHemeraLib.natsDashHemeraMod.HemeraNs.AddMeta = js.native
  def add(
    pattern: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.Pattern,
    handler: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.AddHandler
  ): natsDashHemeraLib.natsDashHemeraMod.HemeraNs.AddMeta = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def createError(name: java.lang.String): js.Any = js.native
  def decorate(prop: java.lang.String, value: js.Any): scala.Unit = js.native
  def expose(key: java.lang.String, `object`: js.Any): scala.Unit = js.native
  def ext(
    `type`: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.ExtensionType,
    handler: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.ExtensionHandler
  ): scala.Unit = js.native
  def fatal(): scala.Unit = js.native
  def list(Pattern: js.Any, options: js.Any): js.Any = js.native
  def on(
    event: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.HemeraEvents,
    handler: js.Function0[scala.Unit]
  ): js.Any = js.native
  def ready(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def remove(topic: java.lang.String, maxMessages: scala.Double): scala.Boolean = js.native
  def removeAll(): js.Any = js.native
  def setConfig(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOption(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def use(params: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.PluginDefinition): scala.Unit = js.native
  def use(params: natsDashHemeraLib.natsDashHemeraMod.HemeraNs.PluginDefinition, options: js.Any): scala.Unit = js.native
}

