package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigureMod {
  
  @JSImport("mdast-util-to-markdown/lib/configure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure(base: State, `extension`: Options): State = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(base.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[State]
  
  type Options = typings.mdastUtilToMarkdown.libTypesMod.Options
  
  type State = typings.mdastUtilToMarkdown.libTypesMod.State
}
