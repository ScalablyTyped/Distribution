package typings.patchConsole

import typings.patchConsole.patchConsoleStrings.stderr
import typings.patchConsole.patchConsoleStrings.stdout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("patch-console", JSImport.Namespace)
  @js.native
  def apply(callback: Callback): Restore = js.native
  
  type Callback = js.Function2[/* stream */ stdout | stderr, /* data */ String, Unit]
  
  type Restore = js.Function0[Unit]
}
