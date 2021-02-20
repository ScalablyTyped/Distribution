package typings.mitsobox

import typings.mitsobox.mitsoboxStrings.ABORT
import typings.mitsobox.mitsoboxStrings.CANCEL
import typings.mitsobox.mitsoboxStrings.IGNORE
import typings.mitsobox.mitsoboxStrings.OK
import typings.mitsobox.mitsoboxStrings.RETRY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mitsobox", "abortRetryIgnore")
  @js.native
  def abortRetryIgnore(title: String, message: String): js.Promise[ABORT | RETRY | IGNORE] = js.native
  
  @JSImport("mitsobox", "ok")
  @js.native
  def ok(title: String, message: String): js.Promise[Unit] = js.native
  
  @JSImport("mitsobox", "okCancel")
  @js.native
  def okCancel(title: String, message: String): js.Promise[OK | CANCEL] = js.native
}
