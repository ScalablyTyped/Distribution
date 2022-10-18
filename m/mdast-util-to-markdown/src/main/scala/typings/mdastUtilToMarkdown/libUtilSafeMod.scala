package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.anon.SafeOptionsencodeArraystr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilSafeMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/safe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def safe(context: Context, input: String, config: SafeOptionsencodeArraystr): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safe")(context.asInstanceOf[js.Any], input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def safe(context: Context, input: Null, config: SafeOptionsencodeArraystr): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safe")(context.asInstanceOf[js.Any], input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def safe(context: Context, input: Unit, config: SafeOptionsencodeArraystr): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safe")(context.asInstanceOf[js.Any], input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Context = typings.mdastUtilToMarkdown.libTypesMod.Context
  
  type SafeOptions = typings.mdastUtilToMarkdown.libTypesMod.SafeOptions
}
