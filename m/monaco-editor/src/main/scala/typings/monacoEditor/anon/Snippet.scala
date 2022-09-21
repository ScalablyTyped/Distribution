package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snippet extends StObject {
  
  var snippet: String
}
object Snippet {
  
  inline def apply(snippet: String): Snippet = {
    val __obj = js.Dynamic.literal(snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snippet]
  }
  
  extension [Self <: Snippet](x: Self) {
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
