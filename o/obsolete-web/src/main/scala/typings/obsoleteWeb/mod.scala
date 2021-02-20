package typings.obsoleteWeb

import typings.obsoleteWeb.obsoleteWebStrings.afterbeing
import typings.obsoleteWeb.obsoleteWebStrings.beforened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("obsolete-web", JSImport.Namespace)
  @js.native
  class ^ () extends Obsolete {
    def this(options: Options) = this()
  }
  
  /* static member */
  /* Inlined std.Readonly<std.Required<obsolete-web.obsolete-web.Options>> */
  object defaultOptions {
    
    @JSImport("obsolete-web", "defaultOptions.position")
    @js.native
    val position: afterbeing | beforened = js.native
    
    @JSImport("obsolete-web", "defaultOptions.promptOnNonTargetBrowser")
    @js.native
    val promptOnNonTargetBrowser: Boolean = js.native
    
    @JSImport("obsolete-web", "defaultOptions.promptOnUnknownBrowser")
    @js.native
    val promptOnUnknownBrowser: Boolean = js.native
    
    @JSImport("obsolete-web", "defaultOptions.template")
    @js.native
    val template: String = js.native
  }
  
  @js.native
  trait Obsolete extends StObject {
    
    /**
      * Test browser compatibility.
      */
    def test(browsers: js.Array[String]): Boolean = js.native
    def test(browsers: js.Array[String], done: js.Function0[Unit]): Boolean = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * If set 'afterbegin', the template will be injected into the start of body.
      * If set 'beforeend', the template will be injected into the end of body
      * @default 'afterbegin'
      */
    var position: js.UndefOr[afterbeing | beforened] = js.native
    
    /**
      * If the current browser useragent doesn't match one of the target browsers, it's considered as unsupported.
      * Thus, the prompt will be shown.
      * @default false
      */
    var promptOnNonTargetBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * If the current browser useragent is unknown, the prompt will be shown
      * @default true
      */
    var promptOnUnknownBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * The prompt html template injected to the bottom of body. The default value is:
      * ```html
      * <div>Your browser is not supported. <button id="obsoleteClose">&times;</button></div>
      * ```
      */
    var template: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: afterbeing | beforened): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPromptOnNonTargetBrowser(value: Boolean): Self = StObject.set(x, "promptOnNonTargetBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptOnNonTargetBrowserUndefined: Self = StObject.set(x, "promptOnNonTargetBrowser", js.undefined)
      
      @scala.inline
      def setPromptOnUnknownBrowser(value: Boolean): Self = StObject.set(x, "promptOnUnknownBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptOnUnknownBrowserUndefined: Self = StObject.set(x, "promptOnUnknownBrowser", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
