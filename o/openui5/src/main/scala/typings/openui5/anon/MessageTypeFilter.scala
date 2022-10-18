package typings.openui5.anon

import typings.openui5.sapMMessagePopoverItemMod.default
import typings.openui5.sapUiCoreLibraryMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTypeFilter extends StObject {
  
  /**
    * Refers to the `MessagePopover` item that is being presented.
    */
  var item: js.UndefOr[default] = js.undefined
  
  /**
    * Refers to the type of messages being shown.
    */
  var messageTypeFilter: js.UndefOr[
    MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String)
  ] = js.undefined
}
object MessageTypeFilter {
  
  inline def apply(): MessageTypeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageTypeFilter]
  }
  
  extension [Self <: MessageTypeFilter](x: Self) {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setMessageTypeFilter(
      value: MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String)
    ): Self = StObject.set(x, "messageTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeFilterUndefined: Self = StObject.set(x, "messageTypeFilter", js.undefined)
  }
}
