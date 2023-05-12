package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilSafeMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/safe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def safe(state: State, input: String, config: SafeConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safe")(state.asInstanceOf[js.Any], input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def safe(state: State, input: Null, config: SafeConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safe")(state.asInstanceOf[js.Any], input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def safe(state: State, input: Unit, config: SafeConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safe")(state.asInstanceOf[js.Any], input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type SafeConfig = typings.mdastUtilToMarkdown.libTypesMod.SafeConfig
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
