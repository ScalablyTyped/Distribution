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
  def off(eventName: java.lang.String, callback: js.Function1[/* params */ js.Any, scala.Unit]): java.lang.String
  def on(eventName: java.lang.String, callback: js.Function1[/* params */ js.Any, scala.Unit]): scala.Unit
  def pgettext(msgctxt: java.lang.String, msgid: java.lang.String): java.lang.String
  def setLocale(locale: java.lang.String): scala.Unit
  def setTextDomain(domain: java.lang.String): scala.Unit
  def textdomain(domain: java.lang.String): scala.Unit
  def warn(message: java.lang.String): scala.Unit
}

