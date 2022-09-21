package typings.patchConsole

import typings.patchConsole.patchConsoleStrings.stderr
import typings.patchConsole.patchConsoleStrings.stdout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("patch-console/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(callback: Callback): Restore = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[Restore]
  
  type Callback = js.Function2[/* stream */ stdout | stderr, /* data */ String, Unit]
  
  type Restore = js.Function0[Unit]
}
