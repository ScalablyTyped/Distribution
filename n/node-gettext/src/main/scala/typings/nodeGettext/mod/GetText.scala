package typings.nodeGettext.mod

import typings.nodeGettext.nodeGettextStrings.error
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetText extends js.Object {
  
  def addTranslations(locale: String, domain: String, translations: js.Object): Unit = js.native
  
  def dgettext(domain: String, msgid: String): String = js.native
  
  def dngettext(domain: String, msgid: String, msgidPlural: String, count: Double): String = js.native
  
  def dnpgettext(domain: String, msgctxt: String, msgid: String, msgidPlural: String, count: Double): String = js.native
  
  val domain: String = js.native
  
  def dpgettext(domain: String, msgctxt: String, msgid: String): String = js.native
  
  def emit(eventName: String, eventData: js.Any): Unit = js.native
  
  def getComment(domain: String, msgctxt: String, msgid: String): js.Object | Boolean = js.native
  
  def gettext(msgid: String): String = js.native
  
  val locale: String = js.native
  
  def ngettext(msgid: String, msgidPlural: String, count: Double): String = js.native
  
  def npgettext(msgctxt: String, msgid: String, msgidPlural: String, count: Double): String = js.native
  
  @JSName("off")
  def off_error(eventName: error, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  @JSName("on")
  def on_error(eventName: error, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  def pgettext(msgctxt: String, msgid: String): String = js.native
  
  def setLocale(locale: String): Unit = js.native
  
  def setTextDomain(domain: String): Unit = js.native
  
  def textdomain(domain: String): Unit = js.native
  
  def warn(message: String): Unit = js.native
}
object GetText {
  
  @scala.inline
  def apply(
    addTranslations: (String, String, js.Object) => Unit,
    dgettext: (String, String) => String,
    dngettext: (String, String, String, Double) => String,
    dnpgettext: (String, String, String, String, Double) => String,
    domain: String,
    dpgettext: (String, String, String) => String,
    emit: (String, js.Any) => Unit,
    getComment: (String, String, String) => js.Object | Boolean,
    gettext: String => String,
    locale: String,
    ngettext: (String, String, Double) => String,
    npgettext: (String, String, String, Double) => String,
    off: (error, js.Function1[/* error */ Error, Unit]) => Unit,
    on: (error, js.Function1[/* error */ Error, Unit]) => Unit,
    pgettext: (String, String) => String,
    setLocale: String => Unit,
    setTextDomain: String => Unit,
    textdomain: String => Unit,
    warn: String => Unit
  ): GetText = {
    val __obj = js.Dynamic.literal(addTranslations = js.Any.fromFunction3(addTranslations), dgettext = js.Any.fromFunction2(dgettext), dngettext = js.Any.fromFunction4(dngettext), dnpgettext = js.Any.fromFunction5(dnpgettext), domain = domain.asInstanceOf[js.Any], dpgettext = js.Any.fromFunction3(dpgettext), emit = js.Any.fromFunction2(emit), getComment = js.Any.fromFunction3(getComment), gettext = js.Any.fromFunction1(gettext), locale = locale.asInstanceOf[js.Any], ngettext = js.Any.fromFunction3(ngettext), npgettext = js.Any.fromFunction4(npgettext), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), pgettext = js.Any.fromFunction2(pgettext), setLocale = js.Any.fromFunction1(setLocale), setTextDomain = js.Any.fromFunction1(setTextDomain), textdomain = js.Any.fromFunction1(textdomain), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[GetText]
  }
  
  @scala.inline
  implicit class GetTextOps[Self <: GetText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddTranslations(value: (String, String, js.Object) => Unit): Self = this.set("addTranslations", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDgettext(value: (String, String) => String): Self = this.set("dgettext", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDngettext(value: (String, String, String, Double) => String): Self = this.set("dngettext", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDnpgettext(value: (String, String, String, String, Double) => String): Self = this.set("dnpgettext", js.Any.fromFunction5(value))
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpgettext(value: (String, String, String) => String): Self = this.set("dpgettext", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEmit(value: (String, js.Any) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetComment(value: (String, String, String) => js.Object | Boolean): Self = this.set("getComment", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGettext(value: String => String): Self = this.set("gettext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgettext(value: (String, String, Double) => String): Self = this.set("ngettext", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNpgettext(value: (String, String, String, Double) => String): Self = this.set("npgettext", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOff(value: (error, js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (error, js.Function1[/* error */ Error, Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPgettext(value: (String, String) => String): Self = this.set("pgettext", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLocale(value: String => Unit): Self = this.set("setLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTextDomain(value: String => Unit): Self = this.set("setTextDomain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextdomain(value: String => Unit): Self = this.set("textdomain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: String => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
}
