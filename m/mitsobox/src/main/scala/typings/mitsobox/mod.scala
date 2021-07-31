package typings.mitsobox

import typings.mitsobox.mitsoboxStrings.ABORT
import typings.mitsobox.mitsoboxStrings.CANCEL
import typings.mitsobox.mitsoboxStrings.IGNORE
import typings.mitsobox.mitsoboxStrings.OK
import typings.mitsobox.mitsoboxStrings.RETRY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mitsobox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def abortRetryIgnore(title: String, message: String): js.Promise[ABORT | RETRY | IGNORE] = (^.asInstanceOf[js.Dynamic].applyDynamic("abortRetryIgnore")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ABORT | RETRY | IGNORE]]
  
  @scala.inline
  def ok(title: String, message: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def okCancel(title: String, message: String): js.Promise[OK | CANCEL] = (^.asInstanceOf[js.Dynamic].applyDynamic("okCancel")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OK | CANCEL]]
}
