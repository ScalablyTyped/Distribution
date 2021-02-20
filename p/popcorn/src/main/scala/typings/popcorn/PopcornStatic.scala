package typings.popcorn

import typings.popcorn.anon.Call
import typings.popcorn.anon.ToSeconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopcornStatic extends StObject {
  
  def apply(callback: js.Function): PopcornImpl = js.native
  def apply(selector: String): PopcornImpl = js.native
  def apply(selector: String, options: js.Any): PopcornImpl = js.native
  
  def destroy(insntace: PopcornImpl): js.Any = js.native
  
  def extend(target: String, source: js.Any, rest: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, callback: js.Function): js.Any = js.native
  def forEach(`object`: js.Any, callback: js.Function, context: js.Any): js.Any = js.native
  
  def getJSONP(url: String, successCallback: js.Function): js.Any = js.native
  
  def getScript(url: String, successCallback: js.Function): js.Any = js.native
  
  def guid(prefix: String): js.Any = js.native
  
  var locale: PopcornLocale = js.native
  
  def parser(parserName: js.Any, fn: js.Any, data: js.Any): js.Any = js.native
  
  def plugin(pluginName: String, info: PopcornPlugin): js.Any = js.native
  def plugin(pluginName: String, info: PopcornPlugin, manifest: js.Any): js.Any = js.native
  @JSName("plugin")
  var plugin_Original: Call = js.native
  
  var util: ToSeconds = js.native
}
