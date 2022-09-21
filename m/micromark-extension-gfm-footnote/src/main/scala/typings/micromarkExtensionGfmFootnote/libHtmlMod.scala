package typings.micromarkExtensionGfmFootnote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHtmlMod {
  
  @JSImport("micromark-extension-gfm-footnote/lib/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gfmFootnoteHtml(): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnoteHtml")().asInstanceOf[HtmlExtension]
  inline def gfmFootnoteHtml(options: Options): HtmlExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmFootnoteHtml")(options.asInstanceOf[js.Any]).asInstanceOf[HtmlExtension]
  
  type CompileContext = typings.micromarkUtilTypes.mod.CompileContext
  
  type HtmlExtension = typings.micromarkUtilTypes.mod.HtmlExtension
  
  trait Options extends StObject {
    
    /**
      * Label to use from backreferences back to their footnote call.
      * Affects screen reader users.
      * Change it if you’re authoring in a different language.
      */
    var backLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Prefix to use before the `id` attribute to prevent it from *clobbering*.
      * attributes.
      * DOM clobbering is this:
      *
      * ```html
      * <p id=x></p>
      * <script>alert(x)</script>
      * ```
      *
      * Elements by their ID are made available in browsers on the `window` object.
      * Using a prefix prevents this from being a problem.
      */
    var clobberPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Label to use for the footnotes section.
      * Affects screen reader users.
      * Change it if you’re authoring in a different language.
      */
    var label: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBackLabel(value: String): Self = StObject.set(x, "backLabel", value.asInstanceOf[js.Any])
      
      inline def setBackLabelUndefined: Self = StObject.set(x, "backLabel", js.undefined)
      
      inline def setClobberPrefix(value: String): Self = StObject.set(x, "clobberPrefix", value.asInstanceOf[js.Any])
      
      inline def setClobberPrefixUndefined: Self = StObject.set(x, "clobberPrefix", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
