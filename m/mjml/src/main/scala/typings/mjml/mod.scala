package typings.mjml

import typings.mjmlCore.mod.MJMLJsonObject
import typings.mjmlCore.mod.MJMLParseResults
import typings.mjmlCore.mod.MJMLParsingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): MJMLParseResults = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[MJMLParseResults]
  inline def apply(input: String, options: MJMLParsingOptions): MJMLParseResults = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MJMLParseResults]
  inline def apply(input: MJMLJsonObject): MJMLParseResults = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[MJMLParseResults]
  inline def apply(input: MJMLJsonObject, options: MJMLParsingOptions): MJMLParseResults = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MJMLParseResults]
  
  @JSImport("mjml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
