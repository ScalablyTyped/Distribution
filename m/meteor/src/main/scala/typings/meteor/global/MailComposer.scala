package typings.meteor.global

import typings.meteor.MailComposerOptions
import typings.meteor.MailComposerStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MailComposer")
@js.native
open class MailComposer protected ()
  extends StObject
     with typings.meteor.MailComposer {
  def this(options: MailComposerOptions) = this()
  
  /* CompleteClass */
  override def addHeader(name: String, value: String): Unit = js.native
  
  /* CompleteClass */
  override def pipe(stream: Any): Unit = js.native
  
  /* CompleteClass */
  override def setMessageOption(from: String, to: String, body: String, html: String): Unit = js.native
  
  /* CompleteClass */
  override def streamMessage(): Unit = js.native
}
object MailComposer {
  
  inline def apply: MailComposerStatic = js.Dynamic.global.selectDynamic("MailComposer").asInstanceOf[MailComposerStatic]
}
