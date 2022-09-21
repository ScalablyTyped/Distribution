package typings.postcssImageSetFunction

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import typings.postcssImageSetFunction.anon.Oninvalid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-image-set-function", JSImport.Default)
  @js.native
  val default: PluginCreator[Oninvalid] = js.native
  
  type _To = PluginCreator[Oninvalid]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Oninvalid] = default
}
