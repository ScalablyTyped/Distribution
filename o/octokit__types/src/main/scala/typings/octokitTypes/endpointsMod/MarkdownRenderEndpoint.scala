package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.gfm
import typings.octokitTypes.octokitTypesStrings.markdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkdownRenderEndpoint extends StObject {
  
  /**
    * The repository context to use when creating references in `gfm` mode. Omit this parameter when using `markdown` mode.
    */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * The rendering mode. Can be either:
    * \* `markdown` to render a document in plain Markdown, just like README.md files are rendered.
    * \* `gfm` to render a document in [GitHub Flavored Markdown](https://github.github.com/gfm/), which creates links for user mentions as well as references to SHA-1 hashes, issues, and pull requests.
    */
  var mode: js.UndefOr[markdown | gfm] = js.undefined
  
  /**
    * The Markdown text to render in HTML. Markdown content must be 400 KB or less.
    */
  var text: String
}
object MarkdownRenderEndpoint {
  
  inline def apply(text: String): MarkdownRenderEndpoint = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownRenderEndpoint]
  }
  
  extension [Self <: MarkdownRenderEndpoint](x: Self) {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setMode(value: markdown | gfm): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
