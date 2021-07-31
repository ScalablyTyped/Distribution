package typings.nodeGettext

import typings.nodeGettext.anon.Debug
import typings.nodeGettext.nodeGettextStrings.error
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-gettext", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with GetText {
    def this(options: Debug) = this()
    
    /* CompleteClass */
    override def addTranslations(locale: String, domain: String, translations: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def dgettext(domain: String, msgid: String): String = js.native
    
    /* CompleteClass */
    override def dngettext(domain: String, msgid: String, msgidPlural: String, count: Double): String = js.native
    
    /* CompleteClass */
    override def dnpgettext(domain: String, msgctxt: String, msgid: String, msgidPlural: String, count: Double): String = js.native
    
    /* CompleteClass */
    override val domain: String = js.native
    
    /* CompleteClass */
    override def dpgettext(domain: String, msgctxt: String, msgid: String): String = js.native
    
    /* CompleteClass */
    override def emit(eventName: String, eventData: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def getComment(domain: String, msgctxt: String, msgid: String): js.Object | Boolean = js.native
    
    /* CompleteClass */
    override def gettext(msgid: String): String = js.native
    
    /* CompleteClass */
    override val locale: String = js.native
    
    /* CompleteClass */
    override def ngettext(msgid: String, msgidPlural: String, count: Double): String = js.native
    
    /* CompleteClass */
    override def npgettext(msgctxt: String, msgid: String, msgidPlural: String, count: Double): String = js.native
    
    /* CompleteClass */
    @JSName("off")
    override def off_error(eventName: error, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    /* CompleteClass */
    @JSName("on")
    override def on_error(eventName: error, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
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
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def getLanguageCode(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageCode")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait GetText extends StObject {
    
    def addTranslations(locale: String, domain: String, translations: js.Object): Unit
    
    def dgettext(domain: String, msgid: String): String
    
    def dngettext(domain: String, msgid: String, msgidPlural: String, count: Double): String
    
    def dnpgettext(domain: String, msgctxt: String, msgid: String, msgidPlural: String, count: Double): String
    
    val domain: String
    
    def dpgettext(domain: String, msgctxt: String, msgid: String): String
    
    def emit(eventName: String, eventData: js.Any): Unit
    
    def getComment(domain: String, msgctxt: String, msgid: String): js.Object | Boolean
    
    def gettext(msgid: String): String
    
    val locale: String
    
    def ngettext(msgid: String, msgidPlural: String, count: Double): String
    
    def npgettext(msgctxt: String, msgid: String, msgidPlural: String, count: Double): String
    
    @JSName("off")
    def off_error(eventName: error, callback: js.Function1[/* error */ Error, Unit]): Unit
    
    @JSName("on")
    def on_error(eventName: error, callback: js.Function1[/* error */ Error, Unit]): Unit
    
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
    implicit class GetTextMutableBuilder[Self <: GetText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddTranslations(value: (String, String, js.Object) => Unit): Self = StObject.set(x, "addTranslations", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDgettext(value: (String, String) => String): Self = StObject.set(x, "dgettext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDngettext(value: (String, String, String, Double) => String): Self = StObject.set(x, "dngettext", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDnpgettext(value: (String, String, String, String, Double) => String): Self = StObject.set(x, "dnpgettext", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpgettext(value: (String, String, String) => String): Self = StObject.set(x, "dpgettext", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEmit(value: (String, js.Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetComment(value: (String, String, String) => js.Object | Boolean): Self = StObject.set(x, "getComment", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGettext(value: String => String): Self = StObject.set(x, "gettext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNgettext(value: (String, String, Double) => String): Self = StObject.set(x, "ngettext", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNpgettext(value: (String, String, String, Double) => String): Self = StObject.set(x, "npgettext", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOff(value: (error, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (error, js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPgettext(value: (String, String) => String): Self = StObject.set(x, "pgettext", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetLocale(value: String => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTextDomain(value: String => Unit): Self = StObject.set(x, "setTextDomain", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextdomain(value: String => Unit): Self = StObject.set(x, "textdomain", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
}
