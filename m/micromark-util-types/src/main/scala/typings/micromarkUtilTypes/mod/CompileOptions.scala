package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.micromarkUtilTypesStrings.Carriagereturn
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.CarriagereturnLinefeed
import typings.micromarkUtilTypes.micromarkUtilTypesStrings.Linefeed
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileOptions extends StObject {
  
  /**
    * Whether to allow embedded HTML (`boolean`, default: `false`).
    */
  var allowDangerousHtml: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to allow potentially dangerous protocols in links and images
    * (`boolean`, default: `false`).
    * URLs relative to the current protocol are always allowed (such as,
    * `image.jpg`).
    * For links, the allowed protocols are `http`, `https`, `irc`, `ircs`,
    * `mailto`, and `xmpp`.
    * For images, the allowed protocols are `http` and `https`.
    */
  var allowDangerousProtocol: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Value to use for line endings not in `doc` (`string`, default: first line
    * ending or `'\n'`).
    *
    * Generally, micromark copies line endings (`'\r'`, `'\n'`, `'\r\n'`) in the
    * markdown document over to the compiled HTML.
    * In some cases, such as `> a`, CommonMark requires that extra line endings
    * are added: `<blockquote>\n<p>a</p>\n</blockquote>`.
    */
  var defaultLineEnding: js.UndefOr[Carriagereturn | Linefeed | CarriagereturnLinefeed] = js.undefined
  
  /**
    * Array of HTML extensions
    */
  var htmlExtensions: js.UndefOr[js.Array[Partial[NormalizedHtmlExtension]]] = js.undefined
}
object CompileOptions {
  
  inline def apply(): CompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompileOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowDangerousHtml(value: Boolean): Self = StObject.set(x, "allowDangerousHtml", value.asInstanceOf[js.Any])
    
    inline def setAllowDangerousHtmlUndefined: Self = StObject.set(x, "allowDangerousHtml", js.undefined)
    
    inline def setAllowDangerousProtocol(value: Boolean): Self = StObject.set(x, "allowDangerousProtocol", value.asInstanceOf[js.Any])
    
    inline def setAllowDangerousProtocolUndefined: Self = StObject.set(x, "allowDangerousProtocol", js.undefined)
    
    inline def setDefaultLineEnding(value: Carriagereturn | Linefeed | CarriagereturnLinefeed): Self = StObject.set(x, "defaultLineEnding", value.asInstanceOf[js.Any])
    
    inline def setDefaultLineEndingUndefined: Self = StObject.set(x, "defaultLineEnding", js.undefined)
    
    inline def setHtmlExtensions(value: js.Array[Partial[NormalizedHtmlExtension]]): Self = StObject.set(x, "htmlExtensions", value.asInstanceOf[js.Any])
    
    inline def setHtmlExtensionsUndefined: Self = StObject.set(x, "htmlExtensions", js.undefined)
    
    inline def setHtmlExtensionsVarargs(value: Partial[NormalizedHtmlExtension]*): Self = StObject.set(x, "htmlExtensions", js.Array(value*))
  }
}
