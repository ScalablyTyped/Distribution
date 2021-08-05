package typings.micromark

import typings.micromark.sharedTypesMod.ParseOptions
import typings.micromark.sharedTypesMod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("micromark/dist/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Parser]
  inline def default(options: ParseOptions): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]
}
