package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilPatternInScopeMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/pattern-in-scope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def patternInScope(stack: js.Array[String], pattern: Unsafe): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("patternInScope")(stack.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type Unsafe = typings.mdastUtilToMarkdown.libTypesMod.Unsafe
}
