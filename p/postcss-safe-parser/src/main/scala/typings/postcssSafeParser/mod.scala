package typings.postcssSafeParser

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Parser
import typings.postcss.mod.Root_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-safe-parser", JSImport.Namespace)
  @js.native
  val ^ : PostCssSafeParser = js.native
  
  type PostCssSafeParser = Parser[Root_]
  
  type _To = PostCssSafeParser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PostCssSafeParser = ^
}
