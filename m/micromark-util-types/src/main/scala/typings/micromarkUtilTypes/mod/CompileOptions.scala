package typings.micromarkUtilTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileOptions extends StObject {
  
  /**
    * Whether to allow (dangerous) HTML (`boolean`, default: `false`).
    *
    * The default is `false`, which still parses the HTML according to
    * `CommonMark` but shows the HTML as text instead of as elements.
    *
    * Pass `true` for trusted content to get actual HTML elements.
    */
  var allowDangerousHtml: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to allow dangerous protocols in links and images (`boolean`,
    * default: `false`).
    *
    * The default is `false`, which drops URLs in links and images that use
    * dangerous protocols.
    *
    * Pass `true` for trusted content to support all protocols.
    *
    * URLs that have no protocol (which means it’s relative to the current page,
    * such as `./some/page.html`) and URLs that have a safe protocol (for
    * images: `http`, `https`; for links: `http`, `https`, `irc`, `ircs`,
    * `mailto`, `xmpp`), are safe.
    * All other URLs are dangerous and dropped.
    */
  var allowDangerousProtocol: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Default line ending to use when compiling to HTML, for line endings not in
    * `value`.
    *
    * Generally, `micromark` copies line endings (`\r`, `\n`, `\r\n`) in the
    * markdown document over to the compiled HTML.
    * In some cases, such as `> a`, CommonMark requires that extra line endings
    * are added: `<blockquote>\n<p>a</p>\n</blockquote>`.
    *
    * To create that line ending, the document is checked for the first line
    * ending that is used.
    * If there is no line ending, `defaultLineEnding` is used.
    * If that isn’t configured, `\n` is used.
    */
  var defaultLineEnding: js.UndefOr[LineEnding | Null] = js.undefined
  
  /**
    * Array of HTML extensions (default: `[]`).
    */
  var htmlExtensions: js.UndefOr[js.Array[HtmlExtension] | Null] = js.undefined
}
object CompileOptions {
  
  inline def apply(): CompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompileOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowDangerousHtml(value: Boolean): Self = StObject.set(x, "allowDangerousHtml", value.asInstanceOf[js.Any])
    
    inline def setAllowDangerousHtmlNull: Self = StObject.set(x, "allowDangerousHtml", null)
    
    inline def setAllowDangerousHtmlUndefined: Self = StObject.set(x, "allowDangerousHtml", js.undefined)
    
    inline def setAllowDangerousProtocol(value: Boolean): Self = StObject.set(x, "allowDangerousProtocol", value.asInstanceOf[js.Any])
    
    inline def setAllowDangerousProtocolNull: Self = StObject.set(x, "allowDangerousProtocol", null)
    
    inline def setAllowDangerousProtocolUndefined: Self = StObject.set(x, "allowDangerousProtocol", js.undefined)
    
    inline def setDefaultLineEnding(value: LineEnding): Self = StObject.set(x, "defaultLineEnding", value.asInstanceOf[js.Any])
    
    inline def setDefaultLineEndingNull: Self = StObject.set(x, "defaultLineEnding", null)
    
    inline def setDefaultLineEndingUndefined: Self = StObject.set(x, "defaultLineEnding", js.undefined)
    
    inline def setHtmlExtensions(value: js.Array[HtmlExtension]): Self = StObject.set(x, "htmlExtensions", value.asInstanceOf[js.Any])
    
    inline def setHtmlExtensionsNull: Self = StObject.set(x, "htmlExtensions", null)
    
    inline def setHtmlExtensionsUndefined: Self = StObject.set(x, "htmlExtensions", js.undefined)
    
    inline def setHtmlExtensionsVarargs(value: HtmlExtension*): Self = StObject.set(x, "htmlExtensions", js.Array(value*))
  }
}
