package typings.micromark

import typings.micromark.libSharedTypesMod.ParseOptions
import typings.micromark.libSharedTypesMod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParseMod {
  
  @JSImport("micromark/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Parser]
  inline def default(options: ParseOptions): Parser = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Parser]
}
