package typings
package popcornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopcornStatic extends js.Object {
  var locale: PopcornLocale = js.native
  @JSName("plugin")
  var plugin_Original: Anon_Debug = js.native
  var util: Anon_Fps = js.native
  def apply(callback: js.Function): PopcornImpl = js.native
  def apply(selector: java.lang.String): PopcornImpl = js.native
  def apply(selector: java.lang.String, options: js.Any): PopcornImpl = js.native
  def destroy(insntace: PopcornImpl): js.Any = js.native
  def extend(target: java.lang.String, source: js.Any, rest: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, callback: js.Function): js.Any = js.native
  def forEach(`object`: js.Any, callback: js.Function, context: js.Any): js.Any = js.native
  def getJSONP(url: java.lang.String, successCallback: js.Function): js.Any = js.native
  def getScript(url: java.lang.String, successCallback: js.Function): js.Any = js.native
  def guid(prefix: java.lang.String): js.Any = js.native
  def parser(parserName: js.Any, fn: js.Any, data: js.Any): js.Any = js.native
  def plugin(pluginName: java.lang.String, info: PopcornPlugin): js.Any = js.native
  def plugin(pluginName: java.lang.String, info: PopcornPlugin, manifest: js.Any): js.Any = js.native
}

