package typings.postcss

import org.scalablytyped.runtime.Shortcut
import typings.postcss.libRootMod.default
import typings.postcss.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParseMod extends Shortcut {
  
  @JSImport("postcss/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : Parse = js.native
  
  @js.native
  trait Parse
    extends Parser[default | typings.postcss.libDocumentMod.default] {
    
    var default: Parse = js.native
  }
  
  type _To = Parse
  
  /* This means you don't have to write `^`, but can instead just say `libParseMod.foo` */
  override def _to: Parse = ^
}
