package typings.nodeDashGettext.nodeDashGettextMod

import typings.nodeDashGettext.Anon_Debug
import typings.nodeDashGettext.nodeDashGettextStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-gettext", JSImport.Namespace)
@js.native
class ^ () extends GetText {
  def this(options: Anon_Debug) = this()
  /* CompleteClass */
  override def addTranslations(locale: String, domain: String, translations: js.Object): Unit = js.native
  /* CompleteClass */
  override def dgettext(domain: String, msgid: String): String = js.native
  /* CompleteClass */
  override def dngettext(domain: String, msgid: String, msgidPlural: String, count: Double): String = js.native
  /* CompleteClass */
  override def dnpgettext(domain: String, msgctxt: String, msgid: String, msgidPlural: String, count: Double): String = js.native
  /* CompleteClass */
  override def dpgettext(domain: String, msgctxt: String, msgid: String): String = js.native
  /* CompleteClass */
  override def emit(eventName: String, eventData: js.Any): Unit = js.native
  /* CompleteClass */
  override def getComment(domain: String, msgctxt: String, msgid: String): js.Object | Boolean = js.native
  /* CompleteClass */
  override def gettext(msgid: String): String = js.native
  /* CompleteClass */
  override def ngettext(msgid: String, msgidPlural: String, count: Double): String = js.native
  /* CompleteClass */
  override def npgettext(msgctxt: String, msgid: String, msgidPlural: String, count: Double): String = js.native
  /* CompleteClass */
  @JSName("off")
  override def off_error(eventName: error, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  /* CompleteClass */
  @JSName("on")
  override def on_error(eventName: error, callback: js.Function1[/* error */ String, Unit]): Unit = js.native
  /* CompleteClass */
  override def pgettext(msgctxt: String, msgid: String): String = js.native
  /* CompleteClass */
  override def setLocale(locale: String): Unit = js.native
  /* CompleteClass */
  override def setTextDomain(domain: String): Unit = js.native
  /* CompleteClass */
  override def textdomain(domain: String): Unit = js.native
  /* CompleteClass */
  override def warn(message: String): Unit = js.native
}

@JSImport("node-gettext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getLanguageCode(locale: String): String = js.native
}

