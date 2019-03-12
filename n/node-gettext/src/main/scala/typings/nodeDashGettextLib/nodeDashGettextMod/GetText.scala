package typings
package nodeDashGettextLib.nodeDashGettextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetText extends js.Object {
  def addTranslations(locale: java.lang.String, domain: java.lang.String, translations: js.Object): scala.Unit
  def dgettext(domain: java.lang.String, msgid: java.lang.String): java.lang.String
  def dngettext(
    domain: java.lang.String,
    msgid: java.lang.String,
    msgidPlural: java.lang.String,
    count: scala.Double
  ): java.lang.String
  def dnpgettext(
    domain: java.lang.String,
    msgctxt: java.lang.String,
    msgid: java.lang.String,
    msgidPlural: java.lang.String,
    count: scala.Double
  ): java.lang.String
  def dpgettext(domain: java.lang.String, msgctxt: java.lang.String, msgid: java.lang.String): java.lang.String
  def emit(eventName: java.lang.String, eventData: js.Any): scala.Unit
  def getComment(domain: java.lang.String, msgctxt: java.lang.String, msgid: java.lang.String): js.Object | scala.Boolean
  def gettext(msgid: java.lang.String): java.lang.String
  def ngettext(msgid: java.lang.String, msgidPlural: java.lang.String, count: scala.Double): java.lang.String
  def npgettext(
    msgctxt: java.lang.String,
    msgid: java.lang.String,
    msgidPlural: java.lang.String,
    count: scala.Double
  ): java.lang.String
  @JSName("off")
  def off_error(
    eventName: nodeDashGettextLib.nodeDashGettextLibStrings.error,
    callback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit
  @JSName("on")
  def on_error(
    eventName: nodeDashGettextLib.nodeDashGettextLibStrings.error,
    callback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit
  def pgettext(msgctxt: java.lang.String, msgid: java.lang.String): java.lang.String
  def setLocale(locale: java.lang.String): scala.Unit
  def setTextDomain(domain: java.lang.String): scala.Unit
  def textdomain(domain: java.lang.String): scala.Unit
  def warn(message: java.lang.String): scala.Unit
}

object GetText {
  @scala.inline
  def apply(
    addTranslations: (java.lang.String, java.lang.String, js.Object) => scala.Unit,
    dgettext: (java.lang.String, java.lang.String) => java.lang.String,
    dngettext: (java.lang.String, java.lang.String, java.lang.String, scala.Double) => java.lang.String,
    dnpgettext: (java.lang.String, java.lang.String, java.lang.String, java.lang.String, scala.Double) => java.lang.String,
    dpgettext: (java.lang.String, java.lang.String, java.lang.String) => java.lang.String,
    emit: (java.lang.String, js.Any) => scala.Unit,
    getComment: (java.lang.String, java.lang.String, java.lang.String) => js.Object | scala.Boolean,
    gettext: java.lang.String => java.lang.String,
    ngettext: (java.lang.String, java.lang.String, scala.Double) => java.lang.String,
    npgettext: (java.lang.String, java.lang.String, java.lang.String, scala.Double) => java.lang.String,
    off_error: (nodeDashGettextLib.nodeDashGettextLibStrings.error, js.Function1[/* error */ java.lang.String, scala.Unit]) => scala.Unit,
    on_error: (nodeDashGettextLib.nodeDashGettextLibStrings.error, js.Function1[/* error */ java.lang.String, scala.Unit]) => scala.Unit,
    pgettext: (java.lang.String, java.lang.String) => java.lang.String,
    setLocale: java.lang.String => scala.Unit,
    setTextDomain: java.lang.String => scala.Unit,
    textdomain: java.lang.String => scala.Unit,
    warn: java.lang.String => scala.Unit
  ): GetText = {
    val __obj = js.Dynamic.literal(addTranslations = js.Any.fromFunction3(addTranslations), dgettext = js.Any.fromFunction2(dgettext), dngettext = js.Any.fromFunction4(dngettext), dnpgettext = js.Any.fromFunction5(dnpgettext), dpgettext = js.Any.fromFunction3(dpgettext), emit = js.Any.fromFunction2(emit), getComment = js.Any.fromFunction3(getComment), gettext = js.Any.fromFunction1(gettext), ngettext = js.Any.fromFunction3(ngettext), npgettext = js.Any.fromFunction4(npgettext), pgettext = js.Any.fromFunction2(pgettext), setLocale = js.Any.fromFunction1(setLocale), setTextDomain = js.Any.fromFunction1(setTextDomain), textdomain = js.Any.fromFunction1(textdomain), warn = js.Any.fromFunction1(warn))
    __obj.updateDynamic("off")(js.Any.fromFunction2(off_error))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_error))
    __obj.asInstanceOf[GetText]
  }
}

