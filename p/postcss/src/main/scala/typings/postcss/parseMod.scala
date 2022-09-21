package typings.postcss

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod extends Shortcut {
  
  @JSImport("postcss/lib/parse", JSImport.Default)
  @js.native
  val default: Parser[typings.postcss.rootMod.default | typings.postcss.documentMod.default] = js.native
  
  type _To = Parser[typings.postcss.rootMod.default | typings.postcss.documentMod.default]
  
  /* This means you don't have to write `default`, but can instead just say `parseMod.foo` */
  override def _to: Parser[typings.postcss.rootMod.default | typings.postcss.documentMod.default] = default
}
