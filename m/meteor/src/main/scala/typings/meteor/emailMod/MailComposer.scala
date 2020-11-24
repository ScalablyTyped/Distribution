package typings.meteor.emailMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailComposer extends js.Object {
  
  def addHeader(name: String, value: String): Unit = js.native
  
  def pipe(stream: js.Any): Unit = js.native
  
  def setMessageOption(from: String, to: String, body: String, html: String): Unit = js.native
  
  def streamMessage(): Unit = js.native
}
@JSImport("meteor/email", "MailComposer")
@js.native
object MailComposer extends TopLevel[MailComposerStatic]
