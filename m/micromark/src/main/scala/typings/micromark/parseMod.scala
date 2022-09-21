package typings.micromark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("micromark/dev/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(): ParseContext = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[ParseContext]
  inline def parse(options: typings.micromarkUtilTypes.mod.ParseOptions): ParseContext = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[ParseContext]
  
  type Create = typings.micromarkUtilTypes.mod.Create
  
  type FullNormalizedExtension = typings.micromarkUtilTypes.mod.FullNormalizedExtension
  
  type InitialConstruct = typings.micromarkUtilTypes.mod.InitialConstruct
  
  type ParseContext = typings.micromarkUtilTypes.mod.ParseContext
  
  type ParseOptions = typings.micromarkUtilTypes.mod.ParseOptions
}
