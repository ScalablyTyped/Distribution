package typings.nextReactDevOverlay

import typings.stacktraceParser.mod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseStackMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/parseStack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseStack(stack: String): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStack")(stack.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]
}
