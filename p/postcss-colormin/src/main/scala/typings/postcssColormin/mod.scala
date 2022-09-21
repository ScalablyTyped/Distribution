package typings.postcssColormin

import typings.postcss.mod.Plugin
import typings.postcssColormin.postcssColorminBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @type {import('postcss').PluginCreator<Record<string, boolean>>}
    * @param {Record<string, boolean>} config
    * @return {import('postcss').Plugin}
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  inline def apply(config: Record[String, Boolean]): Plugin = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @JSImport("postcss-colormin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-colormin", "postcss")
  @js.native
  val postcss: `true` = js.native
}
