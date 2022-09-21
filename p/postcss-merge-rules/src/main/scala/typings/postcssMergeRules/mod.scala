package typings.postcssMergeRules

import typings.postcss.mod.Plugin
import typings.postcssMergeRules.postcssMergeRulesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @type {import('postcss').PluginCreator<void>}
    * @return {import('postcss').Plugin}
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  
  @JSImport("postcss-merge-rules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postcss-merge-rules", "postcss")
  @js.native
  val postcss: `true` = js.native
}
