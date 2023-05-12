package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineCompletions[TItem /* <: InlineCompletion */] extends StObject {
  
  /**
    * A list of commands associated with the inline completions of this list.
    */
  val commands: js.UndefOr[js.Array[Command]] = js.undefined
  
  /**
    * When set and the user types a suggestion without derivating from it, the inline suggestion is not updated.
    */
  val enableForwardStability: js.UndefOr[Boolean] = js.undefined
  
  val items: js.Array[TItem]
  
  val suppressSuggestions: js.UndefOr[Boolean] = js.undefined
}
object InlineCompletions {
  
  inline def apply[TItem /* <: InlineCompletion */](items: js.Array[TItem]): InlineCompletions[TItem] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineCompletions[TItem]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineCompletions[?], TItem /* <: InlineCompletion */] (val x: Self & InlineCompletions[TItem]) extends AnyVal {
    
    inline def setCommands(value: js.Array[Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setEnableForwardStability(value: Boolean): Self = StObject.set(x, "enableForwardStability", value.asInstanceOf[js.Any])
    
    inline def setEnableForwardStabilityUndefined: Self = StObject.set(x, "enableForwardStability", js.undefined)
    
    inline def setItems(value: js.Array[TItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: TItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSuppressSuggestions(value: Boolean): Self = StObject.set(x, "suppressSuggestions", value.asInstanceOf[js.Any])
    
    inline def setSuppressSuggestionsUndefined: Self = StObject.set(x, "suppressSuggestions", js.undefined)
  }
}
