package typings.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configureMod {
  
  @JSImport("mdast-util-to-markdown/lib/configure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure(base: Context, `extension`: Options): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(base.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Context]
  
  type Context = typings.mdastUtilToMarkdown.typesMod.Context
  
  type Options = typings.mdastUtilToMarkdown.typesMod.Options
}
