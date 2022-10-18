package typings.mortice

import typings.mortice.anon.RequiredMorticeOptions
import typings.mortice.mod.MorticeImplementation
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBrowserMod {
  
  @JSImport("mortice/dist/src/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: RequiredMorticeOptions): MorticeImplementation | EventTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[MorticeImplementation | EventTarget]
}
