package typings.naja.anon

import typings.naja.distCoreHistoryHandlerMod.HistoryState
import typings.naja.distCoreSnippetCacheMod.CachedSnippets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snippets extends StObject {
  
  var options: typings.naja.distNajaMod.Options
  
  var snippets: CachedSnippets
  
  var state: HistoryState
}
object Snippets {
  
  inline def apply(options: typings.naja.distNajaMod.Options, snippets: CachedSnippets, state: HistoryState): Snippets = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], snippets = snippets.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snippets]
  }
  
  extension [Self <: Snippets](x: Self) {
    
    inline def setOptions(value: typings.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSnippets(value: CachedSnippets): Self = StObject.set(x, "snippets", value.asInstanceOf[js.Any])
    
    inline def setState(value: HistoryState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
