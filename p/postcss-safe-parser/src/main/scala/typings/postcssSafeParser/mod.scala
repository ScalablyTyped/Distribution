package typings.postcssSafeParser

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-safe-parser", JSImport.Namespace)
  @js.native
  val ^ : PostCssSafeParser = js.native
  
  type PostCssSafeParser = Parser
  
  type _To = PostCssSafeParser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PostCssSafeParser = ^
}
