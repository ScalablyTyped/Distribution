package typings.postcss.mod

import typings.postcss.postcssBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginCreator[PluginOptions] extends StObject {
  
  def apply(): Plugin | typings.postcss.processorMod.default = js.native
  def apply(opts: PluginOptions): Plugin | typings.postcss.processorMod.default = js.native
  
  var postcss: `true` = js.native
}
