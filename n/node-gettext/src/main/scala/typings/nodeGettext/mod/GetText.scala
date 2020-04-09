package typings.nodeGettext.mod

import typings.nodeGettext.nodeGettextStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetText extends js.Object {
  def addTranslations(locale: String, domain: String, translations: js.Object): Unit
  def dgettext(domain: String, msgid: String): String
  def dngettext(domain: String, msgid: String, msgidPlural: String, count: Double): String
  def dnpgettext(domain: String, msgctxt: String, msgid: String, msgidPlural: String, count: Double): String
  def dpgettext(domain: String, msgctxt: String, msgid: String): String
  def emit(eventName: String, eventData: js.Any): Unit
  def getComment(domain: String, msgctxt: String, msgid: String): js.Object | Boolean
  def gettext(msgid: String): String
  def ngettext(msgid: String, msgidPlural: String, count: Double): String
  def npgettext(msgctxt: String, msgid: String, msgidPlural: String, count: Double): String
  @JSName("off")
  def off_error(eventName: error, callback: js.Function1[/* error */ js.Any, Unit]): Unit
  @JSName("on")
  def on_error(eventName: error, callback: js.Function1[/* error */ js.Any, Unit]): Unit
  def pgettext(msgctxt: String, msgid: String): String
  def setLocale(locale: String): Unit
  def setTextDomain(domain: String): Unit
  def textdomain(domain: String): Unit
  def warn(message: String): Unit
}

object GetText {
  @scala.inline
  def apply(
    addTranslations: (String, String, js.Object) => Unit,
    dgettext: (String, String) => String,
    dngettext: (String, String, String, Double) => String,
    dnpgettext: (String, String, String, String, Double) => String,
    dpgettext: (String, String, String) => String,
    emit: (String, js.Any) => Unit,
    getComment: (String, String, String) => js.Object | Boolean,
    gettext: String => String,
    ngettext: (String, String, Double) => String,
    npgettext: (String, String, String, Double) => String,
    off: (error, js.Function1[/* error */ js.Any, Unit]) => Unit,
    on: (error, js.Function1[/* error */ js.Any, Unit]) => Unit,
    pgettext: (String, String) => String,
    setLocale: String => Unit,
    setTextDomain: String => Unit,
    textdomain: String => Unit,
    warn: String => Unit
  ): GetText = {
    val __obj = js.Dynamic.literal(addTranslations = js.Any.fromFunction3(addTranslations), dgettext = js.Any.fromFunction2(dgettext), dngettext = js.Any.fromFunction4(dngettext), dnpgettext = js.Any.fromFunction5(dnpgettext), dpgettext = js.Any.fromFunction3(dpgettext), emit = js.Any.fromFunction2(emit), getComment = js.Any.fromFunction3(getComment), gettext = js.Any.fromFunction1(gettext), ngettext = js.Any.fromFunction3(ngettext), npgettext = js.Any.fromFunction4(npgettext), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), pgettext = js.Any.fromFunction2(pgettext), setLocale = js.Any.fromFunction1(setLocale), setTextDomain = js.Any.fromFunction1(setTextDomain), textdomain = js.Any.fromFunction1(textdomain), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[GetText]
  }
}

