package typings.postcssColorFunctionalNotation

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import typings.postcssColorFunctionalNotation.anon.Preserve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /** Transform lab() and lch() functions in CSS. */
  @JSImport("postcss-color-functional-notation", JSImport.Default)
  @js.native
  val default: PluginCreator[Preserve] = js.native
  
  type _To = PluginCreator[Preserve]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Preserve] = default
}
