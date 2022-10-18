package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilPatternCompileMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/pattern-compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def patternCompile(pattern: Unsafe): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("patternCompile")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  type Unsafe = typings.mdastUtilToMarkdown.libTypesMod.Unsafe
}
