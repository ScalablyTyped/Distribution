package typings.parse5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptions extends StObject {
  
  /**
    * The [scripting flag](https://html.spec.whatwg.org/multipage/parsing.html#scripting-flag). If set
    * to `true`, `noscript` element content will be parsed as text.
    *
    *  **Default:** `true`
    */
  var scriptingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables source code location information. When enabled, each node (except the root node)
    * will have a `sourceCodeLocation` property. If the node is not an empty element, `sourceCodeLocation` will
    * be a {@link ElementLocation} object, otherwise it will be {@link Location}.
    * If the element was implicitly created by the parser (as part of
    * [tree correction](https://html.spec.whatwg.org/multipage/syntax.html#an-introduction-to-error-handling-and-strange-cases-in-the-parser)),
    * its `sourceCodeLocation` property will be `undefined`.
    *
    * **Default:** `false`
    */
  var sourceCodeLocationInfo: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the resulting tree format.
    *
    * **Default:** `treeAdapters.default`
    */
  var treeAdapter: js.UndefOr[TreeAdapter] = js.native
}
object ParserOptions {
  
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  @scala.inline
  implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScriptingEnabled(value: Boolean): Self = StObject.set(x, "scriptingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptingEnabledUndefined: Self = StObject.set(x, "scriptingEnabled", js.undefined)
    
    @scala.inline
    def setSourceCodeLocationInfo(value: Boolean): Self = StObject.set(x, "sourceCodeLocationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocationInfoUndefined: Self = StObject.set(x, "sourceCodeLocationInfo", js.undefined)
    
    @scala.inline
    def setTreeAdapter(value: TreeAdapter): Self = StObject.set(x, "treeAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeAdapterUndefined: Self = StObject.set(x, "treeAdapter", js.undefined)
  }
}
