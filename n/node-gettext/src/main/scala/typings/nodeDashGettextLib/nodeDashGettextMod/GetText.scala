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
    addTranslations: js.Function3[java.lang.String, java.lang.String, js.Object, scala.Unit],
    dgettext: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    dngettext: js.Function4[java.lang.String, java.lang.String, java.lang.String, scala.Double, java.lang.String],
    dnpgettext: js.Function5[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      scala.Double, 
      java.lang.String
    ],
    dpgettext: js.Function3[java.lang.String, java.lang.String, java.lang.String, java.lang.String],
    emit: js.Function2[java.lang.String, js.Any, scala.Unit],
    getComment: js.Function3[java.lang.String, java.lang.String, java.lang.String, js.Object | scala.Boolean],
    gettext: js.Function1[java.lang.String, java.lang.String],
    ngettext: js.Function3[java.lang.String, java.lang.String, scala.Double, java.lang.String],
    npgettext: js.Function4[java.lang.String, java.lang.String, java.lang.String, scala.Double, java.lang.String],
    off_error: js.Function2[
      nodeDashGettextLib.nodeDashGettextLibStrings.error, 
      js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    on_error: js.Function2[
      nodeDashGettextLib.nodeDashGettextLibStrings.error, 
      js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    pgettext: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    setLocale: js.Function1[java.lang.String, scala.Unit],
    setTextDomain: js.Function1[java.lang.String, scala.Unit],
    textdomain: js.Function1[java.lang.String, scala.Unit],
    warn: js.Function1[java.lang.String, scala.Unit]
  ): GetText = {
    val __obj = js.Dynamic.literal(addTranslations = addTranslations, dgettext = dgettext, dngettext = dngettext, dnpgettext = dnpgettext, dpgettext = dpgettext, emit = emit, getComment = getComment, gettext = gettext, ngettext = ngettext, npgettext = npgettext, pgettext = pgettext, setLocale = setLocale, setTextDomain = setTextDomain, textdomain = textdomain, warn = warn)
    __obj.updateDynamic("off")(off_error)
    __obj.updateDynamic("on")(on_error)
    __obj.asInstanceOf[GetText]
  }
}

