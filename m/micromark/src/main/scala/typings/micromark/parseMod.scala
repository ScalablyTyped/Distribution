package typings.micromark

import typings.micromark.sharedTypesMod.ParseOptions
import typings.micromark.sharedTypesMod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("micromark/dist/parse", JSImport.Default)
  @js.native
  def default(): Parser = js.native
  @JSImport("micromark/dist/parse", JSImport.Default)
  @js.native
  def default(options: ParseOptions): Parser = js.native
}
